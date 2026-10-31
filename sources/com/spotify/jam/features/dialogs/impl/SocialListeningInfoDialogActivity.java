package com.spotify.jam.features.dialogs.impl;

import android.os.Bundle;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.a7h1;
import p.eg;
import p.g2z;
import p.i8h1;
import p.j4a1;
import p.k4a1;
import p.k7h1;
import p.kx40;
import p.lzn0;
import p.mir0;
import p.mw40;
import p.o3u;
import p.p410;
import p.p6r0;
import p.pdl0;
import p.q3u;
import p.qir0;
import p.t3b1;
import p.t3u;
import p.u3u;
import p.u890;
import p.uw0;
import p.x6h1;
import p.xab1;
import p.xjn;
import p.y6h1;
import p.yon1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/spotify/jam/features/dialogs/impl/SocialListeningInfoDialogActivity;", "Lp/t3b1;", "<init>", "()V", "p/lvx", "src_main_java_com_spotify_jam_features_dialogs_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SocialListeningInfoDialogActivity extends t3b1 {
    public static final /* synthetic */ int j1 = 0;
    public g2z f1;
    public lzn0 g1;
    public p410 h1;
    public xab1 i1;

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.G1("SOCIAL_LISTENING_NOTIFICATIONDIALOG", "social-listening/notificationdialog", 1910, "social-listening"), (qir0) null, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        mw40 mw40Var;
        super.onCreate(bundle);
        u3u u3uVar = (u3u) getIntent().getParcelableExtra("type");
        String stringExtra = getIntent().getStringExtra("title");
        if (u3uVar == null || stringExtra == null) {
            finish();
            return;
        }
        String stringExtra2 = getIntent().getStringExtra("subtitle");
        if (u3uVar.equals(o3u.a)) {
            uw0 uw0Var = new uw0();
            uw0Var.c = stringExtra;
            uw0Var.Y = stringExtra2;
            String string = getString(2131962668);
            j4a1 j4a1Var = new j4a1(this, (byte) 0);
            uw0Var.Z = string;
            uw0Var.N0 = j4a1Var;
            mw40Var = new mw40(this, uw0Var);
        } else if (u3uVar instanceof q3u) {
            g2z g2zVar = this.f1;
            if (g2zVar == null) {
                u890.C("logger");
                throw null;
            }
            String str = ((q3u) u3uVar).a;
            i8h1 i8h1Var = (i8h1) g2zVar.a;
            x6h1 x6h1VarC = ((pdl0) g2zVar.f).b.c();
            x6h1VarC.i.add(new a7h1("premium_only_dialog", (String) null, (Integer) null, str, (String) null));
            x6h1VarC.j = true;
            y6h1 y6h1VarA = x6h1VarC.a();
            k7h1 k7h1Var = new k7h1();
            ((xjn) k7h1Var).a = y6h1VarA;
            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
            i8h1Var.f(k7h1Var.a(), (Set) null);
            uw0 uw0Var2 = new uw0();
            uw0Var2.c = stringExtra;
            uw0Var2.Y = stringExtra2;
            String string2 = getString(2131955848);
            k4a1 k4a1Var = new k4a1(this, u3uVar, (byte) 0);
            uw0Var2.Z = string2;
            uw0Var2.N0 = k4a1Var;
            String string3 = getString(2131956949);
            j4a1 j4a1Var2 = new j4a1(this, (byte) 2);
            uw0Var2.b = string3;
            uw0Var2.O0 = j4a1Var2;
            mw40Var = new mw40(this, uw0Var2);
        } else {
            if (!(u3uVar instanceof t3u)) {
                eg.o();
                return;
            }
            uw0 uw0Var3 = new uw0();
            uw0Var3.c = stringExtra;
            uw0Var3.Y = stringExtra2;
            String string4 = getString(2131962672);
            k4a1 k4a1Var2 = new k4a1(this, u3uVar, (byte) 1);
            uw0Var3.Z = string4;
            uw0Var3.N0 = k4a1Var2;
            String string5 = getString(2131956949);
            j4a1 j4a1Var3 = new j4a1(this, (byte) 4);
            uw0Var3.b = string5;
            uw0Var3.O0 = j4a1Var3;
            mw40Var = new mw40(this, uw0Var3);
        }
        mw40Var.b().b();
    }

    public final void onStop() {
        super/*p.dac0*/.onStop();
        xab1 xab1Var = this.i1;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }
}
