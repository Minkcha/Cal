package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {
    private int c = 0;
    @FXML
    Button B1,B2,B3,B4,B5,B6,B7,B8,B9,B0,BDot,BSol,BAc,BAdd,BDiv,BMi,BMul;
    @FXML
    TextField Tf;

    private Calculator calculator = new Calculator();

    public void IfClickBtnB1(){
        calculator.setNum("1");
        Tf.setText(calculator.getNum());
    }
    public void IfClickBtnB2(){
        calculator.setNum("2");
        Tf.setText(calculator.getNum());
    }
    public void IfClickBtnB3(){
        calculator.setNum("3");
        Tf.setText(calculator.getNum());
    }
    public void IfClickBtnB4(){
        calculator.setNum("4");
        Tf.setText(calculator.getNum());
    }
    public void IfClickBtnB5(){
        calculator.setNum("5");
        Tf.setText(calculator.getNum());
    }
    public void IfClickBtnB6(){
        calculator.setNum("6");
        Tf.setText(calculator.getNum());
    }
    public void IfClickBtnB7(){
        calculator.setNum("7");
        Tf.setText(calculator.getNum());
    }
    public void IfClickBtnB8(){
        calculator.setNum("8");
        Tf.setText(calculator.getNum());
    }
    public void IfClickBtnB9(){
        calculator.setNum("9");
        Tf.setText(calculator.getNum());
    }
    public void IfClickBtnB0(){
        calculator.setNum("0");
        Tf.setText(calculator.getNum());
    }
    public void IfClickBtnBDot(){
        if(c==0){
            calculator.setNum(".");
            Tf.setText(calculator.getNum());
            c = 1;
        }
    }
    public void IfClickBtnBAdd(){
        calculator.addSum();
        calculator.setSum();
        Tf.setText(calculator.getNum());
        c=0;
    }
    public void IfClickBtnBMi(){
        calculator.minusSum();
        calculator.setSum();
        Tf.setText(calculator.getNum());
        c=0;
    }
    public void IfClickBtnBMul(){
        calculator.multiSum();
        calculator.setSum();
        Tf.setText(calculator.getNum());
        c=0;
    }
    public void IfClickBtnBDiv(){
        calculator.divSum();
        calculator.setSum();
        Tf.setText(calculator.getNum());
        c=0;
    }

    public void IfClickBtnBAc(){
        calculator.clearTotal();
        Tf.setText(calculator.getNum());
        c = 0;
    }
    public void IfClickBtnBSol(){
        calculator.solSum();
        calculator.setSum();
        Tf.setText(calculator.getSum());

    }







}

