import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculatorPanel implements ActionListener{
    private JFrame mainFrame;
    private JPanel borderPanel, gridPanel;
    private JTextField textBox;
    private JButton add, subtract, multiply, divide, modulo, equal;
    private JButton zero, one, two, three, four, five, six, seven, eight, nine;
    private String key="";
    private double total;
    private double variable1, variable2, variable3;
    private double sum;

    public static void main(String[] args) {
        calculatorPanel myCode = new calculatorPanel();
    }

    public calculatorPanel(){
        mainFrame = new JFrame("Mini Calculator");
        mainFrame.setSize(300,350);

        borderPanel = new JPanel();
        borderPanel.setLayout(new BorderLayout());
        mainFrame.add(borderPanel);

        gridPanel = new JPanel(new GridLayout(4, 4));
        borderPanel.add(gridPanel, BorderLayout.CENTER);


        textBox = new JTextField("enter here:");
        add = new JButton("+");
        subtract = new JButton("-");
        multiply = new JButton("x");
        divide = new JButton("÷");
        modulo = new JButton("%");
        equal = new JButton("=");

        zero = new JButton("0");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");

        borderPanel.add(textBox, BorderLayout.NORTH);
        gridPanel.add(one);
        gridPanel.add(two);
        gridPanel.add(three);
        gridPanel.add(add);
        gridPanel.add(four);
        gridPanel.add(five);
        gridPanel.add(six);
        gridPanel.add(subtract);
        gridPanel.add(seven);
        gridPanel.add(eight);
        gridPanel.add(nine);
        gridPanel.add(multiply);
        gridPanel.add(zero);
        gridPanel.add(modulo);
        gridPanel.add(divide);
        gridPanel.add(equal);


        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        zero.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        modulo.addActionListener(this);
        equal.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        key = e.getActionCommand();
        textBox.setText(key);
        double total = Double.parseDouble(key);
        variable1 = total;
        if (key.equals("+") || key.equals("-") || key.equals("x") || key.equals("÷") || key.equals("%") || key.equals("=")) {
            variable2 = total;
        }else variable3 = total;

        if (key.equals("+")){
            sum = variable1 + variable3;
        }
        if (key.equals("-")){
            sum = variable1 - variable3;
        }
        if (key.equals("x")){
            sum = variable1 * variable3;
        }
        if (key.equals("÷")){
            sum = variable1 / variable3;
        }
        if (key.equals("%")){
            sum = variable1 % variable3;
        }

        System.out.println(variable1);
        System.out.println(variable2);

//        total += key;
//        test = (double)test;
//        textBox.setText(total);

    }
}

