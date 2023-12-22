package Entity;

import java.text.ParseException;

public class ImportedProduct extends Product{
    private Double customsFee;


    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double costumsFee) {
        super(name, price);
        this.customsFee = costumsFee;
    }
    public Double getCostumsFee() {
        return customsFee;
    }

    public void setCostumsFee(Double costumsFee) {
        this.customsFee = costumsFee;
    }

    @Override
    public String priceTag(){
        return getName()+ " " + totalPrice() + " (Customs fee: $" + String.format("%.2f", customsFee) + ")";
    }

    public Double totalPrice(){
        return (super.getPrice() + customsFee);
    }

}
