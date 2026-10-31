package p;

import j$.time.ZoneId;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mw11 implements h0r0 {
    public final hvj a;
    public final bih1 b;
    public final ZoneId c;
    public final r35 d;
    public final p1f0 e;
    public final kdy0 f;
    public final cbr0 g;

    public mw11(hvj hvjVar, bih1 bih1Var, ZoneId zoneId, r35 r35Var, p1f0 p1f0Var, kdy0 kdy0Var) {
        this.a = hvjVar;
        this.b = bih1Var;
        this.c = zoneId;
        this.d = r35Var;
        this.e = p1f0Var;
        this.f = kdy0Var;
        t1r0 t1r0Var = new t1r0(true);
        yxe1 yxe1Var = new yxe1(new jx21(2131961061));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{t1r0Var, yxe1Var, new bn70((n6r0) yon1.J5(), nik1.K5, (v8h1) d7e.v()), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.g;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return hvj.b(this.a, bbp1.g(this.b.g().map(new vqv0(this, (byte) 19))), apo.j(-1122638934, new lw11(this, (byte) 0), true));
    }
}
