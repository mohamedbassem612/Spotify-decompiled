package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m221 implements h0r0 {
    public final yuj a;
    public final mbq0 b;
    public final weq0 c;
    public final poj0 d;
    public final String e;
    public final cbr0 f;

    static {
        cbr0 cbr0Var = cbr0.c;
    }

    public m221(los losVar, yuj yujVar, mbq0 mbq0Var, weq0 weq0Var, poj0 poj0Var, String str) {
        this.a = yujVar;
        this.b = mbq0Var;
        this.c = weq0Var;
        this.d = poj0Var;
        this.e = str;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{new bn70(yon1.R4(), nik1.q5, (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 1, (mxb) null, losVar, false, false, true, (nsm0) null, 3797), new t1r0(true)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        m6e0 m6e0VarN = this.b.n();
        n7e0 n7e0Var = new n7e0(new l221(this), new ps11(this, (byte) 8), new ulc((byte) 22), i021.f);
        return yuj.b(this.a, m6e0VarN, apo.j(-2066512061, new g001(this, (byte) 26), true), n7e0Var);
    }
}
