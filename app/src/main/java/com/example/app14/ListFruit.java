package com.example.app14;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app14.adapter.FruitsAdapter;
import com.example.app14.beans.Fruits;
import com.example.app14.services.FruitService;

public class ListFruit extends AppCompatActivity {

    private FruitService fs = null;
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_fruit);

        fs = new FruitService();
        fs.create(new Fruits("Banane", 20, R.mipmap.bananas));
        fs.create(new Fruits("Fraise", 10, R.mipmap.apple));
        fs.create(new Fruits("Orange", 12, R.mipmap.bananas));
        fs.create(new Fruits("Pomme", 13, R.mipmap.pineapple));
        fs.create(new Fruits("Banane", 20, R.mipmap.bananas));
        fs.create(new Fruits("Fraise", 10, R.mipmap.apple));
        fs.create(new Fruits("Orange", 12, R.mipmap.bananas));
        fs.create(new Fruits("Pomme", 13, R.mipmap.pineapple));
        fs.create(new Fruits("Banane", 20, R.mipmap.bananas));
        fs.create(new Fruits("Fraise", 10, R.mipmap.apple));
        fs.create(new Fruits("Orange", 12, R.mipmap.bananas));
        fs.create(new Fruits("Pomme", 13, R.mipmap.pineapple));
        fs.create(new Fruits("Banane", 20, R.mipmap.bananas));
        fs.create(new Fruits("Fraise", 10, R.mipmap.apple));
        fs.create(new Fruits("Orange", 12, R.mipmap.bananas));
        fs.create(new Fruits("Pomme", 13, R.mipmap.pineapple));

        list = findViewById(R.id.list);
        list.setAdapter(new FruitsAdapter(fs.findAll(), this));

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                // Créer un AlertDialog pour confirmer la suppression
                AlertDialog.Builder builder = new AlertDialog.Builder(ListFruit.this);
                builder.setTitle("Confirmation de suppression");
                builder.setMessage("Voulez-vous vraiment supprimer cet élément ?");

                // Si l'utilisateur clique sur "Oui"
                builder.setPositiveButton("Oui", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        fs.delete(fs.findAll().get(position));

                        ((FruitsAdapter) list.getAdapter()).notifyDataSetChanged();
                        Toast.makeText(ListFruit.this, "Élément supprimé", Toast.LENGTH_SHORT).show();
                    }
                });


                builder.setNegativeButton("Non", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });


                builder.show();
            }
        });
    }
}
