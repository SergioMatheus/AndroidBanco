package br.com.k19.android.cap03.meretrizesaplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Banco extends SQLiteOpenHelper {

    public static final String BANCO = "Nome_Banco";
    public static final int VERSAO = 1;
    private Context context;

    public static final String TABELA = "FILMES";
    public static final String COL_ID = "_id";
    public static final String COL_TITULO = "TITULO";
    public static final String COL_LOCAL = "LOCAL";
    public static final String COL_DURACAO = "DURACAO";
    public static final String COL_HORARIO = "HORARIO";

    private static final String DATABASE_CREATE = "create table " + TABELA + "(" + COL_ID + "integer primary key autoincrement ,"
            + COL_TITULO + "" +
            " text not null," + COL_LOCAL + " text not null"+ COL_DURACAO + " text not null"+ COL_HORARIO + " text not null";

    public Banco(Context context) {
        super(context, BANCO, null, VERSAO);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
