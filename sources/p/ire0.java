package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ire0 implements h0r0 {
    public final hvj a;
    public final lzn0 b;
    public final yge0 c;
    public final fqe0 d;
    public final j2e0 e;
    public final ikp f;
    public final cbr0 g;

    public ire0(hvj hvjVar, lzn0 lzn0Var, yge0 yge0Var, fqe0 fqe0Var, j2e0 j2e0Var, ikp ikpVar) {
        this.a = hvjVar;
        this.b = lzn0Var;
        this.c = yge0Var;
        this.d = fqe0Var;
        this.e = j2e0Var;
        this.f = ikpVar;
        dbr0 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.G1("LOCKSTATE", "lockstate", 936, "lockstate"), nik1.o3, (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.g;
    }

    public final p2r0 b() {
        return this.a.a(new o6e0(new oxa0(this, null, (byte) 6), f46.I(new p6e0[0])), new j2i(-319761061, new k2d0((Object) this, (byte) 20), true), new xvj((xu30) null, new j2i(50053109, new s2c0(this, (byte) 26), true), (j2i) null, false, 61));
    }
}
