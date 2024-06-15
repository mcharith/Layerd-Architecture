package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException ;
    public void deleteItem(String code) throws SQLException, ClassNotFoundException;
    public void saveItems(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;
    //void saveItems(String code, String description, BigDecimal unitPrice, int qtyOnHand) throws SQLException, ClassNotFoundException;
    public void updateItems(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;
    public boolean existItem(String code) throws SQLException, ClassNotFoundException ;
    public String generateNewId() throws SQLException, ClassNotFoundException ;
    public ItemDTO findItem(String newItemCode) throws SQLException, ClassNotFoundException;
}
