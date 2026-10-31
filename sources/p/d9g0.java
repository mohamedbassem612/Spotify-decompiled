package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d9g0 implements h0r0 {
    public final a2b0 a;
    public final yuj b;
    public final z8g0 c;
    public final k9g0 d;
    public final bjx e;
    public final sb40 f;
    public final cbr0 g;

    public d9g0(a2b0 a2b0Var, yuj yujVar, z8g0 z8g0Var, k9g0 k9g0Var, bjx bjxVar, e5b0 e5b0Var, sb40 sb40Var) {
        this.a = a2b0Var;
        this.b = yujVar;
        this.c = z8g0Var;
        this.d = k9g0Var;
        this.e = bjxVar;
        this.f = sb40Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{new bn70(yon1.q3(), k9g0Var.a(), (nar0) null), new pu00(true), new t1r0(true), e5b0Var}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.g;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.b, f610.e(new p6e0[0], new oxa0(this, (lnm) null, (byte) 10)), apo.j(2019047104, new kmd0(this, (byte) 22), true), new n7e0(new c9g0(this), new mbf0(this, (byte) 17), new lhc((byte) 15), j2g0.N0));
    }
}
