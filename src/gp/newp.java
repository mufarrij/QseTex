/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;

/**
 *
 * @author User
 */
public class newp extends javax.swing.JFrame{

    /**
     * Creates new form newp
     */
	
	main_frame g;
    
	public newp(main_frame a){
		sub_title.setEditable(true);
		sub_code.setEditable(true);
    	getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
    	getContentPane().setBackground(SystemColor.menu);
        initComponents();
        g=a;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
        degree = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
        sem = new javax.swing.JComboBox<>();
        sem.setFont(new Font("Tahoma", Font.PLAIN, 11));
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
        to_answer = new javax.swing.JComboBox<>();
        to_answer.setFont(new Font("Tahoma", Font.PLAIN, 11));
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
        duration = new javax.swing.JComboBox<>();
        duration.setFont(new Font("Tahoma", Font.PLAIN, 11));
        jLabel9 = new javax.swing.JLabel();
        jLabel9.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
        cal = new javax.swing.JComboBox<>();
        cal.setFont(new Font("Tahoma", Font.PLAIN, 11));
        jLabel10 = new javax.swing.JLabel();
        jLabel10.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 11));
        per = new javax.swing.JComboBox<>();
        per.setFont(new Font("Tahoma", Font.PLAIN, 11));
        jLabel11 = new javax.swing.JLabel();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       //setDefaultCloseOperation(newp.EXIT_ON_CLOSE);
        setTitle("New Paper");
        setBackground(java.awt.SystemColor.inactiveCaption);

        jPanel1.setBackground(SystemColor.controlHighlight);
        jPanel1.setBorder(UIManager.getBorder("CheckBoxMenuItem.border")); // NOI18N

        jLabel1.setText("     Degree programme");

        jLabel2.setText("     Academic year");

        jLabel3.setText("  Semester");

        sem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd" }));

        jLabel4.setText("  Exam Year");

        jLabel5.setText("  Subject Code");

        jLabel6.setText("  Subject Title");
        
        year = new JComboBox();
        year.setFont(new Font("Tahoma", Font.PLAIN, 11));
        year.setModel(new DefaultComboBoxModel(new String[] {"2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024"}));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(18)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
        							.addComponent(jLabel6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jLabel5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        							.addComponent(jLabel4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(sub_title, 0, 192, Short.MAX_VALUE)
        				.addComponent(degree, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
        				.addComponent(year, 0, 192, Short.MAX_VALUE)
        				.addComponent(sem, 0, 192, Short.MAX_VALUE)
        				.addComponent(aca_year, 0, 192, Short.MAX_VALUE)
        				.addComponent(sub_code, 0, 192, Short.MAX_VALUE))
        			.addGap(145))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        				.addComponent(degree, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(14)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(aca_year, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(13)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(sem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(year, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(sub_code, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6)
        				.addComponent(sub_title, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(25, Short.MAX_VALUE))
        );
        aca_year.setFont(new Font("Tahoma", Font.PLAIN, 11));
        aca_year.setModel(new DefaultComboBoxModel(new String[] {"2016/2017", "2017/2018", "2018/2019", "2019/2020", "2020/2021", "2021/2022", "2022/2023", "2023/2024"}));
        jPanel1.setLayout(jPanel1Layout);

        jPanel2.setBackground(SystemColor.controlHighlight);
        jPanel2.setBorder(UIManager.getBorder("CheckBoxMenuItem.border"));

        jLabel7.setText("    Answer");

        to_answer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "one", "two", "three", "four", " " }));

        jLabel8.setText("    Duration");

        duration.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1h", "2h", "2.5h", "3h" }));

        jLabel9.setText("Calculaters");

        cal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alowed", "Not Alowed" }));

        jLabel10.setText("Additional answer sheets");

        per.setModel(new DefaultComboBoxModel(new String[] {"Permited", "Not Permited"}));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(duration, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(to_answer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(per, 0, 94, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(to_answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(per, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel11.setBackground(new java.awt.Color(51, 102, 255));
        
        paper = new JLabel("                 Paper Details");
        paper.setFont(new Font("Microsoft JhengHei", Font.BOLD, 17));
        
        lblNewLabel = new JLabel("     Instructions");
        lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 17));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(24)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 119, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jPanel1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        						.addComponent(jPanel2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        						.addComponent(create, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
        					.addGap(19)))
        			.addContainerGap())
        		.addGroup(layout.createSequentialGroup()
        			.addGap(125)
        			.addComponent(paper, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(194, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(167, Short.MAX_VALUE)
        			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
        			.addGap(144))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(39)
        			.addComponent(paper)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(47)
        			.addComponent(lblNewLabel)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(41)
        			.addComponent(create)
        			.addGap(19)
        			.addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        			.addContainerGap())
        );
        create.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	    g.tq.setText("0");
        	    g.tm.setText("0");
        	    g.mc.setText("0");
        	    g.mm.setText("0");
        		String spa="Write your answers on and only on the space provided on this question paper";
        		String alw="";
        		if(cal.getSelectedItem()!="Alowed"){
        			alw="not";
        		}
        		if(per.getSelectedItem()=="Permited"){
        			spa="You can use additional papers to answer question other than space provided";
        		}
        		
        		
        		String latex="\\documentclass[12pt,onecolumn,a4paper]{article}\r\n"+      
        				"\\usepackage{ucsc-exam}\r\n"+
        				"\\usepackage{graphicx}"+
        				"\\usepackage{times}\r\n"+
        				"\\usepackage{enumerate}\r\n"+
        				"\\degree{"+ degree.getText()+"}\r\n"+
        				"\\academicyear{" + aca_year.getSelectedItem()+ "}\r\n"+
        				"\\semester{" + sem.getSelectedItem()+ "}\r\n"+
        				"\\examyear{" + year.getSelectedItem()+ "}\r\n"+
        				"\\subjectcode{" +sub_code.getSelectedItem() + "}\r\n"+
        				"\\subjecttitle{" +sub_title.getSelectedItem() + "}\r\n"+
        				"\\duration{" +duration.getSelectedItem() + "}\r\n"+
        				"\\toanswer{" +to_answer.getSelectedItem() + "}\r\n"+
        				"\\alow{ "+ alw +"}\r\n"+
                        "\\spaper{"+ spa+"}\r\n"+


        				"\\begin{document}\r\n"+
        				"\\maketitle\r\n"+

        				
        				"\\begin{expaper}\r\n";


        				String end="\\end{expaper}\r\n"+
        				"\\end{document}\r\n ";
        		        
        				String  endmark="\\begin{center}\r\n"+
        			                "----- ***** -----\r\n"+
        			                 "\\end{center}\r\n";
        				 g.paper =latex;
        				 String write=latex+endmark+end;
        					
        				  try{
        					  PrintWriter writer = new PrintWriter("C:\\Users\\user\\Desktop\\MyFiles\\java\\fwdtemplates(1)\\latex.tex", "UTF-8");
        					  writer.println(write);
        					  writer.close();
        					  
        					 /* gp a=new gp();
        					  a.frmPrototype.setVisible(true);*/
        					 // g.setVisible(true);
        					  DefaultListModel listModel = new DefaultListModel();
        					  try{
        					  BufferedReader in=new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\MyFiles\\java\\fwdtemplates(1)\\latex.tex"));
        					  String line=null;
        					  while((line=in.readLine())!=null){
        						  listModel.addElement(line);
        						  g.tex.append(line+"\n");
        					  }
        					  //a.tex.setModel(listModel);
        					  //g.tex.setModel(listModel);
        					  }
        					  catch(Exception ex){
        						  ex.printStackTrace();
        						  
        					  }
        					  
        					  
        					  
        					  
        				  }catch(Exception ex){
        					  ex.printStackTrace();
        					  
        					  
        				  }  
        				  dispose();
        		        
        		
        		
        	}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
        });
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

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
            java.util.logging.Logger.getLogger(newp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new newp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> sem;
    private javax.swing.JComboBox<String> to_answer;
    private javax.swing.JComboBox<String> duration;
    private javax.swing.JComboBox<String> cal;
    private javax.swing.JComboBox<String> per;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField degree;
    private final JButton create = new JButton("   Create");
    private final JComboBox aca_year = new JComboBox();
    private JComboBox year;
    private JLabel paper;
    private JLabel lblNewLabel;
    private final JComboBox sub_code = new JComboBox();
    private final JComboBox sub_title = new JComboBox();
}
