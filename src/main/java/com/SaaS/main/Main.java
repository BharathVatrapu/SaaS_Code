package com.SaaS.main;

import com.SaaS.projects.NewProject;
import com.SaaS.projects.Projects;

import javax.swing.*;
import java.awt.*;

public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public static RightPanel rightPanel=null;
    public static RightProjects rightProjects=null;


    public static NewProject newProject=null;
    public static Projects projects = null;


    GridBagLayout gridBagLayout = new GridBagLayout();
    GridBagLayout gridbody = new GridBagLayout();

    public static void setpanelNotVisible(){

        rightProjects.setVisible(false);
        newProject.setVisible(false);
        projects.setVisible(false);

    }

    public Main() {
        initComponents();

        rightPanel = new RightPanel();
        rightProjects=new RightProjects();
        newProject=new NewProject();
        projects=new Projects();

        pnlLeft.setLayout(gridBagLayout);
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        pnlLeft.add(rightPanel,c);

        c.gridx = 0;
        c.gridy = 0;
        pnlLeft.add(rightProjects,c);

        pnlBody.setLayout(gridbody);
        GridBagConstraints gb = new GridBagConstraints();
        gb.gridx = 0;
        gb.gridy = 0;
        pnlBody.add(newProject,c);
        pnlBody.add(projects,c);

        setpanelNotVisible();


    }


    private void initComponents() {

        pnlTop = new javax.swing.JPanel();
        txtDate = new javax.swing.JLabel();
        txtTitle = new javax.swing.JLabel();
        txtHub = new javax.swing.JLabel();
        txtNode = new javax.swing.JLabel();
        lblMaximize = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        pnlLeft = new javax.swing.JPanel();
        pnlUtils = new javax.swing.JPanel();
        btnSeleniumGrid = new javax.swing.JButton();
        btnSublimeText = new javax.swing.JButton();
        btnSchedulTask = new javax.swing.JButton();
        btnGithub = new javax.swing.JButton();
        btnSpeak = new javax.swing.JButton();
        btnLocation = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnBuildProject = new javax.swing.JButton();
        btnSeleniumGrid7 = new javax.swing.JButton();
        btnSeleniumGrid8 = new javax.swing.JButton();
        txtProjectName = new javax.swing.JLabel();
        pnlBody = new javax.swing.JPanel();
        txtUserName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       // setLocationRelativeTo(null);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 5, 5,new Color(0,122,181) ));

        pnlTop.setBackground(new java.awt.Color(50, 27, 140));

        txtDate.setText("Date");

        lblMaximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/rectangle_stroked_18px.png")));
        lblMaximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMaximizeMousePressed(evt);
            }
        });

        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/multiply_18px.png")));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCloseMousePressed(evt);
            }
        });

        lblMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/minus_18px.png")));
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMinimizeMousePressed(evt);
            }
        });

        txtTitle.setBackground(new java.awt.Color(255, 255, 255));
        txtTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtTitle.setText("Title");

        txtHub.setForeground(new java.awt.Color(255, 255, 255));
        txtHub.setText("Hub");

        txtNode.setForeground(new java.awt.Color(255, 255, 255));
        txtNode.setText("Node");

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
                pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(txtTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtHub)
                                .addGap(81, 81, 81)
                                .addComponent(txtNode)
                                .addGap(150, 150, 150)
                                .addComponent(txtDate)
                                .addGap(123, 123, 123)
                                .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblMaximize, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        pnlTopLayout.setVerticalGroup(
                pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTopLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblMaximize, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(txtDate))
                                        .addComponent(txtTitle)
                                        .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtHub)
                                                .addComponent(txtNode)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlLeft.setBackground(new java.awt.Color(102, 0, 153));

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
                pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 226, Short.MAX_VALUE)
        );
        pnlLeftLayout.setVerticalGroup(
                pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 591, Short.MAX_VALUE)
        );

        pnlUtils.setBackground(new java.awt.Color(153, 153, 153));

        btnSeleniumGrid.setBackground(new java.awt.Color(153, 153, 153));
        btnSeleniumGrid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/selenium_32px.png")));
        btnSeleniumGrid.setToolTipText("Selenium Grid");
        btnSeleniumGrid.setBorder(null);
        btnSeleniumGrid.setBorderPainted(false);
        btnSeleniumGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleniumGridActionPerformed(evt);
            }
        });

        btnSublimeText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/sublime_text_32px.png")));
        btnSublimeText.setBackground(new java.awt.Color(153, 153, 153));
        btnSublimeText.setToolTipText("Sublime Text");
        btnSublimeText.setBorder(null);
        btnSublimeText.setBorderPainted(false);
        btnSublimeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSublimeTextActionPerformed(evt);
            }
        });

        btnSchedulTask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/schedule_32px.png")));
        btnSublimeText.setBackground(new java.awt.Color(153, 153, 153));
        btnSublimeText.setToolTipText("Sublime Text");
        btnSublimeText.setBorder(null);
        btnSublimeText.setBorderPainted(false);
        btnSchedulTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSchedulTaskActionPerformed(evt);
            }
        });

        btnGithub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/github_32px.png")));
        btnGithub.setBackground(new java.awt.Color(153, 153, 153));
        btnGithub.setToolTipText("Sublime Text");
        btnGithub.setBorder(null);
        btnGithub.setBorderPainted(false);
        btnGithub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGithubActionPerformed(evt);
            }
        });

        btnSpeak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/voice_32px.png")));
        btnSpeak.setBackground(new java.awt.Color(153, 153, 153));
        btnSpeak.setToolTipText("Sublime Text");
        btnSpeak.setBorder(null);
        btnSpeak.setBorderPainted(false);
        btnSpeak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeakActionPerformed(evt);
            }
        });

        btnLocation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/marker_32px.png")));
        btnLocation.setBackground(new java.awt.Color(153, 153, 153));
        btnLocation.setToolTipText("Sublime Text");
        btnLocation.setBorder(null);
        btnLocation.setBorderPainted(false);
        btnLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocationActionPerformed(evt);
            }
        });

        btnLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/log_32px.png")));
        btnLog.setBackground(new java.awt.Color(153, 153, 153));
        btnLog.setToolTipText("Sublime Text");
        btnLog.setBorder(null);
        btnLog.setBorderPainted(false);
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        btnBuildProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/engineering_32px.png")));
        btnBuildProject.setBackground(new java.awt.Color(153, 153, 153));
        btnBuildProject.setToolTipText("Sublime Text");
        btnBuildProject.setBorder(null);
        btnBuildProject.setBorderPainted(false);
        btnBuildProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuildProjectActionPerformed(evt);
            }
        });

        btnSeleniumGrid7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/selenium_32px.png")));
        btnSeleniumGrid7.setBackground(new java.awt.Color(153, 153, 153));
        btnSeleniumGrid7.setToolTipText("Sublime Text");
        btnSeleniumGrid7.setBorder(null);
        btnSeleniumGrid7.setBorderPainted(false);
        btnSeleniumGrid7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleniumGrid7ActionPerformed(evt);
            }
        });

        btnSeleniumGrid8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/selenium_32px.png")));
        btnSeleniumGrid8.setBackground(new java.awt.Color(153, 153, 153));
       // btnSeleniumGrid8.setToolTipText("Sublime Text");
        btnSeleniumGrid8.setBorder(null);
        btnSeleniumGrid8.setBorderPainted(false);
        btnSeleniumGrid8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleniumGrid8ActionPerformed(evt);
            }
        });

        txtProjectName.setText("Project Name");

        javax.swing.GroupLayout pnlUtilsLayout = new javax.swing.GroupLayout(pnlUtils);
        pnlUtils.setLayout(pnlUtilsLayout);
        pnlUtilsLayout.setHorizontalGroup(
                pnlUtilsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlUtilsLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btnSeleniumGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSublimeText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSchedulTask, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGithub, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSpeak, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuildProject, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSeleniumGrid7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSeleniumGrid8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                                .addComponent(txtProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
        );
        pnlUtilsLayout.setVerticalGroup(
                pnlUtilsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlUtilsLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlUtilsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnSeleniumGrid8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSeleniumGrid7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBuildProject, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSpeak, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSchedulTask, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSublimeText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSeleniumGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnGithub, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlUtilsLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(txtProjectName)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlBody.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout pnlBodyLayout = new javax.swing.GroupLayout(pnlBody);
        pnlBody.setLayout(pnlBodyLayout);
        pnlBodyLayout.setHorizontalGroup(
                pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlBodyLayout.setVerticalGroup(
                pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        txtUserName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main/user_60px.png")));
        txtUserName.setText("UserName");
        txtUserName.setRequestFocusEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pnlUtils, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(pnlUtils, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtUserName)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }

    private void btnSeleniumGridActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnSchedulTaskActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnGithubActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnSpeakActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnLocationActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnBuildProjectActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnSeleniumGrid7ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnSeleniumGrid8ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnSublimeTextActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void lblMinimizeMousePressed(java.awt.event.MouseEvent evt) {
        this.setState(Frame.ICONIFIED);
    }

    private void lblMaximizeMousePressed(java.awt.event.MouseEvent evt) {
        if (this.getExtendedState() == MAXIMIZED_BOTH) {
            this.setExtendedState(JFrame.NORMAL);
        } else {
            this.setExtendedState(MAXIMIZED_BOTH);
        }
    }

    private void lblCloseMousePressed(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnBuildProject;
    private javax.swing.JButton btnGithub;
    private javax.swing.JButton btnLocation;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnSchedulTask;
    private javax.swing.JButton btnSeleniumGrid;
    private javax.swing.JButton btnSeleniumGrid7;
    private javax.swing.JButton btnSeleniumGrid8;
    private javax.swing.JButton btnSpeak;
    private javax.swing.JButton btnSublimeText;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMaximize;
    private javax.swing.JLabel lblMinimize;
    public  javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JPanel pnlUtils;
    private javax.swing.JLabel txtDate;
    private javax.swing.JLabel txtProjectName;
    private javax.swing.JLabel txtUserName;
    private javax.swing.JLabel txtTitle;
    private javax.swing.JLabel txtHub;
    private javax.swing.JLabel txtNode;
    // End of variables declaration
}
