/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usandojsf;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Suspir0n
 */
@Named(value = "beanGerenciavel")
@SessionScoped
public class BeanGerenciavel implements Serializable {
    //Atributos--------------------------------
    private Integer valor1;
    private Integer valor2;
    private String result;
    
    //Construtor-------------------------------
    public BeanGerenciavel() {
        
    }
    
    //Metodos----------------------------------
    public void isAdd(){
        result = String.valueOf(valor1+valor2);
    }
    public void isSubtract(){
        result = String.valueOf(valor1-valor2);
    }
    public void isMultiply(){
        result = String.valueOf(valor1*valor2);
    }
    public void isDivide(){
        if(valor2 == 0){
            result = "Divisão Impossivel!";
        }else{
            result = String.valueOf((double)valor1/(double)valor2);
        }
    }
    
    //getters & setters------------------------
    public Integer getValor1() {
        return valor1;
    }
    public void setValor1(Integer valor1) {
        this.valor1 = valor1;
    }
    public Integer getValor2() {
        return valor2;
    }
    public void setValor2(Integer valor2) {
        this.valor2 = valor2;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
}
