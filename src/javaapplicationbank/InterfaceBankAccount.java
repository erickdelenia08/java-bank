/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javaapplicationbank;

/**
 *
 * @author erick
 */
public interface InterfaceBankAccount {
    
    public final String BANK="Java Bank";
    public void deposit(int amt);
    public void withdraw(int amt);
    public int getBalance();
    public String getBankName();
    
}