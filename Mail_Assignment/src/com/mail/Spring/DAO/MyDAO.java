package com.mail.Spring.DAO;

import com.mail.Spring.model.RegisterDTO;

public interface MyDAO {
public void register(RegisterDTO dto);
public RegisterDTO login(RegisterDTO dto);
}
