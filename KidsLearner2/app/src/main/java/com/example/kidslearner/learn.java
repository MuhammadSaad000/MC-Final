package com.example.kidslearner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class learn extends AppCompatActivity implements View.OnClickListener{

    Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        a = findViewById(R.id.btnA);
        b = findViewById(R.id.btnB);
        c = findViewById(R.id.btnC);
        d = findViewById(R.id.btnD);
        e = findViewById(R.id.btnE);
        f = findViewById(R.id.btnF);
        g = findViewById(R.id.btnG);
        h = findViewById(R.id.btnH);
        i = findViewById(R.id.btnI);
        j = findViewById(R.id.btnJ);
        k = findViewById(R.id.btnK);
        l = findViewById(R.id.btnL);
        m = findViewById(R.id.btnM);
        n = findViewById(R.id.btnN);
        o = findViewById(R.id.btnO);
        p = findViewById(R.id.btnP);
        q = findViewById(R.id.btnQ);
        r = findViewById(R.id.btnR);
        s = findViewById(R.id.btnS);
        t = findViewById(R.id.btnT);
        u = findViewById(R.id.btnU);
        v = findViewById(R.id.btnV);
        w = findViewById(R.id.btnW);
        x = findViewById(R.id.btnX);
        y = findViewById(R.id.btnY);
        z = findViewById(R.id.btnZ);


        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        v.setOnClickListener(this);
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnA:
                Intent intent = new Intent(this, Alphabet.class);
                intent.putExtra("text", "A");
                intent.putExtra("picture", R.drawable.afor);
                startActivity(intent);
                break;
            case R.id.btnB:
                Intent intentb = new Intent(this, Alphabet.class);
                intentb.putExtra("text", "B");
                intentb.putExtra("picture", R.drawable.bfor);
                startActivity(intentb);
                break;
            case R.id.btnC:
                Intent intentc = new Intent(this, Alphabet.class);
                intentc.putExtra("text", "C");
                intentc.putExtra("picture", R.drawable.cfor);
                startActivity(intentc);
                break;
            case R.id.btnD:
                Intent intentd = new Intent(this, Alphabet.class);
                intentd.putExtra("text", "D");
                intentd.putExtra("picture", R.drawable.dfor);
                startActivity(intentd);
                break;
            case R.id.btnE:
                Intent intente = new Intent(this, Alphabet.class);
                intente.putExtra("text", "E");
                intente.putExtra("picture", R.drawable.efor);
                startActivity(intente);
                break;
            case R.id.btnF:
                Intent intentf = new Intent(this, Alphabet.class);
                intentf.putExtra("text", "F");
                intentf.putExtra("picture", R.drawable.ffor);
                startActivity(intentf);
                break;
            case R.id.btnG:
                Intent intentg = new Intent(this, Alphabet.class);
                intentg.putExtra("text", "G");
                intentg.putExtra("picture", R.drawable.gfor);
                startActivity(intentg);
                break;
            case R.id.btnH:
                Intent intenth = new Intent(this, Alphabet.class);
                intenth.putExtra("text", "H");
                intenth.putExtra("picture", R.drawable.hfor);
                startActivity(intenth);
                break;
            case R.id.btnI:
                Intent intenti = new Intent(this, Alphabet.class);
                intenti.putExtra("text", "I");
                intenti.putExtra("picture", R.drawable.ifor);
                startActivity(intenti);
                break;
            case R.id.btnJ:
                Intent intentj = new Intent(this, Alphabet.class);
                intentj.putExtra("text", "J");
                intentj.putExtra("picture", R.drawable.jfor);
                startActivity(intentj);
                break;
            case R.id.btnK:
                Intent intentk = new Intent(this, Alphabet.class);
                intentk.putExtra("text", "K");
                intentk.putExtra("picture", R.drawable.kfor);
                startActivity(intentk);
                break;
            case R.id.btnL:
                Intent intentl = new Intent(this, Alphabet.class);
                intentl.putExtra("text", "L");
                intentl.putExtra("picture", R.drawable.lfor);
                startActivity(intentl);
                break;
            case R.id.btnM:
                Intent intentm = new Intent(this, Alphabet.class);
                intentm.putExtra("text", "M");
                intentm.putExtra("picture", R.drawable.mfor);
                startActivity(intentm);
                break;
            case R.id.btnN:
                Intent intentn = new Intent(this, Alphabet.class);
                intentn.putExtra("text", "N");
                intentn.putExtra("picture", R.drawable.nfor);
                startActivity(intentn);
                break;
            case R.id.btnO:
                Intent intento = new Intent(this, Alphabet.class);
                intento.putExtra("text", "O");
                intento.putExtra("picture", R.drawable.ofor);
                startActivity(intento);
                break;
            case R.id.btnP:
                Intent intentp = new Intent(this, Alphabet.class);
                intentp.putExtra("text", "P");
                intentp.putExtra("picture", R.drawable.pfor);
                startActivity(intentp);
                break;
            case R.id.btnQ:
                Intent intentq = new Intent(this, Alphabet.class);
                intentq.putExtra("text", "Q");
                intentq.putExtra("picture", R.drawable.qfor);
                startActivity(intentq);
                break;
            case R.id.btnR:
                Intent intentr = new Intent(this, Alphabet.class);
                intentr.putExtra("text", "R");
                intentr.putExtra("picture", R.drawable.rfor);
                startActivity(intentr);
                break;
            case R.id.btnS:
                Intent intents = new Intent(this, Alphabet.class);
                intents.putExtra("text", "S");
                intents.putExtra("picture", R.drawable.sfor);
                startActivity(intents);
                break;
            case R.id.btnT:
                Intent intentt = new Intent(this, Alphabet.class);
                intentt.putExtra("text", "T");
                intentt.putExtra("picture", R.drawable.tfor);
                startActivity(intentt);
                break;
            case R.id.btnU:
                Intent intentu = new Intent(this, Alphabet.class);
                intentu.putExtra("text", "U");
                intentu.putExtra("picture", R.drawable.ufor);
                startActivity(intentu);
                break;
            case R.id.btnV:
                Intent intentv = new Intent(this, Alphabet.class);
                intentv.putExtra("text", "V");
                intentv.putExtra("picture", R.drawable.vfor);
                startActivity(intentv);
                break;
            case R.id.btnW:
                Intent intentw = new Intent(this, Alphabet.class);
                intentw.putExtra("text", "W");
                intentw.putExtra("picture", R.drawable.wfor);
                startActivity(intentw);
                break;
            case R.id.btnX:
                Intent intentx = new Intent(this, Alphabet.class);
                intentx.putExtra("text", "X");
                intentx.putExtra("picture", R.drawable.xfor);
                startActivity(intentx);
                break;
            case R.id.btnY:
                Intent intenty = new Intent(this, Alphabet.class);
                intenty.putExtra("text", "Y");
                intenty.putExtra("picture", R.drawable.yfor);
                startActivity(intenty);
                break;
            case R.id.btnZ:
                Intent intentz = new Intent(this, Alphabet.class);
                intentz.putExtra("text", "Z");
                intentz.putExtra("picture", R.drawable.zfor);
                startActivity(intentz);
                break;

        }
    }

}