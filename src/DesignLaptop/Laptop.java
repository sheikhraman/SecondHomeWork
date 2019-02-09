package DesignLaptop;
public class Laptop {
	String color ;
	String operatingSystem;
	String madeIn;
	int madeYear;
	int screenSize;
	String hardDrive;
	int ramGB;
	static String manufacturer = "HP";
	static double price;
	static String processor;
	static int processorSpeed;
	public Laptop(){}
    public  Laptop  (String color,int screenSize,String hardDrive,int ramGB,String manufacturer) {
        this.color = color;
        this.screenSize =screenSize;
        this.hardDrive =hardDrive;
        this.ramGB = ramGB;
        this.manufacturer=manufacturer;
        System.out.println("Color: "+color+" Screen Size: "+screenSize+"inch  Hard Drive: "+hardDrive+" RAM: "+ramGB+"GB  Manufacturer :"+manufacturer);
        System.out.println("\n-------------------------------------------");
    }
    Laptop(double p,String process,int proSpeed){
    	price =p;
    	processor =process;
    	processorSpeed =proSpeed;
    	
    }
	public void dispSecondConstructorValue() {
		System.out.println("Price berore tax: "+price);
		System.out.println("Processor :"+processor);
		System.out.println("Processor Speed: "+processorSpeed);
		System.out.println("\n------------------------------------------");
	}
    public void setLatoptInformation(String color,int screenSize,String hardDrive,int ramGB) {
        this.color = color;
        this.screenSize =screenSize;
        this.hardDrive =hardDrive;
        this.ramGB = ramGB;
        System.out.println("Color:"+color+"ScreenSize:"+screenSize+"Hard Drive:"+hardDrive+"Ram:"+ramGB);
    }

	public void dsplyLaptopInformation() {
    	System.out.println("Laptop color:"+color);
    	System.out.println("Laptop screen size: "+this.screenSize);
    	System.out.println("Laptop hard drive size: "+this.hardDrive);
    	System.out.println("Laptop RAM:"+this.ramGB);
    	//System.out.println("Laptop manufacturer :"+manufacturer);
    	System.out.println("\n-----------------------------------------");
     }
	public void setLaptopPrice(double price) {
		this.price=price;
	}
	public double getLaptopPrice() {
		return price;
	}
   public static void laptopExtraInfo(String operatingSystem,String madeIn,int madeYear) {
	 System.out.println("This computer operating system: "+operatingSystem+"  Made In: "+madeIn+"  Year :"+madeYear);  
   }

}
