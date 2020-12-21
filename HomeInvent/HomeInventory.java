package homeinventory;

import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.awt.print.*;

public class HomeInventory extends javax.swing.JFrame 
{
  String letterClicked;
  static final int maximumEntries = 300,entriesPerPage = 2;
  static int numberEntries,lastPage;
  static InventoryItem[] myInventory = new InventoryItem[maximumEntries];
  int currentEntry,n;
  ImageIcon image = null; 
  
  public HomeInventory()
  {
    setTitle("Home Inventory Manager");
    setResizable(false);
    addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent evt){exitForm(evt);}});
    getContentPane().setLayout(new GridBagLayout());
    GridBagConstraints gridConstraints;
    pack();
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    setBounds((int)(0.5 *(screenSize.width - getWidth())),(int)(0.5*(screenSize.height- getHeight())),getWidth(), getHeight()); 
    initComponents();
    try
    {
        BufferedReader inputFile = new BufferedReader(new FileReader("inventory.txt"));
        numberEntries = Integer.valueOf(inputFile.readLine()).intValue();

         if (numberEntries != 0)
         {
            for (int i=0; i<numberEntries; i++)
            {
             myInventory[i] = new InventoryItem();
             myInventory[i].description = inputFile.readLine();
             myInventory[i].location = inputFile.readLine();
             myInventory[i].serialNumber = inputFile.readLine();
             myInventory[i].marked = Boolean.valueOf(inputFile.readLine()).booleanValue();
             myInventory[i].purchasePrice = inputFile.readLine();
             myInventory[i].purchaseDate = inputFile.readLine();
             myInventory[i].purchaseLocation = inputFile.readLine();
             myInventory[i].note = inputFile.readLine();
             myInventory[i].photoFile = inputFile.readLine();}}
         
        n = Integer.valueOf(inputFile.readLine()).intValue();
        
        if (n != 0)
        {
         for(int i = 0; i < n; i++)
         {locationComboBox.addItem(inputFile.readLine());}}
        
         inputFile.close();
         
         currentEntry = 1;
         showEntry(currentEntry);}
        
        catch (Exception ex)
        { numberEntries = 0;
          currentEntry = 0; }
        
        if(numberEntries == 0)
        {
         newButton.setEnabled(false);
         deleteButton.setEnabled(false);
         nextButton.setEnabled(false);
         previousButton.setEnabled(false);
         printButton.setEnabled(false);}}

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        itemTextField1 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        itemlabel = new javax.swing.JLabel();
        locationlabel = new javax.swing.JLabel();
        seriallabel = new javax.swing.JLabel();
        pricelabel = new javax.swing.JLabel();
        itemTextField = new javax.swing.JTextField();
        locationComboBox = new javax.swing.JComboBox<>();
        serialTextField = new javax.swing.JTextField();
        markedCheckBox = new javax.swing.JCheckBox();
        priceTextField = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        storeTextField = new javax.swing.JTextField();
        noteTextField = new javax.swing.JTextField();
        StoreLabel = new javax.swing.JLabel();
        noteLabel = new javax.swing.JLabel();
        photoLabel = new javax.swing.JLabel();
        photoButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        photoPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        photoTextArea = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        newButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        itemTextField1.setPreferredSize(new java.awt.Dimension(400, 25));

        jButton8.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        jButton8.setText("F");
        jButton8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton8.setPreferredSize(new java.awt.Dimension(37, 27));

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Inventory Manager");

        itemlabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        itemlabel.setText("Inventory Item");

        locationlabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        locationlabel.setText("Location");

        seriallabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        seriallabel.setText("Serial Number");

        itemTextField.setPreferredSize(new java.awt.Dimension(400, 25));

        locationComboBox.setEditable(true);
        locationComboBox.setPreferredSize(new java.awt.Dimension(270, 25));
        locationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationComboBoxActionPerformed(evt);
            }
        });

        serialTextField.setPreferredSize(new java.awt.Dimension(270, 25));
        serialTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialTextFieldActionPerformed(evt);
            }
        });

        markedCheckBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        markedCheckBox.setText("Marked?");
        markedCheckBox.setFocusable(false);

        priceTextField.setPreferredSize(new java.awt.Dimension(160, 25));
        priceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTextFieldActionPerformed(evt);
            }
        });

        priceLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        priceLabel.setText(" Purchase Price");

        dateLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dateLabel.setText("Date Purchased");

        storeTextField.setPreferredSize(new java.awt.Dimension(400, 25));

        noteTextField.setPreferredSize(new java.awt.Dimension(400, 25));

        StoreLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        StoreLabel.setText("Store/Website");

        noteLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        noteLabel.setText("Note");

        photoLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        photoLabel.setText("Photo");

        photoButton.setText("...");
        photoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoButtonActionPerformed(evt);
            }
        });

        jPanel1.setFocusable(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(240, 160));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setText("A");
        jButton2.setFocusable(false);
        jButton2.setMargin(new java.awt.Insets(-10, -10, -10, -10));
        jButton2.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setText("B");
        jButton3.setFocusable(false);
        jButton3.setMargin(new java.awt.Insets(-10, -10, -10, -10));
        jButton3.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton4.setText("C");
        jButton4.setFocusable(false);
        jButton4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton4.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 0));
        jButton5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton5.setText("D");
        jButton5.setFocusable(false);
        jButton5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton5.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 0));
        jButton6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton6.setText("E");
        jButton6.setFocusable(false);
        jButton6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton6.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 0));
        jButton7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton7.setText("F");
        jButton7.setFocusable(false);
        jButton7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton7.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 0));
        jButton9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton9.setText("G");
        jButton9.setFocusable(false);
        jButton9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton9.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 255, 0));
        jButton10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton10.setText("H");
        jButton10.setFocusable(false);
        jButton10.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton10.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 255, 0));
        jButton11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton11.setText("I");
        jButton11.setFocusable(false);
        jButton11.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton11.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 255, 0));
        jButton12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton12.setText("J");
        jButton12.setFocusable(false);
        jButton12.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton12.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(255, 255, 0));
        jButton13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton13.setText("K");
        jButton13.setFocusable(false);
        jButton13.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton13.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(255, 255, 0));
        jButton14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton14.setText("L");
        jButton14.setFocusable(false);
        jButton14.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton14.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(255, 255, 0));
        jButton15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton15.setText("M");
        jButton15.setFocusable(false);
        jButton15.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton15.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(255, 255, 0));
        jButton16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton16.setText("N");
        jButton16.setFocusable(false);
        jButton16.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton16.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(255, 255, 0));
        jButton17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton17.setText("O");
        jButton17.setFocusable(false);
        jButton17.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton17.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(255, 255, 0));
        jButton18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton18.setText("P");
        jButton18.setFocusable(false);
        jButton18.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton18.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(255, 255, 0));
        jButton19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton19.setText("Q");
        jButton19.setFocusable(false);
        jButton19.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton19.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(255, 255, 0));
        jButton20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton20.setText("R");
        jButton20.setFocusable(false);
        jButton20.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton20.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(255, 255, 0));
        jButton21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton21.setText("S");
        jButton21.setFocusable(false);
        jButton21.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton21.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(255, 255, 0));
        jButton22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton22.setText("T");
        jButton22.setFocusable(false);
        jButton22.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton22.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(255, 255, 0));
        jButton23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton23.setText("U");
        jButton23.setFocusable(false);
        jButton23.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton23.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(255, 255, 0));
        jButton24.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton24.setText("V");
        jButton24.setFocusable(false);
        jButton24.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton24.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(255, 255, 0));
        jButton25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton25.setText("W");
        jButton25.setFocusable(false);
        jButton25.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton25.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setBackground(new java.awt.Color(255, 255, 0));
        jButton26.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton26.setText("X");
        jButton26.setFocusable(false);
        jButton26.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton26.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setBackground(new java.awt.Color(255, 255, 0));
        jButton27.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton27.setText("Y");
        jButton27.setFocusable(false);
        jButton27.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton27.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(255, 255, 0));
        jButton28.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton28.setText("Z");
        jButton28.setFocusable(false);
        jButton28.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton28.setPreferredSize(new java.awt.Dimension(37, 27));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        photoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        photoPanel.setFocusable(false);
        photoPanel.setPreferredSize(new java.awt.Dimension(270, 160));

        javax.swing.GroupLayout photoPanelLayout = new javax.swing.GroupLayout(photoPanel);
        photoPanel.setLayout(photoPanelLayout);
        photoPanelLayout.setHorizontalGroup(
            photoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
            .addGroup(photoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(photoPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(photoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(photoPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        photoPanelLayout.setVerticalGroup(
            photoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
            .addGroup(photoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(photoPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(photoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(photoPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        photoTextArea.setBackground(new java.awt.Color(255, 255, 192));
        photoTextArea.setPreferredSize(new java.awt.Dimension(350, 35));
        photoTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoTextAreaActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setFocusable(false);

        newButton.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        newButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeinventory/New.png"))); // NOI18N
        newButton.setText("New");
        newButton.setToolTipText("Add New Item");
        newButton.setFocusable(false);
        newButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newButton.setMargin(new java.awt.Insets(-10, -10, -10, -10));
        newButton.setPreferredSize(new java.awt.Dimension(70, 50));
        newButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeinventory/Delete-file-icon.png"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setToolTipText("Delete Current Item");
        deleteButton.setFocusable(false);
        deleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteButton.setMargin(new java.awt.Insets(-10, -10, -10, -10));
        deleteButton.setPreferredSize(new java.awt.Dimension(70, 50));
        deleteButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeinventory/Save.png"))); // NOI18N
        saveButton.setText("Save");
        saveButton.setToolTipText("Save Current Item");
        saveButton.setFocusable(false);
        saveButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveButton.setMargin(new java.awt.Insets(14, 14, 14, 14));
        saveButton.setPreferredSize(new java.awt.Dimension(70, 50));
        saveButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        previousButton.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        previousButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeinventory/previous.png"))); // NOI18N
        previousButton.setText("Previous");
        previousButton.setToolTipText("Display Previous Item");
        previousButton.setFocusable(false);
        previousButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        previousButton.setMargin(new java.awt.Insets(14, 14, 14, 14));
        previousButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        nextButton.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeinventory/next.png"))); // NOI18N
        nextButton.setText("Next");
        nextButton.setToolTipText("Display Next Item");
        nextButton.setFocusable(false);
        nextButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nextButton.setMargin(new java.awt.Insets(14, 14, 14, 14));
        nextButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        printButton.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        printButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeinventory/printer-3-512.png"))); // NOI18N
        printButton.setText("Print");
        printButton.setToolTipText("Print Inventory List");
        printButton.setFocusable(false);
        printButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        printButton.setMargin(new java.awt.Insets(14, 14, 14, 14));
        printButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        exitbutton.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        exitbutton.setText("Exit");
        exitbutton.setToolTipText("Exit Program");
        exitbutton.setFocusable(false);
        exitbutton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exitbutton.setMargin(new java.awt.Insets(14, 14, 14, 14));
        exitbutton.setPreferredSize(new java.awt.Dimension(70, 50));
        exitbutton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exitbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(printButton, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(nextButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(previousButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(previousButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Item search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(pricelabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(StoreLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(photoLabel)
                                        .addGap(25, 25, 25))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(noteLabel)
                                        .addGap(25, 25, 25)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(25, 25, 25)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(noteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(photoTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(photoButton))
                                .addComponent(storeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(itemlabel)
                                .addComponent(locationlabel)
                                .addComponent(seriallabel))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(locationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(33, 33, 33)
                                            .addComponent(markedCheckBox))
                                        .addComponent(itemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(serialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(priceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(photoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pricelabel)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemlabel)
                    .addComponent(itemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationlabel)
                    .addComponent(markedCheckBox)
                    .addComponent(locationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seriallabel)
                    .addComponent(serialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceLabel)
                            .addComponent(dateLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(storeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StoreLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(noteLabel)
                            .addComponent(noteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(photoLabel)
                            .addComponent(photoButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(photoTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(photoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showEntry(int j){
     itemTextField.setText(myInventory[j - 1].description);
     locationComboBox.setSelectedItem(myInventory[j - 1].location);
     markedCheckBox.setSelected(myInventory[j - 1].marked);
     serialTextField.setText(myInventory[j - 1].serialNumber);
     priceTextField.setText(myInventory[j - 1].purchasePrice);
     dateChooser.setDate(stringToDate(myInventory[j - 1].purchaseDate));
     storeTextField.setText(myInventory[j - 1].purchaseLocation);
     noteTextField.setText(myInventory[j - 1].note);
     showPhoto(myInventory[j - 1].photoFile);
     itemTextField.requestFocus(); 
     nextButton.setEnabled(true);
     previousButton.setEnabled(true);
     if (j == 1){ previousButton.setEnabled(false);}
     if (j == numberEntries){ nextButton.setEnabled(false);}}
    private Date stringToDate(String s){
     int m = Integer.valueOf(s.substring(0, 2)).intValue() - 1;
     int d = Integer.valueOf(s.substring(3, 5)).intValue();
     int y = Integer.valueOf(s.substring(6)).intValue() - 1900;
     return(new Date(y, m, d));}
    private String dateToString(Date dd){
     String yString = String.valueOf(dd.getYear() + 1900);
     int m = dd.getMonth() + 1;
     String mString = new DecimalFormat("00").format(m);
     int d = dd.getDate();
     String dString = new DecimalFormat("00").format(d);
     return(mString + "/" + dString + "/" + yString);}
    private void showPhoto(String photoFile){
    if (!photoFile.equals(""))
    {
     try
     { photoTextArea.setText(photoFile);}
     catch (Exception ex)
     { photoTextArea.setText("");}}
     else
     { photoTextArea.setText("Error");}
     photoPanel.repaint();
     
     try
     {  image = new ImageIcon(photoTextArea.getText());
        Image Image = image.getImage(); 
        Image newimg = Image.getScaledInstance(270,160,java.awt.Image.SCALE_SMOOTH); 
        image = new ImageIcon(newimg);
        jLabel3.setIcon(image);}
     
     catch(Exception e)
     {  System.out.println("Error: "+e); }}   
    private void locationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationComboBoxActionPerformed
        if (locationComboBox.getItemCount() != 0)
        {
         for (int i = 0; i < locationComboBox.getItemCount(); i++)
         {
         if(locationComboBox.getSelectedItem().toString().equals(locationComboBox.getItemAt(i).toString()))
         {
          serialTextField.requestFocus();
          return; }}}
         locationComboBox.addItem(locationComboBox.getSelectedItem().toString());
         serialTextField.requestFocus();
    }//GEN-LAST:event_locationComboBoxActionPerformed
    private void serialTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serialTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serialTextFieldActionPerformed
    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        lastPage = (int)(1 + (numberEntries-1)/entriesPerPage);
        PrinterJob inventoryPrinterJob = PrinterJob.getPrinterJob();
        inventoryPrinterJob.setPrintable(new InventoryDocument());
        if (inventoryPrinterJob.printDialog())
        {
         try
         { inventoryPrinterJob.print();}
         catch (PrinterException ex)
         { JOptionPane.showConfirmDialog(null, ex.getMessage(), "Print Error",JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);}}
    }//GEN-LAST:event_printButtonActionPerformed
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        checkSave();
        currentEntry++;
        showEntry(currentEntry);
    }//GEN-LAST:event_nextButtonActionPerformed
    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        checkSave();
        blankValues();
    }//GEN-LAST:event_newButtonActionPerformed
    private void priceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTextFieldActionPerformed
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
      letterClicked = "P";
    }//GEN-LAST:event_jButton18ActionPerformed
    private void photoTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_photoTextAreaActionPerformed
    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        checkSave();
        currentEntry--;
        showEntry(currentEntry);
    }//GEN-LAST:event_previousButtonActionPerformed
    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
       exitForm(null);
    }//GEN-LAST:event_exitbuttonActionPerformed
    private void photoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoButtonActionPerformed
       JFileChooser openChooser = new JFileChooser();
       openChooser.setDialogType(JFileChooser.OPEN_DIALOG);
       openChooser.setDialogTitle("Open Photo File");
       openChooser.addChoosableFileFilter(new FileNameExtensionFilter("Photo Files","jpg"));
       if(openChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
       { showPhoto(openChooser.getSelectedFile().toString());}
    }//GEN-LAST:event_photoButtonActionPerformed
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
    
    itemTextField.setText(itemTextField.getText().trim());
    
    if (itemTextField.getText().equals(""))
    {
     JOptionPane.showConfirmDialog(null, "Must have item description.", "Error",JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
     itemTextField.requestFocus();
     return;}
    
    if (newButton.isEnabled()){ deleteEntry(currentEntry); }
    
    String s = itemTextField.getText();
    itemTextField.setText(s.substring(0,1).toUpperCase() + s.substring(1));
    numberEntries++;

    currentEntry = 1;
    if (numberEntries != 1)
    {
     do
     {
       if(itemTextField.getText().compareTo(myInventory[currentEntry - 1].description) < 0)
       { break; }
         currentEntry++;} while (currentEntry < numberEntries); }
       
       if (currentEntry != numberEntries)
       {
        for (int i = numberEntries; i >= currentEntry + 1; i--)
        {
          myInventory[i - 1] = myInventory[i - 2];
          myInventory[i - 2] = new InventoryItem(); }}
       
        myInventory[currentEntry - 1] = new InventoryItem();
        myInventory[currentEntry - 1].description = itemTextField.getText();
        myInventory[currentEntry - 1].location = locationComboBox.getSelectedItem().toString();
        myInventory[currentEntry - 1].marked = markedCheckBox.isSelected();
        myInventory[currentEntry - 1].serialNumber = serialTextField.getText();
        myInventory[currentEntry - 1].purchasePrice = priceTextField.getText();
        myInventory[currentEntry - 1].purchaseDate =dateToString(dateChooser.getDate());
        myInventory[currentEntry - 1].purchaseLocation = storeTextField.getText();
        myInventory[currentEntry - 1].photoFile = photoTextArea.getText();
        myInventory[currentEntry - 1].note = noteTextField.getText();
        showEntry(currentEntry);
        
        if (numberEntries < maximumEntries)
        { newButton.setEnabled(true);}
        else
        { newButton.setEnabled(false);}

        deleteButton.setEnabled(true);
        printButton.setEnabled(true);
    }//GEN-LAST:event_saveButtonActionPerformed
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
    if(JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this item?","Delete Inventory Item", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION)
    { return; }
 
    deleteEntry(currentEntry);
    
    if(numberEntries == 0)
    {
     currentEntry = 0;
     blankValues(); }
    else
    {
     currentEntry--;
     if (currentEntry == 0)
     { currentEntry = 1;}
       showEntry(currentEntry);}
    }//GEN-LAST:event_deleteButtonActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        letterClicked = "A";
        search();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        letterClicked = "B";
        search();
    }//GEN-LAST:event_jButton3ActionPerformed
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       letterClicked = "C";
       search();
    }//GEN-LAST:event_jButton4ActionPerformed
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       letterClicked = "D";
       search();
    }//GEN-LAST:event_jButton5ActionPerformed
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       letterClicked = "E";
       search();
    }//GEN-LAST:event_jButton6ActionPerformed
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       letterClicked = "F";
       search();
    }//GEN-LAST:event_jButton7ActionPerformed
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       letterClicked = "G";
       search();
    }//GEN-LAST:event_jButton9ActionPerformed
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       letterClicked = "H";
       search();
    }//GEN-LAST:event_jButton10ActionPerformed
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       letterClicked = "I";
       search();
    }//GEN-LAST:event_jButton11ActionPerformed
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       letterClicked = "J";
       search();
    }//GEN-LAST:event_jButton12ActionPerformed
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       letterClicked = "K";
       search();
    }//GEN-LAST:event_jButton13ActionPerformed
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
       letterClicked = "L";
       search();
    }//GEN-LAST:event_jButton14ActionPerformed
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       letterClicked = "M";
       search();
    }//GEN-LAST:event_jButton15ActionPerformed
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
       letterClicked = "N";
       search();
    }//GEN-LAST:event_jButton16ActionPerformed
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
       letterClicked = "O";
       search();
    }//GEN-LAST:event_jButton17ActionPerformed
    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
       letterClicked = "Q";
       search();
    }//GEN-LAST:event_jButton19ActionPerformed
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
       letterClicked = "R";
       search();
    }//GEN-LAST:event_jButton20ActionPerformed
    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
       letterClicked = "S";
       search();
    }//GEN-LAST:event_jButton21ActionPerformed
    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
       letterClicked = "T";
       search();
    }//GEN-LAST:event_jButton22ActionPerformed
    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
       letterClicked = "U";
       search();
    }//GEN-LAST:event_jButton23ActionPerformed
    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
       letterClicked = "V";
       search();
    }//GEN-LAST:event_jButton24ActionPerformed
    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
       letterClicked = "W";
       search();
    }//GEN-LAST:event_jButton25ActionPerformed
    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
       letterClicked = "X";
       search();
    }//GEN-LAST:event_jButton26ActionPerformed
    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
       letterClicked = "Y";
       search();
    }//GEN-LAST:event_jButton27ActionPerformed
    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
       letterClicked = "Z";
       search();
    }//GEN-LAST:event_jButton28ActionPerformed
    private void search(){    
     int i = 0;
     boolean found = false;

    do
    {
       if(myInventory[i].description.substring(0, 1).equals(letterClicked))
       {
        currentEntry = i + 1;
        showEntry(currentEntry);
        found = true;
        break;}
        i++; }while (i<numberEntries);
    
    if(found==false)
    { JOptionPane.showConfirmDialog(null, "No " + letterClicked + " inventory items.","None Found", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);}
    }
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
            java.util.logging.Logger.getLogger(HomeInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeInventory().setVisible(true);
            }
        });
    }
    private void exitForm(WindowEvent evt){
    
    if (JOptionPane.showConfirmDialog(null, "Any unsaved changes will be lost.\nAre you sure you want to exit?", "Exit Program", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION)
    { return; }    
    
    try
    {
        PrintWriter outputFile = new PrintWriter(new BufferedWriter(new FileWriter("inventory.txt")));
        outputFile.println(numberEntries);

        if (numberEntries != 0)
        {
         for (int i = 0; i < numberEntries; i++)
         {
          outputFile.println(myInventory[i].description);
          outputFile.println(myInventory[i].location);
          outputFile.println(myInventory[i].serialNumber);
          outputFile.println(myInventory[i].marked);
          outputFile.println(myInventory[i].purchasePrice);
          outputFile.println(myInventory[i].purchaseDate);
          outputFile.println(myInventory[i].purchaseLocation);
          outputFile.println(myInventory[i].note);
          outputFile.println(myInventory[i].photoFile);}}

        outputFile.println(locationComboBox.getItemCount());
        
        if(locationComboBox.getItemCount() != 0)
        {
            for (int i = 0; i < locationComboBox.getItemCount(); i++)
            { outputFile.println(locationComboBox.getItemAt(i)); }}
        
            outputFile.close(); }
        catch(Exception ex){}
       System.exit(0); }
    private void blankValues(){
       newButton.setEnabled(false);
       deleteButton.setEnabled(false);
       saveButton.setEnabled(true);
       previousButton.setEnabled(false);
       nextButton.setEnabled(false);
       printButton.setEnabled(false);
       itemTextField.setText("");
       locationComboBox.setSelectedItem("");
       markedCheckBox.setSelected(false);
       serialTextField.setText("");
       priceTextField.setText("");
       dateChooser.setDate(new Date());
       storeTextField.setText("");
       noteTextField.setText("");
       photoTextArea.setText("");
       photoPanel.repaint();
       jLabel3.setIcon(null);
       itemTextField.requestFocus();}
    private void deleteEntry(int j){
    if (j != numberEntries)
    {
     for (int i = j; i < numberEntries; i++)
     {
       myInventory[i - 1] = new InventoryItem();
       myInventory[i - 1] = myInventory[i]; }}
       numberEntries--;}
    private void checkSave(){
        
        boolean edited = false; 
        if (!myInventory[currentEntry - 1].description.equals(itemTextField.getText()))
            edited = true;
        else if (!myInventory[currentEntry -1].location.equals(locationComboBox.getSelectedItem().toString()))
            edited = true;
        else if (myInventory[currentEntry - 1].marked != markedCheckBox.isSelected())
            edited = true;
        else if (!myInventory[currentEntry - 1].serialNumber.equals(serialTextField.getText()))
            edited = true;
        else if (!myInventory[currentEntry - 1].purchasePrice.equals(priceTextField.getText()))
            edited = true;
        else if (!myInventory[currentEntry -1].purchaseDate.equals(dateToString(dateChooser.getDate())))
            edited = true;
        else if (!myInventory[currentEntry -1].purchaseLocation.equals(storeTextField.getText()))
            edited = true;
        else if (!myInventory[currentEntry - 1].note.equals(noteTextField.getText()))
            edited = true;
        else if (!myInventory[currentEntry - 1].photoFile.equals(photoTextArea.getText()))
            edited = true;
        
        if(edited)
        {
          if (JOptionPane.showConfirmDialog(null, "You have edited this item. Do you want to save the changes?", "Save Item", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)
              saveButton.doClick();}}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel StoreLabel;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exitbutton;
    private javax.swing.JTextField itemTextField;
    private javax.swing.JTextField itemTextField1;
    private javax.swing.JLabel itemlabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JComboBox<String> locationComboBox;
    private javax.swing.JLabel locationlabel;
    private javax.swing.JCheckBox markedCheckBox;
    private javax.swing.JButton newButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JTextField noteTextField;
    private javax.swing.JButton photoButton;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JPanel photoPanel;
    private javax.swing.JTextField photoTextArea;
    private javax.swing.JButton previousButton;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JLabel pricelabel;
    private javax.swing.JButton printButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField serialTextField;
    private javax.swing.JLabel seriallabel;
    private javax.swing.JTextField storeTextField;
    // End of variables declaration//GEN-END:variables
}

class InventoryDocument implements Printable
{
public int print(Graphics g, PageFormat pf, int pageIndex)
{
  Graphics2D g2D = (Graphics2D) g;
  
  if ((pageIndex + 1) > HomeInventory.lastPage)
  { return NO_SUCH_PAGE; }
  int i,iEnd;

  g2D.setFont(new Font("Arial", Font.BOLD, 14));
  g2D.drawString("Home Inventory Items - Page " + String.valueOf(pageIndex + 1),(int) pf.getImageableX(), (int) (pf.getImageableY() + 25));
  // get starting y
  int dy = (int) g2D.getFont().getStringBounds("S",g2D.getFontRenderContext()).getHeight();
  int y = (int) (pf.getImageableY() + 4 * dy);
  iEnd = HomeInventory.entriesPerPage * (pageIndex + 1);
  if (iEnd > HomeInventory.numberEntries)
  { iEnd = HomeInventory.numberEntries;}  

  for(i = 0+HomeInventory.entriesPerPage*pageIndex; i<iEnd; i++)
  {
   Line2D.Double dividingLine = new Line2D.Double(pf.getImageableX(), y,pf.getImageableX() + pf.getImageableWidth(), y);
   g2D.draw(dividingLine);
   y += dy;
   g2D.setFont(new Font("Arial", Font.BOLD, 12));
   g2D.drawString(HomeInventory.myInventory[i].description, (int) pf.getImageableX(),y);
   y += dy;
   g2D.setFont(new Font("Arial", Font.PLAIN, 12));
   g2D.drawString("Location: " + HomeInventory.myInventory[i].location, (int)(pf.getImageableX() + 25), y);
   y += dy;
   
   if (HomeInventory.myInventory[i].marked)
   { g2D.drawString("Item is marked with identifying information.",(int)(pf.getImageableX() + 25), y);}
   else
   { g2D.drawString("Item is NOT marked with identifying information.",(int)(pf.getImageableX() + 25), y);}
    y += dy;
    
    g2D.drawString("Serial Number: " +HomeInventory.myInventory[i].serialNumber, (int) (pf.getImageableX() + 25), y);
    y += dy;
    g2D.drawString("Price: $" + HomeInventory.myInventory[i].purchasePrice + ",Purchased on: " + HomeInventory.myInventory[i].purchaseDate, (int) (pf.getImageableX() +25), y);
    y += dy;
    g2D.drawString("Purchased at: " +HomeInventory.myInventory[i].purchaseLocation, (int) (pf.getImageableX() + 25), y);
    y += dy;
    g2D.drawString("Note: " + HomeInventory.myInventory[i].note, (int)(pf.getImageableX() + 25), y);
    y += dy;
    
    try
    {
    Image inventoryImage = new ImageIcon(HomeInventory.myInventory[i].photoFile).getImage();
    double ratio = (double) (inventoryImage.getWidth(null)) / (double)inventoryImage.getHeight(null);
    g2D.drawImage(inventoryImage, (int) (pf.getImageableX() + 25), y, (int) (100 *ratio), 100, null); }
    catch (Exception ex){}
    y += 2 * dy + 100;}
  
    return PAGE_EXISTS; }}