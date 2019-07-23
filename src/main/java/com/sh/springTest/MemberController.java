package com.sh.springTest;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.ModelAndView;

import com.sh.member.MemberService;
import com.sh.member.MemberVO;

@Controller
@RequestMapping("/member/")
public class MemberController {

	@Inject
	private MemberService memberService;
	
	//회원가입
	@RequestMapping(value="memberJoin", method = RequestMethod.GET)
	public void join(MemberVO memberVO)throws Exception{
		
	}
	
	@RequestMapping(value="memberJoin", method = RequestMethod.POST)
	public ModelAndView join(MemberVO memberVO, MultipartFile photo, HttpSession session)throws Exception{
		System.out.println("photo");
		ModelAndView mv = new ModelAndView();
		int result =  memberService.setWrite(memberVO, photo,session);
		mv.addObject("path", "../");
		mv.setViewName("common/messageMove");
		String msg = "Fail Join";
		if(result>0) {
			msg = "Join Success";
		}
		mv.addObject("msg",msg);
		return mv;
	}
	
	//////////
}
