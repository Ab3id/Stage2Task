package abeid.stage2task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.doOnTextChanged

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editTextInput:EditText = findViewById(R.id.editTextInput);
        val textView:TextView = findViewById(R.id.textView);

        editTextInput.doOnTextChanged { text, _, _, _ -> textView.text = text }
    }
}