package id.ac.polinema.midterm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhanifudin
 */
public class Item {
    protected String name;
    protected float price;
    protected int amount;

    public Item(String name, float price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        getTotalPrice();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    @Override
    public String toString(){ // override
        return "| "+name+"\t\t| "+price+"\t|"+amount+"\t\t|"+(price*amount);        
    }
   
    public float getTotalPrice(){ // override
        return (price*amount)-(price-amount*amount);

    }
}
