
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rahimecalik
 */
public class dosya {

    public static void main(String[] args) {
        //Dosya yolu ve veritabanı bağlantı bilgileri ile SQL sorgusu.
        String filePath = "kullanicilar.txt";
        String url = "jdbc:mysql://127.0.0.1:3306/proje";
        String user = "root";
        String password = "Rahime4588";
        String query = "SELECT tc FROM kullanici";
        //Veritabanından kullanıcı bilgilerini dosyaya yazma.
        dosyaYazma(url, user, password, query, filePath);
        //Dosyadan kullanıcı bilgilerini okuma ve ekrana yazma.
        dosyaOkuma(filePath);
    }
// Veritabanından verileri dosyaya yazan metot
    public static void dosyaYazma(String url, String user, String password, String query, String filePath) {
// Veritabanı bağlantısı, SQL sorgusu ve dosya yazma işlemleri için try-with-resources kullanma
        try (java.sql.Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/proje", "root", "Rahime4588"); java.sql.Statement s = c.createStatement(); ResultSet rs = s.executeQuery("SELECT * FROM proje.kullanici"); BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
// Sonuç kümesini (ResultSet) iterasyon ile okuma ve dosyaya yazma
            while (rs.next()) {
                // Kullanıcı TC kimlik numarasını al
                String kullaniciAdi = rs.getString("tc");
                bw.write(kullaniciAdi);  // Kullanıcı adını dosyaya yaz
                bw.newLine();  // Yeni satıra geç
            }

        } catch (SQLException e) {
             // Veritabanı hatası durumunda hata mesajı ve istisna yığını yazdırma
            System.out.println("Veritabanı ile ilgili bir hata oluştu: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            // Dosya hatası durumunda hata mesajı ve istisna yığını yazdırma
            System.out.println("Dosya ile ilgili bir hata oluştu: " + e.getMessage());
            e.printStackTrace();
        }

    }
// Dosyadan verileri okuyan ve ekrana yazdıran metot
    public static void dosyaOkuma(String filePath) {
        // Dosya okuma işlemleri için try-with-resources kullanma
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Dosyadan satır satır okuma ve ekrana yazdırma
            while ((line = br.readLine()) != null) {
                System.out.println(line);  // Dosyadan okunan satırı yazdır
            }
        } catch (IOException e) {
             // Dosya okuma hatası durumunda hata mesajı ve exception yazdırma
            e.printStackTrace();
            System.out.println("Dosya okunurken bir hata oluştu.");
        }
    }
}
