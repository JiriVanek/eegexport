package gui;

import hdf5.Export;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;
/**
 * GUI class with main
 * @author vanek2
 *
 */
public class MainPanel extends JFrame {
	private JButton open_vmrk = new JButton("Open VMRK");
	private final JButton openEEG = new JButton("Open EEG");
	private final JButton openVHDR = new JButton("Open VHDR");
	private String headerFile = "E:\\!skola\\diplomka\\stimulation\\data_mereni\\10-6_driver.vhdr";
	private String dataFile = "E:\\!skola\\diplomka\\stimulation\\data_mereni\\10-6_driver.eeg";
	private String stimuliFile = "E:\\!skola\\diplomka\\stimulation\\data_mereni\\10-6_driver.vmrk";
	private String filename = "hdfsoubor.hdf5";
	private String savePath = "E:\\temp\\";
	private String hdfName = null;
	private int experimentID = -1;
	private int chunkSize = 1;
	private final JTextField textVMRK = new JTextField();
	private final JTextField textEEG = new JTextField();
	private final JTextField textVHDR = new JTextField();
	private Export exp = new Export();
	private String path = null;
	private final JButton selectButton = new JButton("Select save location");
	private JPanel p_1;
	private final JTextField saveField = new JTextField();
	private final Button saveButton = new Button("Save");
	private final JCheckBox chckbLoadDataWS = new JCheckBox(
			"Load data from file system");
	private JTextField textIdExp = new JTextField();;
	private final JTextField txtSelectExperimentFor = new JTextField();
	private final JCheckBox chckbxMetaLoad = new JCheckBox(
			"Load metadata from EEGBase");
	private final Choice choice = new Choice();

	private final JTextField txtCompressionChunkSize = new JTextField();

	public MainPanel() {
		Image rankImage = Toolkit.getDefaultToolkit().getImage(
				getClass().getResource("/eegbase.PNG"));
		this.setIconImage(rankImage);
		setMinimumSize(new Dimension(550, 400));
		setTitle("EEGBase HDF5 export");
		JPanel p = new JPanel();
		Container cp = getContentPane();
		txtCompressionChunkSize.setEditable(false);
		txtCompressionChunkSize.setText("Compression chunk size");
		txtCompressionChunkSize.setColumns(10);
		textVMRK.setToolTipText("Path to VMRK file");
		textEEG.setToolTipText("Path to EEG file");
		textVHDR.setToolTipText("Path to VHDR file");
		saveField.setToolTipText("Path for saving HDF5 file");
		choice.add("1");
		choice.add("32");
		choice.add("64");
		choice.add("128");
		choice.add("256");
		choice.add("512");
		choice.add("1024");
		textIdExp.setVisible(false);
		txtSelectExperimentFor.setVisible(false);

		/*
		 * NumberFormat numberFormat =
		 * NumberFormat.getNumberInstance(Locale.getDefault()); DecimalFormat
		 * decimalFormat = (DecimalFormat) numberFormat;
		 * decimalFormat.setGroupingUsed(false); textIdExp = new
		 * JFormattedTextField(decimalFormat);
		 */
		cp.add(p, BorderLayout.SOUTH);
		p.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("200px"), ColumnSpec.decode("default:grow"),
				ColumnSpec.decode("100px"), }, new RowSpec[] {
				RowSpec.decode("23px"), FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("23px"), FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, }));
		selectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser c;
				if (path == null)
					c = new JFileChooser(".");
				else {
					c = new JFileChooser(path);
				}
				FileFilter filter = new FileNameExtensionFilter("HDF5 file",
						new String[] { "h5" });
				c.setFileFilter(filter);
				// "SAVE" dialog:
				int rVal = c.showOpenDialog(MainPanel.this);
				if (rVal == JFileChooser.APPROVE_OPTION) {
					savePath = c.getCurrentDirectory().toString() + "\\";
					if (!c.getSelectedFile().getName().endsWith(".h5"))
						hdfName = c.getSelectedFile().getName() + ".h5";
					saveField.setText(c.getCurrentDirectory().toString() + "\\"
							+ hdfName);
					path = c.getCurrentDirectory().toString() + "\\";
					filename = hdfName;
				}
				if (rVal == JFileChooser.CANCEL_OPTION) {
					saveField.setText("");
				}
			}
		});

		p.add(chckbxMetaLoad, "1, 1, fill, default");
		txtSelectExperimentFor
				.setText("Select experiments ID for load metadata");
		txtSelectExperimentFor.setEditable(false);
		txtSelectExperimentFor.setColumns(10);

		p.add(txtSelectExperimentFor, "2, 1, fill, default");
		textIdExp.setToolTipText("Write number of experiment ");

		textIdExp.setColumns(10);

		p.add(textIdExp, "3, 1, center, default");
		p.add(selectButton, "1, 3, fill, default");
		saveField.setColumns(10);

		p.add(saveField, "2, 3, 2, 1, fill, fill");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				runExport();
			}
		});

		p.add(txtCompressionChunkSize, "1, 5, fill, default");
		p.add(choice, "2, 5, left, default");

		p.add(saveButton, "3, 5, fill, fill");
		p_1 = new JPanel();
		p_1.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("170px"),
				ColumnSpec.decode("max(100dlu;default):grow"), },
				new RowSpec[] { RowSpec.decode("23px"),
						FormFactory.LINE_GAP_ROWSPEC, RowSpec.decode("23px"),
						FormFactory.LINE_GAP_ROWSPEC, RowSpec.decode("23px"),
						FormFactory.LINE_GAP_ROWSPEC, RowSpec.decode("23px"), }));
		chckbLoadDataWS.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if (chckbLoadDataWS.isSelected()) {
					open_vmrk.setEnabled(true);
					openEEG.setEnabled(true);
					openVHDR.setEnabled(true);
					textVHDR.setEnabled(true);
					textEEG.setEnabled(true);
					textVMRK.setEnabled(true);
					txtSelectExperimentFor
							.setText("Set experiments ID for metadata load:");

				}
				if (!chckbLoadDataWS.isSelected()) {
					open_vmrk.setEnabled(false);
					openEEG.setEnabled(false);
					openVHDR.setEnabled(false);
					textVHDR.setEnabled(false);
					textEEG.setEnabled(false);
					textVMRK.setEnabled(false);
					txtSelectExperimentFor
							.setText("Set experiments ID for data and metadata load:");
				}
			}
		});

		chckbxMetaLoad.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if (chckbxMetaLoad.isSelected()) {
					textIdExp.setVisible(true);
					txtSelectExperimentFor.setVisible(true);

				}
				if (!chckbxMetaLoad.isSelected()) {
					textIdExp.setVisible(false);
					txtSelectExperimentFor.setVisible(false);
				}
			}
		});
		chckbLoadDataWS.setSelected(true);
		p_1.add(chckbLoadDataWS, "2, 1, left, default");
		p_1.add(openEEG, "1, 3, fill, fill");
		textEEG.setColumns(10);
		p_1.add(textEEG, "2, 3, fill, fill");
		p_1.add(openVHDR, "1, 5, fill, fill");
		openEEG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser c;
				if (path == null)
					c = new JFileChooser(".");
				else {
					c = new JFileChooser(path);
				}
				FileFilter filter = new FileNameExtensionFilter("EEG file",
						new String[] { "eeg", "EEG" });
				c.setFileFilter(filter);
				// "EEG" dialog:
				int rVal = c.showOpenDialog(MainPanel.this);
				if (rVal == JFileChooser.APPROVE_OPTION) {
					dataFile = c.getCurrentDirectory().toString() + "\\"
							+ c.getSelectedFile().getName();
					textEEG.setText(dataFile);
					path = c.getCurrentDirectory().toString();
				}
				if (rVal == JFileChooser.CANCEL_OPTION) {
					textEEG.setText("");
				}
			}
		});
		openVHDR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser c;
				if (path == null)
					c = new JFileChooser(".");
				else {
					c = new JFileChooser(path);
				}
				FileFilter filter = new FileNameExtensionFilter("VHDR file",
						new String[] { "vhdr", "VHDR" });
				c.setFileFilter(filter);
				// VHDR dialog:
				int rVal = c.showOpenDialog(MainPanel.this);
				if (rVal == JFileChooser.APPROVE_OPTION) {
					headerFile = c.getCurrentDirectory().toString() + "\\"
							+ c.getSelectedFile().getName();
					textVHDR.setText(headerFile);
					path = c.getCurrentDirectory().toString();
				}
				if (rVal == JFileChooser.CANCEL_OPTION) {
					textVHDR.setText("");
				}
			}
		});
		textVHDR.setColumns(10);
		p_1.add(textVHDR, "2, 5, fill, fill");
		cp.add(p_1, BorderLayout.NORTH);
		open_vmrk.addActionListener(new OpenL());
		p_1.add(open_vmrk, "1, 7, fill, fill");
		textVMRK.setColumns(10);
		p_1.add(textVMRK, "2, 7, fill, fill");

	}

	class OpenL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFileChooser c;
			if (path == null)
				c = new JFileChooser(".");
			else {
				c = new JFileChooser(path);
			}
			FileFilter filter = new FileNameExtensionFilter("VMRK file",
					new String[] { "vmrk", "VMRK" });
			c.setFileFilter(filter);
			// VMRK" dialog:
			int rVal = c.showOpenDialog(MainPanel.this);
			if (rVal == JFileChooser.APPROVE_OPTION) {
				stimuliFile = c.getCurrentDirectory().toString() + "\\"
						+ c.getSelectedFile().getName();
				textVMRK.setText(stimuliFile);
				path = c.getCurrentDirectory().toString();
			}
			if (rVal == JFileChooser.CANCEL_OPTION) {
				textVMRK.setText("");
			}
		}
	}

	public static void main(String[] args) {
		run(new MainPanel(), 700, 300);

	}

	public static void run(JFrame frame, int width, int height) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
	}
/**
 * method for export to hdf5
 */
	private void runExport() {
		chunkSize = Integer.parseInt(choice.getSelectedItem());
		if (chckbxMetaLoad.isSelected()) {
			try {
				experimentID = Integer.parseInt(textIdExp.getText());
			} catch (Exception e2) {
				experimentID = -1;
				JOptionPane.showMessageDialog(p_1, "Wrong experiment ID");
			}
		}
		if ((headerFile != null && stimuliFile != null && dataFile != null
				&& filename != null && path != null)) {
			try {
				if (chckbxMetaLoad.isSelected() && experimentID > 0) {
					exp.hdfFile(headerFile, dataFile, stimuliFile, filename,
							path, experimentID, chunkSize);
					JOptionPane.showMessageDialog(p_1, "Export complete.");
				} else {
					exp.hdfFilWithoutMeta(headerFile, dataFile, stimuliFile,
							filename, path, chunkSize);
					JOptionPane.showMessageDialog(p_1, "Export complete.");
				}
			} catch (Exception ex) {
				ex.printStackTrace();
				JOptionPane.showMessageDialog(p_1, "Something went wrong.",
						"Error", JOptionPane.ERROR_MESSAGE);
			}
		} else {
			// export without stimuli
			if ((headerFile != null && dataFile != null && filename != null && path != null)) {
				try {
					if (chckbxMetaLoad.isSelected() && experimentID > 0) {
						exp.hdfFileWithoutStimuli(headerFile, dataFile,
								filename, path, experimentID, chunkSize);
						JOptionPane.showMessageDialog(p_1, "Export complete.");
					} else {
						exp.hdfFilWithoutMetaStimuli(headerFile, dataFile,
								filename, path, chunkSize);
						JOptionPane.showMessageDialog(p_1, "Export complete.");
					}
				} catch (Exception ex) {
					ex.printStackTrace();
					JOptionPane.showMessageDialog(p_1, "Something went wrong.",
							"Error", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(p_1,
						"Error path to data files must be filled. WS load is not working.", "Error",
						JOptionPane.WARNING_MESSAGE);
				
			if ((!chckbLoadDataWS.isSelected() && filename != null
					&& path != null && textIdExp.getText() != null))
				try {
					exp.hdfFileWs(filename, path, experimentID, chunkSize);
					JOptionPane.showMessageDialog(p_1, "Export complete.");
				} catch (Exception ex) {
					ex.printStackTrace();
					JOptionPane.showMessageDialog(p_1, "Something went wrong.",
							"Error", JOptionPane.ERROR_MESSAGE);
				}
			}

		}
	}
} // /:~