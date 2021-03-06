/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FCRBrowserView.java
 *
 * Created on 2012/04/05, 17:07:46
 */

package open.dolphin.impl.img;

/**
 * FCR連携
 * @author Life Sciences Computing Corporation.
 */
public class FCRBrowserView extends javax.swing.JPanel {

    /** Creates new form FCRBrowserView */
    public FCRBrowserView() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dirLbl = new javax.swing.JLabel();
        refreshBtn = new javax.swing.JButton();
        settingBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        fcrListBtn = new javax.swing.JButton();
        fcrImageBtn = new javax.swing.JButton();
        fcrTodayBtn = new javax.swing.JButton();
        newdirBtn = new javax.swing.JButton();
        backdirBtn = new javax.swing.JButton();

        dirLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/open/dolphin/resources/images/about_16.gif"))); // NOI18N

        refreshBtn.setText("更新"); // NOI18N

        settingBtn.setText("設定"); // NOI18N

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        fcrListBtn.setText("List"); // NOI18N

        fcrImageBtn.setText("Image"); // NOI18N

        fcrTodayBtn.setText("Today"); // NOI18N

        newdirBtn.setText("新規"); // NOI18N
        newdirBtn.setToolTipText("ディレクトリの新規作成");

        backdirBtn.setText("上へ"); // NOI18N
        backdirBtn.setToolTipText("ディレクトリの新規作成");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(dirLbl, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                        .add(94, 94, 94)
                        .add(fcrListBtn)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(fcrImageBtn)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(fcrTodayBtn)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(backdirBtn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(newdirBtn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(refreshBtn)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(settingBtn))
                    .add(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(refreshBtn)
                    .add(settingBtn)
                    .add(dirLbl)
                    .add(fcrListBtn)
                    .add(fcrImageBtn)
                    .add(fcrTodayBtn)
                    .add(newdirBtn)
                    .add(backdirBtn))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addContainerGap())
        );

        newdirBtn.getAccessibleContext().setAccessibleName("newdirBtn");
        backdirBtn.getAccessibleContext().setAccessibleDescription("一つ上の階層に戻る");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backdirBtn;
    private javax.swing.JLabel dirLbl;
    private javax.swing.JButton fcrImageBtn;
    private javax.swing.JButton fcrListBtn;
    private javax.swing.JButton fcrTodayBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newdirBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton settingBtn;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JLabel getDirLbl() {
        return dirLbl;
    }

    public javax.swing.JButton getRefreshBtn() {
        return refreshBtn;
    }

    public javax.swing.JButton getSettingBtn() {
        return settingBtn;
    }

    public javax.swing.JTable getTable() {
        return table;
    }

    public javax.swing.JButton getFcrListBtn() {
        return fcrListBtn;
    }

    public javax.swing.JButton getFcrImageBtn() {
        return fcrImageBtn;
    }

    public javax.swing.JButton getFcrTodayBtn() {
        return fcrTodayBtn;
    }

//s.oh^ 2014/05/07 PDF・画像タブの改善
    public javax.swing.JButton getNewDirBtn() {
        return newdirBtn;
    }
//s.oh$

//s.oh^ 2014/05/30 PDF・画像タブの改善
    public javax.swing.JButton getBackDirBtn() {
        return backdirBtn;
    }
//s.oh$
}
