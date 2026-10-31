package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e8t implements h0r0 {
    public final hvj a;
    public final g8t b;
    public final w7t c;
    public final e2b0 d;

    public e8t(hvj hvjVar, g8t g8tVar, w7t w7tVar, e2b0 e2b0Var) {
        this.a = hvjVar;
        this.b = g8tVar;
        this.c = w7tVar;
        this.d = e2b0Var;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{new bn70(yon1.k3(), cfm0.i("spotify:internal:parental-control:delete-account:", this.b.a(), nik1.X3), (nar0) null), new yxe1(new ehc1("")), new pu00(true), new hgr0(egr0.a, 0, 2), new t1r0(true), new kce0()}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return hvj.b(this.a, f610.e(new p6e0[0], new pbg(this, (lnm) null, (byte) 11)), apo.j(706425942, new b1s(this, (byte) 28), true));
    }
}
