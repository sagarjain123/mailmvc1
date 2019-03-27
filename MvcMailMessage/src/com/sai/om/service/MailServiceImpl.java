package com.sai.om.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sai.om.dto.MailDTO;

@Service
public class MailServiceImpl implements MailService {
	
	@Autowired
	private SimpleMailMessage mailmessage;
	@Autowired
	private JavaMailSender mailsender;

	@Override
	public Boolean sendMailFromService(MailDTO dtoFromJSP) throws Exception {
		System.out.println("entering validation logic");
		try{
			if(!StringUtils.isEmpty(dtoFromJSP.getReceiptent()) && !StringUtils.isEmpty(dtoFromJSP.getSubject())) {
				System.out.println("validation success");
				mailmessage.setTo(dtoFromJSP.getReceiptent());
				mailmessage.setText(dtoFromJSP.getText());
				mailmessage.setSubject(dtoFromJSP.getSubject());
				return Boolean.TRUE;
			}

		} catch(Exception e){
			System.out.println();
		}
				return Boolean.FALSE;
	}

}
