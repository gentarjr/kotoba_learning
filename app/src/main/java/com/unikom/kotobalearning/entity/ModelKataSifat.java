package com.unikom.kotobalearning.entity;

public class ModelKataSifat {

    private String textQuestionKataSifat[] = {
            "あおい",
            "あぶない",
            "あかい",
            "あかるい",
            "あまい",
            "あたらしい",
            "あたたかい",
            "あつい",
            "ちいさい",
            "ちかい",
            "ふるい",
            "ふとい",
            "はやい",
            "ひくい",
            "ひろい",
            "ほしい",
            "ほそい",
            "よい",
            "いそがしい",
            "いたい ",
            "からい",
            "かるい",
            "かわいい",
            "きいろい",
            "きたない",
            "くらい ",
            "くろい",
            "まるい",
            "まずい",
            "みじかい",
            "むずかし",
            "ながい",
            "ぬるい",
            "おいしい",
            "おもい",
            "おもしろい",
            "おおい",
            "おおき",
            "おそい",
            "さむい",
            "せまい",
            "しろい",
            "すくない",
            "すずし",
            "たかい",
            "たのしい",
            "とおい",
            "つまらない",
            "つめたい",
            "つよい",
            "うるさい",
            "うすい",
            "わかい",
            "わるい",
            "やさしい",
            "やすい",
            "よわい ",
    };

    private String multipleKataSifat[][] = {
            {"biru", "merah", "kuning", "hijau"},
            {"hati-hati", "bahaya", "lucu", "kotor"},
            {"hijau", "putih", "merah", "kuning"},
            {"hitam", "gelap", "transparan", "terang"},
            {"pedas", "asam", "manis", "pahit"},
            {"baru", "lama", "panjang", "berat"},
            {"panas", "sejuk", "dingin", "hangat"},
            {"ringan", "tebal", "tipis", "berat"},
            {"kecil", "besar", "banyak", "sempit"},
            {"kotor", "dekat", "jauh", "bulat"},
            {"kuno", "kecil", "tebal", "berat"},
            {"kurus", "gemuk", "tinggi", "kecil"},
            {"cepat", "lambat", "lama", "dekat"},
            {"rentang", "baik", "bagus", "rendah"},
            {"luas/lapang", "luas/rumah", "luas/tanah", "rumah"},
            {"menjadi", "ingin", "kotor", "gelap"},
            {"tinggi", "kurus", "gemuk", "sekal"},
            {"ramah", "pendiam", "bagus/baik", "lembut"},
            {"sombong", "sibuk", "lelah", "pusing"},
            {"sehat", "baik", "sakit", "pendiam"},
            {"manis", "pahit", "pedas/asin", "enak"},
            {"berat", "ringan", "besar", "kecil"},
            {"mungil/lucu", "imut", "cantik", "manis"},
            {"kuning", "merah", "hitam", "coklat"},
            {"bersih", "kotor", "wangi", "bau"},
            {"terang", "coklat", "gelap", "hitam"},
            {"coklat", "merah", "kuning", "hitam"},
            {"lonjong/panjang", "pendek/tinggi", "bundar", "bulat/bundar"},
            {"asam", "manis", "bau", "tidak enak/tawar"},
            {"kecil", "pendek", "panjang", "bulat"},
            {"mudah", "sulit", "ramah", "baik"},
            {"panjang", "lebar", "pendek", "tinggi"},
            {"tidak cukup berat", "tidak cukup(panas/dingin)", "tidak cukup mudah", "sulit"},
            {"asam", "enak", "lucu", "manis"},
            {"berat","besar", "kecil", "pendek"},
            {"sulit", "mudah", "pendek", "menarik"},
            {"sedikit", "harum", "besar", "banyak"},
            {"kecil", "mungil", "besar", "lucu "},
            {"cepat", "lambat", "lama", "lincah"},
            {"panas(cuaca)", "panas", "dingin(cuaca)", "hangat"},
            {"sempit", "luas", "lebar", "panjang"},
            {"merah", "putih", "hitam", "kuning"},
            {"banyak", "sedikit", "lucu", "imut"},
            {"dingin", "panas", "sejuk", "lebar"},
            {"mahal", "murah", "tinggi", "rendah"},
            {"gembira", "menyenangkan", "menyusahkan", "senang"},
            {"jauh", "dekat", "tinggi", "dalam"},
            {"membosankan", "bahagia", "membosankan", "gembira"},
            {"dingin(benda)", "panas(benda)", "sejuk", "asam"},
            {"lesu", "kuat", "enak", "lucu"},
            {"tenang", "berisik", "sepi", "ramai"},
            {"tebal", "tipis", "rendah", "lebar"},
            {"tua", "muda", "baik", "buruk"},
            {"cantik", "tampan", "lucu", "jelek"},
            {"sulit/susah", "mudah/gampang", "cantik", "lucu"},
            {"tinggi", "rendah", "murah", "panjang"},
            {"lemah", "hebat", "lucu", "panjang"},
    };

    private String mCorrectAnswer[] = {
            "biru", "bahaya", "merah", "terang", "manis", "baru", "hangat", "tebal", "kecil", "dekat", "Kuno", "Gemuk", "Cepat", "Rendah", "Luas", "Ingin", "Kurus", "Baik", "Sibuk", "Sakit", "Pedas/Asin", "Ringan", "mungil/lucu", "Kuning", "Kotor", "Gelap", "Hitam", "Bulat", "Tidak Enak", "Pendek", "Sulit", "Panjang", "Tidak Cukup(Panas/dingin)", "Enak", "Berat", "Menarik", "Banyak", "Besar", "Lambat", "Dingin(Cuaca)", "Sempit", "Putih", "Sedikit", "Sejuk", "Mahal", "Menyenangkan", "Jauh", "Membosankan", "Dingin(Benda)", "Kuat", "Berisik", "Tipis", "Muda", "jelek", "Mudah/gampang", "Murah", "Lemah"
    };

    public int getLength(){
        return textQuestionKataSifat.length;
    }

    public String getQuestion(int a) {
        String question = textQuestionKataSifat[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleKataSifat[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
