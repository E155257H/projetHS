package com.example.e155257h.projeths;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caractcarte);
        // These code snippets use an open-source library. http://unirest.io/java
        HttpResponse<JsonNode> response = Unirest.get("https://omgvamp-hearthstone-v1.p.mashape.com/cards")
                .header("X-Mashape-Key", "<required>")
                .asJson();

    }
}
