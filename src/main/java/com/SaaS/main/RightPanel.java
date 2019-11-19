package com.SaaS.main;

import com.SaaS.ui.Design;

import java.awt.*;

public class RightPanel extends javax.swing.JPanel {


    /**
     * Creates new form RightPanel
     */

    public RightPanel() {
        initComponents();
    }


    private void initComponents() {

        btnDashboard = new javax.swing.JButton();
        btnProjects = new javax.swing.JButton();
        btnSmartHub = new javax.swing.JButton();
        btnExecutionLab = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        btnSuiteManagement = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(225, 590));
//        setBackground(new java.awt.Color(102, 0, 153));
        setBackground(new Color(48, 48, 48));

        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/combo_chart_45px.png")));
        btnDashboard.setText("Dashboard");
        Design.button_ui_style_black(btnDashboard);
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnProjects.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/combo_chart_45px.png")));
        btnProjects.setText("Projects");
        Design.button_ui_style_black(btnProjects);
        btnProjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProjectsActionPerformed(evt);
            }
        });

        btnSmartHub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/combo_chart_45px.png")));
        btnSmartHub.setText("Smart Hub");
        Design.button_ui_style_black(btnSmartHub);
        btnSmartHub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               btnSmartHubActionPerformed(evt);
            }
        });


        btnExecutionLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/combo_chart_45px.png")));
        btnExecutionLab.setText("Execution Lab");
        Design.button_ui_style_black(btnExecutionLab);
        btnExecutionLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecutionLabActionPerformed(evt);
            }
        });

        btnReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/combo_chart_45px.png")));
        btnReports.setText("Reports");
        Design.button_ui_style_black(btnReports);
        btnReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsActionPerformed(evt);
            }
        });

        btnSuiteManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/combo_chart_45px.png")));
        btnSuiteManagement.setText("Suite Management");
        Design.button_ui_style_black(btnSuiteManagement);
        btnSuiteManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuiteManagementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnProjects, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                        .addComponent(btnSmartHub, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                        .addComponent(btnExecutionLab, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                        .addComponent(btnReports, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                        .addComponent(btnSuiteManagement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(84, Short.MAX_VALUE)
                                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnProjects, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnSmartHub, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnExecutionLab, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnReports, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnSuiteManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
        );
    }

    private void btnProjectsActionPerformed(java.awt.event.ActionEvent evt) {
        Main.setpanelNotVisible();
        loadProjects();

    }



    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    private void btnSmartHubActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void btnExecutionLabActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void btnSuiteManagementActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public static void loadProjects(){
        Main.rightPanel.setVisible(false);
        Main.rightProjects.setVisible(true);

        Main.projects.setVisible(true);
    }


    // Variables declaration - do not modify
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnExecutionLab;
    private javax.swing.JButton btnProjects;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnSuiteManagement;
    private javax.swing.JButton btnSmartHub;
    // End of variables declaration
}
