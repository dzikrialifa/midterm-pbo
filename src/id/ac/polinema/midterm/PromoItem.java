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
    
}