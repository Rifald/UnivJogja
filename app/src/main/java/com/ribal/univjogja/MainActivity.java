package com.ribal.univjogja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private List<Universitas> list;
    private RecyclerView.ItemDecoration decoration;
    ImageView aboutBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rvAndroid);
        aboutBt = findViewById(R.id.about_iv);



        list = new ArrayList<>();
        decoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        UniversitasAdapter adapter = new UniversitasAdapter(list);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.addItemDecoration(decoration);
        rv.setAdapter(adapter);



        // Load data list item
        loadDataDummy();

        aboutBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AboutActivity.class));
            }
        });

    }

    private void loadDataDummy() {


        list.add(new Universitas(
                "Universitas Gadjah Mada (UGM)",
                "Bulaksumur, Caturtunggal, Kec. Depok, Kab. Sleman",
                "Universitas Gadjah Mada adalah salah satu universitas tertua di Indonesia yang ada sejak tahun " +
                        "19 Desember 1949. Moto UGM adalah Mengakar Kuat, Menjulang Tinggi. UGM mempunyai 18 fakultas, " +
                        "satu sekolah pascasarjana, dan satu sekolah vokasi. Fakultas yang ada diantaranya Fakultas Biologi, " +
                        "Fakultas Ekonomika dan Bisnis, Fakultas Biologi, Fakultas Ekonomika dan Bisnis Fakultas Farmasi, " +
                        "Fakultas Geografi, Fakultas Filsafat, Fakultas Hukum,  Fakultas Ilmu Budaya, Fakultas ISIPOL, " +
                        "Fakultas Kedokteran, Fakultas Kedokteran Gigi, Fakultas Kedokteran Hewan, Fakultas Kehutanan, " +
                        "Fakultas MIPA Fakultas, Pertanian Fakultas Peternakan, Fakultas Psikologi, Fakultas Teknik, Fakultas Teknologi Pertanian.",
                "https://kampusaja.com/wp-content/uploads/2016/12/3_profil-kampus-UGM-Yogyakarta-480x270.jpg",
                R.drawable.logougm
        ));

        list.add(new Universitas(
                "Universitas Negeri Yogyakarta (UNY)",
                "Jl. Colombo Yogyakarta No.1, Karang Malang, Caturtunggal, Kec. Depok, Kab. Sleman",
                "Universitas Negeri Yogyakarta adalah universitas yang didirikan pada 21 Mei 1964, dimana sebelumnya universitas ini bernama IKIP " +
                        "Yogyakarta. Moto UNY adalah Unggul, Kreatif, Inovatif, Takwa, Mandiri, dan Cendekia. UNY mempunyai 8 fakultas yang terdiri dari " +
                        "Fakultas Ilmu Pendidikan (FIP), Fakultas Bahasa dan Seni (FBS), Fakultas Matematika dan Ilmu Pengetahuan Alam (FMIPA), Fakultas " +
                        "Ilmu Sosial (FIS), Fakultas Ekonomi (FE), Fakultas Teknik (FT), Fakultas Ilmu Keolahragaan (FIK), dan Program Pascasarjana (PPs)",
                "https://kampusaja.com/wp-content/uploads/2018/08/2.-UNY-Universitas-Negeri-Yogyakarta-Universitas-Terbaik-di-Yogyakarta.jpg",
                R.drawable.logouny
        ));

        list.add(new Universitas(
                "Universitas Islam Negeri Sunan Kalijaga (UIN SUKA)",
                "Jl. Laksda Adisucipto, Papringan, Caturtunggal, Kec. Depok, Kab. Sleman",
                "UIN Sunan Kalijaga adalah salah satu universitas terbaik di Yogyakarta, dimana universitas ini berdiri pada 26 September 1951. " +
                        "UIN SUKA mempunyai 8 fakultas dan 1 sekolah pascasarjana, Terdiri dari Fakultas Adab dan Ilmu Budaya, Fakultas Dakwah dan Komunikasi, " +
                        "Fakultas Syariah dan Hukum, Fakultas Ilmu Tarbiyah dan Keguruan, Fakultas Ushuluddin dan Pemikiran Islam, Fakultas Sains dan Teknologi, " +
                        "Fakultas Ilmu Sosial dan Humaniora, Fakultas Ekonomi dan Bisnis Islam, Pascasarjana.",
                "https://kampusaja.com/wp-content/uploads/2018/08/3.-UIN-SUKA-UIN-Sunan-Kalijaga-Universitas-Terbaik-di-Yogyakarta.jpg",
                R.drawable.logouinsuka
        ));

        list.add(new Universitas(
                "Universitas Muhammadiyah Yogyakarta (UMY)",
                "Jl. Brawijaya, Geblagan, Tamantirto, Kec. Kasihan, Bantul",
                "UMY adalah universitas swasta dan menjadi salah satu universitas terbaik di Yogyakarta. UMY didirikan pada 1 Maret 1981. " +
                        "UMY mempunyai 9 Fakultas dan Program Pascasarjana. Fakultas UMY terdiri dari Fakultas Agama Islam, Fakultas Ekonomi, " +
                        "Fakultas Hukum, Fakultas Isipol, Fakultas Kedokteran dan Ilmu Kesehatan, Fakultas Pertanian, Fakultas Teknik, " +
                        "Fakultas Pendidikan Bahasa, Program Vokasi/Politeknik UMY (D III).",
                "https://i1.wp.com/harga.web.id/wp-content/uploads/UMY-Universitas-Muhammadiyah-Yogyakarta.jpg?w=680&ssl=1",
                R.drawable.logoumy
        ));
        list.add(new Universitas(
                "Universitas Sanata Dharma (USD)",
                "Jl. Affandi, Santren, Caturtunggal, Kec. Depok, Kab. Sleman",
                "Universitas Sanata Dharma atau sering dikenal dengan USD adalah salah satu universitas swasta terbaik di Yogyakarta. " +
                        "Kampus USD sendiri tersebar di beberapa wilayah di Yogyakarta dan terdiri dari 5 Kampus. USD mempunyai 7 fakultas dan " +
                        "satu program pascasarjana. Fakultas USD terdiri dari Fakultas Ekonomi, Fakultas Farmasi, Fakultas Keguruan dan " +
                        "Ilmu Pendidikan, Fakultas Psikologi, Fakultas Sains dan Teknologi, Fakultas Sastra, Fakultas Teologi, dan " +
                        "Program Pasca Sarjana.",
                "https://kampusaja.com/wp-content/uploads/2018/08/5.-USD-Universitas-Sanata-Dharma-Universitas-Terbaik-di-Yogyakarta.jpg",
                R.drawable.logousd
        ));
        list.add(new Universitas(
                "Universitas Islam Indonesia (UII)",
                "Jl. Kaliurang No.Km. 14,5, Krawitan, Umbulmartani, Kec. Ngemplak, Kab. Sleman",
                "Universitas Islam Indonesia atau yang lebih dikenal dengan UII adalah salah satu perguruan tinggi swasta tertua di Indonesia " +
                        "dan berada di Yogyakarta. UII berdiri pada tanggal 8 Juli 1945 dengan nama Sekolah Tinggi Islam (STI) yang berada di Jakarta." +
                        " UII terdiri dari 8 fakultas dan satu program internasional. Fakultas UII terdiri dari Fakultas Ekonomi, Fakultas Hukum, " +
                        "Fakultas Ilmu Agama Islam, Fakultas Kedokteran, Fakultas MIPA, Fakultas Psikologi dan Ilmu Sosial Budaya, " +
                        "Fakultas Teknik Sipil dan Perencanaan, Fakutas Teknologi Industri, dan International Program.",
                "https://kampusaja.com/wp-content/uploads/2018/08/6.-UII-Universitas-Islam-Indonesia-Universitas-Terbaik-di-Yogyakarta.jpg",
                R.drawable.logouii
        ));
        list.add(new Universitas(
                "Universitas Kristen Duta Wacana (UKDW)",
                "Jl. Dr. Wahidin Sudirohusodo No.5-25, Kotabaru, Kec. Gondokusuman, Kota Yogyakarta",
                "UKDW adalah salah satu perguruan tinggi swasta yang didirikan pada tahun 1962 dan berada di Yogyakarta. Saat ini sendiri UKDW " +
                        "telah memperoleh akreditasi A dari BAN PT. Program pendidikan di UKDW terdiri dari Fakultas Teologi, Fakultas Teknologi " +
                        "Informasi, Fakultas Arsitektur dan Desain, Fakultas Bisnis, Fakultas Bioteknologi, Fakultas Kedokteran, dan Program Studi " +
                        "Pendidikan Bahasa Inggris.",
                "https://kampusaja.com/wp-content/uploads/2018/08/7.UKDW-Universitas-Kristen-Duta-Wacana-Universitas-Terbaik-di-Yogyakarta-1024x609.jpg",
                R.drawable.logoukdw
        ));

        list.add(new Universitas(
                "Universitas Ahmad Dahlan (UAD)",
                "Jl. Kapas No.9, Semaki, Kec. Umbulharjo, Kota Yogyakarta",
                "UAD didirikan pada tanggal 19 Desember 1993. UAD telah memperoleh akreditasi A dari BAN PT. Untuk fakultas, UAD terdiri dari " +
                        "Fakultas Agama Islam (FAI), Fakultas Ekonomi dan Bisnis (FEB), Fakultas Farmasi (FFar), Fakultas Hukum, Fakultas Keguruan dan " +
                        "Ilmu Pendidikan (FKIP), Fakultas Ilmu Kesehatan Masyarakat (FKM), Fakultas Matematika dan Ilmu Pengetahuan Alam (FMIPA), " +
                        "Fakultas Psikologi (FPsi), Fakultas Sastra, Budaya, dan Ilmu Komunikasi (FBSK), Fakultas Teknologi Industri (FTI), Program Vokasi," +
                        " Program Pascasarjana (S2), dan Program Profesi.",
                "https://kampusaja.com/wp-content/uploads/2018/08/8.-UAD-Universitas-Ahmad-Dahlan-Universitas-Terbaik-di-Yogyakarta.jpg",
                R.drawable.logouad
        ));
        list.add(new Universitas(
                "Universitas Atma Jaya (UAJY)",
                "Jl. Babarsari No.44, Janti, Caturtunggal, Kec. Depok, Kab. Sleman",
                "Universitas Atma Jaya Yogyakarta atau sering dikenal dengan UAJY adalah salah satu perguruan tinggi swasta di Yogyakarta. " +
                        "UAJY sekarang telah mendapatkan akreditasi A dari BAN PT secara institusi.UAJY terdiri dari beberapa fakultas antara lain " +
                        "Fakultas Teknik, Fakultas Ekonomi, Fakultas Hukum, Fakultas Teknobiologi, Fakutas Teknologi Industri, Fakultas Ilmu " +
                        "Sosial dan Ilmu Politik, dan Program Magister.",
                "https://kampusaja.com/wp-content/uploads/2018/08/9.-UAJY-Universitas-Atma-Jaya-Universitas-Terbaik-di-Yogyakarta.jpg",
                R.drawable.logouajy
        ));
        list.add(new Universitas(
                "Universitas Pembangunan Nasional “Veteran” Yogyakarta (UPN)",
                "Jl. SWK Jl. Ring Road Utara No.104, Ngropoh, Condongcatur, Kec. Depok, Kab. Sleman",
                "UPN sebelumnya adalah kampus swasta, akan tetapi setelah tahun 2014 berubah menjadi berstatus kampus negeri. " +
                        "Saat ini UPN “Veteran” Yogyakarta mempunyai 5 fakultas yakni Fakultas Teknologi Mineral, Fakultas Teknologi " +
                        "Industri, Fakultas Pertanian, Fakultas Ekonomi dan Bisnis, dan Fakultas Ilmu Sosial dan Ilmu Politik.",
                "https://i0.wp.com/tambahpinter.com/wp-content/uploads/2020/05/Lokasi-dan-Lingkungan-Kampus-630x420.jpg",
                R.drawable.logoupn
        ));


    }
}