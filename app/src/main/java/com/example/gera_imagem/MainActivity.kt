package com.example.gera_imagem

import android.os.Bundle
import android.app.Activity
import android.content.pm.ActivityInfo
import android.view.View
import android.widget.ArrayAdapter
import android.widget.listView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.gera_imagem.databinding.ActivityMainBinding

public class PratosExibir extends activity {
    ImageView pro;
    textView pro;
    string cod;
    int cont;

    protected void onCreate(bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_detalhesproduto);

        this.setRequestedOrientation(activityinfo.screen_orientation_portrait);

        nome = (TextView) findViewById(R.id.textView);
        pro = (textView) findViewById(R.id.imageView);
        cont = 0;

        if (cont == 0){
            pro.setimagemREsource(r.drawable.ic_launcher);
            nome.settext(getintent().getStringExtra("nome"));
        }
    }

}

public class ImageViewAndroidActivity extends listActivity {
    private static final String[] opcoes = {"Carregar Imagens", "Exibir Imagens"};

    private static final String[] ACOES = {"TELA_IMAGEM", "TELA_EXI"} ;

}

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}