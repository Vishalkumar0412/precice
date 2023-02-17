import java.util.*;
public class marks {
    int math,phy,chem,hin,eng,per,total;
    public static void main(String[] args) {
        
        math();
    }
    public void math(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ther masrks of math subject :");       
        math = sc.nextInt();
        if(math>=0||math<=100){
            phy();
        }
        else{
            math();
        }

    }
    public   void phy(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ther masrks of physics subject :");
        phy = sc.nextInt();
        if(phy>=0||phy<=100){
            chem();
        }
        else{
            phy();
        }

    }
    public void chem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ther masrks of chemistry subject :");
        chem = sc.nextInt();
        if(chem>=0||chem<=100){
            hin();
        }
        else{
            chem(); 

            }

    }
    public void hin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ther masrks of hindi subject :");
        hin = sc.nextInt();
        if(hin>=0||hin<=100){
            eng();
        }
        else{
            hin(); 

            }

    }
    public void eng(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ther masrks of English subject :");
        eng = sc.nextInt();
        if(eng>=0||eng<=100){
            per();
        }
        else{
            eng();

            }
            public void per(){
        total = math+phy+chem+hin+eng;
        per = (total*5)/100
        System.out.println("You total marks is "+total);
        System.out.println("You percentage  is "+per);
    }
        
       
    }
  
    }
