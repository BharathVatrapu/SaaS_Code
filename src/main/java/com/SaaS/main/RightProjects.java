package com.SaaS.main;

import com.SaaS.projects.NewProject;

import java.awt.*;

public class RightProjects extends javax.swing.JPanel {

    /**
     * Creates new form RightProjects
     */


    public RightProjects() {
        initComponents();



    }


    private void initComponents() {

        btnCreateProject = new javax.swing.JButton();
        btnLoadProject = new javax.swing.JButton();
        btnDeleteProject = new javax.swing.JButton();
        btnImportProject = new javax.swing.JButton();
        btnExportProject = new javax.swing.JButton();
        btnConfigProject = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(225, 590));
        setBackground(new java.awt.Color(102, 0, 153));

        btnCreateProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/combo_chart_45px.png")));
        btnCreateProject.setText("New Project");
        btnCreateProject.setBackground(new java.awt.Color(102, 0, 153));
        btnCreateProject.setBorderPainted(false);
        btnCreateProject.setBorder(null);
        btnCreateProject.setFocusPainted(false);
        btnCreateProject.setFont(new Font("Tahoma", 0, 18));
        btnCreateProject.setForeground(new Color(255, 255, 255));
        btnCreateProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateProjectActionPerformed(evt);
            }
        });

        btnLoadProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/combo_chart_45px.png")));
        btnLoadProject.setText("Load Project");
        btnLoadProject.setBackground(new java.awt.Color(102, 0, 153));
        btnLoadProject.setBorderPainted(false);
        btnLoadProject.setBorder(null);
        btnLoadProject.setFocusPainted(false);
        btnLoadProject.setFont(new Font("Tahoma", 0, 18));
        btnLoadProject.setForeground(new Color(255, 255, 255));
        btnLoadProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadProjectActionPerformed(evt);
            }
        });

        btnDeleteProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/combo_chart_45px.png")));
        btnDeleteProject.setText("Delete Project");
        btnDeleteProject.setBackground(new java.awt.Color(102, 0, 153));
        btnDeleteProject.setBorderPainted(false);
        btnDeleteProject.setBorder(null);
        btnDeleteProject.setFocusPainted(false);
        btnDeleteProject.setFont(new Font("Tahoma", 0, 18));
        btnDeleteProject.setForeground(new Color(255, 255, 255));
        btnDeleteProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProjectActionPerformed(evt);
            }
        });

        btnImportProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/combo_chart_45px.png")));
        btnImportProject.setText("Import Project");
        btnImportProject.setBackground(new java.awt.Color(102, 0, 153));
        btnImportProject.setBorderPainted(false);
        btnImportProject.setBorder(null);
        btnImportProject.setFocusPainted(false);
        btnImportProject.setFont(new Font("Tahoma", 0, 18));
        btnImportProject.setForeground(new Color(255, 255, 255));
        btnImportProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportProjectActionPerformed(evt);
            }
        });

        btnExportProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/combo_chart_45px.png")));
        btnExportProject.setText("Export Project");
        btnExportProject.setBackground(new java.awt.Color(102, 0, 153));
        btnExportProject.setBorderPainted(false);
        btnExportProject.setBorder(null);
        btnExportProject.setFocusPainted(false);
        btnExportProject.setFont(new Font("Tahoma", 0, 18));
        btnExportProject.setForeground(new Color(255, 255, 255));
        btnExportProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportProjectActionPerformed(evt);
            }
        });

        btnConfigProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/combo_chart_45px.png")));
        btnConfigProject.setText("Config Project");
        btnConfigProject.setBackground(new java.awt.Color(102, 0, 153));
        btnConfigProject.setBorderPainted(false);
        btnConfigProject.setBorder(null);
        btnConfigProject.setFocusPainted(false);
        btnConfigProject.setFont(new Font("Tahoma", 0, 18));
        btnConfigProject.setForeground(new Color(255, 255, 255));
        btnConfigProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigProjectActionPerformed(evt);
            }
        });

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/rewind_65px.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCreateProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnLoadProject, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                        .addComponent(btnDeleteProject, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                        .addComponent(btnImportProject, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                        .addComponent(btnExportProject, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                        .addComponent(btnConfigProject, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(19, Short.MAX_VALUE)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(btnCreateProject, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLoadProject, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnDeleteProject, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnImportProject, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnExportProject, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnConfigProject, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
        );
    }// </editor-fold>

    private void btnLoadProjectActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnCreateProjectActionPerformed(java.awt.event.ActionEvent evt) {

        Main.setpanelNotVisible();
        Main.rightProjects.setVisible(true);
        Main.newProject.setVisible(true);
    }

    private void btnDeleteProjectActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnImportProjectActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnExportProjectActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnConfigProjectActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
        Main.setpanelNotVisible();
        Main.rightPanel.setVisible(true);
    }


    // Variables declaration - do not modify
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfigProject;
    private javax.swing.JButton btnCreateProject;
    private javax.swing.JButton btnDeleteProject;
    private javax.swing.JButton btnExportProject;
    private javax.swing.JButton btnImportProject;
    private javax.swing.JButton btnLoadProject;
    // End of variables declaration
}
