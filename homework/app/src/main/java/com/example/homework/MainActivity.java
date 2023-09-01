package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Button buton;
    Button butonA;
    Button butonB;
    Button butonC;
    Button butonD;
    EditText editText;
    TextView textView;
    ImageView imageView;
    Integer soru = 0;
    Integer score = 0;
    String text = "Geç";

    public void questions(View view)
    {
        buton = (Button)findViewById(R.id.button1);
        buton.setText(text);

        textView = (TextView)findViewById(R.id.textView1);

        editText = (EditText)findViewById(R.id.editText1);

        butonA = (Button)findViewById(R.id.button2);
        butonB = (Button)findViewById(R.id.button3);
        butonC = (Button)findViewById(R.id.button4);
        butonD = (Button)findViewById(R.id.button5);

        soru++;

        imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.white);

        if(soru==1)
        {
            editText.setText("Soru1: Aşağıdakilerden hangisi kılcal damar kanamasının özelliğidir?");
            butonA.setText("Koyu renkli ve taşma tarzında kan akması");
            butonB.setText("Sızıntı biçiminde ve hafif bir kanama olması");
            butonC.setText("Yüksek basınçla akması ve zor durdurulabilmesi");
            butonD.setText("Yara ağzından kalp atımlarına uyumlu şekil-de fışkırarak akması");
            textView.setText("Score:" +score.toString());
            //B

        }
        if(soru==2)
        {
            editText.setText("Soru2: Aşağıdakilerin hangisinde şok pozisyonu vermek sakıncalıdır?");
            butonA.setText("Bacağında kanama olanlarda");
            butonB.setText("El bileğinde açık kırık olanlarda");
            butonC.setText("Tansiyonu düşük ve nabız alınamayanlarda");
            butonD.setText("Burnundan ve kulağından kanama olanlarda");
            textView.setText("Score:" +score.toString());
            //D

        }
        if(soru==3)
        {
            editText.setText("Soru3: Omurga yaralanmalarında geçici veya kalıcı felçlerin oluşmasının nedeni aşağıdakilerden hangisidir?");
            butonA.setText("Omuriliğin baskı altında olması ya da zedelenmesi");
            butonB.setText("Taşıma esnasında baş, boyun ve gövde ekseninin korunması");
            butonC.setText("Kazazedenin sırtüstü, düz pozisyonda yatırılması");
            butonD.setText("Kazazedenin hareketsiz hâle getirilmesi");
            textView.setText("Score:" +score.toString());
            //A

        }
        if(soru==4)
        {
            editText.setText("Soru4: Aşağıdakilerden hangisi, kaza sonrası güvenli bir ortamın oluşturulması için yapılması gereken uygulamalardandır?");
            butonA.setText("Yardımı güçleştirecek meraklı kişilerin olay yerinden uzaklaştırılması");
            butonB.setText("Olay yerinin diğer araç sürücüleri tarafından görünmesinin engellenmesi");
            butonC.setText("Araç LPG´li ise bagajında bulunan tüpün vanasının kapatılmaması");
            butonD.setText("Kazaya uğrayan aracın kontağının açık bırakılması");
            textView.setText("Score:" +score.toString());
            //A

        }
        if(soru==5)
        {
            editText.setText("Soru5: Yetişkinlere ve bebeklere yapılan temel yaşam desteği uygulamasında, göğüs kemiği kaç cm aşağı inecek şekilde kalp basısı uygulanır?");
            butonA.setText("A");
            butonB.setText("B");
            butonC.setText("C");
            butonD.setText("D");
            textView.setText("Score:" +score.toString());
            //C
            imageView = findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.soru5);

        }
        if(soru==6)
        {
            editText.setText("Soru6: Kalp-damar sisteminin yaşamsal organlara uygun oranda kanlanma yapamaması nedeniyle ortaya çıkan, tansiyon düşüklüğü ile seyreden ve ani gelişen dolaşım yetmezliğine - - - - denir.");
            butonA.setText("Şok");
            butonB.setText("Havale");
            butonC.setText("Epilepsi");
            butonD.setText("Bayılma");
            textView.setText("Score:" +score.toString());
            //A
        }
        if(soru==7)
        {
            editText.setText("Bitti");
            butonA.setText("");
            butonB.setText("");
            butonC.setText("");
            butonD.setText("");
            textView.setText("Score:" +score.toString());
        }
        if(soru==8)
        {
            finish();
        }
    }
    public void addingScore(View view)
    {
        score = score + 1;
    }
}