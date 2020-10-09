package com.example.controlador;

public interface IDao<T> {
    void getAdd(T obj)throws Exception;
    void getUp(T obj)throws Exception;
    void getDel(Object cod)throws Exception;
    void getList(Object bus)throws Exception;
    T getItem(int f);
    int getSize();
}
