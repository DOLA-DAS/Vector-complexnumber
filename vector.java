public class vector{
   private double real;
   private double img;
   private double mag;
   private double theta;
   public vector(){}
   private int size;
   
   public vector(int sz)
   {
	   size=sz;
   }
   public vector(double rl,double im)
   {
         real=rl;
         img=im;
         mag=Math.sqrt(real*real+img*img);
         theta=Math.toDegrees(Math.atan(img/real));
   }

   public vector add(vector z,int sz)
   {
	   size=sz;
       vector r=new vector((real+z.real)/size,(img+z.img)/size);
       return r;
    }
     public vector sub(vector z,int sz)
   {
    	 size=sz;
       vector r=new vector((real-z.real)/size,(img-z.img)/size);
       return r;
    }
     public vector mul(vector z,int sz)
     {
  	   size=sz;
         vector r=new vector((real*z.real)/size,(img*z.img)/size);
         return r;
      }
     public vector div(vector z,int sz)
     {
  	   size=sz;
         vector r=new vector((real/z.real)/size,(img/z.img)/size);
         return r;
      }
     public vector add2(vector z)
     {
         vector r=new vector(real+z.real,img+z.img);
         return r;
      }
       public vector sub2(vector z)
     {
         vector r=new vector(real-z.real,img-z.img);
         return r;
      }
       public vector mul2(vector z)
       {
           vector r=new vector(real*z.real,img*z.img);
           return r;
        }
         public vector div2(vector z)
       {
           vector r=new vector(real/z.real,img/z.img);
           return r;
        }
         

    public void printVector()
    {
        System.out.println(real+"+"+img+"i");
        System.out.println("mag:"+mag+" arg:"+theta);
            }

public static void main(String[] args)
    {
        vector c1=new vector(12.0,10.5);
        vector c2=new vector(15.5,20.5);
        vector c3=new vector(1.0,2.0);
        c1.printVector();
        c2.printVector();
        vector R1=c1.add(c2,2);
        vector R2=c1.sub(c2,2);
        R1.printVector();
        R2.printVector();
        vector R3=R1.add2(c3);
        vector R4=R2.sub2(c3);
        R3.printVector();
        R4.printVector();
        vector R5=c1.mul(c2,2);
        vector R6=c1.div(c2,2);
        R5.printVector();
        R6.printVector();
        vector R7=R1.mul2(c3);
        vector R8=R2.div2(c3);
        R7.printVector();
        R8.printVector();
        
    }
    
}