package com.example.app14.services;

import java.util.ArrayList;
import java.util.List;

import com.example.app14.beans.Fruits;
import com.example.app14.dao.IDao;

public  class FruitService implements IDao<Fruits> {

    private List<Fruits> fruits;

    public FruitService() {
        fruits = new ArrayList<>();
    }

    @Override
    public boolean create(Fruits o) {
        return fruits.add(o);
    }

    @Override
    public boolean update(Fruits o) {
        return false;
    }

    @Override
    public boolean delete(Fruits o) {
        return fruits.remove(o);
    }

    @Override
    public Fruits findById(int id) {
        for(Fruits f : fruits)
            if(f.getId() == id)
                return f;
        return null;
    }

    @Override
    public List<Fruits> findAll() {
        return fruits;
    }
}
