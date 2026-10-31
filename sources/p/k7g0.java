package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k7g0 implements h0r0 {
    public final qyj a;
    public final m7g0 b;
    public final umf0 c;
    public final cbr0 d;

    static {
        cbr0 cbr0Var = cbr0.c;
    }

    public k7g0(qyj qyjVar, m7g0 m7g0Var, umf0 umf0Var) {
        this.a = qyjVar;
        this.b = m7g0Var;
        this.c = umf0Var;
        yxe1 yxe1Var = new yxe1(new jx21(2131958086));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.o3(), nik1.T5.b("spotify:internal:parental-control:child:" + m7g0Var.a() + ":manage-content"), (nar0) null), new t1r0(true)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-1084566259, new mbf0(this, (byte) 16), true));
    }
}
