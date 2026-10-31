package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hk10 implements h0r0 {
    public final qyj a;
    public final jk10 b;
    public final pt c;
    public final los d;
    public final cbr0 e;

    public hk10(qyj qyjVar, jk10 jk10Var, pt ptVar, los losVar) {
        this.a = qyjVar;
        this.b = jk10Var;
        this.c = ptVar;
        this.d = losVar;
        dbr0 yxe1Var = new yxe1(new jx21(2131955919));
        dbr0 t1r0Var = new t1r0(true);
        dbr0 s9h1Var = new s9h1(14, true, false, false);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{yxe1Var, t1r0Var, s9h1Var, new bn70(yon1.G1("FAN_EVENTS_REDEMPTION", "fan-events/redemption", 544, "fan-events"), new lik1(jk10Var.b), (nar0) null), new nxb(null, null, null, 0, null, losVar, false, false, false, null, 4063)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(-1010347804, new hzw(this, (byte) 24), true));
    }
}
