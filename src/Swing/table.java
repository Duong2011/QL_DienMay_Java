/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Swing;

import java.awt.Color;
import java.awt.Component;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class table extends JTable{
    public table(){
        setShowHorizontalLines(true);
        setRowHeight(40);
        setGridColor(new Color(230, 230, 230));
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                tableHeader header = new tableHeader(value + "");
                if(column == 9){
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
          
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                if(column != 9){
                    Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    com.setBackground(Color.WHITE);
                    setBorder(noFocusBorder);
                    if(isSelected){
                       com.setForeground(Color.BLACK);
                       com.setBackground(new Color(255, 216, 143));
                    } else {
                        com.setForeground(new Color(102, 102, 102));
                        com.setBackground(Color.WHITE);
                    }
                    return com;
                }
                return new JLabel("");
            }
        });
    }
    
    public void addRow(Vector row){
        DefaultTableModel model = (DefaultTableModel)getModel();
        model.addRow(row);
    }
}
