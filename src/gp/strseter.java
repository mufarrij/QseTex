package gp;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;

import gp.math.jahuwaldt.jatex.MainWindow;

import javax.swing.event.ChangeEvent;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Component;
import java.awt.Font;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import javax.swing.JTabbedPane;
import javax.swing.JSpinner;
/**
 *
 * @author User
 */
public class strseter extends javax.swing.JFrame {

    /**
     * Creates new form strseter
     */
	
	public  String  tst="";
	public  String  tp ="Above";
	main1_frame g;
	
	public static JTextArea textAreaStruct = null;
	public static int curPosStruct;
	
	public String imgpath="";
	public String abimgpath="";

	
    public strseter(main1_frame a) {
    	setResizable(false);
    	setFont(new Font("Bell Gothic Std Light", Font.PLAIN, 12));
    	setAlwaysOnTop(true);
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

        jLabel1 = new javax.swing.JLabel();
        Title = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        qno = new javax.swing.JSpinner();
        
        qno.addChangeListener(new ChangeListener() {
        	public void stateChanged(ChangeEvent arg0) {
        		Integer no= (Integer) qno.getValue();
        	    String a=no.toString();
        	    int r=no.intValue();
        	    
        	    if(g.stmapper.containsKey(r)){
        	    	strclass o=(strclass)g.stmapper.get(r);
        	    	String tit=o.utitle;
        	    	stro st1=(stro)o.strlist.get(1);
        	    	Title.setText(tit);
        	        question.setText(st1.question);
        	        Double marks=Double.parseDouble(st1.mark);
        	        Marks.setValue(marks);
        	       
        	       
        	  }else{
        		Title.setText("");
      			question.setText("");
       	         }
        	}
        });
        
        qno.setModel(new SpinnerNumberModel(1, 1, 20, 1));
        jLabel3 = new javax.swing.JLabel();
        sqno = new javax.swing.JSpinner();
        sqno.addChangeListener(new ChangeListener() {
        	public void stateChanged(ChangeEvent arg0) {
        		Integer no= (Integer) sqno.getValue();
        	    String a=no.toString();
        	    int r=no.intValue();
        	    Integer no1=(Integer)qno.getValue();
        		strclass mcb=(strclass)g.stmapper.get(no1);
        		if(mcb.strlist.containsKey(no)){
            		stro o=(stro)mcb.strlist.get(no);
            		question.setText(o.uquestion);
        	    	Double marks=Double.parseDouble(o.mark);
        	    	Marks.setValue(marks);
        	    	Area.setSelectedItem(o.btarea);
            			
            			
            		}
            		else{
            			question.setText("");
             	      }
        	}
        });
        sqno.setModel(new SpinnerNumberModel(1, 1, 8, 1));
        changetitle = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Marks = new javax.swing.JSpinner();
        Marks.setModel(new SpinnerNumberModel(0.0, 0.0, 100.0, 1.0));
        Table = new javax.swing.JButton();
        Bloom = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Area = new javax.swing.JComboBox<>();
        space = new javax.swing.JSpinner();
        space.setModel(new SpinnerNumberModel(0.0, 0.0, 10.0, 1.0));
        jLabel7 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        setTitle("Structure Setter");

        jLabel1.setText("  Title");

        jLabel2.setText(" Question No");

        jLabel3.setText(" Sub Part No");

        changetitle.setText("Change Title");
        changetitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Question");

        jLabel5.setText("Marks");

        Table.setText("Add Table");
        Table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	TableActionPerformed(evt);
            }
        });

        Bloom.setText("Bloom Texanomy");
        Bloom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloomActionPerformed(evt);
            }
        });

        jLabel6.setText("  Area");

        Area.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Remembering", "Understanding", "Applying", "Analyzing", "Evaluating", "Creating" }));

        jLabel7.setText("Space");

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        question = new javax.swing.JTextArea();
        question.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseReleased(MouseEvent arg0) {
        		curPosStruct=question.getCaretPosition();
				textAreaStruct=question;
        	}
        });
        question.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyReleased(KeyEvent e) {
        		curPosStruct=question.getCaretPosition();
				textAreaStruct=question;
        	}
        });
        
                question.setColumns(20);
                question.setRows(5);
        
        Pic = new JButton("Picture");
        Pic.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JFileChooser fileChooser=new JFileChooser("C:\\");
        		FileNameExtensionFilter filter;
        		filter = new FileNameExtensionFilter("jpeg, gif and png files", "jpg", "gif", "png");
        		fileChooser.addChoosableFileFilter(filter);
        		int returnVal = fileChooser.showOpenDialog((Component)e.getSource());
        	    if (returnVal == JFileChooser.APPROVE_OPTION) {
        	        File file = fileChooser.getSelectedFile();
        	        String filename=fileChooser.getSelectedFile().getName();
        	        abimgpath=filename;
        	        try {
        	           imgpath = file.toString();
        	           
        	           String dest="C:\\Users\\User\\Desktop\\MyFiles\\java\\fwdtemplates(1)\\+"+filename;
        	           File f1=new File(imgpath);
        	           File f2=new File(dest);
        	           Files.copy(f1.toPath(),f2.toPath(),StandardCopyOption.REPLACE_EXISTING);
        	           System.out.println(imgpath);
        	        } catch (Exception ex) {
        	          System.out.println("problem accessing file"+file.getAbsolutePath());
        	        }
        	    } 
        	    else {
        	        System.out.println("File access cancelled by user.");
        	    }
        	}
        });
        
        JButton btnAddMaths = new JButton("Add Maths");
        btnAddMaths.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		try {
                	
                	if(mcqseter.main != null){
                		mcqseter.main.textArea = null;
                		mcqseter.main.textField = null;
                		mcqseter.main.textPaneEssay = null;
                		mcqseter.main.curPos = curPosStruct;
                		mcqseter.main.textAreaStruct = textAreaStruct;
                		mcqseter.main.setVisible(true);
                	}else{
                		mcqseter.main = new MainWindow(null,null,null,textAreaStruct,curPosStruct);
                		mcqseter.main.setVisible(true);
                	}
                	//BufferedReader b=new BufferedReader(FileReader("math.txt"));
                	
                                          

                } catch (Throwable ex) {
                    ex.printStackTrace();
                    
                }
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(Add, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createParallelGroup(Alignment.LEADING)
        					.addGroup(layout.createSequentialGroup()
        						.addContainerGap()
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(space, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED, 615, Short.MAX_VALUE)
        									.addComponent(btnAddMaths)
        									.addGap(25)
        									.addComponent(Pic))
        								.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        									.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(Title, GroupLayout.PREFERRED_SIZE, 853, GroupLayout.PREFERRED_SIZE))
        								.addComponent(question, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)))
        						.addGap(32)
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        							.addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jLabel3, Alignment.LEADING))
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        							.addComponent(Bloom, 0, 0, Short.MAX_VALUE)
        							.addComponent(Table, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(changetitle, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(qno, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
        							.addGroup(layout.createSequentialGroup()
        								.addGap(6)
        								.addComponent(Area, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
        							.addComponent(sqno)
        							.addComponent(Marks)))
        					.addGroup(layout.createSequentialGroup()
        						.addGap(1078)
        						.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))))
        			.addGap(94))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(35)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(qno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(Title, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(changetitle))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(sqno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(Marks, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel5))
        					.addGap(29)
        					.addComponent(Table))
        				.addComponent(question, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(19)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel7)
        						.addComponent(space, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(Bloom)
        						.addComponent(btnAddMaths)
        						.addComponent(Pic))))
        			.addGap(18)
        			.addComponent(jLabel6)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(Area, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(176)
        			.addComponent(Add)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        qno.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	int no=(int) qno.getValue();
   	   if(g.stmapper.containsKey(no)){
  	    	strclass o=(strclass)g.stmapper.get(no);
  	    	o.title="\\question {"+Title.getText()+".\r\n";
  	    	o.utitle=Title.getText();
  	   }else{
  		   Title.setText("");
  	   }
   	   
    	
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	
    	
    }  
    
    private void TableActionPerformed(java.awt.event.ActionEvent evt){
      	  table4 a=new table4(this);
          a.setVisible(true);
      	
      }

    private void BloomActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	new BT().setVisible(true);
    }                                        

    private void AddActionPerformed(java.awt.event.ActionEvent evt) { 
        
    	 int no= (int) qno.getValue();
    	 
  		 Double mark=(Double)Marks.getValue();
  		 int sqn=(int)sqno.getValue();
    	
    	
    	String dtable="";
   		String utable="";
           
   		if(tst!=""){
   		   if(tp=="Above"){
   			   utable =tst;
   			   
   		   }
   		   else{
   			   dtable=tst; 
   		   }
   		}
    	
   		
   		String pic="";
   		if(abimgpath!=null){
   			pic="\\includegraphics[width=0.5\\textwidth]{"+"+"+abimgpath+"}\\break\r\n";
   		      
   		}
   		
   		
   		
   		String stitle="\\newpage\r\n"+"\\question{"+Title.getText()+"\r\n";
   		
    	String str=
    		  utable+"\\subquestion{"+ pic+question.getText() +"\r\n" + dtable+ 
              
              "\\qmarks{"+Marks.getValue()+"}\r\n"+

              "\\answer{"+space.getValue()+"in}\r\n"+

              "}\r\n";
              
             
    	String start="\\begin{subqlist}\r\n";
    	String end="\\end{subqlist}\r\n";
    	
    	
    	
    	if(g.stmapper.containsKey(no)){
    		strclass testa=(strclass)g.stmapper.get(no);
    		g.stmapper.remove(no);
    	    testa.title="\\newpage\r\n"+"\\question {"+Title.getText()+".\r\n";
   			testa.utitle=Title.getText();
    		if(testa.strlist.containsKey(sqn)){
    			System.out.print(testa.mark);
    			stro r=(stro)testa.strlist.get(sqn);
    			testa.strlist.remove(sqn);
    			String oldmark=r.mark;
    			r.qno= sqn;
    	        r.question=str;
    	        r.uquestion=question.getText();
        		r.mark=Marks.getValue().toString();
        		r.btarea=Area.getSelectedItem().toString();
        		/*if(!testa.CheckMark()){
        			JOptionPane.showMessageDialog(null, "Marks for total questions exeeded the Limit");
        			
        		}else{
        		testa.strlist.put(sqn,r);
        		}*/
        		testa.strlist.put(sqn,r);
        		pic="";
        		abimgpath="";
       	       }
    		else{
    			stro t=new stro(no,str);
    			t.uquestion=question.getText();
        		t.qno= sqn;
        		t.mark=Marks.getValue().toString();
        		t.btarea=Area.getSelectedItem().toString();
        		testa.strlist.put(sqn,t);
    			}
    		   g.stmapper.put(no,testa);
    		   pic="";
    		   abimgpath="";
    		
    	}else{
    	
    		strclass r=new strclass(no);
    		r.title=stitle;
    		r.utitle=Title.getText();
    		stro t=new stro(no,str);
    		t.uquestion=question.getText();
    		t.qno= sqn;
    		t.mark=Marks.getValue().toString();
    		t.btarea=Area.getSelectedItem().toString();
    		r.strlist.put(sqn,t);
    		g.stmapper.put(no,r);
    		pic="";
    		abimgpath="";
    	}
    	
    	g.strset();
		g.strupd();
		tst="";
    	
    	
    	
       
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
            java.util.logging.Logger.getLogger(strseter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(strseter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(strseter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(strseter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new strseter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton changetitle;
    private javax.swing.JButton Table;
    private javax.swing.JButton Bloom;
    private javax.swing.JButton Add;
    private javax.swing.JComboBox<String> Area;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSpinner qno;
    private javax.swing.JSpinner sqno;
    private javax.swing.JSpinner Marks;
    private javax.swing.JSpinner space;
    private javax.swing.JTextArea question;
    private javax.swing.JTextField Title;
    private JButton Pic;
    /**
     * @wbp.nonvisual location=425,-31
     */
    private final JSpinner spinner = new JSpinner();
}
