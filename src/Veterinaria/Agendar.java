package Veterinaria;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Agendar extends javax.swing.JFrame {

    boolean v1, v2, v3, v4, v5;
    String Fecha, TipoCita, Hora;
    int cedulaDue;
    TipoAtencion ConsultaVeterinario;
    TipoAtencion Control;
    TipoAtencion Desparasitacion;
    TipoAtencion Vacunacion;
    TipoAtencion GuarderiaSoloPorDia;
    TipoAtencion Radiologia;
    TipoAtencion Baño;

    public Agendar() {
        initComponents();
        textoAlerta.setVisible(false);
        textoAlerta1.setVisible(false);
        textoAlerta2.setVisible(false);
        textoAlerta3.setVisible(false);
        ConsultaVeterinario = new TipoAtencion("Consulta Veterinario", 60000, 60);
        Control = new TipoAtencion("Control", 10000, 30);
        Desparasitacion = new TipoAtencion("Desparasitacion", 40000, 30);
        Vacunacion = new TipoAtencion("Vacunacion", 35000, 30);
        GuarderiaSoloPorDia = new TipoAtencion("Guarderia solo por dia", 35000, 1440);
        Radiologia = new TipoAtencion("Radiologia", 100000, 60);
        Baño = new TipoAtencion("Baño", 25000, 120);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cedulaDueno = new javax.swing.JTextField();
        textoCed = new javax.swing.JLabel();
        textoAlerta = new javax.swing.JLabel();
        confirmar = new javax.swing.JButton();
        textoNac = new javax.swing.JLabel();
        DiaCita = new com.toedter.calendar.JDateChooser();
        textoNac1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        textoCed1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        NombreM = new javax.swing.JTextField();
        textoAlerta1 = new javax.swing.JLabel();
        textoAlerta3 = new javax.swing.JLabel();
        textoAlerta2 = new javax.swing.JLabel();
        Crear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cedulaDueno.setText("Digite su cédula");
        cedulaDueno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cedulaDuenoMouseClicked(evt);
            }
        });
        cedulaDueno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaDuenoActionPerformed(evt);
            }
        });

        textoCed.setText("Cédula:");

        textoAlerta.setForeground(new java.awt.Color(255, 51, 51));
        textoAlerta.setText("¡La cédula debe ser de números!");

        confirmar.setText("Confirmar");
        confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmarMouseClicked(evt);
            }
        });
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        textoNac.setText("Indique la fecha cita");

        textoNac1.setText("Atencion necesitada");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consulta Veterinario", "Control", "Desparasitacion", "Vacunacion", "Guarderia solo por dia", "Radiologia", "Baño" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        textoCed1.setText("Seleccione la hora de la cita");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30" }));

        jLabel1.setText("Ingrese el nombre del paciente");

        textoAlerta1.setForeground(new java.awt.Color(255, 51, 51));
        textoAlerta1.setText("Debe ingresar un nombre");

        textoAlerta3.setForeground(new java.awt.Color(255, 51, 51));
        textoAlerta3.setText("No se olvide de colocar la fecha ");

        textoAlerta2.setForeground(new java.awt.Color(255, 51, 51));
        textoAlerta2.setText("La hora se encuentra ocupada");

        Crear.setText("Crear Cita");
        Crear.setEnabled(false);
        Crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoCed1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cedulaDueno, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 173, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textoCed)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoAlerta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(confirmar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textoNac)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textoAlerta3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(textoAlerta2))
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoNac1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NombreM, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textoAlerta1))
                                    .addComponent(DiaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Crear)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoCed)
                            .addComponent(textoAlerta))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(confirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(cedulaDueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textoAlerta1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoNac1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(textoCed1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoAlerta2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNac)
                    .addComponent(textoAlerta3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DiaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Crear)))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cedulaDuenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cedulaDuenoMouseClicked
        cedulaDueno.setText("");

    }//GEN-LAST:event_cedulaDuenoMouseClicked

    private void cedulaDuenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaDuenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaDuenoActionPerformed

    private void confirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarMouseClicked
        int diaactual = (DiaCita.getCalendar().get(Calendar.DAY_OF_WEEK) - 1);

        String LineB = "";
        Crear.setEnabled(false);
        v5 = true;
        v1 = true;
        v2 = true;
        v3 = true;
        v4 = true;
        if (diaactual == 6 || diaactual == 7) {
            v5 = false;
            JOptionPane.showMessageDialog(null, "En este dia de la semana no se puede pedir cita, cv");
        }
        textoAlerta.setVisible(false);
        textoAlerta1.setVisible(false);
        textoAlerta2.setVisible(false);
        textoAlerta3.setVisible(false);
        Hora = jComboBox2.getSelectedItem().toString();
        TipoCita = jComboBox1.getSelectedItem().toString();
        if ((TipoCita.equals(GuarderiaSoloPorDia.Nombre) || TipoCita.equals(Baño.Nombre))) {
            try {
                cedulaDue = Integer.valueOf(cedulaDueno.getText());
            } catch (java.lang.NumberFormatException x) {
                textoAlerta.setVisible(true);
                v1 = !true;
            }
            if ("".equals(NombreM.getText())) {
                textoAlerta1.setVisible(true);
                v1 = !true;
            }
            try {
                String dia = Integer.toString(DiaCita.getCalendar().get(Calendar.DAY_OF_MONTH));
                String mes = Integer.toString(DiaCita.getCalendar().get(Calendar.MONTH) + 1);
                String year = Integer.toString(DiaCita.getCalendar().get(Calendar.YEAR));
                Fecha = dia + "/" + mes + "/" + year;

            } catch (java.lang.NullPointerException e) {
                textoAlerta3.setVisible(true);
                v1 = !true;
            }
            String direccionArchivoGestion = "C:\\user";
            File fAG = new File(direccionArchivoGestion);
            String rutaAG = "C:\\user"; //Carpeta ruta
            String nombreArchivoAG = "GestionVeterinaria.txt"; //Nombre archivo
            File GestionVeterinaria = new File(rutaAG, nombreArchivoAG);
            if (!GestionVeterinaria.exists()) {
                v1 = !true;
                System.out.println("No hay clientes inscritos");
            } else {
                try ( Scanner sc = new Scanner(GestionVeterinaria)) {
                    v3 = !true;
                    v4 = !true;
                    while (sc.hasNextLine()) {
                        String linea = sc.nextLine();
                        String data[] = linea.split(",");
                        String CedulaA = data[0];
                        String NombreMA = data[1];
                        String RazaA = data[2];
                        String ColorA = data[3];
                        String FechaNacimientoA = data[4];
                        if (Integer.valueOf(CedulaA) == cedulaDue) {
                            v3 = true;
                            if (NombreMA.equals(NombreM.getText())) {
                                v4 = true;
                                break;
                            }
                        }
                    }
                } catch (Exception e) {
                }
                if (!v3) {
                    JOptionPane.showMessageDialog(null, "Apreciado Cliente, no se ecnuentra registrado");
                }
                if (!v4) {
                    JOptionPane.showMessageDialog(null, "Esta Mascota no se encuentra registrada");
                }
            }
        } else {
            try {
                cedulaDue = Integer.valueOf(cedulaDueno.getText());
            } catch (java.lang.NumberFormatException x) {
                textoAlerta.setVisible(true);
                v1 = !true;
            }
            if ("".equals(NombreM.getText())) {
                textoAlerta1.setVisible(true);
                v1 = !true;
            }
            try {
                String dia = Integer.toString(DiaCita.getCalendar().get(Calendar.DAY_OF_MONTH));
                String mes = Integer.toString(DiaCita.getCalendar().get(Calendar.MONTH) + 1);
                String year = Integer.toString(DiaCita.getCalendar().get(Calendar.YEAR));
                Fecha = dia + "/" + mes + "/" + year;

            } catch (java.lang.NullPointerException e) {
                textoAlerta3.setVisible(true);
                v1 = !true;
            }
            String direccionArchivoGestion = "C:\\user";
            File fAG = new File(direccionArchivoGestion);
            String rutaAG = "C:\\user"; //Carpeta ruta
            String nombreArchivoAG = "GestionVeterinaria.txt"; //Nombre archivo
            File GestionVeterinaria = new File(rutaAG, nombreArchivoAG);
            if (!GestionVeterinaria.exists()) {
                v1 = !true;
                System.out.println("No hay clientes inscritos");
            } else {
                try ( Scanner sc = new Scanner(GestionVeterinaria)) {
                    v3 = !true;
                    v4 = !true;
                    while (sc.hasNextLine()) {
                        String linea = sc.nextLine();
                        String data[] = linea.split(",");
                        String CedulaA = data[0];
                        String NombreMA = data[1];
                        String RazaA = data[2];
                        String ColorA = data[3];
                        String FechaNacimientoA = data[4];
                        if (Integer.valueOf(CedulaA) == cedulaDue) {
                            v3 = true;
                            if (NombreMA.equals(NombreM.getText())) {
                                v4 = true;
                                break;
                            }
                        }
                    }
                } catch (Exception e) {
                }
                if (!v3) {
                    System.out.println("Apreciado Cliente, no se ecnuentra registrado");
                }
                if (!v4) {
                    System.out.println("Esta Mascota no se encuentra registrada");
                }
            }
            if (v1 && v3 && v4 && v5) {
                String direccionAgendaVet = "C:\\user";
                File f = new File(direccionAgendaVet);
                String ruta = "C:\\user"; //Carpeta ruta
                String nombreArchivo = "AgendaVet.txt"; //Nombre archivo
                File ArchivoVet = new File(ruta, nombreArchivo);
                if (!ArchivoVet.exists()) { //No existe el archivo
                    f.mkdir();
                    try {
                        ArchivoVet.createNewFile();
                    } catch (IOException ex) {
                        System.out.println("Error");
                    }
                    String LineA = Fecha + "," + Hora + "," + TipoCita;
                    try ( FileWriter fw = new FileWriter(ArchivoVet.getAbsoluteFile(), true)) {
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(LineA);
                        bw.newLine();
                        bw.flush();
                        bw.close();
                        fw.close();
                    } catch (IOException e) {
                        System.out.println("Error al crear archivo");
                    }
                    if (TipoCita.equals(ConsultaVeterinario.Nombre) || TipoCita.equals(Radiologia.Nombre)) {
                        String Hora2 = "";
                        if (Hora.contains(":00")) {
                            Hora2 = Hora.substring(0, 3) + "30";
                            int HoraAux = Integer.parseInt(Hora.substring(0, 2)) + 1;
                            System.out.println("dios");
                            if ((Integer.valueOf(Hora.substring(0, 2)) + 1) > 9) {
                                Hora2 = HoraAux + ":00";
                            } else {
                                Hora2 = "0" + HoraAux + ":00";
                            }
                        } else if (Hora.contains(":30")) {
                            int HoraAux = Integer.parseInt(Hora.substring(0, 2)) + 1;
                            System.out.println(HoraAux);
                            System.out.println((Integer.valueOf(Hora.substring(0, 2))));
                            Hora2 = HoraAux + ":00";
                            if (HoraAux > 9) {
                                Hora2 = HoraAux + ":00";
                            } else {
                                Hora2 = "0" + HoraAux + ":00";
                            }
                        }
                        LineB = Fecha + "," + Hora2 + "," + TipoCita;
                        try ( FileWriter fw = new FileWriter(ArchivoVet.getAbsoluteFile(), true)) {
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.write(LineB);
                            bw.newLine();
                            bw.flush();
                            bw.close();
                            fw.close();
                        } catch (IOException e) {
                            System.out.println("Error al crear archivo");
                        }

                    }
                } else {
                    try ( Scanner sc = new Scanner(ArchivoVet)) {
                        while (sc.hasNextLine()) {
                            String linea = sc.nextLine();
                            String data[] = linea.split(",");
                            String FechaA = data[0];
                            String HoraA = data[1];
                            String TipoCitaA = data[2];
                            if (Fecha.equals(FechaA)) {
                                if (TipoCita.equals(Control.Nombre) || TipoCita.equals(Desparasitacion.Nombre) || TipoCita.equals(Vacunacion.Nombre)) {
                                    if (Hora.equals(HoraA)) {
                                        v2 = false;
                                        break;
                                    }
                                } else if (TipoCita.equals(ConsultaVeterinario.Nombre) || TipoCita.equals(Radiologia.Nombre)) {
                                    String Hora2 = "";
                                    if (Hora.contains(":00")) {
                                        Hora2 = Hora.substring(0, 3) + "30";
                                    } else if (Hora.contains(":30")) {
                                        int HoraAux = Integer.parseInt(Hora.substring(0, 2)) + 1;

                                        Hora2 = HoraAux + ":00";
                                        System.out.println(HoraAux);
                                    }
                                    if (Hora.equals(HoraA) || Hora2.equals(HoraA)) {
                                        v2 = false;
                                        break;
                                    }
                                }
                            }
                        }
                        if (v2 == false) {
                            textoAlerta2.setVisible(true);
                        } else {

                            String LineA = Fecha + "," + Hora + "," + TipoCita;
                            try ( FileWriter fw = new FileWriter(ArchivoVet.getAbsoluteFile(), true)) {
                                BufferedWriter bw = new BufferedWriter(fw);
                                bw.write(LineA);
                                bw.newLine();
                                bw.flush();
                                bw.close();
                                fw.close();
                            } catch (IOException e) {
                                System.out.println("Error al crear archivo");
                            }
                            if (TipoCita.equals(ConsultaVeterinario.Nombre) || TipoCita.equals(Radiologia.Nombre)) {
                                String Hora2 = "";
                                if (Hora.contains(":00")) {
                                    Hora2 = Hora.substring(0, 3) + "30";
                                    int HoraAux = Integer.parseInt(Hora.substring(0, 2)) + 1;
                                    System.out.println("dios");
                                    if ((Integer.valueOf(Hora.substring(0, 2)) + 1) > 9) {
                                        Hora2 = HoraAux + ":00";
                                    } else {
                                        Hora2 = "0" + HoraAux + ":00";
                                    }
                                } else if (Hora.contains(":30")) {
                                    int HoraAux = Integer.parseInt(Hora.substring(0, 2)) + 1;
                                    System.out.println(HoraAux);
                                    System.out.println((Integer.valueOf(Hora.substring(0, 2))));
                                    Hora2 = HoraAux + ":00";
                                    if (HoraAux > 9) {
                                        Hora2 = HoraAux + ":00";
                                    } else {
                                        Hora2 = "0" + HoraAux + ":00";
                                    }
                                }

                                LineB = Fecha + "," + Hora2 + "," + TipoCita;
                                try ( FileWriter fw = new FileWriter(ArchivoVet.getAbsoluteFile(), true)) {
                                    BufferedWriter bw = new BufferedWriter(fw);
                                    bw.write(LineB);
                                    bw.newLine();
                                    bw.flush();
                                    bw.close();
                                    fw.close();
                                } catch (IOException e) {
                                    System.out.println("Error al crear archivo");
                                }
                            }

                        }

                    } catch (FileNotFoundException e) {
                        System.out.println("El archivo no se encontró");
                    }

                }
                OrganizarArchivoVet(ArchivoVet);
            }

        }

        System.out.println(v1);
        System.out.println(v2);
        Crear.setEnabled(v1 && v2 && v3 && v4 && v5);
        confirmar.setEnabled(!(v1 && v2 && v3 && v4 && v5));

        // TODO add your handling code here:
    }//GEN-LAST:event_confirmarMouseClicked
    private void OrganizarArchivoVet(File Archivo) {
        String LineB = "";

        ArrayList<cita> fechas = new ArrayList<cita>();
        try ( Scanner sc = new Scanner(Archivo)) {
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String data[] = linea.split(",");
                String FechaA = data[0];
                String HoraA = data[1];
                String TipoCitaA = data[2];
                fechas.add(new cita(FechaA, HoraA, TipoCitaA));
            }
            try ( PrintWriter pw = new PrintWriter(Archivo)) {
                pw.write("");
            }
            Collections.sort(fechas, (cita lhs, cita rhs) -> {
                if (lhs.getFecha().getTime() < rhs.getFecha().getTime()) {
                    return -1;
                } else if (lhs.getFecha().getTime() == rhs.getFecha().getTime()) {
                    return 0;
                } else {
                    return 1;
                }
            }
            );
        } catch (Exception e) {
            System.out.println("El archivo no se encontró");
        }
        try ( FileWriter fw = new FileWriter(Archivo.getAbsoluteFile(), true)) {
            BufferedWriter bw = new BufferedWriter(fw);
            for (cita fecha : fechas) {
                String LineA = fecha.Fecha + "," + fecha.Hora + "," + fecha.TipoCita;
                bw.write(LineA);
                bw.newLine();
                bw.flush();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Error al crear archivo");
        }
    }
    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void CrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearMouseClicked
        int codigo = 1000;
        String Hora2 = "";
        if (TipoCita.equals(GuarderiaSoloPorDia.Nombre) || TipoCita.equals(Baño.Nombre)) {
            String LineA = "";
            String direccionCitas = "C:\\user";
            File f = new File(direccionCitas);
            String ruta = "C:\\user"; //Carpeta ruta
            String nombreArchivo = "ArchivoCitas.txt"; //Nombre archivo
            File ArchivoCitas = new File(ruta, nombreArchivo);
            if (!ArchivoCitas.exists()) { //No existe el archivo
                f.mkdir();
                try {
                    ArchivoCitas.createNewFile();
                } catch (IOException ex) {
                    System.out.println("Error");
                }
                if (TipoCita.equals(GuarderiaSoloPorDia.Nombre)) {
                    LineA = codigo + "," + Fecha + "," + "08:00" + "," + TipoCita + "," + NombreM.getText() + "," + cedulaDueno.getText();
                } else if (TipoCita.equals(Baño.Nombre)) {

                    if (Hora.contains(":00")) {
                        Hora2 = Integer.parseInt(Hora.substring(0, 2)) + 2 + ":00";
                    } else if (Hora.contains(":30")) {
                        int HoraAux = Integer.parseInt(Hora.substring(0, 2)) + 2;
                        if (HoraAux > 9) {
                            Hora2 = HoraAux + ":30";
                        } else {
                            Hora2 = "0" + HoraAux + ":30";
                        }
                    }
                    LineA = codigo + "," + Fecha + "," + Hora + "-" + Hora2 + "," + TipoCita + "," + NombreM.getText() + "," + cedulaDueno.getText();
                }
                try ( FileWriter fw = new FileWriter(ArchivoCitas.getAbsoluteFile(), true)) {
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(LineA);
                    bw.newLine();
                    bw.flush();
                    bw.close();
                    fw.close();
                } catch (IOException e) {
                    System.out.println("Error al crear archivo");
                }
            } else {
                try ( Scanner sc = new Scanner(ArchivoCitas)) {

                    while (sc.hasNextLine()) {
                        String linea = sc.nextLine();
                        String data[] = linea.split(",");
                        String CodigoA = data[0];
                        String FechaA = data[1];
                        String HoraA = data[2];
                        String TipoCitaA = data[3];
                        String NombreMA = data[4];
                        String CedulaA = data[5];
                        codigo = Integer.valueOf(CodigoA) + 1;
                        System.out.println(codigo);
                    }
                } catch (Exception e) {
                }
                if (TipoCita.equals(GuarderiaSoloPorDia.Nombre)) {
                    LineA = codigo + "," + Fecha + "," + "08:00" + "," + TipoCita + "," + NombreM.getText() + "," + cedulaDueno.getText();
                } else if (TipoCita.equals(Baño.Nombre)) {

                    if (Hora.contains(":00")) {
                        Hora2 = Integer.parseInt(Hora.substring(0, 2)) + 2 + ":00";
                    } else if (Hora.contains(":30")) {
                        int HoraAux = Integer.parseInt(Hora.substring(0, 2)) + 2;
                        if (Integer.valueOf(Hora.substring(0, 2)) > 9) {
                            Hora2 = HoraAux + ":30";
                        } else {
                            Hora2 = "0" + HoraAux + ":30";
                        }
                    }
                    LineA = codigo + "," + Fecha + "," + Hora + "-" + Hora2 + "," + TipoCita + "," + NombreM.getText() + "," + cedulaDueno.getText();
                }
                try ( FileWriter fw = new FileWriter(ArchivoCitas.getAbsoluteFile(), true)) {
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(LineA);
                    bw.newLine();
                    bw.flush();
                    bw.close();
                    fw.close();
                } catch (IOException e) {
                    System.out.println("Error al crear archivo");
                }
            }
        } else if (!(TipoCita.equals(GuarderiaSoloPorDia.Nombre) || TipoCita.equals(Baño.Nombre))) {
            if (v1 && v2) {
                String direccionCitas = "C:\\user";
                File f = new File(direccionCitas);
                String ruta = "C:\\user"; //Carpeta ruta
                String nombreArchivo = "ArchivoCitas.txt"; //Nombre archivo
                File ArchivoCitas = new File(ruta, nombreArchivo);
                if (!ArchivoCitas.exists()) { //No existe el archivo
                    f.mkdir();
                    try {
                        ArchivoCitas.createNewFile();
                    } catch (IOException ex) {
                        System.out.println("Error");
                    }
                    String LineA = codigo + "," + Fecha + "," + Hora + "," + TipoCita + "," + NombreM.getText() + "," + cedulaDueno.getText();
                    try ( FileWriter fw = new FileWriter(ArchivoCitas.getAbsoluteFile(), true)) {
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(LineA);
                        bw.newLine();
                        bw.flush();
                        bw.close();
                        fw.close();
                    } catch (IOException e) {
                        System.out.println("Error al crear archivo");
                    }
                    if (TipoCita.equals(ConsultaVeterinario.Nombre) || TipoCita.equals(Radiologia.Nombre)) {
                         if (Hora.contains(":00")) {
                            Hora2 = Hora.substring(0, 3) + "30";
                            int HoraAux = Integer.parseInt(Hora.substring(0, 2)) + 1;
                            System.out.println("dios");
                            if ((Integer.valueOf(Hora.substring(0, 2))+1) > 9) {
                                Hora2 = HoraAux + ":00";
                            } else {
                                Hora2 = "0" + HoraAux + ":00";
                            }
                        } else if (Hora.contains(":30")) {
                            int HoraAux = Integer.parseInt(Hora.substring(0, 2)) + 1;
                            System.out.println(HoraAux);
                            System.out.println((Integer.valueOf(Hora.substring(0, 2))));
                            Hora2 = HoraAux + ":00";
                            if (HoraAux > 9) {
                                Hora2 = HoraAux + ":00";
                            } else {
                                Hora2 = "0" + HoraAux + ":00";
                            }
                        }

                        String LineB = codigo + "," + Fecha + "," + Hora2 + "," + TipoCita + "," + NombreM.getText() + "," + cedulaDueno.getText();
                        try ( FileWriter fw = new FileWriter(ArchivoCitas.getAbsoluteFile(), true)) {
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.write(LineB);
                            bw.newLine();
                            bw.flush();
                            bw.close();
                            fw.close();
                        } catch (IOException e) {
                            System.out.println("Error al crear archivo");
                        }
                    }
                } else {

                    try ( Scanner sc = new Scanner(ArchivoCitas)) {

                        while (sc.hasNextLine()) {
                            String linea = sc.nextLine();
                            String data[] = linea.split(",");
                            String CodigoA = data[0];
                            String FechaA = data[1];
                            String HoraA = data[2];
                            String TipoCitaA = data[3];
                            String NombreMA = data[4];
                            String CedulaA = data[5];
                            codigo = Integer.valueOf(CodigoA) + 1;
                            System.out.println(codigo);
                        }
                    } catch (Exception e) {
                    }
                    String LineA = codigo + "," + Fecha + "," + Hora + "," + TipoCita + "," + NombreM.getText() + "," + cedulaDueno.getText();
                    try ( FileWriter fw = new FileWriter(ArchivoCitas.getAbsoluteFile(), true)) {
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(LineA);
                        bw.newLine();
                        bw.flush();
                        bw.close();
                        fw.close();
                    } catch (IOException e) {
                        System.out.println("Error al crear archivo");
                    }
                    if (TipoCita.equals(ConsultaVeterinario.Nombre) || TipoCita.equals(Radiologia.Nombre)) {
                        if (Hora.contains(":00")) {
                            Hora2 = Hora.substring(0, 3) + "30";
                            int HoraAux = Integer.parseInt(Hora.substring(0, 2)) + 1;
                            System.out.println("dios");
                            if ((Integer.valueOf(Hora.substring(0, 2))+1) > 9) {
                                Hora2 = HoraAux + ":00";
                            } else {
                                Hora2 = "0" + HoraAux + ":00";
                            }
                        } else if (Hora.contains(":30")) {
                            int HoraAux = Integer.parseInt(Hora.substring(0, 2)) + 1;
                            System.out.println(HoraAux);
                            System.out.println((Integer.valueOf(Hora.substring(0, 2))));
                            Hora2 = HoraAux + ":00";
                            if (HoraAux > 9) {
                                Hora2 = HoraAux + ":00";
                            } else {
                                Hora2 = "0" + HoraAux + ":00";
                            }
                        }

                        String LineB = codigo + "," + Fecha + "," + Hora2 + "," + TipoCita + "," + NombreM.getText() + "," + cedulaDueno.getText();
                        try ( FileWriter fw = new FileWriter(ArchivoCitas.getAbsoluteFile(), true)) {
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.write(LineB);
                            bw.newLine();
                            bw.flush();
                            bw.close();
                            fw.close();
                        } catch (IOException e) {
                            System.out.println("Error al crear archivo");
                        }

                    }
                }
            }
        }
        confirmar.setEnabled(v1 && v2);
        Crear.setEnabled(!(v1 && v2));
// TODO add your handling code here:
    }//GEN-LAST:event_CrearMouseClicked

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
            java.util.logging.Logger.getLogger(Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agendar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Crear;
    private com.toedter.calendar.JDateChooser DiaCita;
    private javax.swing.JTextField NombreM;
    private javax.swing.JTextField cedulaDueno;
    private javax.swing.JButton confirmar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textoAlerta;
    private javax.swing.JLabel textoAlerta1;
    private javax.swing.JLabel textoAlerta2;
    private javax.swing.JLabel textoAlerta3;
    private javax.swing.JLabel textoCed;
    private javax.swing.JLabel textoCed1;
    private javax.swing.JLabel textoNac;
    private javax.swing.JLabel textoNac1;
    // End of variables declaration//GEN-END:variables
}
