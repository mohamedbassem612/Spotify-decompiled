package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ia90 implements h0r0 {
    public final hvj a;
    public final lzn0 b;
    public final ga90 c;
    public final q3b1 d;
    public final ka90 e;
    public final i8h1 f;
    public final cz30 g;
    public final cbr0 h;

    public ia90(hvj hvjVar, lzn0 lzn0Var, ga90 ga90Var, q3b1 q3b1Var, ka90 ka90Var, i8h1 i8h1Var, cz30 cz30Var) {
        this.a = hvjVar;
        this.b = lzn0Var;
        this.c = ga90Var;
        this.d = q3b1Var;
        this.e = ka90Var;
        this.f = i8h1Var;
        this.g = cz30Var;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarB1 = yon1.B1();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.h = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarB1, oap1.i(ka90Var.getUri()), (nar0) null), new hgr0(egr0.a, 0, 2), new tc30(1), new pu00(true)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.h;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        txk0 txk0VarN = k8p1.n();
        return this.a.a(this.c.c(), apo.j(1584426503, new cex(this, txk0VarN, (byte) 26), true), new xvj(apo.j(-802529767, new yy80(this, (byte) 2), true), (j2i) null, (j2i) null, true, 54));
    }
}
