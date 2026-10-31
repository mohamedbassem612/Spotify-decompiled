package p;

import android.app.Activity;
import android.content.res.Resources;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o03 implements h0r0 {
    public final qyj a;
    public final r03 b;
    public final q7r0 c;
    public final a1r0 d;
    public final Activity e;
    public final v03 f;
    public final ycc1 g;
    public final Map h;
    public final a4i1 i;
    public final k03 j;
    public final cbr0 k;

    public o03(Resources resources, qyj qyjVar, r03 r03Var, q7r0 q7r0Var, a1r0 a1r0Var, Activity activity, v03 v03Var, ycc1 ycc1Var, ez4 ez4Var, Map map, a4i1 a4i1Var) {
        this.a = qyjVar;
        this.b = r03Var;
        this.c = q7r0Var;
        this.d = a1r0Var;
        this.e = activity;
        this.f = v03Var;
        this.g = ycc1Var;
        this.h = map;
        this.i = a4i1Var;
        k03 k03VarT = v8r.t(r03Var.a(), map);
        this.j = k03VarT;
        t1r0 t1r0Var = new t1r0(true);
        n6r0 n6r0VarA = k03VarT.a();
        if (n6r0VarA == null) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            n6r0VarA = yon1.H();
        }
        lik1 lik1VarB = k03VarT.b();
        this.k = new cbr0(new dbr0[]{t1r0Var, new bn70(n6r0VarA, lik1VarB == null ? nik1.h3 : lik1VarB, (nar0) null), new nxb(Integer.valueOf((int) (resources.getDisplayMetrics().heightPixels * 0.25f)), ixb.b, (Integer) null, 1, (mxb) null, (los) null, false, false, true, (nsm0) null, 3828), new s9h1(6, true, false, ez4Var.a())}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.k;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-1296654187, new xb2(this, (byte) 9), true));
    }
}
