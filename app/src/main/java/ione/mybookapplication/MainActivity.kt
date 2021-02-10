package ione.mybookapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submitbtn(view: View) {
        //Toast.makeText(this,"hello",Toast.LENGTH_LONG).show();

        var BnameEditText = findViewById<EditText>(R.id.BName);
        var authorEditText = findViewById<EditText>(R.id.Author);
        var distriEditText = findViewById<EditText>(R.id.BDistri);
        var publisherEditText = findViewById<EditText>(R.id.publics);
        var costEditText = findViewById<EditText>(R.id.cost);
        var getname = BnameEditText.text.toString();
        var getauthor = authorEditText.text.toString();
        var getdistri = distriEditText.text.toString();
        var getpublisher = publisherEditText.text.toString();
        var getprice = costEditText.text.toString();
        Toast.makeText(this, getname + "\t" + getauthor, Toast.LENGTH_LONG).show();

    }
    fun registerbtn(view: View) {
        //   Toast.makeText(this,"hello",Toast.LENGTH_LONG).show();


        intent = Intent(this,RegisterActivity::class.java);
        startActivity( intent);
    }





}