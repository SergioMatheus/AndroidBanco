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
        ImageView imagem2 = (ImageView)
                findViewById(R.id.faixaetaria);

        nome.setText(f.getNomeFilme());
        duracao.setText(f.getDuracao());
        horario.setText(f.getHorarios());
        local.setText(f.getLocal());
        Categoria categoria = f.getCategoria();
        if (categoria.equals(Categoria.PICAPAU)) {
            imagem.setImageResource(R.drawable.picapau);
            imagem2.setImageResource(R.drawable.l);
        } else if (categoria.equals(Categoria.KINGSMAN)) {
            imagem.setImageResource(R.drawable.kingsman);
            imagem2.setImageResource(R.drawable.f16);
        } else if (categoria.equals(Categoria.MEUMALVADOFAVORITO)) {
            imagem.setImageResource(R.drawable.meumalvado);
            imagem2.setImageResource(R.drawable.l);
        } else if (categoria.equals(Categoria.MYLITTLE)) {
            imagem.setImageResource(R.drawable.mylittle);
            imagem2.setImageResource(R.drawable.l);
        } else if (categoria.equals(Categoria.ITCOISA)) {
            imagem.setImageResource(R.drawable.itcoisa);
            imagem2.setImageResource(R.drawable.f16);
        } else if (categoria.equals(Categoria.DEVOLTA)) {
            imagem.setImageResource(R.drawable.devolta);
            imagem2.setImageResource(R.drawable.f12);
        } else if (categoria.equals(Categoria.EMOJI)) {
            imagem.setImageResource(R.drawable.emoji);
            imagem2.setImageResource(R.drawable.l);
        } else if (categoria.equals(Categoria.ALEMMORTE)) {
            imagem.setImageResource(R.drawable.alemmorte);
            imagem2.setImageResource(R.drawable.f14);
        } else if (categoria.equals(Categoria.DIVINA)) {
            imagem.setImageResource(R.drawable.divina);
            imagem2.setImageResource(R.drawable.f14);
        } else if (categoria.equals(Categoria.NOZES)) {
            imagem.setImageResource(R.drawable.nozes);
            imagem2.setImageResource(R.drawable.l);
        } else if (categoria.equals(Categoria.AMORTE)) {
            imagem.setImageResource(R.drawable.amorte);
            imagem2.setImageResource(R.drawable.f14);
        } else if (categoria.equals(Categoria.BLADE)) {
            imagem.setImageResource(R.drawable.blade);
            imagem2.setImageResource(R.drawable.f14);
        } else if (categoria.equals(Categoria.LEGO)) {
            imagem.setImageResource(R.drawable.lego);
            imagem2.setImageResource(R.drawable.l);
        } else if (categoria.equals(Categoria.CUECA)) {
            imagem.setImageResource(R.drawable.cueca);
            imagem2.setImageResource(R.drawable.l);
        } else if (categoria.equals(Categoria.TEMPESTADE)) {
            imagem.setImageResource(R.drawable.tempestade);
            imagem2.setImageResource(R.drawable.f12);
        } else if (categoria.equals(Categoria.UMARAZAO)) {
            imagem.setImageResource(R.drawable.umarazao);
            imagem2.setImageResource(R.drawable.f10);
        } else if (categoria.equals(Categoria.ENTREIRMAS)) {
            imagem.setImageResource(R.drawable.entreirmas);
            imagem2.setImageResource(R.drawable.f14);
        } else if (categoria.equals(Categoria.PIORALUNO)) {
            imagem.setImageResource(R.drawable.pioraluno);
            imagem2.setImageResource(R.drawable.f14);
        }
    }
}