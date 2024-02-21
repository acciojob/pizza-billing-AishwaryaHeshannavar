package com.driver;

public class Pizza {

    private int price;
    private int base;
    private Boolean isVeg=false;
   protected Boolean ExtraChess=false;
   protected Boolean ExtraToppings=false;
    private Boolean Takeaway=false;

    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.base=(isVeg)?300:400;

        // your code goes here
    }

    public void addExtraCheese(){
            ExtraChess=true;
        // your code goes here
    }

    public void addExtraToppings(){
        // your code goes here
        ExtraToppings=true;
    }

    public void addTakeaway(){
        // your code goes here
            Takeaway=true;
    }
    public int getPrice(){
        int total=base;
        if(ExtraChess==true){
            total+=80;
        }
        if(ExtraToppings==true){
            total+=(isVeg)?70:120;
        }
        if(Takeaway==true){
            total+=20;
        }
        return total;
    }

    public String getBill(){
        // your code goes here
        bill="Base Price Of The Pizza: "+base+'\n';
        if(ExtraChess==true){
            bill+="Extra Cheese Added: 80"+'\n';
        }
        if(ExtraToppings==true){
            if(isVeg==true){
                bill+="Extra Toppings Added: 70"+'\n';
            }else{
                bill+="Extra Toppings Added: 120"+'\n';
            }
        }
        if(Takeaway==true){
            bill+="Paperbag Added: 20"+'\n';
        }
        bill+="Total Price: "+getPrice();

        return this.bill;
    }
}
