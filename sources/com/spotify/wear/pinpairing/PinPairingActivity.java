package com.spotify.wear.pinpairing;

import android.os.Bundle;
import p.cy30;
import p.dg30;
import p.lmw;
import p.nu9;
import p.t3b1;
import p.tg30;
import p.w1t0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public class PinPairingActivity extends t3b1 {
    public static final /* synthetic */ int f1 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624011);
        lmw lmwVar = ((dg30) this).U0;
        if (((tg30) lmwVar.b).g.G("fragment") == null) {
            nu9 nu9Var = new nu9(((tg30) lmwVar.b).g);
            String stringExtra = getIntent().getStringExtra("url");
            int i = w1t0.Z1;
            Bundle bundleG = cy30.g("pairing-url", stringExtra);
            w1t0 w1t0Var = new w1t0();
            w1t0Var.T0(bundleG);
            nu9Var.k(2131428202, w1t0Var, "fragment", 1);
            nu9Var.f();
        }
    }
}
