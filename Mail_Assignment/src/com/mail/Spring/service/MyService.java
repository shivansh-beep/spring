package com.mail.Spring.service;

import com.mail.Spring.model.RegisterDTO;

public interface MyService {
 public void register(RegisterDTO dto);
 public RegisterDTO login(RegisterDTO dto);
}
