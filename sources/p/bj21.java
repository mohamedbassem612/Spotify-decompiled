package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bj21 implements h0r0 {
    public final kyj a;
    public final fj21 b;
    public final vi21 c;
    public final yla d;
    public final is10 e;
    public final cbr0 f;

    static {
        cbr0 cbr0Var = cbr0.c;
    }

    public bj21(kyj kyjVar, fj21 fj21Var, vi21 vi21Var, yla ylaVar, ks10 ks10Var) {
        this.a = kyjVar;
        this.b = fj21Var;
        this.c = vi21Var;
        this.d = ylaVar;
        is10 is10VarA = ks10.a(fj21Var.a());
        this.e = is10VarA;
        yxe1 yxe1Var = new yxe1(new jx21(is10VarA.a()));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarO2 = yon1.O2();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.f = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarO2, oap1.i(fj21Var.getUri()), (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, (los) null, false, false, false, (nsm0) null, 4093), new bt21(), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-1884424672, new z821(this, (byte) 4), true), new dx81(new zi21(this), new zw11(this, (byte) 9), icx0.g));
    }
}
