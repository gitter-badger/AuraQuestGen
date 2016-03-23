package Interface;

import Core.AuraQuestGen;
import Utilities.UtilSOfTC;

import javax.swing.*;
import javax.swing.text.html.HTMLDocument;
import java.awt.*;

/**
 * Created by Bruno on 23/03/2016.
 */
public class GUI {
    private static JFrame frame;
    public static void createGUI(){
        frame = new JFrame("Aura Quest Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2,0));

        ScriptIdGUI(frame);
        ScriptNameGUI(frame);
        QuestNameGUI(frame);
        QuestDescGUI(frame);

        frame.pack();
        frame.setVisible(true);
    }

    private static void ScriptIdGUI(JFrame frame){
        //Quest ID
        JLabel askQuestId = new JLabel("Script ID:");
        JTextField getQuestId = new JTextField(10);
        JButton setQuestId = new JButton("Set");
        JLabel currQuestId = new JLabel("null");


        setQuestId.addActionListener(e -> {
            if (getQuestId.getText().isEmpty()){
                currQuestId.setText(
                        "null"
                );
            }
            else{
                currQuestId.setText(
                        (UtilSOfTC.isInteger(getQuestId.getText()) ?
                                getQuestId.getText() : "Invalid")
                );
                //AuraQuestGen.script.id=Integer.parseInt(getQuestId.getText());
            }
        });

        askQuestId.setPreferredSize(new Dimension(80,20));
        currQuestId.setPreferredSize(new Dimension(100,20));

        frame.getContentPane().add(askQuestId);
        frame.getContentPane().add(getQuestId);
        frame.getContentPane().add(setQuestId);
        frame.getContentPane().add(currQuestId);
    }

    private static void ScriptNameGUI(JFrame frame){
        //Quest Name
        JLabel askScriptName = new JLabel("Script Name:");
        JTextField getScriptName = new JTextField(10);
        JButton setScriptName = new JButton("Set");
        JLabel currScriptName = new JLabel("null");

        setScriptName.addActionListener(e -> {
            if (getScriptName.getText().isEmpty()){
                currScriptName.setText("null");
            }
            else{
                currScriptName.setText(getScriptName.getText());
                //AuraQuestGen.script.scriptName=getScriptName.getText();
            }
        });

        askScriptName.setPreferredSize(new Dimension(80,20));
        currScriptName.setPreferredSize(new Dimension(100,20));

        frame.getContentPane().add(askScriptName);
        frame.getContentPane().add(getScriptName);
        frame.getContentPane().add(setScriptName);
        frame.getContentPane().add(currScriptName);
    }

    private static void QuestNameGUI(JFrame frame){
        //Quest Name
        JLabel askQuestName = new JLabel("Quest Name:");
        JTextField getQuestName = new JTextField(10);
        JButton setQuestName = new JButton("Set");
        JLabel currQuestName = new JLabel("null");

        setQuestName.addActionListener(e -> {
            if (getQuestName.getText().isEmpty()){
                currQuestName.setText("null");
            }
            else{
                currQuestName.setText(getQuestName.getText());
                //AuraQuestGen.script.quest.name=getQuestName.getText();
            }
        });

        askQuestName.setPreferredSize(new Dimension(80,20));
        currQuestName.setPreferredSize(new Dimension(100,20));

        frame.getContentPane().add(askQuestName);
        frame.getContentPane().add(getQuestName);
        frame.getContentPane().add(setQuestName);
        frame.getContentPane().add(currQuestName);
    }

    private static void QuestDescGUI(JFrame frame){
        //Quest Name
        JLabel askQuestDesc = new JLabel("Quest Description:");
        JTextArea getQuestDesc = new JTextArea();
        JButton setQuestDesc = new JButton("Set");
        JLabel currQuestDesc = new JLabel("null");

        setQuestDesc.addActionListener(e -> {
            if (getQuestDesc.getText().isEmpty()){
                currQuestDesc.setText("null");
            }
            else{
                currQuestDesc.setText(getQuestDesc.getText());
                //AuraQuestGen.script.quest.name=getQuestDesc.getText();
            }
        });

        askQuestDesc.setPreferredSize(new Dimension(80,20));
        currQuestDesc.setPreferredSize(new Dimension(100,20));

        frame.getContentPane().add(askQuestDesc);
        frame.getContentPane().add(getQuestDesc);
        frame.getContentPane().add(setQuestDesc);
        frame.getContentPane().add(currQuestDesc);
    }
}
