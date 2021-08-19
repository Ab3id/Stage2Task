package abeid.stage2task

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editTextInput:EditText = findViewById(R.id.editTextInput);
        val textView:TextView = findViewById(R.id.textView);
        val textLink:TextView = findViewById(R.id.tvLink);
        textLink.setOnClickListener {
            openLink()
        }

        editTextInput.doOnTextChanged { text, _, _, _ -> textView.text = text }
    }

    fun openLink(){
        val uri: Uri = Uri.parse("https://internship.zuri.team")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }
}