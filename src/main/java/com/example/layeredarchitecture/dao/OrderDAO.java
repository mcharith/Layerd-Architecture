package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;

public interface OrderDAO {
    public String generateNewOrderId() throws SQLException, ClassNotFoundException;
}
