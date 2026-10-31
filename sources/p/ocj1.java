package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ocj1 implements h0r0 {
    public final rcj1 a;
    public final a1r0 b;
    public final qyj c;
    public final q290 d;
    public final ncj1 e;
    public final cbr0 f;

    public ocj1(rcj1 rcj1Var, a1r0 a1r0Var, qyj qyjVar, q290 q290Var, ncj1 ncj1Var) {
        this.a = rcj1Var;
        this.b = a1r0Var;
        this.c = qyjVar;
        this.d = q290Var;
        this.e = ncj1Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{new bn70(yon1.G1("ADS", "ads", 18, "ads"), new lik1("spotify:internal:video-ad-overlay"), (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.f;
    }

    public final p2r0 b() {
        return this.c.a(new j2i(-1791110649, new muh1(this, (byte) 16), true));
    }
}
