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

        nome.setText(f.getNomeFilme());
        duracao.setText(f.getDuracao());
        horario.setText(f.getHorarios());
        local.setText(f.getLocal());
        Categoria categoria = f.getCategoria();
        if (categoria.equals(Categoria.PICAPAU)) {
            imagem.setImageResource(R.drawable.picapau);
        }else if(categoria.equals(Categoria.KINGSMAN)){
            imagem.setImageResource(R.drawable.kingsman);
        }else if(categoria.equals(Categoria.MEUMALVADOFAVORITO)){
            imagem.setImageResource(R.drawable.meumalvado);
        }else if(categoria.equals(Categoria.MYLITTLE)) {
            imagem.setImageResource(R.drawable.mylittle);
        }
    }
}
