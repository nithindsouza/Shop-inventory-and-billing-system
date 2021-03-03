public class Screenscreen {
    public static void main(String args[])
    {
        splash Splash = new splash();
        Splash.setVisible(true);
        loginForm LoginForm = new loginForm();
        try{
            for(int i = 0;i<=100;i++){
                Thread.sleep(40);
                Splash.loadingnum.setText(Integer.toString(i)+"%");
                Splash.loadingbar.setValue(i);
            if(i==100){
                    Splash.setVisible(false);
                    LoginForm.setVisible(true);
                }
            }
        }catch(Exception e){
              
      
        }
    }
}
