package sample;

public class Calculator {
    private String num = "";
    private String operation = "";
    private int check1;
    private int check2;
    private double sum = 0;

    public void setNum(String a) {
        num+=a;
        if(check2 == 1) {
            check2 = 0;
            if(check1 == 1) { operation += "+";}
            else if (check1 == 2) { operation += "-";}
            else if (check1 == 3){ operation += "x";}
            else if (check1 == 4){ operation += "/";}
            else if (check1 == 5){ operation += "=";}
        }
    }

    public String getNum(){ return num; }
    public void addSum(){
        check1 = 1;
        check2 = 1;
    }
    public void minusSum(){
        check1 = 2;
        check2 = 1;
    }
    public void multiSum(){
        check1 = 3;
        check2 = 1;
    }
    public void divSum(){
        check1 = 4;
        check2 = 1;
    }
    public void solSum(){
        check1 = 5;
        check2 = 1;
    }

    public void setSum(){
        if(operation.length()>0){
            if(operation.equals("+")){
                sum += Double.parseDouble(num);
                num = "";
            }
            else if(operation.equals("-")){
                sum -= Double.parseDouble(num);
                num = "";
            }
            else if(operation.equals("x")){
                sum *= Double.parseDouble(num);
                num = "";
            }
            else if(operation.equals("/")){
                sum /= Double.parseDouble(num);
                num = "";
            }
            operation = "";
        }
        else{
            if (num != "" || operation.equals("=")){
                if(num.equals(".")){num = "0";}
                sum += Double.parseDouble(num);
                num = "";}
        }
    }
    public String getSum(){ return String.valueOf(sum); }

    public void clearTotal(){
        sum = 0;
        num = "";
        operation = "";
        check1 = 0;
        check2 = 0;
    }
}
