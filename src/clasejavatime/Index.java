package clasejavatime;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Miguel
 */
public class Index extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Persona> auxListBuscar = main.listaPersonas;
    ArrayList<Persona> auxListOrdenar = main.listaPersonas;
    int indexOrdenar = 0;
    
    public Index() {
        initComponents();
        OrdenarStream(indexOrdenar);
        CargarDatos(main.listaPersonas);     
        setLocationRelativeTo(null);
        btnRefrescar.setEnabled(false);
        
    }

    public void CargarDatos(ArrayList<Persona> auxArray) {
        
        
        String[] titulos = {"Nombre", "Apellido Paterno", "Apellido Materno"};
        modelo.setColumnIdentifiers(titulos);
        modelo.setRowCount(0);
        
        auxArray.stream().map(registro -> {
            Object[] datos = new Object[3];
            datos[0] = registro.getFirst_name();
            datos[1] = registro.getLast_name();
            datos[2] = registro.getMother_last_name();   
            return datos;
        }).forEach(modelo::addRow);
        tablaPersona.setModel(modelo);
        // System.out.println("Tiempo Transcurridos = " + (System.currentTimeMillis() / 1000) + " segundos");
    }
    
    public void OrdenarStream(int inicio) {
        
        if (inicio == 0) {
            main.listaPersonas = (ArrayList<Persona>) main.listaPersonas.stream()
                    .sorted(Comparator.comparing(Persona::getLast_name)).collect(Collectors.toList());
        } else {
            main.listaPersonas = (ArrayList<Persona>) main.listaPersonas.stream()
                    .sorted(Comparator.comparing(Persona::getLast_name).reversed()).collect(Collectors.toList());
        }
        
    }
    
    public void BuscarStream(String auxBuscar) {
        int opcion = jcOpcion.getSelectedIndex();
        
        /**
         * Mendiante el metodo .filter nos encargamos mediante una funcion lambda validar cada uno de los datos con la opcion escogida por el 
         * usuario.
         */
        if (opcion == 0) {
            auxListBuscar = (ArrayList<Persona>) main.listaPersonas.stream()
                    .filter(persona -> persona.getFirst_name().equalsIgnoreCase(auxBuscar)).collect(Collectors.toList());
        }
        if (opcion == 1) {
            auxListBuscar = (ArrayList<Persona>) main.listaPersonas.stream()
                    .filter(persona -> persona.getLast_name().equalsIgnoreCase(auxBuscar)).collect(Collectors.toList());
        }
        if (opcion == 2) {
            auxListBuscar = (ArrayList<Persona>) main.listaPersonas.stream()
                    .filter(persona -> persona.getMother_last_name().equalsIgnoreCase(auxBuscar)).collect(Collectors.toList());
        }
        
        // System.out.println("Tiempo Transcurridos = " + (System.currentTimeMillis() / 1000) + " segundos");
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcOpcion = new javax.swing.JComboBox<>();
        lbOrdenar = new javax.swing.JLabel();
        txtIngreso = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersona = new javax.swing.JTable();
        lbMetodo = new javax.swing.JLabel();
        cbOrdenar = new javax.swing.JComboBox<>();
        btnRefrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("CLASE STREAM");

        jcOpcion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jcOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Apellido Paterno", "Apellido Materno" }));
        jcOpcion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcOpcionItemStateChanged(evt);
            }
        });

        lbOrdenar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbOrdenar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbOrdenar.setText("Ordenar");

        txtIngreso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tablaPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaPersona);

        lbMetodo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbMetodo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMetodo.setText("Nombre");

        cbOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ascendente", "descendente" }));
        cbOrdenar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbOrdenarItemStateChanged(evt);
            }
        });

        btnRefrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refrescar.png"))); // NOI18N
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jcOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(205, 205, 205))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRefrescar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnRefrescar))
                .addGap(18, 18, 18)
                .addComponent(jcOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIngreso)
                    .addComponent(lbMetodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbOrdenar)
                    .addComponent(cbOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcOpcionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcOpcionItemStateChanged
        String opcion = jcOpcion.getSelectedItem().toString();
        lbMetodo.setText(opcion);
        
    }//GEN-LAST:event_jcOpcionItemStateChanged

    private void cbOrdenarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbOrdenarItemStateChanged
        indexOrdenar = cbOrdenar.getSelectedIndex();
        OrdenarStream(indexOrdenar);
        CargarDatos(main.listaPersonas);
    }//GEN-LAST:event_cbOrdenarItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BuscarStream(txtIngreso.getText());
        CargarDatos(auxListBuscar);
        txtIngreso.setText("");
        cbOrdenar.setEnabled(false);
        btnRefrescar.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        CargarDatos(main.listaPersonas);
        cbOrdenar.setEnabled(true);
    }//GEN-LAST:event_btnRefrescarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JComboBox<String> cbOrdenar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcOpcion;
    private javax.swing.JLabel lbMetodo;
    private javax.swing.JLabel lbOrdenar;
    private javax.swing.JTable tablaPersona;
    private javax.swing.JTextField txtIngreso;
    // End of variables declaration//GEN-END:variables
}
