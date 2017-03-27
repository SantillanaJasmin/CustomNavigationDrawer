package com.example.jasmin.navigationdrawer.model;

import com.bignerdranch.expandablerecyclerview.model.Parent;

import java.util.Date;
import java.util.List;

/**
 * Model for History details that will be visible in the recycler view
 */
public class HistoryParent implements Parent<HistoryChild> {

    /* Create an instance variable for your list of children */
    private List<HistoryChild> mChildrenList;

    private int id, number;
    private double price;
    private float ratings;
    private Date date;
    private String comment;

    public HistoryParent(int id, int trans_number, Date date, double trans_price, float ratings, List<HistoryChild> list) {
        this.id = id;
        this.number = trans_number;
        this.date = date;
        this.price = trans_price;
        this.ratings = ratings;
        this.mChildrenList = list;
    }

    public int getTrans_number() {
        return number;
    }

    public void setTrans_number(int trans_number) {
        this.number = trans_number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getRatings() {
        return ratings;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }

    @Override
    public List<HistoryChild> getChildList() {
        return mChildrenList;
    }

    @Override
    public boolean isInitiallyExpanded() {
        return false;
    }
}
