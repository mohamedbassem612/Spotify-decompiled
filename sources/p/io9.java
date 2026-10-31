package p;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class io9 implements h0r0 {
    public final qyj a;
    public final rm9 b;
    public final Activity c;
    public final h72 d;
    public final a1r0 e;
    public final mko f;
    public final cbr0 g;
    public final cbr0 h;

    public io9(qyj qyjVar, rm9 rm9Var, Activity activity, h72 h72Var, a1r0 a1r0Var, mko mkoVar) {
        this.a = qyjVar;
        this.b = rm9Var;
        this.c = activity;
        this.d = h72Var;
        this.e = a1r0Var;
        this.f = mkoVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        cbr0 cbr0Var = new cbr0(new dbr0[]{new bn70(yon1.G1("BYOM_NOWPLAYING", "byom/nowplaying", 261, "byom"), new lik1("spotify:internal:byom-npv"), (nar0) null), new tc30(4), new t1r0(true), new s9h1(14, true, false, false)}, false);
        this.g = cbr0Var;
        this.h = cbr0Var;
    }

    public final cbr0 a() {
        return this.h;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(-1916776985, new mu6(this, (byte) 23), true));
    }
}
