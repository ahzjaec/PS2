package pkgInteger;

public class MyInteger {

	private int iValue;

	public MyInteger(int Value){
		iValue = Value;
	}
	
	public int getiValue(){
		return iValue;
	}
	
	public boolean isEven(){
		if (iValue%2==0){
			return true;
		}else{
			return false;
			}
	}
	
	public boolean isOdd(){
		if (iValue%2==1){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isPrime(){
		
		boolean prime = false;
		int x=iValue/2;    
		for(int i=2;i<=x;i++){    
		   if(iValue%i==0){        
		   prime=true;    
		   break;    
		   }    
		  }    
		if(prime==false){
			return true;
		}else{
		return false;
			} 
		}  
	
	public static boolean isEven(int iValue){
		if (iValue%2==0){
			return true;
		}
			else{
				return false;
			}
	}
	
	public static boolean isOdd(int iValue){
		if (iValue%2==1){
			return true;
		}
			else{
				return false;
				}
	}
	
	public static boolean isPrime(int iValue){

		boolean prime = false;
		int x=iValue/2;    
		for(int i=2;i<=x;i++){    
		   if(iValue%i==0){        
		   prime=true;    
		   break;    
		  }    
		  }    
		if(prime==false){
			return true;
		}else{
		return false;
			} 
		}
	
	public static boolean isEven(MyInteger Integer){
		if (Integer.iValue%2==0){
			return true;
		}else{
		return false;
			}
	}
	
	public static boolean isOdd(MyInteger Integer){
		if (Integer.iValue%2==1){
			return true;
		}else{
		return false;
		}
	}
	
	public static boolean isPrime(MyInteger Integer){
		int y=Integer.iValue;

		int x; 
		boolean prime = false;
		x=y/2;    
		for(int i=2;i<=x;i++){    
		   if(y%i==0){        
		   prime=true;    
		   break;    
		  }    
		  }    
		if(prime==false){
			return true;
		}else{
			return false;
			} 
		}  
}
