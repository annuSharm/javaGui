
package aditi;

import java.awt.event.MouseEvent;

public class demo extends javax.swing.JFrame {

   
    public demo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        label1 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu100 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenu110 = new javax.swing.JMenu();
        jMenu21 = new javax.swing.JMenu();
        jMenu22 = new javax.swing.JMenu();
        jMenu120 = new javax.swing.JMenu();
        jMenu31 = new javax.swing.JMenu();
        jMenu32 = new javax.swing.JMenu();
        jMenu33 = new javax.swing.JMenu();
        jMenu34 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        list1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list1ActionPerformed(evt);
            }
        });

        label1.setName("Label1"); // NOI18N
        label1.setText("Selected List\n");

        jButton1.setText("Submit/Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu.setText("PaperType");
        jMenu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenuMouseDragged(evt);
            }
        });

        jMenu1.setText("100 GSM Maplitho");
        jMenu1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenu1MouseDragged(evt);
            }
        });
        jMenu.add(jMenu1);

        jMenu2.setText("Orient");
        jMenu2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenu2MouseDragged(evt);
            }
        });
        jMenu.add(jMenu2);

        jMenu3.setText("Ledger Paper");
        jMenu3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenu3MouseDragged(evt);
            }
        });
        jMenu.add(jMenu3);

        jMenu4.setText("Card Sheet");
        jMenu4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenu4MouseDragged(evt);
            }
        });
        jMenu4.addMenuDragMouseListener(new javax.swing.event.MenuDragMouseListener() {
            public void menuDragMouseDragged(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {
                jMenu4MenuDragMouseEntered(evt);
            }
            public void menuDragMouseExited(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseReleased(javax.swing.event.MenuDragMouseEvent evt) {
            }
        });
        jMenu.add(jMenu4);

        jMenu5.setText("Sirpur Colour Paper");
        jMenu5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenu5MouseDragged(evt);
            }
        });
        jMenu.add(jMenu5);

        jMenu6.setText("Duplicate Paper");
        jMenu6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenu6MouseDragged(evt);
            }
        });
        jMenu.add(jMenu6);

        jMenu7.setText("Duplex Paper");
        jMenu7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenu7MouseDragged(evt);
            }
        });
        jMenu.add(jMenu7);

        jMenuBar1.add(jMenu);

        jMenu100.setText("PaperSize");

        jMenu11.setText("30*40 / 20*30");
        jMenu11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenu11MouseDragged(evt);
            }
        });
        jMenu100.add(jMenu11);

        jMenu12.setText("23*36 / 18*23");
        jMenu12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenu12MouseDragged(evt);
            }
        });
        jMenu100.add(jMenu12);

        jMenu13.setText("16*26 / 17*27");
        jMenu13.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenu13MouseDragged(evt);
            }
        });
        jMenu100.add(jMenu13);

        jMenuBar1.add(jMenu100);

        jMenu110.setText("Orientation");

        jMenu21.setText("Portraite");
        jMenu21.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenu21MouseDragged(evt);
            }
        });
        jMenu110.add(jMenu21);

        jMenu22.setText("Landscape");
        jMenu22.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenu22MouseDragged(evt);
            }
        });
        jMenu110.add(jMenu22);

        jMenuBar1.add(jMenu110);

        jMenu120.setText("Quality");

        jMenu31.setText("1");
        jMenu31.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenu31MouseDragged(evt);
            }
        });
        jMenu120.add(jMenu31);

        jMenu32.setText("2");
        jMenu32.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenu32MouseDragged(evt);
            }
        });
        jMenu120.add(jMenu32);

        jMenu33.setText("3");
        jMenu33.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenu33MouseDragged(evt);
            }
        });
        jMenu120.add(jMenu33);

        jMenu34.setText("4");
        jMenu34.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenu34MouseDragged(evt);
            }
        });
        jMenu120.add(jMenu34);

        jMenuBar1.add(jMenu120);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(280, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(107, 107, 107))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuMouseDragged

    private void jMenu2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MouseDragged

    private void jMenu3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MouseDragged

    private void jMenu4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4MouseDragged

    private void jMenu5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5MouseDragged

    private void jMenu6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6MouseDragged

    private void jMenu7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu7MouseDragged

    private void jMenu11MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu11MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu11MouseDragged

    private void jMenu13MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu13MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu13MouseDragged

    private void jMenu12MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu12MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu12MouseDragged

    private void jMenu21MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu21MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu21MouseDragged

    private void jMenu22MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu22MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu22MouseDragged

    private void jMenu31MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu31MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu31MouseDragged

    private void jMenu32MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu32MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu32MouseDragged

    private void jMenu33MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu33MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu33MouseDragged

    private void jMenu34MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu34MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu34MouseDragged

    private void list1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list1ActionPerformed
        list1.getSelectedItem();
        
    }//GEN-LAST:event_list1ActionPerformed

    private void jMenu1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MouseDragged

    private void jMenu4MenuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {//GEN-FIRST:event_jMenu4MenuDragMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4MenuDragMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        print pj= new print();
        pj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new demo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu100;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu110;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu120;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu22;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu31;
    private javax.swing.JMenu jMenu32;
    private javax.swing.JMenu jMenu33;
    private javax.swing.JMenu jMenu34;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private java.awt.Label label1;
    private java.awt.List list1;
    // End of variables declaration//GEN-END:variables
}
