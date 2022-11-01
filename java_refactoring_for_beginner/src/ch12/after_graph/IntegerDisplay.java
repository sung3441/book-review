package ch12.after_graph;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class IntegerDisplay extends Frame implements ActionListener, ValueListener {

    private final Label octalLabel = new Label("0");
    private final Label decimalLabel = new Label("0");
    private final Label hexadecimalLabel = new Label("0");
    private final Button incrementButton = new Button("+");
    private final Button decrementButton = new Button("-");

    private Value value = new Value(0);

    private final Graph graphCircle = Graph.create(Graph.CIRCLE, 100, 100);
    private final Graph graphRectangle = Graph.create(Graph.RECTANGLE, 100, 50);

    public IntegerDisplay() {
        super("IntegerDisplay");

        setLayout(new BorderLayout());

        Panel panel = new Panel(new GridLayout(4, 2));
        panel.add(new Label("Octal: "));
        panel.add(octalLabel);
        panel.add(new Label("Decimal: "));
        panel.add(decimalLabel);
        panel.add(new Label("Hexadecimal: "));
        panel.add(hexadecimalLabel);
        panel.add(incrementButton);
        panel.add(decrementButton);

        add(panel, BorderLayout.NORTH);
        add(graphCircle, BorderLayout.CENTER);
        add(graphRectangle, BorderLayout.SOUTH);

        incrementButton.addActionListener(this);
        decrementButton.addActionListener(this);

        value.addValueListener(this);

        value.addValueListener(graphCircle);
        value.addValueListener(graphRectangle);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == incrementButton) {
            setValue(value.getValue() + 1);
        } else if (e.getSource() == decrementButton) {
            setValue(value.getValue() - 1);
        }
    }

    public int getValue() {
        return value.getValue();
    }

    public void setValue(int value) {
        this.value.setValue(value);
    }

    @Override
    public void valueChanged(ValueChangeEvent e) {
        if (e.getSource() == value) {
            octalLabel.setText(Integer.toString(value.getValue(), 8));
            decimalLabel.setText(Integer.toString(value.getValue(), 10));
            hexadecimalLabel.setText(Integer.toString(value.getValue(), 16));
        }
    }
}
