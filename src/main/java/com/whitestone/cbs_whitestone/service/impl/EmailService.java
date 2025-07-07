package com.whitestone.cbs_whitestone.service.impl;
import com.whitestone.cbs_whitestone.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
