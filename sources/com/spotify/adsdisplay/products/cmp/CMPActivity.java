package com.spotify.adsdisplay.products.cmp;

import android.os.Bundle;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import p.d6d1;
import p.dg30;
import p.lmw;
import p.nu9;
import p.pmc;
import p.qdd1;
import p.t3b1;
import p.tg30;
import p.zlv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/adsdisplay/products/cmp/CMPActivity;", "Lp/t3b1;", "<init>", "()V", "src_main_java_com_spotify_adsdisplay_products-products"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class CMPActivity extends t3b1 {
    public final void onCreate(Bundle bundle) {
        qdd1 qdd1Var = new qdd1(0, 0, 2, d6d1.U0);
        zlv.a(this, qdd1Var, qdd1Var);
        super.onCreate(bundle);
        setContentView(2131624009);
        lmw lmwVar = ((dg30) this).U0;
        if (((tg30) lmwVar.b).g.G("one_trust_fragment") != null) {
            return;
        }
        nu9 nu9Var = new nu9(((tg30) lmwVar.b).g);
        nu9Var.k(2131430232, new pmc(), "one_trust_fragment", 1);
        nu9Var.f();
    }
}
