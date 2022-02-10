package edu.temple.signupform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name: TextView = findViewById(R.id.editText)
        var email: TextView = findViewById(R.id.email)
        var pass: TextView = findViewById(R.id.enterPassword)
        var confirm: TextView = findViewById(R.id.confirmPassword)
        var button:Button = findViewById(R.id.register)
        var name2 = ""
        button.setOnClickListener {
        confirm.text.isEmpty()
            if(name.text.isEmpty()){
                name.setError("Please complete all fields")
            }
            if(email.text.isEmpty()){
                    email.setError("Please complete all fields")
                }
            if(pass.text.isEmpty()){
                pass.setError("Please complete all fields")
            }
            if(confirm.text.isEmpty()){
                confirm.setError("Please complete all fields")
            }
            if(pass.text.toString().equals(confirm.text.toString())){

            }
            else{
                Toast.makeText(this,"These passwords do not match",Toast.LENGTH_LONG).show()
            }
            name2 =  name.text.toString()
            Toast.makeText(this,"Welcome $name2",Toast.LENGTH_LONG).show()

        }
    }
}
