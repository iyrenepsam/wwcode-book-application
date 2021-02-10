package ione.mybookapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun go(view: View) {

        var nameEditText=findViewById<EditText>(R.id.name);
        var phnumEditText=findViewById<EditText>(R.id.phnum);
        var emailEditText=findViewById<EditText>(R.id.email);
        var unameEditText=findViewById<EditText>(R.id.uname);
        var pswdEditText=findViewById<EditText>(R.id.pswd);
        var cpEditText=findViewById<EditText>(R.id.cp);

        var getname=nameEditText.text.toString();
        var getphnum=phnumEditText.text.toString();
        var getemail=emailEditText.text.toString();
        var getuname=unameEditText.text.toString();
        var getpswd=pswdEditText.text.toString();
        var getcp=cpEditText.text.toString();

        Toast.makeText(this,getname+"\n"+getphnum+"\n"+getemail+"\n"+getuname+"\n"+getpswd+"\n"+getcp,Toast.LENGTH_LONG).show();

    }
    fun back(view: View) {}
}