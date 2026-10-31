package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q88 implements h0r0 {
    public final yuj a;
    public final n88 b;
    public final dv9 c;
    public final hhr d;
    public final v88 e;
    public final cbr0 f;

    public q88(yuj yujVar, n88 n88Var, dv9 dv9Var, hhr hhrVar, v88 v88Var) {
        this.a = yujVar;
        this.b = n88Var;
        this.c = dv9Var;
        this.d = hhrVar;
        this.e = v88Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{new bn70(yon1.U(), nik1.T2, (nar0) null), new kce0()}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.a, f610.e(new p6e0[]{new p6e0()}, new dt0(this, (lnm) null, (byte) 11)), apo.j(-1947561685, new v72(this, (byte) 25), true), new n7e0(new p88(this), c37.W0, new e4x0((byte) 29)));
    }
}
