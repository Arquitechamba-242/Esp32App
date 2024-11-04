package com.example.mytest

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class WriteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.write_activity)

        val etField1 = findViewById<EditText>(R.id.editText1)
        val etField2 = findViewById<EditText>(R.id.editText2)
        val etField3 = findViewById<EditText>(R.id.editText3)
        val etField4 = findViewById<EditText>(R.id.editText4)
        val writeDataButton = findViewById<Button>(R.id.ButtonToWriteData)
        val dbRef : DatabaseReference = FirebaseDatabase.getInstance().getReference("Data")

        writeDataButton.setOnClickListener {
            if (etField1 != null && etField2 !=null && etField3 !=null && etField4 !=null){
                val dataID = dbRef.push().key!!
                val data = Data(dataID,etField1.text.toString(),etField2.text.toString(),etField3.text.toString(),etField4.text.toString())
                dbRef.child(dataID).setValue(data)
                etField1.text.clear()
                etField2.text.clear()
                etField3.text.clear()
                etField4.text.clear()
            }
        }


    }
}