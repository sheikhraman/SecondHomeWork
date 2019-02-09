package DesignLaptop;

public class TestLaptop {

	public static void main(String[] args) {
		Laptop lptp =new Laptop("Red",17,"1TB",16,"HP");
		System.out.println(Laptop.manufacturer);//accessing static variable
        lptp.dsplyLaptopInformation();
        Laptop lptp1 = new Laptop(720.50,"i7",4);
        lptp1.dispSecondConstructorValue();
        //lptp1.setLatoptInformation("blue",16 , "1TB", 16);
        lptp1.getLaptopPrice();
        double getPrice =lptp1.getLaptopPrice();
        getPrice=getPrice+100;
        System.out.println(getPrice);
        Laptop.laptopExtraInfo("Windows", "China", 2019);
	}

}
