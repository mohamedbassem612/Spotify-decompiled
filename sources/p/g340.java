package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g340 implements h0r0 {
    public final yqg a;
    public final yuj b;
    public final q3b1 c;
    public final b340 d;
    public final d340 e;
    public final i340 f;
    public final i8h1 g;
    public final cbr0 h;

    public g340(yqg yqgVar, yuj yujVar, q3b1 q3b1Var, b340 b340Var, d340 d340Var, i340 i340Var, i8h1 i8h1Var) {
        this.a = yqgVar;
        this.b = yujVar;
        this.c = q3b1Var;
        this.d = b340Var;
        this.e = d340Var;
        this.f = i340Var;
        this.g = i8h1Var;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarC1 = yon1.C1();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.h = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarC1, oap1.i(i340Var.getUri()), (nar0) null), new hgr0(egr0.a, 0, 2), new tc30(1)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.h;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        txk0 txk0VarN = k8p1.n();
        zud0 zud0VarN = n8p1.n(txk0VarN);
        i340 i340Var = this.f;
        g5l0 g5l0VarT = zud0VarN.t(i340Var.a());
        return this.b.a(this.e.b(i340Var.a()), apo.j(-433887, new gk0(this, txk0VarN, g5l0VarT, (byte) 13), true), new n7e0(new f340(this), bp30.O0, b610.d), new xvj(apo.j(-491475203, new mp20(this, (byte) 14), true), (j2i) null, (j2i) null, true, 54));
    }
}
