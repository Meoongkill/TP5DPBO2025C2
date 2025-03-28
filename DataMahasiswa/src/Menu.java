import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

public class Menu extends JFrame{
    public static void main(String[] args) {
        // buat object window
        Menu window = new Menu();

        // atur ukuran window
        window.setSize(480,560);

        // letakkan window di tengah layar
        window.setLocationRelativeTo(null);

        // isi window
        window.setContentPane(window.mainPanel);

        // ubah warna background
        window.getContentPane().setBackground(Color.white);

        // tampilkan window
        window.setVisible(true);

        // agar program ikut berhenti saat window diclose
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // index baris yang diklik
    private int selectedIndex = -1;

    // list untuk menampung semua mahasiswa
    private ArrayList<Mahasiswa> listMahasiswa;

    // Untuk Menampung Database
    private Database database;

    private JPanel mainPanel;
    private JTextField nimField;
    private JTextField namaField;
    private JTable mahasiswaTable;
    private JButton addUpdateButton;
    private JButton cancelButton;
    private JComboBox jenisKelaminComboBox;
    private JComboBox WaifuComboBox;
    private JComboBox HobbyComboBox;
    private JButton deleteButton;
    private JLabel titleLabel;
    private JLabel nimLabel;
    private JLabel namaLabel;
    private JLabel jenisKelaminLabel;
    private JLabel WaifuLabel;
    private JLabel HobbyLabel;

    // constructor
    public Menu() {
        // inisialisasi listMahasiswa
        listMahasiswa = new ArrayList<>();

        // buat objek database
        database = new Database();

        // isi tabel mahasiswa
        mahasiswaTable.setModel(setTable());

        // ubah styling title
        titleLabel.setFont(titleLabel.getFont().deriveFont(Font.BOLD, 20F));

        // atur isi combo box
        String[] JenisKelaminData = {"", "Laki-laki", "Perempuan"};
        String[] WaifuData = {"", "Furiri", "Clorinde", "Nilou", "Al-Haitam", "Diluc", "Childe"};
        String[] HobbyData = {"", "Gaming", "Reading", "Cycling", "Writing"};
        jenisKelaminComboBox.setModel(new DefaultComboBoxModel(JenisKelaminData));
        WaifuComboBox.setModel(new DefaultComboBoxModel(WaifuData));
        HobbyComboBox.setModel(new DefaultComboBoxModel(HobbyData));

        // sembunyikan button delete
        deleteButton.setVisible(false);

        // saat tombol add/update ditekan
        addUpdateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectedIndex == -1){
                    insertData();
                } else{
                    updateData();
                }
            }
        });

        // saat tombol delete ditekan
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectedIndex >= 0){
                    deleteData();
                }
            }
        });

        // saat tombol cancel ditekan
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cek apakah form tidak kosong
                if(!nimField.getText().isEmpty() ||
                        !namaField.getText().isEmpty() ||
                        !jenisKelaminComboBox.getSelectedItem().toString().isEmpty() ||
                        !WaifuComboBox.getSelectedItem().toString().isEmpty() ||
                        !HobbyComboBox.getSelectedItem().toString().isEmpty()) {

                    // Tampilkan dialog konfirmasi
                    int option = JOptionPane.showConfirmDialog(
                            null,
                            "Apakah Anda yakin ingin membatalkan? Data yang belum disimpan akan hilang.",
                            "Konfirmasi Batal",
                            JOptionPane.YES_NO_OPTION
                    );

                    // Jika pengguna memilih 'Yes' (opsi 0)
                    if(option == 0) {
                        clearForm();
                    }
                    // Jika memilih 'No', tidak lakukan apa-apa
                } else {
                    // Jika form sudah kosong, langsung clear form tanpa konfirmasi
                    clearForm();
                }
            }
        });

        // saat salah satu baris tabel ditekan
        mahasiswaTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // ubah selectedIndex menjadi baris tabel yang diklik
                selectedIndex = mahasiswaTable.getSelectedRow();

                // simpan value textfield dan combo box
                String selectedNim = mahasiswaTable.getModel().getValueAt(selectedIndex, 1).toString();
                String selectedNama = mahasiswaTable.getModel().getValueAt(selectedIndex, 2).toString();
                String selectedJenisKelamin = mahasiswaTable.getModel().getValueAt(selectedIndex, 3).toString();
                String selectedWaifu = mahasiswaTable.getModel().getValueAt(selectedIndex, 4).toString();
                String selectedHobby = mahasiswaTable.getModel().getValueAt(selectedIndex, 5).toString();

                // ubah isi textfield dan combo box
                nimField.setText(selectedNim);
                namaField.setText(selectedNama);
                jenisKelaminComboBox.setSelectedItem(selectedJenisKelamin);
                WaifuComboBox.setSelectedItem(selectedWaifu);
                HobbyComboBox.setSelectedItem(selectedHobby);

                // ubah button "Add" menjadi "Update"
                addUpdateButton.setText("Update Datanya");

                // tampilkan button delete
                deleteButton.setVisible(true);

            }
        });
    }

    public final DefaultTableModel setTable() {
        Object[] column = {"No", "NIM", "Nama", "Jenis Kelamin", "Waifu", "Hobby"};
        DefaultTableModel temp = new DefaultTableModel(null, column);

        try {
            ResultSet resultSet = database.selectQuery("SELECT * FROM mahasiswa");
            int i = 0;
            while(resultSet.next()){
                Object[] row = new Object[6];
                row[0] = i + 1;
                row[1] = resultSet.getString("nim");
                row[2] = resultSet.getString("nama");
                row[3] = resultSet.getString("jenis_kelamin");
                row[4] = resultSet.getString("waifu");
                row[5] = resultSet.getString("hobby");
                temp.addRow(row);
                i++;
            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        return temp;
    }

    public void insertData() {
        String nim = nimField.getText();
        String nama = namaField.getText();
        String jenisKelamin = jenisKelaminComboBox.getSelectedItem().toString();
        String waifu = WaifuComboBox.getSelectedItem().toString();
        String hobby = HobbyComboBox.getSelectedItem().toString();

        if (!nim.isEmpty() && !nama.isEmpty() && !jenisKelamin.isEmpty() && !waifu.isEmpty() && !hobby.isEmpty()){
            try{
                String checkQuery = "SELECT nim FROM mahasiswa WHERE nim = '" + nim + "';";
                ResultSet resultSet = database.selectQuery(checkQuery);

                if(resultSet.next()){
                    JOptionPane.showMessageDialog(null, "NIM sudah terdaftar! Gunakan NIM yang lain.");
                } else {
                    String sql = "INSERT INTO mahasiswa VALUES (null, '" + nim + "', '" + nama + "', '" + jenisKelamin + "', '" + waifu + "', '" + hobby + "');";
                    database.InsertUpdateDeleteQuery(sql);
                    mahasiswaTable.setModel(setTable());
                    clearForm();
                    JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan!");
                }
            } catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Mohon isi semua kotak!");
        }
    }

    public void updateData() {
        // Ambil data dari form
        String nim = nimField.getText();
        String nama = namaField.getText();
        String jenisKelamin = jenisKelaminComboBox.getSelectedItem().toString();
        String waifu = WaifuComboBox.getSelectedItem().toString();
        String hobby = HobbyComboBox.getSelectedItem().toString();

        // Mengecek apakah semua kolom sudah diisi
        if (!nim.isEmpty() && !nama.isEmpty() && !jenisKelamin.isEmpty() && !waifu.isEmpty() && !hobby.isEmpty()) {
            // Tampilkan dialog konfirmasi sebelum update
            int pilihan = JOptionPane.showConfirmDialog(
                    this,
                    "Apakah Anda yakin ingin memperbarui data ini?",
                    "Konfirmasi Update",
                    JOptionPane.YES_NO_OPTION
            );

            // Jika pengguna memilih 'Yes' (opsi 0)
            if (pilihan == JOptionPane.YES_OPTION) {
                // Query update
                String sql = "UPDATE mahasiswa SET nama = '" + nama + "'," +
                        " jenis_kelamin = '" + jenisKelamin + "'," +
                        " waifu = '" + waifu + "'," +
                        " hobby = '" + hobby + "'" +
                        " WHERE nim = '" + nim + "';";

                // Lakukan update ke database
                database.InsertUpdateDeleteQuery(sql);

                // Perbarui tampilan tabel
                mahasiswaTable.setModel(setTable());

                // Bersihkan form input
                clearForm();

                // Tampilkan notifikasi sukses
                System.out.println("Update Berhasil sir!");
                JOptionPane.showMessageDialog(null, "Data Berhasil Diperbarui Sir!");
            }
            // Jika memilih 'No', tidak melakukan apa-apa
        } else {
            // Jika ada kotak kosong, tampilkan peringatan
            System.out.println("Update Gagal sir! Ada kotak yang masih kosong.");
            JOptionPane.showMessageDialog(null, "Isi semua kotak terlebih dahulu!");
        }
    }

    public void deleteData() {
        // Tampilkan dialog konfirmasi
        int pilihan = JOptionPane.showConfirmDialog(
                this,
                "Apakah Anda yakin ingin menghapus data ini?",
                "Konfirmasi Hapus",
                JOptionPane.YES_NO_OPTION
        );

        // Jika pengguna memilih 'Yes' (opsi 0)
        if(pilihan == JOptionPane.YES_OPTION) {
            //kita tandain NIM yang mau kita hapus
            String nim = nimField.getText();

            //Kita bakalan menghapus data dari list
            String sql = "DELETE FROM mahasiswa WHERE nim = '" + nim + "';";
            database.InsertUpdateDeleteQuery(sql);

            // update tabel
            mahasiswaTable.setModel(setTable());

            // bersihkan form
            clearForm();

            // feedback
            System.out.println("Delete Berhasil sir!");
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus Sir!");
        }
        // Jika pengguna memilih 'No', tidak melakukan apa-apa
    }

    public void clearForm() {
        // kosongkan semua texfield dan combo box
        nimField.setText("");
        namaField.setText("");
        jenisKelaminComboBox.setSelectedItem("");
        WaifuComboBox.setSelectedItem("");
        HobbyComboBox.setSelectedItem("");

        // ubah button "Update" menjadi "Add"
        addUpdateButton.setText("Add Datanya");

        // sembunyikan button delete
        deleteButton.setVisible(false);

        // ubah selectedIndex menjadi -1 (tidak ada baris yang dipilih)
        selectedIndex = -1;
    }
}
