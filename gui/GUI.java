package scripts.SPXAIOPlanker.gui;


import org.tribot.api.General;
import scripts.SPXAIOPlanker.data.Vars;

import javax.swing.*;

/**
 * Created by Sphiinx on 12/30/2015.
 */
public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        coinAmount = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        plankType = new javax.swing.JComboBox();
        start = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24));
        jLabel1.setText("[SPX] AIO Planker");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 0, 14))); // NOI18N

        coinAmount.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(25000), Integer.valueOf(25000), null, Integer.valueOf(1000)));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 12));
        jLabel2.setText("Amount of coins to take:");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 12));
        jLabel3.setText("Type of planks to make:");

        plankType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Wood", "Oak", "Teak", "Mahogany" }));

        start.setFont(new java.awt.Font("Ubuntu", 0, 12));
        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(coinAmount)
                                                        .addComponent(plankType, 0, 92, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(89, 89, 89)
                                                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(coinAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(plankType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }

    private void printGuiInformation() {
        General.println("Plank type: " + Vars.get().plankType);
        General.println("Coins amount: " + Vars.get().coinsAmount);
    }

    private void startActionPerformed(java.awt.event.ActionEvent evt) {
        Vars.get().coinsAmount = Integer.parseInt(coinAmount.getValue().toString());
        switch(plankType.getSelectedItem().toString()) {
            case "Wood":
                Vars.get().logType = "Logs";
                Vars.get().logTypeId = 1511;
                Vars.get().plankType = "Plank";
                Vars.get().plankTypeId = 960;
                Vars.get().interfaceChild = 89;
                Vars.get().plankPrice = 100;
                break;
            case "Oak":
                Vars.get().logType = "Oak logs";
                Vars.get().logTypeId = 1521;
                Vars.get().plankType = "Oak Plank";
                Vars.get().plankTypeId = 8778;
                Vars.get().interfaceChild = 90;
                Vars.get().plankPrice = 250;
                break;
            case "Teak":
                Vars.get().logType = "Teak logs";
                Vars.get().logTypeId = 6333;
                Vars.get().plankType = "Teak Plank";
                Vars.get().plankTypeId = 8780;
                Vars.get().interfaceChild = 91;
                Vars.get().plankPrice = 500;
                break;
            case "Mahogany":
                Vars.get().logType = "Mahogany logs";
                Vars.get().logTypeId = 6332;
                Vars.get().plankType = "Mahogany Plank";
                Vars.get().plankTypeId = 8782;
                Vars.get().interfaceChild = 92;
                Vars.get().plankPrice = 1500;
                break;
        }
        printGuiInformation();
        Vars.get().guiComplete = true;
        setVisible(false);
    }

    private javax.swing.JSpinner coinAmount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox plankType;
    private javax.swing.JButton start;

}

