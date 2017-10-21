package br.com.k19.android.cap03.meretrizesaplication;

public enum Categoria {

    PICAPAU(0),KINGSMAN(14),MEUMALVADOFAVORITO(0),MYLITTLE(0),ITCOISA(16),DEVOLTA(12),EMOJI(0),ALEMMORTE(14),DIVINA(14),
    NOZES(0),AMORTE(14),BLADE(14),LEGO(0),CUECA(0),TEMPESTADE(12),UMARAZAO(10),ENTREIRMAS(14),PIORALUNO(14);

    int faixaEt;

    Categoria(int faixaEt) {
        this.faixaEt = faixaEt;
    }

    public int getFaixaEt() {
        return faixaEt;
    }
}