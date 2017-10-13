package br.com.k19.android.cap03.meretrizesaplication;

import android.content.ContentValues;
import android.database.Cursor;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class FilmeDAO {

    private Banco bd;

    public FilmeDAO (Banco bd){
        this.bd=bd;
    }
    public void insert(Filme filme){
        ContentValues values= new ContentValues();
        values.put(Banco.COL_TITULO,filme.getNomeFilme());
        values.put(Banco.COL_LOCAL,filme.getLocal());
        values.put(Banco.COL_DURACAO,filme.getDuracao());
        values.put(Banco.COL_HORARIO,filme.getHorarios());
        values.put(Banco.COL_CATEGORIA,filme.getCategoria().name());
        bd.getWritableDatabase().insert("filmes",null,values);
        bd.getWritableDatabase().close();
    }

    public List<Filme> listar(){
        List<Filme> lista= new ArrayList<>();
        Cursor c = bd.getReadableDatabase().query("filmes",new String[]{"titulo,local,duracao,horario,categoria"},null,null,null,null,null);
        Log.d("APLICACAO",c.getCount()+"");
        c.moveToFirst();
        do {
            Filme f = new Filme(c.getString(0),c.getString(1),c.getString(2),c.getString(3),c.getString(4));
            lista.add(f);
        }while(c.moveToNext());
        bd.getWritableDatabase().close();
        return lista;
    }
    public void excluir (Filme filme){
        bd.getWritableDatabase().execSQL("delete from livro where titulo='"+ filme.getNomeFilme()+"';");
        bd.getWritableDatabase().close();
    }
}