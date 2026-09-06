package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Frame;
import javax.swing.JMenu;
import java.awt.BorderLayout;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class FrmPrincipal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuItem mntmPaciente;
	private JDesktopPane desktopPane;
	
	FrmManPaciente frmManPaciente = new FrmManPaciente();
	FrmManEspecialidad frmManEspecialidad = new FrmManEspecialidad();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipal frame = new FrmPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FrmPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmPrincipal.class.getResource("/iconos/Best.gif")));
		setTitle("Sistema de Gestión de Establecimientos Médicos");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 369);
		
		JMenuBar Farmacia = new JMenuBar();
		Farmacia.setBackground(new Color(240, 240, 240));
		Farmacia.setToolTipText("Farmacia/Stock");
		setJMenuBar(Farmacia);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Add to basket.gif")));
		Farmacia.add(mnMantenimiento);
		
		mntmPaciente = new JMenuItem("Paciente");
		mntmPaciente.addActionListener(this);
		mntmPaciente.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Basket.gif")));
		mnMantenimiento.add(mntmPaciente);
		
		JMenuItem mntmEspecialidad = new JMenuItem("Especialidad");
		mntmEspecialidad.setSelected(true);
		mntmEspecialidad.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Boy.gif")));
		mntmEspecialidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktopPane.add(frmManEspecialidad);
				frmManEspecialidad.setVisible(true);
				frmManEspecialidad.toFront();
			}
		});
		mnMantenimiento.add(mntmEspecialidad);
		
		JMenuItem mntmMedico = new JMenuItem("Médico");
		mntmMedico.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Handshake.gif")));
		mnMantenimiento.add(mntmMedico);
		
		JMenu mnProcesos = new JMenu("Procesos");
		mnProcesos.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Add.gif")));
		Farmacia.add(mnProcesos);
		
		JMenuItem mntmHistorial = new JMenuItem("Historial Médico");
		mntmHistorial.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Book.gif")));
		mnProcesos.add(mntmHistorial);
		
		JMenuItem mntmCita = new JMenuItem("Cita");
		mntmCita.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Clock.gif")));
		mnProcesos.add(mntmCita);
		
		JMenuItem mntmReceta = new JMenuItem("Receta");
		mntmReceta.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/List.gif")));
		mnProcesos.add(mntmReceta);
		
		JMenu mnConsultas = new JMenu("Consultas");
		mnConsultas.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Clipboard.gif")));
		Farmacia.add(mnConsultas);
		
		JMenuItem mntmConsulta01 = new JMenuItem("Historial médico por paciente");
		mntmConsulta01.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Text.gif")));
		mnConsultas.add(mntmConsulta01);
		
		JMenuItem mntmConsulta02 = new JMenuItem("Cita por Paciente");
		mntmConsulta02.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Open letter.gif")));
		mnConsultas.add(mntmConsulta02);
		
		JMenuItem mntmConsulta03 = new JMenuItem("Receta por paciente");
		mntmConsulta03.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Lists.gif")));
		mnConsultas.add(mntmConsulta03);
		
		JMenu mnReportes = new JMenu("Reportes");
		mnReportes.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Dog.gif")));
		Farmacia.add(mnReportes);
		
		JMenuItem mntmReporte01 = new JMenuItem("Reporte de  Análisis Pacientes ");
		mntmReporte01.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Notes.gif")));
		mnReportes.add(mntmReporte01);
		
		JMenuItem mntmReporte02 = new JMenuItem("Reporte de Análisi de Historial Médico}");
		mntmReporte02.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Report.gif")));
		mnReportes.add(mntmReporte02);
		
		JMenuItem mntmReporte03 = new JMenuItem("Reporte de Citas");
		mntmReporte03.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/To do list.gif")));
		mnReportes.add(mntmReporte03);
		
		JMenu mnFarmacia = new JMenu("Farmacia/stock");
		mnFarmacia.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Heart.gif")));
		Farmacia.add(mnFarmacia);
		
		JMenuItem mntmMedicamentos = new JMenuItem("Registro de Medicamentos e Insumos");
		mntmMedicamentos.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Lists.gif")));
		mnFarmacia.add(mntmMedicamentos);
		
		JMenuItem mntmControl = new JMenuItem("Control de inventarios");
		mntmControl.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Numbered list.gif")));
		mnFarmacia.add(mntmControl);
		
		JMenuItem mntmVencimiento = new JMenuItem("Alerta de Medicamentos Vencidos");
		mntmVencimiento.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Problem.gif")));
		mnFarmacia.add(mntmVencimiento);
		
		JMenuItem mntmAlmacén = new JMenuItem("Entrada y salida de Almacén");
		mntmAlmacén.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Refresh.gif")));
		mnFarmacia.add(mntmAlmacén);
		
		JMenu mnFacturación = new JMenu("Facturación");
		mnFacturación.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Bar chart.gif")));
		Farmacia.add(mnFacturación);
		
		JMenuItem mntmApertura = new JMenuItem("Apertura y cierre");
		mntmApertura.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Unlock.gif")));
		mnFacturación.add(mntmApertura);
		
		JMenuItem mntmCobro = new JMenuItem("Cobro de consultas");
		mntmCobro.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Money.gif")));
		mnFacturación.add(mntmCobro);
		
		JMenuItem mntmComprobantes = new JMenuItem("Emision de comprobantes de pago");
		mntmComprobantes.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Text.gif")));
		mnFacturación.add(mntmComprobantes);
		
		JMenuItem mntmCaja = new JMenuItem("Reporte de Caja");
		mntmCaja.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Brief case.gif")));
		mnFacturación.add(mntmCaja);
		
		JMenu mnSeguridad = new JMenu("Seguridad");
		mnSeguridad.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Unlock.gif")));
		Farmacia.add(mnSeguridad);
		
		JMenuItem mntmUsuarios = new JMenuItem("Gestion de Usuarios");
		mntmUsuarios.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/User group.gif")));
		mnSeguridad.add(mntmUsuarios);
		
		JMenuItem mntmRoles = new JMenuItem("Roles y Permisos por Módulo");
		mntmRoles.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Unknown person.gif")));
		mnSeguridad.add(mntmRoles);
		
		JMenuItem mntmContraseña = new JMenuItem("Cambio de Contraseña");
		mntmContraseña.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Users.gif")));
		mnSeguridad.add(mntmContraseña);
		
		JMenuItem mntmAuditoria = new JMenuItem("Auditoria de Sistema");
		mntmAuditoria.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Open book.gif")));
		mnSeguridad.add(mntmAuditoria);
		
		JMenuItem mntmVisor = new JMenuItem("Visor de Eventos");
		mntmVisor.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Info.gif")));
		mnSeguridad.add(mntmVisor);
		
		JMenu mnConfiguración = new JMenu("Configuración");
		mnConfiguración.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Peace.gif")));
		Farmacia.add(mnConfiguración);
		
		JMenuItem mntmDatos = new JMenuItem("Datos de la Institución");
		mntmDatos.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Company.gif")));
		mnConfiguración.add(mntmDatos);
		
		JMenuItem mntmHorarios = new JMenuItem("Horarios de Atención");
		mntmHorarios.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Clock.gif")));
		mnConfiguración.add(mntmHorarios);
		
		JMenuItem mntmImpresoras = new JMenuItem("Configuracion de impresoras");
		mntmImpresoras.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Printer.gif")));
		mnConfiguración.add(mntmImpresoras);
		
		JMenuItem mntmSeguridad = new JMenuItem("Copia de Seguridad");
		mntmSeguridad.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Database.gif")));
		mnConfiguración.add(mntmSeguridad);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		mnAyuda.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Zoom.gif")));
		Farmacia.add(mnAyuda);
		
		JMenuItem mntmUsuario = new JMenuItem("Manual de Usuario");
		mntmUsuario.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Clipboard.gif")));
		mnAyuda.add(mntmUsuario);
		
		JMenuItem mntmBuscar = new JMenuItem("Buscar");
		mntmBuscar.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Search.gif")));
		mnAyuda.add(mntmBuscar);
		
		JMenuItem mntmSoporte = new JMenuItem("Soporte Tecnico");
		mntmSoporte.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/User.gif")));
		mnAyuda.add(mntmSoporte);
		
		JMenuItem mntmVersion = new JMenuItem("Acerca (Version del Sistema)");
		mntmVersion.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/iconos/Create.gif")));
		mnAyuda.add(mntmVersion);
		
		JMenuBar menuBar_1 = new JMenuBar();
		Farmacia.add(menuBar_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(SystemColor.textHighlight);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		frmManPaciente.setLocation(-75, 250);
		
		desktopPane.add(frmManPaciente);
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmPaciente) {
			handleMntmPacienteActionPerformed(e);
		}
	}
	protected void handleMntmPacienteActionPerformed(ActionEvent e) {
		frmManPaciente.setVisible(true);
	}
}