/*
*   DZIKRI ALIF AB
*   Email : dzikrialif99@gmail.com
*   Hawlet Packard
*/
package id.ac.polinema.midterm;
public class PromoItem extends Item{
    private float promo;

    public PromoItem(String name, float price, int amount, float promo) {
        super(name, price, amount);
        this.promo = promo;
    }

    public void setPromo(float promo) {
        this.promo = promo;
    }
    public float getPromo() {
        return promo;
    }

    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
    public int getAmount() {
        return amount;
    }
    @Override
    public String toString(){
        return "| "+name+"\t\t|"+price+"\t\t"+amount+"\t\t|";
    }
    
}
