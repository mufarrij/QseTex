/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  gp;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Checkbox;
import java.awt.Choice;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class table4 extends javax.swing.JFrame {
	
	strseter  x;
    private DefaultTableModel model=new DefaultTableModel();
    public TableModel md;
    
     
    //
     public String gen(){
         
       TableModel tm = table.getModel();
       int col=tm.getColumnCount();
       String g="";
        
      for(int i=0;i<col;i++){
        g=g+" c |";
      }
      String a="\\begin{tabular}{|"+g+"}\r\n" +"\\hline\r\n";
      return a;
    }
     
    
   public String genfront(){ 
	   String front="\\begin{table}[h!]\r\n"+
                 "\\centering\r\n"+
                  "\\caption{"+ title.getText()+"}\r\n"+
                   "\\label{tab:table1}\r\n";
	   
	   return front;
	   
   }
   public String  end="\\end{tabular}\r\n"+
                "\\end{table}\r\n";
   
   
   
   // public String rowdata(int row,int col){
    public String rowdata(){   
    //TableModel  model=jtable.getModel();
    //md=table.getModel();
    
    
    TableModel tm =table.getModel();
    
    String f="";


for (int i = 0; i < tm.getRowCount(); i++) {
  String a="";  
    
 try{ for (int j = 0; j < tm.getColumnCount(); j++) {
    //Object o = tm.getValueAt(i, j);
    
    //if (o instanceof Integer) {
      //System.out.println((Integer)o);
  //  } else if (o instanceof String) {
      //System.out.println((String)o);
   // }
    String aa=tm.getValueAt(i, j).toString();
    String apend=aa+" & ";
    a+=apend;
    
  }}catch(Exception e){warn.setText("make sure you exit from editable mode");
                       return "";}
 
 
 
String ff=a.substring(0,a.length()-2);
ff+="\\\\\r\n\\hline\r\n";
f+=ff;    
    
}
 return f;   
    
    
    

    
    
    
    
   /* 
    String f="";
    for(int r=0;r<row;r++){
    String a="";
    //s = s.substring(0, s.length() - 1)
    for(int c=0;c <col;c++){
       
       String aa = md.getValueAt(r,c).toString();
       //String aa=b[r][c];
       String apend=aa+"&";
       a+=apend;
    }
    String ff=a.substring(0,a.length()-1);
    ff+="//\r\n\\hline\r\n";
    f+=ff;
    }
    
    return f;
    }
    
     public String getw(int col,int row){
       String f=front+this.gen(col)+this.rowdata(row,col)+end;
       return f;*/
   }
    
 public String getwole(){
 if(this.rowdata()==""){return "";}
 else{
 String x=this.genfront()+this.gen()+this.rowdata()+end;
 return x;
 }
 }
    
    //
    /**
     * Creates new form table2
     */
    
    public void getdata(){
    TableModel tm =table.getModel();
for (int i = 0; i < tm.getRowCount(); i++) {
  for (int j = 0; j < tm.getColumnCount(); j++) {
    Object o = tm.getValueAt(i, j);
    if (o instanceof Integer) {
      System.out.println((Integer)o);
    } else if (o instanceof String) {
      System.out.println((String)o);
    }
  }
    }
    }
    
    
    public table4(strseter t) {
    	lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 13));
    	pos.setModel(new DefaultComboBoxModel(new String[] {"Above", "Below"}));
        initComponents();
        x=t;
    }

    /*public table3(ActionListener actionListener) {
		// TODO Auto-generated constructor stub
	}*/


	/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        rows = new javax.swing.JSpinner();
        colmns = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        gen = new javax.swing.JButton();
        warn = new javax.swing.JLabel();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        rows.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999, 1));

        colmns.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999, 1));

        jLabel1.setText("rows");

        jLabel2.setText("colomns");

        update.setText("Create");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        gen.setText("Add");
        gen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genActionPerformed(evt);
            }
        });
        
        title = new JTextField();
        title.setColumns(10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(warn, GroupLayout.PREFERRED_SIZE, 469, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(96, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(24)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(lblTitle, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(title, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        						.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        						.addComponent(lblPosition))))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(rows, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        						.addComponent(update, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        						.addComponent(colmns, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        						.addComponent(pos, 0, 67, Short.MAX_VALUE))
        					.addGap(37))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(gen, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(32)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(31)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(rows, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel1))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(colmns, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel2))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(update)
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblPosition)
        						.addComponent(pos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addComponent(gen)))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(title, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        				.addComponent(lblTitle, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(warn, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    private void updateActionPerformed(java.awt.event.ActionEvent evt){                                       
        // TODO add your handling code here:
                    int row = (int) rows.getValue();
                    int cols = (int) colmns.getValue();

                    // Dynamic master model...
//                 model.setRowCount(row);
//                  model.setColumnCount(cols);

                    // Replace model
                    table.setModel(new DefaultTableModel(row, cols){});
                 
                 /*table.setModel(new DefaultTableModel(){
                  String[] employee = {"emp 1", "emp 2"}; 

            @Override 
            public int getColumnCount() { 
                return employee.length; 
            } 

            @Override 
            public String getColumnName(int index) { 
                return employee[index]; 
            } 
                 
                 
                 
                 });*/
                        
        
    }                                      

    private void genActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
      //md=table.getModel();
      //int x=(int)rows.getValue();
      //int y=(int)colmns.getValue();
      //System.out.println(this.rowdata(x,y));
      
     //System.out.println(md.getValueAt(0,0).toString());
    //table.getSelectionModel().clearSelection();
    
  // table.selectAll();
    
    /*TableModel tm =table.getModel();
    table.selectAll();
    
    
      
    
   
    
for (int i = 0; i < tm.getRowCount(); i++) {
  for (int j = 0; j < tm.getColumnCount(); j++) {
    Object o = tm.getValueAt(i, j);
    if (o instanceof Integer) {
      System.out.println((Integer)o);
    } else if (o instanceof String) {
      System.out.println((String)o);
    }
  }
}*/
  
  warn.setText("");    
//System.out.println(this.getwole());
  String error=this.rowdata();
   if(error !=""){
   x.tst=this.getwole();
   x.tp=(String) pos.getSelectedItem();
   this.setVisible(false);
   }
   else{
	   warn.setText("you are not exit from edit mode");
   }
   //System.out.println(tm.getValueAt(1,0));
     
    // this.getdata();

    //System.out.println(this.rowdata());
        
    }                                   

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(table2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(table2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(table2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(table2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new table2().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify                     
    private javax.swing.JSpinner colmns;
    private javax.swing.JButton gen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner rows;
    public javax.swing.JTable table;
    private javax.swing.JButton update;
    private javax.swing.JLabel warn;
    private final JComboBox pos = new JComboBox();
    private final JLabel lblPosition = new JLabel("Position");
    private JTextField title;
    private final JLabel lblTitle = new JLabel("        Title");
}

