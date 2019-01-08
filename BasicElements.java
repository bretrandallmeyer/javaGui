import javax.swing.*;

public  class BasicElements {

    public static void main( String args[]){
        JFrame myFrame = new JFrame("A basic java gui");
        JButton myButton = new JButton();
        myButton.setSize(200,50);

        myFrame.setLayout(null);

        myFrame.add(myButton);

        myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        myFrame.setSize(666, 666);

        System.out.println("basic java elements");
    }

}