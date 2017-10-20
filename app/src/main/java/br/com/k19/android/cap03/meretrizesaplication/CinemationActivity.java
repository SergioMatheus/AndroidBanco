package br.com.k19.android.cap03.meretrizesaplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.Serializable;
import java.util.List;

public class CinemationActivity extends AppCompatActivity {


    public void cargaInicial() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meretrizes);
        FilmeDAO f = new FilmeDAO(new Banco(this));
        if (f.listar().isEmpty()) {
            Filme picapau = new Filme("PICA-PAU O FILME", "UCI Orient", "94 min", "Dub - 10h50, 13h00, 15h00, 17h20, 19h30", Categoria.PICAPAU.name());
            f.insert(picapau);
            Filme kingsman = new Filme("KINGSMAN: O CÍRCULO DOURADO", "UCI Orient", "141 min", "Dub - 11h40, 14h40, 17h40", Categoria.KINGSMAN.name());
            f.insert(kingsman);
            Filme meumalvado = new Filme("MEU MALVADO FAVORITO 3", "UCI Orient", "96 min", "Dub - 10h50, 15h20", Categoria.MEUMALVADOFAVORITO.name());
            f.insert(meumalvado);
            Filme mylittle = new Filme("MY LITTLE PONY: O FILME", "UCI Orient", "99 min", "Dub - 10h40, 13h00", Categoria.MYLITTLE.name());
            f.insert(mylittle);
            Filme itcoisa = new Filme("IT: A COISA", "UCI Orient", "135 min", "Dub - 15h30, 18h10, 20h50, 23h30", Categoria.ITCOISA.name());
            f.insert(itcoisa);
            Filme devolta = new Filme("DE VOLTA PARA CASA", "UCI Orient", "97 min", "Dub - 15h10, 17h20, 19h30\nLeg. - 21h40", Categoria.DEVOLTA.name());
            f.insert(devolta);
            Filme emoji = new Filme("EMOJI: O FILME", "UCI Orient", "86 min", "Dub - 10h40, 13h00", Categoria.EMOJI.name());
            f.insert(emoji);
            Filme alemmorte = new Filme("ALÉM DA MORTE", "UCI Orient", "108 min", "Dub - 11h30, 13h50, 16h10, 18h30, 20h50, 23h10\nLeg. - 22h00", Categoria.ALEMMORTE.name());
            f.insert(alemmorte);
            Filme divina = new Filme("A COMÉDIA DIVINA", "UCI Orient", "100 min", "Nacional - 11h30A, 13h40, 15h50, 18h00, 20h20, 22h30", Categoria.DIVINA.name());
            f.insert(divina);
            Filme nozes = new Filme("O QUE SERÁ DE NOZES 2", "UCI Orient", "91 min", "Dub - 11h00", Categoria.NOZES.name());
            f.insert(nozes);
            Filme amorte = new Filme("A MORTE TE DÁ PARABÉNS", "UCI Orient", "96 min", "Dub - 13h10, 15h20, 17h30, 19h40, 21h50", Categoria.AMORTE.name());
            f.insert(amorte);
            Filme blade = new Filme("BLADE RUNNER 2049", "UCI Orient", "163 min", "Dub - 13h00, 18h30\n Leg. - 21h50", Categoria.BLADE.name());
            f.insert(blade);
            Filme lego = new Filme("LEGO NINJAGO: O FILME", "UCI Orient", "101 min", "Dub - 10h50A, 16h20", Categoria.LEGO.name());
            f.insert(lego);
            Filme cueca = new Filme("AS AVENTURAS DO CAPITÃO CUECA – O FILME", "UCI Orient", "89 min", "Dub - 10h30A, 13h00, 15h00, 16h59, 19h00", Categoria.CUECA.name());
            f.insert(cueca);
            Filme tempestade = new Filme("TEMPESTADE: PLANETA EM FÚRIA", "UCI Orient", "109 min", "Dub - 11h20A, 13h40, 16h00, 18h20, 20h40, 23h00", Categoria.TEMPESTADE.name());
            f.insert(tempestade);
            Filme umarazao = new Filme("UMA RAZÃO PARA RECOMEÇAR", "UCI Orient", "90 min", "Dub - 13h20, 18h30, 23h45", Categoria.UMARAZAO.name());
            f.insert(umarazao);
            Filme entreirmas = new Filme("ENTRE IRMÃS", "UCI Orient", "160 min", "Nacional - 10h00A, 15h15, 20h30", Categoria.ENTREIRMAS.name());
            f.insert(entreirmas);
            Filme pioraluno = new Filme("COMO SE TORNAR O PIOR ALUNO DA ESCOLAS", "UCI Orient", "103 min", "Nacional - 11h50, 14h10, 16h30, 18h50, 21h10, 23h25", Categoria.PIORALUNO.name());
            f.insert(pioraluno);
        }



        List<Filme> filmes = f.listar();

        ArrayAdapter<Filme> adapter = new ArrayAdapter<Filme>(CinemationActivity.this, android.R.layout.simple_list_item_1, filmes);
        ListView lv = (ListView) findViewById(R.id.listview);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(CinemationActivity.this, ActivityVisualizarItens.class);
                intent.putExtra("filme", (Serializable) parent.getItemAtPosition(position));
                startActivity(intent);
            }
        });
    }
}
