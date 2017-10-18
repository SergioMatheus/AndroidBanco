package br.com.k19.android.cap03.meretrizesaplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MeretrizesActivity extends AppCompatActivity {


    public void cargaInicial() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meretrizes);
        FilmeDAO f = new FilmeDAO(new Banco(this));
        if (f.listar().isEmpty()) {
            Filme picapau = new Filme("PICA-PAU O FILME", "UCI Orient", "94 min", "10h50, 13h00, 15h00, 17h20, 19h30", Categoria.PICAPAU.name());
            picapau.setCategoria(Categoria.PICAPAU);
            f.insert(picapau);
            Filme kingsman = new Filme("KINGSMAN: O CÍRCULO DOURADO", "UCI Orient", "141 min", "11h40, 14h40, 17h40", Categoria.KINGSMAN.name());
            kingsman.setCategoria(Categoria.KINGSMAN);
            f.insert(kingsman);
            Filme meumalvado = new Filme("MEU MALVADO FAVORITO 3", "UCI Orient", "96 min", "10h50, 15h20", Categoria.MEUMALVADOFAVORITO.name());
            meumalvado.setCategoria(Categoria.MEUMALVADOFAVORITO);
            f.insert(meumalvado);
        }

        List<Filme> filmes = f.listar();

        ArrayAdapter<Filme> adapter = new ArrayAdapter<Filme>(MeretrizesActivity.this, android.R.layout.simple_list_item_1, filmes);
        ListView lv = (ListView) findViewById(R.id.listview);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MeretrizesActivity.this, ActivityVisualizarItens.class);
                intent.putExtra("filme", (Serializable) parent.getItemAtPosition(position));
                startActivity(intent);
            }
        });
    }
}
