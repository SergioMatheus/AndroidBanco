package br.com.k19.android.cap03.meretrizesaplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityVisualizarItens extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar_itens);
        Filme f = (Filme) getIntent().getSerializableExtra("filme");
        TextView nome = (TextView)
                findViewById(R.id.tituloFilme);
        TextView duracao = (TextView)
                findViewById(R.id.duracaoFilme);
        TextView horario = (TextView)
                findViewById(R.id.horarioDoFilme);
        TextView local = (TextView)
                findViewById(R.id.localFilme);
        ImageView imagem = (ImageView)
                findViewById(R.id.imagemFilme);
        ImageView imagemFaixa = (ImageView)
                findViewById(R.id.imagemFaixaEt);

        nome.setText(f.getNomeFilme());
        duracao.setText(f.getDuracao());
        horario.setText(f.getHorarios());
        local.setText(f.getLocal());
        Categoria categoria = f.getCategoria();
        switch (categoria.getFaixaEt()) {
            case 0:
                imagemFaixa.setImageResource(R.drawable.l);
                break;
            case 10:
                imagemFaixa.setImageResource(R.drawable.f10);
                break;
            case 12:
                imagemFaixa.setImageResource(R.drawable.f12);
                break;
            case 14:
                imagemFaixa.setImageResource(R.drawable.f14);
                break;
            case 16:
                imagemFaixa.setImageResource(R.drawable.f16);
                break;
//            case 18:   NÃO UTILIZADO ATÉ O DADO MOMENTO, SEM FILMES PARA ESTA CATEGORIA
//                break;
        }
        if (categoria.equals(Categoria.PICAPAU)) {
            imagem.setImageResource(R.drawable.picapau);
        } else if (categoria.equals(Categoria.KINGSMAN)) {
            imagem.setImageResource(R.drawable.kingsman);
        } else if (categoria.equals(Categoria.MEUMALVADOFAVORITO)) {
            imagem.setImageResource(R.drawable.meumalvado);
        } else if (categoria.equals(Categoria.MYLITTLE)) {
            imagem.setImageResource(R.drawable.mylittle);
        } else if (categoria.equals(Categoria.ITCOISA)) {
            imagem.setImageResource(R.drawable.itcoisa);
        } else if (categoria.equals(Categoria.DEVOLTA)) {
            imagem.setImageResource(R.drawable.devolta);
        } else if (categoria.equals(Categoria.EMOJI)) {
            imagem.setImageResource(R.drawable.emoji);
        } else if (categoria.equals(Categoria.ALEMMORTE)) {
            imagem.setImageResource(R.drawable.alemmorte);
        } else if (categoria.equals(Categoria.DIVINA)) {
            imagem.setImageResource(R.drawable.divina);
        } else if (categoria.equals(Categoria.NOZES)) {
            imagem.setImageResource(R.drawable.nozes);
        } else if (categoria.equals(Categoria.AMORTE)) {
            imagem.setImageResource(R.drawable.amorte);
        } else if (categoria.equals(Categoria.BLADE)) {
            imagem.setImageResource(R.drawable.blade);
        } else if (categoria.equals(Categoria.LEGO)) {
            imagem.setImageResource(R.drawable.lego);
        } else if (categoria.equals(Categoria.CUECA)) {
            imagem.setImageResource(R.drawable.cueca);
        } else if (categoria.equals(Categoria.TEMPESTADE)) {
            imagem.setImageResource(R.drawable.tempestade);
        } else if (categoria.equals(Categoria.UMARAZAO)) {
            imagem.setImageResource(R.drawable.umarazao);
        } else if (categoria.equals(Categoria.ENTREIRMAS)) {
            imagem.setImageResource(R.drawable.entreirmas);
        } else if (categoria.equals(Categoria.PIORALUNO)) {
                imagem.setImageResource(R.drawable.pioraluno);
        }
    }
}