package com.spotify.appauthorization.externallogin;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import kotlin.Metadata;
import p.cj8;
import p.e1r0;
import p.e9k;
import p.eg;
import p.i2f0;
import p.j2f0;
import p.k2f0;
import p.mzo;
import p.nbr;
import p.qh0;
import p.u2f0;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/spotify/appauthorization/externallogin/LoginRedirectActivity;", "Lp/mzo;", "<init>", "()V", "p/e9k", "src_main_java_com_spotify_appauthorization_externallogin-externallogin"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LoginRedirectActivity extends mzo {
    public e9k b1 = i2f0.g;
    public final qh0 c1 = a0(new cj8(this, (byte) 4), new e1r0((byte) 5, false));
    public u2f0 d1;
    public nbr e1;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.mzo
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        nbr nbrVar = this.e1;
        if (nbrVar == null) {
            u890.C("attributionController");
            throw null;
        }
        nbrVar.a((Intent) null, getReferrer());
        this.b1 = k2f0.g;
    }

    public final void onNewIntent(Intent intent) {
        super/*p.g0i*/.onNewIntent(intent);
        if (u890.j(intent.getAction(), "com.spotify.music.ACTION_EXTERNAL_LOGIN")) {
            this.b1 = k2f0.g;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        super/*p.dg30*/.onResume();
        e9k e9kVar = this.b1;
        boolean zJ = u890.j(e9kVar, k2f0.g);
        i2f0 i2f0Var = i2f0.g;
        if (zJ) {
            Intent intent = new Intent(getApplicationContext(), (Class<?>) LoginRedirectActivity.class);
            u2f0 u2f0Var = this.d1;
            if (u2f0Var == null) {
                u890.C("loginTrigger");
                throw null;
            }
            this.c1.a(u2f0.a(u2f0Var, getApplicationContext(), intent, false, (Uri) null, 0, 0, 76));
        } else if (e9kVar instanceof j2f0) {
            setResult(((j2f0) e9kVar).g);
            finish();
        } else if (!u890.j(e9kVar, i2f0Var)) {
            eg.o();
            return;
        }
        this.b1 = i2f0Var;
    }
}
