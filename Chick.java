class Chick implements Animal 
{     
     private String myType;    
     private boolean c;  
     private String mySound; 
     private String mySoundc;     
     public Chick(String type, String sound)     
     {         
         myType = type;         
         mySound = sound; 
         c = false;    
     }  
      public Chick(String type, String sound, String soundc)     
     {         
         myType = type;         
         mySound = sound; 
         mySoundc = soundc;
         c = true;    
     }    
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){
     	if (c == true && (int)(Math.random() * 2) == 1){
     		return mySoundc;
     	}
     	return mySound;
     	}   
     public String getType(){return myType;} 
}
