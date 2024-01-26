
public class Main{
    public static void main(String[] args) {

        OnOneListener onOneListener = new OnOneListener() {
            @Override
            public void onOne(String message) {
                System.out.println("One: " + message);
            }
        };

        OnOneListener onOneListener1 = (String message) ->{
            System.out.println("One Lambda: " + message);
        };

        onOneListener.onOne("Sin lambda :(");
        onOneListener1.onOne("Con Lambda :)");

        OnClick onClick = (point)->{
            System.out.println("Clicked Point: " + point);
        };

        OnOneListener onOneListener2 = message ->  System.out.println("Tu mensaje");

    }


}