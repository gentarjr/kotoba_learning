package com.unikom.kotobalearning.entity;

public class ModelKataKerja {

    private String textQuestionKataKerja[] = {
            "あきます",
            "あるきます",
            "ふきます",
            "はきます",
            "はたらきます",
            "ひきます",
            "いきます",
            "かきます",
            "ききます",
            "みがきます",
            "なきます",
            "おきます",
            "さきます",
            "つきます",
            "ぬぎます",
            "およぎます",
            "あそびます",
            "ならびさむ",
            "とびます",
            "よびます",
            "のみます",
            "すみます",
            "たのみます",
            "やすみます",
            "よみます",
            "しにます",
            "あいます",
            "あらいます",
            "ちがいます",
            "いいます",
            "かいます",
            "ならいます",
            "すいます ",
            "つかいます",
            "うたいます",
            "まちます",
            "もちます",
            "たちます",
            "あります",
            "ふります",
            "はいります",
            "はじまります",
            "はります",
            "はしります",
            "いります",
            "かえります",
            "かかります",
            "きります",
            "こまります",
            "くもります",
            "まがります",
            "なります",
            "のぼります",
            "のります",
            "おわります",
            "しまります",
            "しります",
            "すわります",
            "とまります",
            "とります",
            "つくります",
            "うります",
            "わかります",
            "わたります",
            "やります",
            "だします",
            "はなします",
            "かえします ",
            "かします",
            "けします",
            "なくします",
            "おします",
            "さします",
            "わたします"

    };

    private String multipleKataKerja[][] = {
            {"terbuka", "terbang", "memanggil", "tinggal"},
            {"beristirahat", "berjalan kaki", "mengambil", "mendaki"},
            {"membaca", "bertiup", "membuang", "berhenti"},
            {"menulis", "turun", "menjual", "mengenakan"},
            {"berkata", "bekerja", "membeli", "mengerti"},
            {"menarik", "pulang", "mengerti", "memotong"},
            {"pergi", "memotong", "melakukan", "memerlukan"},
            {"mendengar", "menyusahkan", "berbicara", "menulis"},
            {"membawa", "melengkung", "mendengar", "berdiri"},
            {"berdiri", "menggosok/memoles", "menyerahkan", "menunggu"},
            {"bersuara/berbunyi (benda)", "bersuara", "berbunyi", "bersuara/berbunyi (binatang)"},
            {"meletakan", "menyimpan", "meminta", "memberi"},
            {"berbunga", "berkembang/berbunga", "mengembang", "mati"},
            {"tertinggal", "meninggalkan", "tiba", "terbang"},
            {"meninggalkan", "tiba", "memanggil", "tertinggal"},
            {"nyelam", "mandi", "mencuci", "berenang"},
            {"pergi", "meninggalkan", "jatuh", "bermain-main"},
            {"berbaris", "mengantri", "berkumpul", "bertemu"},
            {"melayang", "terbang", "menyampaikan", "memanggil"},
            {"menyuruh", "memanggil", "menoleh", "pergi"},
            {"makan", "minum", "masak", "belajar"},
            {"pergi", "tinggal", "pulang", "kembali"},
            {"meminta/memaafkan", "meminta/tolong", "meminta/menolong", "meminta/memberi"},
            {"rebahan", "beristirahat", "menolong", "mandi"},
            {"membaca", "menulis", "melipat", "menyimpan"},
            {"mati/meninggal", "bersembunyi", "tidur", "pergi"},
            {"bisa", "bertemu", "menonton", "bangun"},
            {"mandi", "masak", "mencuci", "sekolah"},
            {"berbeda", "benar", "berbeda/salah", "berkata"},
            {"bertanya", "menegur", "berkata", "mendengar"},
            {"mengambil", "membeli", "menarik", "memotong"},
            {"belajar", "sekolah", "bermain", "bertemu"},
            {"menghisap", "bertiup", "minum", "menarik"},
            {"meletakan", "menarik (benda)", "memakai/menggunakan", "menghisap"},
            {"bernyanyi", "berbunyi", "bersuara", "mendengarkan"},
            {"menunggu", "mengantar", "menjemput", "pergi"},
            {"melihat", "membawa/mempunyai", "mempunyai/dibawa", "terbawa"},
            {"berlari", "berjalan", "berdiri", "olahraga"},
            {"hilang", "ada", "terlihat", "mendengarkan"},
            {"jatuh", "turun (hujan/salju)", "bergerak", "bertiup"},
            {"masuk", "turun", "masak", "datang"},
            {"terlambat", "mulai", "dimulai", "tertinggal"},
            {"didiamkan", "menempel/diletakan", "menempel/dipegang", "disimpan"},
            {"bergerak", "berlari", "berjalan", "olahraga"},
            {"butuh/ingin", "butuh/perlu", "berdiri", "berjalan"},
            {"pergi", "masuk", "pulang", "datang"},
            {"waktu", "uang", "memerlukan (waktu/uang)", "perlu"},
            {"menggiling", "mengaduk", "memotong", "memilih"},
            {"menyamakan", "menyusahkan", "tolong", "membantu"},
            {"hujan", "mendung/berawan", "panas/berawan", "berawan/hujan"},
            {"membelok/melengkung", "melurus/melengkung", "melurus", "malaju" },
            {"membaca", "menjadi", "mencuci", "minum"},
            {"menarik", "membeli", "membaca", "mendaki"},
            {"naik turun", "baik (kendaraan)", "turun", "berlari"},
            {"sudah", "selesai/berakhir", "sebelum", "memanggil"},
            {"tutup/tertutup", "buka/terbuka", "terbuka/tertutup", "hilang"},
            {"tidak tahu", "mengenal/mengetahui", "membiarkan", "tetap"},
            {"berdiri", "duduk", "jongkok", "kayang"},
            {"berlari", "berhenti", "jalan", "olahraga"},
            {"membawa", "menarik", "mengambil", "mendaki"},
            {"menyeberang", "membuat", "berbicara", "melakukan"},
            {"menjual", "menyerahkan", "melakukan", "membawa"},
            {"membawa", "mengerti", "mendaki", "menarik"},
            {"melompat", "berlari", "menyeberang", "memadamkan"},
            {"menggunkan", "melakukan", "menghapus", "memadamkan"},
            {"keluar", "masuk", "mengeluarkan", "menghapus"},
            {"tertawa  ", "menangis", "berbicara", "menangis"},
            {"mengembalikan", "menagih", "membawa", "tertinggal"},
            {"menyeberang", "meminjamkan", "memejamkan", "menghilangkan"},
            {"mengeluarkan", "menghapus/memadamkan", "menghilangkan/memadamkan", "mendorong"},
            {"menghilangkan", "menghapus", "menyembunyikan", "tersembunyi"},
            {"cap", "melakukan", "mengerti", "mendorong/mencap"},
            {"melakukan", "mengulurkan (tangan)", "menghapus/memadamkan", "mendorong"},
            {"memberi", "menyerahkan", "mengembalikan", "melakukan"},
    };

    private String mCorrectAnswer[] = {
            "terbuka", "berjalan kaki", "bertiup", "mengenakan(celana/rok)", "bekerja", "menarik", "pergi", "menulis", "mendengar", "menggosok/memoles", "bersuara/bebunyi(binatang)", "meletakan", "berkembang/berbunga", "tiba", "mati/meninggalkan", "berenang", "bermain-main", "berbaris", "terbang", "Memanggil", "minum", "tinggal", "meminta/memohon", "beristirahat", "membaca", "meninggal", "bertemu", "mencuci", "berbeda/salah", "berkata", "membeli", "belajar", "menghisap", "memakai/menggunkan", "berbunyi", "menunggu", "membawa/mempunyai", "berdiri", "ada", "turun(hujan/salju)", "masuk/isi", "mulai", "menempelkan/meletakan", "berlari", "butuh/perlu", "pulang", "memerlukan(waktu/uang)", "memotong", "menyusahkan", "mendung/berawan", "membelok/melengkung", "menjadi", "mendaki", "naik(kendaraan)", "selesai/berakhir", "tutup/tertutup", "mengenal/mengetahui", "duduk", "berhenti", "mengambil(foto/film)", "membuat", "menjual", "mengerti", "menyeberang", "melakukan", "mengeluarkan", "berbicara", "mengembalikan", "meminjamkan", "menghapus/memadamkan", "menghilangkan", "mendorong", "mengulurkan(tangan)", "menyerahkan"
    };

    public int getLength(){
        return textQuestionKataKerja.length;
    }

    public String getQuestion(int a) {
        String question = textQuestionKataKerja[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleKataKerja[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
