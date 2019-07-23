package com.sh.member;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sh.file.FileDAO;
import com.sh.file.FileVO;
import com.sh.util.FileSaver;

@Service
public class MemberService {

	@Inject
	private MemberDAO memberDAO;
	@Inject
	private FileDAO fileDAO;
	@Inject
	private FileSaver fileSaver;
	
	public int setWrite(MemberVO memberVO, MultipartFile photo, HttpSession session)throws Exception{
		System.out.println(photo.getOriginalFilename());
		//1. 저장경로
		String realPath = session.getServletContext().getRealPath("/resources/MemberFile");
		System.out.println("memberService에 있는 realPath : "+realPath);
		
		FileVO fileVO = new FileVO();
		String fname = fileSaver.saveFile(realPath, photo);
		String id = memberVO.getId();
		String oname =photo.getOriginalFilename();
		fileVO.setId(id);
		fileVO.setFname(fname);
		fileVO.setOname(oname);
		System.out.println("fileName");
		int result = memberDAO.setWrite(memberVO);
		result = fileDAO.getWrite(fileVO);
		System.out.println("result : "+result);
		return result;
	}
}
