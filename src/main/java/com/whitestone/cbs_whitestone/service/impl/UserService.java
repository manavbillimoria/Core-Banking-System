package com.whitestone.cbs_whitestone.service.impl;

import com.whitestone.cbs_whitestone.dto.BankResponse;
import com.whitestone.cbs_whitestone.dto.EnquiryRequest;
import com.whitestone.cbs_whitestone.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
}
