package p;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s531 implements h0r0 {
    public final hvj a;
    public final q3b1 b;
    public final lzn0 c;
    public final i531 d;
    public final zgz0 e;
    public final hq41 f;
    public final w531 g;
    public final i8h1 h;
    public final cz30 i;
    public final cbr0 j;

    public s531(hvj hvjVar, q3b1 q3b1Var, lzn0 lzn0Var, i531 i531Var, zgz0 zgz0Var, hq41 hq41Var, w531 w531Var, i8h1 i8h1Var, cz30 cz30Var) {
        this.a = hvjVar;
        this.b = q3b1Var;
        this.c = lzn0Var;
        this.d = i531Var;
        this.e = zgz0Var;
        this.f = hq41Var;
        this.g = w531Var;
        this.h = i8h1Var;
        this.i = cz30Var;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarD1 = yon1.D1();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.j = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarD1, oap1.i(w531Var.getUri()), (nar0) null), new hgr0(egr0.a, 0, 2), new tc30(1), new pu00(true)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.j;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        Handler handler = new Handler(Looper.getMainLooper());
        txk0 txk0VarN = k8p1.n();
        mre0 mre0VarP = p8p1.p(txk0VarN);
        w531 w531Var = this.g;
        g5l0 g5l0VarF = mre0VarP.f(w531Var.a());
        wzv0 wzv0VarA = this.f.a();
        return this.a.a(this.d.b(w531Var), apo.j(148568115, new n2y0(wzv0VarA, this, txk0VarN, g5l0VarF, handler, (byte) 4), true), new xvj(apo.j(1557715791, new lw11(this, (byte) 15), true), (j2i) null, (j2i) null, true, 54));
    }
}
