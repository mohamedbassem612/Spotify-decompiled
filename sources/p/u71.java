package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u71 implements h0r0 {
    public final yuj a;
    public final eyh0 b;
    public final lzn0 c;
    public final boolean d;

    public u71(yuj yujVar, eyh0 eyh0Var, lzn0 lzn0Var, boolean z) {
        this.a = yujVar;
        this.b = eyh0Var;
        this.c = lzn0Var;
        this.d = z;
    }

    public final cbr0 a() {
        dbr0 yxe1Var = new yxe1(new jx21(2131951870));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.t(), nik1.n5, (nar0) null)}, false);
    }

    public final p2r0 b() {
        eyh0 eyh0Var = this.b;
        boolean z = this.d;
        return yuj.b(this.a, eyh0Var.r(z), apo.j(1812136646, new m3(this, (byte) 22), true), eyh0Var.t(z));
    }
}
