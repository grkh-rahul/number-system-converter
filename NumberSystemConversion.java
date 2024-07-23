import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;


public class NumberSystemConversion {
	public static int[] decimalBinary(int num){
    	int flag=0;
		if(num==0 || num==1){
			int rem1[]= {num};
			return rem1;
		}
		else {	
			int rem[] = new int[100];
    		for(int i=(rem.length-1);i>=0;i--){
        		rem[i]= num % 2;
            	num/=2;
        	}
			for(int j=0;j<rem.length;++j){
				if(rem[j]==1){
					flag=j;
					break;
				}
			}
			int rem1[]=Arrays.copyOfRange(rem,flag,rem.length);
			return rem1;	
		}
    }
    public static int[] decimalOctal(int num){
		int flag=0;
		if(num==0 || num==1 || num==2 || num ==3 || num==4 || num==5 || num==6 || num==7){
			int rem1[]={num};
			return rem1;
			}
    	
		else{	
			int rem[]= new int[100];
    		for(int i=(rem.length-1); i>=0;i--){
    			rem[i]= num%8;
    			num/=8;
    		}
			for(int j=0;j<rem.length;++j){
				if( rem[j]==1 || rem[j]==2 || rem[j]==3 || rem[j]==4 || rem[j]==5 || rem[j]==6 || rem[j]==7){
					flag=j;
					break;
				}
			}
			int rem1[]=Arrays.copyOfRange(rem,flag,rem.length);
			return rem1;
		}
	}
    	
    public static StringBuilder decimalHexa(int num){
    	int flag=0;
		if(num==0 ||num==1 || num==2 || num ==3 || num==4 || num==5 || num==6 || num==7 || num==8 || num==9 || num ==10 || num==11 || num==12 || num==13 || num==14 || num==15){
			StringBuilder str= new StringBuilder(1);
			if(num==10)
				str.append("A");
			else if(num==11)
				str.append("B");
			else if(num==12)
				str.append("C");
			else if(num==13)
				str.append("D");
			else if(num==14)
				str.append("E");
			else if(num==15)
				str.append("F");
			else
				str.append(num);
			return str;
		}
    	else{	
			int rem[]= new int[100];
    		for(int i=(rem.length-1); i>=0;i--){
    			rem[i]= num%16;
    			num/=16;
    		}
			for(int j=0;j<rem.length;++j){
				if( rem[j]==1 || rem[j]==2 || rem[j]==3 || rem[j]==4 || rem[j]==5 || rem[j]==6 || rem[j]==7 || rem[j]==8 || rem[j]==9 || rem[j]==10 || rem[j]==11 || rem[j]==12 || rem[j]==13 || rem[j]==14 || rem[j]==15){
					flag=j;
					break;
				}
			}
			int rem1[]=Arrays.copyOfRange(rem,flag,rem.length);
			StringBuilder str= new StringBuilder(rem1.length);
			for(int i=0;i<rem1.length;i++){
				if(rem1[i]==10)
					str.append("A");
				else if(rem1[i]==11)
					str.append("B");
				else if(rem1[i]==12)
					str.append("C");
				else if(rem1[i]==13)
					str.append("D");
				else if(rem1[i]==14)
					str.append("E");
				else if(rem1[i]==15)
					str.append("F");
				else if(rem1[i]==1)
					str.append("1");
				else if(rem1[i]==2)
					str.append("2");
				else if(rem1[i]==3)
					str.append("3");
				else if(rem1[i]==4)
					str.append("4");
				else if(rem1[i]==5)
					str.append("5");
				else if(rem1[i]==6)
					str.append("6");
				else if(rem1[i]==7)
					str.append("7");
				else if(rem1[i]==8)
					str.append("8");
				else if(rem1[i]==9)
					str.append("9");
			}
				return str;
		}
    }
    	
    public static int binaryDecimal(String binary){
		int decimal=0, k;
		k=binary.length();
		int num[]= new int[k];
		int num1[]= new int[k];
		int j=k;
		for(int i=0;i<k;i++){
			num[i]= Character.getNumericValue(binary.charAt(i));
		}
		for(int i=0;i<k;i++){
			num1[j-1]=num[i];
			j=j-1;
		}
		for(int m=0;m<k;m++){
			decimal+= (num1[m]*(int) Math.pow(2,m));
		}
		return decimal;
	}	

	public static int octalDecimal(String octal){
		int decimal=0, k;
		k=octal.length();
		int num[]= new int[k];
		int num1[]= new int[k];
		int j=k;
		
		for(int i=0;i<k;i++){
			 num[i]= Character.getNumericValue(octal.charAt(i));
		}
		for(int i=0;i<k;i++){
			num1[j-1]=num[i];
			j-=1;
		}
		for(int m=0;m<k;m++){
			decimal+= (num1[m]*(int) Math.pow(8,m));
		}
		return decimal;
	}

	public static int hexaDecimal(String hexa){
		int decimal=0;
		int num[]= new int[hexa.length()];
		int num1[]= new int[hexa.length()];
		int j=hexa.length();
		for(int i=0;i<hexa.length();i++){
			if(hexa.charAt(i)=='A')
                num[i]=10;
			else if(hexa.charAt(i)=='B')
                num[i]=11;
			else if(hexa.charAt(i)=='C')
                num[i]=12;
			else if(hexa.charAt(i)=='D')
                num[i]=13;
			else if(hexa.charAt(i)=='E')
                num[i]=14;
            else if(hexa.charAt(i)=='F')
                num[i]=15;
			num[i]= Character.getNumericValue(hexa.charAt(i));
		}
		for(int i=0;i<hexa.length();i++){
			num1[j-1]=num[i];
			j-=1;
		}
		for(int m=0;m<hexa.length();m++){
			decimal+= (num1[m]*(int) Math.pow(16,m));
		}
		return decimal;
	}
	public static void arr(int[] rem){
		for(int i=0;i<rem.length;++i){
			System.out.print(rem[i]); 
		}
	}
       
     public static void main (String[] args) {
		//coded by rahul kapar(ig-grkh.rahul__)
        Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		System.out.println("Please Tell Us Your Number Type\na.Decimal\nb.Binary\nc.Octal\nd.Hexa-Decimal");
		char option0=input.next().charAt(0);
		System.out.println("Please Tell Us Which Number System You Want Conversion\na.Decimal\nb.Binary\nc.Octal\nd.Hexa-Decimal");
		char option1=input.next().charAt(0);
		if(option0=='a' && option1=='b'){
			System.out.print("Enter your Deciaml number: ");
			int num= input.nextInt();
			int rem[]=decimalBinary(num);
        	System.out.print("The binary form of " + num + " is ");
			arr(rem);
		}
		else if(option0=='a' && option1=='c'){
			System.out.print("Enter your Deciaml number: ");
			int num= input.nextInt();
			int rem[]= decimalOctal(num);
    		System.out.print("The octal form of " + num + "  is ");
    		arr(rem);
		}
		else if(option0=='a' && option1=='d'){
			System.out.print("Enter your Deciaml number: ");
			int num= input.nextInt();
			StringBuilder str= decimalHexa(num);
			System.out.print("The hexa-decimal form of " + num + " is " + str);
    		}
		else if(option0=='b' && option1=='a'){
			System.out.print("Enter your Binary number: ");
			String num2= input1.nextLine();
			System.out.println("The decimal form of " + num2 + " is " + binaryDecimal(num2) );
		}
		else if(option0=='c' && option1=='a'){
			System.out.print("Enter your Octal number: ");
			String num3= input1.nextLine();
			System.out.println("The decimal form of " + num3 + " is " + octalDecimal(num3));
		}
		else if(option0=='d' && option1=='a'){
			System.out.print("Enter your Hexa-decimal number: ");
			String num4= input1.nextLine();
			System.out.println("The decimal form of " + num4 + " is " + hexaDecimal(num4));
		}
		else if(option0=='b' && option1=='c'){
			System.out.print("Enter your Binary number: ");
			String num2= input1.nextLine();
			int signal=binaryDecimal(num2);
			int rem[]= decimalOctal(signal);
			System.out.print("The octal form of " + num2 + " is ");
    		arr(rem);
		}
		else if(option0=='b' && option1=='d'){
			System.out.print("Enter your Binary number: ");
			String num2= input1.nextLine();
			int signal=binaryDecimal(num2);
			StringBuilder str= decimalHexa(signal);
    		System.out.println("The hexa-decimal form of " + num2 + " is " + str);
		}
		else if(option0=='c' && option1=='b'){
			System.out.print("Enter your Octal number: ");
			String num2= input1.nextLine();
			int signal=octalDecimal(num2);
			int rem[]=decimalBinary(signal);
			System.out.print("The binary form of the is: " );
			arr(rem);
		}
		else if(option0=='d' && option1=='b'){
			System.out.print("Enter your Hexa-deciaml number: ");
			String num2= input1.nextLine();
			int signal=hexaDecimal(num2);
			int rem[]=decimalBinary(signal);
			System.out.print("The binary form of " + num2 + " is " );
			arr(rem);
		}
		else if( option0=='c' && option1=='d'){
			System.out.print("Enter your Octal number: ");
			String num2= input1.nextLine();
			int signal=octalDecimal(num2);
			StringBuilder str= decimalHexa(signal);
    		System.out.println("The hexa-decimal form of " + num2 + " is " + str);
		}
		else if(option0=='d' && option1=='c'){
			System.out.print("Enter your Hexa-deciaml number: ");
			String num2= input1.nextLine();
			int signal=hexaDecimal(num2);
			int rem[]= decimalOctal(signal);
    		System.out.print("The octal form of " + num2 + " is ");
    		arr(rem);
		}	
		else
		System.out.println("Invalid Input!");

      	input.close();
		input1.close();
    }
}