package spring_demo3.dao;

import spring_demo3.model.ModelDTO;

public interface MyDAO {
public void register(ModelDTO dto);
public boolean login(ModelDTO dto);
}
