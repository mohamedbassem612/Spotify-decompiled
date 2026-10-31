package p;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y8i1 implements h0r0 {
    public final qyj a;
    public final n9i1 b;
    public final lzn0 c;
    public final Activity d;
    public final y9i1 e;
    public final e490 f;
    public final cbr0 g;

    public y8i1(qyj qyjVar, stq stqVar, a9i1 a9i1Var, n9i1 n9i1Var, lzn0 lzn0Var, Activity activity) {
        this.a = qyjVar;
        this.b = n9i1Var;
        this.c = lzn0Var;
        this.d = activity;
        this.e = stqVar.a(a9i1Var.k(), a9i1Var.h(), a9i1Var.j(), a9i1Var.a(), a9i1Var.g());
        this.f = a9i1Var.b();
        yxe1 yxe1Var = new yxe1(new jx21(2131963563));
        bt21 bt21Var = new bt21();
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{yxe1Var, bt21Var, new bn70(yon1.j2(), nik1.J5, (nar0) null), new tc30(1), new hgr0(egr0.a, 0, 2)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.g;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-423502425, new muh1(this, (byte) 5), true));
    }
}
