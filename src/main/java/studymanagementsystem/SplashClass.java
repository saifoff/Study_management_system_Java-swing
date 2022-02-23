/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studymanagementsystem;

/**
 *
 * @author saiful
 */
public class SplashClass {
    public static void main(){
        splash ap= new splash();
        ap.setVisible(true);
        try {
            for(int a=0;a<=101;a++){
                Thread.sleep(30);
               ap.jProgressBar1.setValue(a);
            }
            ap.setVisible(false);
            //LogIn login=new LogIn();
            //login.setVisible(true);
        } catch (InterruptedException e) {
        }
    }
    
}
