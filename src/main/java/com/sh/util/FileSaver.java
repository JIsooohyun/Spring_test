package com.sh.util;

import java.io.File;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

public class FileSaver {
	
	
	//1. Spring에서 제공하는 FileCopyUtils 클래스의 copy 메서드 사용
	//1-1. 저장경로
	//1-2. MultipartFile
	
	public String saveFile(String realPath, MultipartFile multipartFile)throws Exception{
		//1.파일 객체 만들기
		File file = new File(realPath);
		//2.파일 존재하지 않으면 디렉터리 만들어주기
		if(!file.exists()) {
			file.mkdirs();
		}
		
		//3. 저장할 파일명 생성
		//UUID 클래스 사용 (유니버셜 유니크 아이디)
		String fileSystemName = UUID.randomUUID().toString();
		String originalName = multipartFile.getOriginalFilename();
		originalName = originalName.substring(originalName.lastIndexOf('.'));
		fileSystemName = fileSystemName+originalName;
		
		System.out.println(fileSystemName);
		// 저장
		file = new File(realPath,fileSystemName);
		FileCopyUtils.copy(multipartFile.getBytes(), file); //파일 및 스트림 복사를 위한 간단한 유틸리티 메소드의 집합체
		
		System.out.println(fileSystemName);
		return fileSystemName;
	}
}
