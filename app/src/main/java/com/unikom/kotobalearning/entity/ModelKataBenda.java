package com.unikom.kotobalearning.entity;

public class ModelKataBenda {

    private String textQuestionKataBenda[] = {
            " もの",
            " ぼうし",
            " かさ",
            " メガネ",
            " ハンカチ",
            " タオル",
            " せっけん",
            " シャンプー",
            " さいふ",
            " おかね",
            " スリッパ",
            " くつした",
            " くつ",
            " にもつ",
            " かばん",
            " たばこ",
            " マッチ",
            " くすり",
            " かぎ",
            " しんぶん",
            " ざっし"
    };

    private String multipleKataBenda[][] = {
            {"Barang", "Topi", "Payung", "Kacamata"},
            {"Korek Api", "Topi", "Obat", "Kunci"},
            {"Kaos Kaki", "Sepatu", "Payung", "Barang Bawaan"},
            {"Kacamata", "Tas", "Rokok", "Majalah"},
            {"Laptop", "Handphone", "Mouse", "Sapu tangan"},
            {"jaket", "Handuk", "Dompet", "Kunci"},
            {"Kipas Angin", "Bantal", "Sabun", "Rokok"},
            {"Tas", "Shampo", "Handuk", "Televisi"},
            {"Jaket", "Baju", "Celana", "Dompet"},
            {"Uang", "Handuk", "Jam", "Handphone"},
            {"Sepatu", "Heels", "Sandal", "Kaos Kaki"},
            {"Sandal", "Sepatu", "Heels", "Kaos Kaki"},
            {"Sepatu", "Heels", "Jaket", "Baju"},
            {"Barang Bawaan", "Barang Ganti", "barang Simpan", "Barang Simpanan"},
            {"Kacamata", "Tas", "Dompet", "Sepatu"},
            {"Korek Api", "Vape", "Rokok", "Jam Tangan"},
            {"Korek Api", "Jam Tangan", "Vape", "Tas"},
            {"Sapu Tangan", "Kunci", "Gantungan", "Dompet"},
            {"Buku", "Majalah", "Kamus", "Koran"},
            {"Majalah", "Kamus", "Koran", "Kertas"},
            {"Majalah", "Kamus", "Koran", "Kertas"},

    };

    private String mCorrectAnswer[] = {
            "Barang", "Topi", "Payung", "Kacamata", "Sapu tangan", "Handuk", "Sabun", "Shampo", "Dompet", "Uang", "Sandal", "Kaos Kaki", "Sepatu", "Barang Bawaan", "Tas", "Rokok", "Korek Api", "Obat", "Kunci", "Koran", "Majalah"
    };

    public int getLength(){
        return textQuestionKataBenda.length;
    }

    public String getQuestion(int a) {
        String question = textQuestionKataBenda[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleKataBenda[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
