package com.spotify.musicappplatform.offlineerrors;

import android.content.DialogInterface;
import com.spotify.musicappplatform.offlineerrors.OfflineDeviceLimitReachedActivity;
import io.reactivex.rxjava3.core.Single;
import java.util.Set;
import p.fv5;
import p.i8h1;
import p.idd1;
import p.iu4;
import p.ix7;
import p.l7h1;
import p.mw40;
import p.rku;
import p.t3b1;
import p.w7h1;
import p.xok0;
import p.yoi1;
import p.yqp0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public class OfflineDeviceLimitReachedActivity extends t3b1 {
    public static final /* synthetic */ int k1 = 0;
    public i8h1 f1;
    public ix7 g1;
    public iu4 h1;
    public final rku i1 = new rku();
    public final xok0 j1 = new xok0((byte) 19);

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0(int i, l7h1 l7h1Var, final w7h1 w7h1Var) {
        mw40 mw40VarT = yoi1.T(this, this.h1.a() ? getString(2131959329) : getString(2131959328), getString(i));
        String string = getString(2131959327);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: p.xqp0
            /* JADX WARN: Type inference failed for: r2v2, types: [android.app.Activity, com.spotify.musicappplatform.offlineerrors.OfflineDeviceLimitReachedActivity] */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = OfflineDeviceLimitReachedActivity.k1;
                ?? r2 = this.a;
                r2.f1.m(w7h1Var, (xj61) null);
                r2.finish();
            }
        };
        mw40VarT.a = string;
        mw40VarT.c = onClickListener;
        mw40VarT.e = true;
        mw40VarT.f = new yqp0(this, (byte) 0);
        mw40VarT.b().b();
        this.f1.f(l7h1Var, (Set) null);
    }

    public final void onPause() {
        super/*p.dac0*/.onPause();
        this.i1.a();
    }

    public final void onResume() {
        super/*p.dac0*/.onResume();
        this.i1.b(((Single) ((idd1) this.g1.d).getValue()).subscribe(new fv5(this, (byte) 8)));
    }
}
