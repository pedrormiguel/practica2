package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class Information extends AppCompatActivity {

    Estudiantes currentStudent;

    ImageView imageView ;
    ConstraintLayout layout;
    // View's informations items
    TextView TextName;
    TextView TextCity ;
    TextView TextNumberId ;
    TextView TextExpression ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        setTitle(R.string.titleSecondScrrend);
        Intent intent = getIntent();
        setUpControllers();


//        currentStudent = new Estudiantes("Pedro Ruiz",
//                "drawable/pedro.jpg",
//                "Santo Domingo",
//                "100391119",
//                getString(R.string.expressionPedro));

        imageView.setImageResource(MainActivity.studenSelected.photo);
        TextName.setText(MainActivity.studenSelected.name);
        TextCity.setText(MainActivity.studenSelected.city);
        TextNumberId.setText(MainActivity.studenSelected.numberId);
        TextExpression.setText(MainActivity.studenSelected.expression);
        layout.setBackgroundColor(MainActivity.colorToApply);


    }

    void setUpControllers(){

         imageView = findViewById(R.id.imageView);

        // View's informations items
         TextName = findViewById(R.id.TextName);
         TextCity = findViewById(R.id.TextCity);
         TextNumberId = findViewById(R.id.TextNumberId);
         TextExpression = findViewById(R.id.TextExpression);
         layout = findViewById(R.id.container2);
    }

}
