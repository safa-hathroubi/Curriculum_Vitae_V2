package tn.esprit.curriculum_vitae_v2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    // Get input text
    val inputText = outlinedTextField.editText?.text.toString()

    outlinedTextField.editText?.doOnTextChanged { inputText, _, _, _ ->
        // Respond to input text change
    }
}