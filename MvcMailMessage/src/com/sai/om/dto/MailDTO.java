package com.sai.om.dto;

import java.io.Serializable;

import org.springframework.web.servlet.DispatcherServlet;

public class MailDTO implements Serializable {
	
	private String receiptent;
	private String subject;
	private String text;
	
	public MailDTO() {
		System.out.println(this.getClass().getSimpleName()+"created");
			}

	public String getReceiptent() {
		return receiptent;
	}

	public void setReceiptent(String receiptent) {
		this.receiptent = receiptent;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "MailDTO [receiptent=" + receiptent + ", subject=" + subject + ", text=" + text + ", getReceiptent()="
				+ getReceiptent() + ", getSubject()=" + getSubject() + ", getText()=" + getText() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}

	
