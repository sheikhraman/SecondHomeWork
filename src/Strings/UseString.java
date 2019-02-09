package Strings;

public class UseString {
	 String name ="Sheikh Rahman";
     String fname ="  Sheikh  ";
     String lname = " Rahman  ";
    // String fullName=fname+lname;
     public void lenghtOfName() {
    	System.out.println("Length of name is :"+name.length()); 
     }
     public void upperCase() {
    	 System.out.println("All letters are upper case :"+name.toUpperCase());
     }
     public void lowerCase() {
    	 System.out.println("All letters are lower case: "+name.toLowerCase());
     }
     public void indexCharecter() {
    	 System.out.println("Index number of first letter: "+name.charAt(0));
     }
     public void stringHashCode() {
    	 System.out.println("Index:"+name.hashCode());
     }
     public void replaceLetter() {
    	 System.out.println("Replace: "+name.replace("i", "a"));
     }
     public void replaceWord() {
    	 System.out.println("Tow Letter replaced:"+name.replace("Sheikh", "replacement"));
     }
     public void indexOfLetter() {
    	 System.out.println("Index of letter :"+name.indexOf(0));
     }
     public void contentTrueFalse() {
    	 boolean cont =name.contains("eikh");
    	System.out.println(cont);
     }
     public void variableValueBlank() {
    	 boolean truefalse =name.isBlank();
       System.out.println("Is variable name blank:"+truefalse);
     }
     public void emptyVariable() {
    	 boolean empValue  = name.isEmpty();
    	 System.out.println(empValue);
     }
     public void concatName() {
    	 String fullName =fname.concat (lname);
    	 System.out.println("Full Name is :"+fullName);
     }
     public void startWith() {
    	 boolean strt =fname.startsWith("S");
    	 System.out.println("First name start with :"+strt);
     }
     public void endsWith() {
    	 boolean endwith=lname.endsWith("n");
    	 System.out.println(endwith);
     }
     
     public void askeValue() {
    	 int value =fname.codePointAt(0);
    	 System.out.println(value);
     }
     public void findIndex() {
    	 int findx =lname.indexOf('R');
    	 System.out.println(findx);
     }
     public void spaceRemove() {
    	 String remov =lname.trim();
    	 System.out.println(remov);
     }
     public void useLastIndex() {
    	 int lstindx =lname.lastIndexOf('n');
    	 System.out.println(lstindx);
     }
     public void printString() {
    	 String charec=lname.substring(0,3);
    	 System.out.println("substring will print firt for letter from lname:"+charec);
     }
     public void removeExtraSpace() {
    	 String exspce=fname.strip();
    	 System.out.println("Remove Extra space of :"+exspce);
     }
     public void removeBeginningSpace() {
    	 String spece=fname.stripLeading();
    	 System.out.println("Removing Begining space:"+spece);
     }
     public void repeatAll() {
    	 String rpt = name.repeat(20);
    	 System.out.println("Repat twenty times:"+rpt);
     }
     public void equalsOf() {
    	 boolean equl = lname.equals("Rahman");
    	 System.out.println("Last name equal to :"+equl);
     }
}
