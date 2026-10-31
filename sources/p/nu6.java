package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nu6 implements h0r0 {
    public final qyj a;
    public final pu6 b;
    public final i8h1 c;
    public final cbr0 d;

    public nu6(qyj qyjVar, pu6 pu6Var, i8h1 i8h1Var, p6r0 p6r0Var) {
        this.a = qyjVar;
        this.b = pu6Var;
        this.c = i8h1Var;
        dbr0 t1r0Var = new t1r0(true);
        dbr0 nxbVar = new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, (los) null, false, false, true, (nsm0) null, 3837);
        Parcelable.Creator creator = lik1.CREATOR;
        this.d = new cbr0(new dbr0[]{t1r0Var, nxbVar, new bn70(p6r0Var, new lik1(pu6Var.d()), new nar0(new wrk0(y6b1.b(pu6Var.a).toString()))), new s9h1(4, true, true, true)}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(216831308, new mu6(this, (byte) 0), true));
    }
}
