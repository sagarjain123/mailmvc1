package com.sai.om.service;

import com.sai.om.dto.MailDTO;

public interface MailService {

	Boolean sendMailFromService(MailDTO dtoFromJSP) throws Exception;

}
