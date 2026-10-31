package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class or21 implements h0r0 {
    public final qyj a;
    public final rr21 b;
    public final q7r0 c;
    public final yqg d;
    public final jxp e;
    public final jxp f;
    public final uu00 g;
    public final xrk h;
    public final cbr0 i;

    public or21(qyj qyjVar, rr21 rr21Var, q7r0 q7r0Var, yqg yqgVar, jxp jxpVar, jxp jxpVar2, uu00 uu00Var, xrk xrkVar) {
        this.a = qyjVar;
        this.b = rr21Var;
        this.c = q7r0Var;
        this.d = yqgVar;
        this.e = jxpVar;
        this.f = jxpVar2;
        this.g = uu00Var;
        this.h = xrkVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("CONCERTS_RESERVED_ONBOARDING", "concerts/reserved-onboarding", 393, "concerts");
        Parcelable.Creator creator = lik1.CREATOR;
        this.i = new cbr0(new dbr0[]{new bn70(p6r0VarG1, new lik1(rr21Var.a), (nar0) null), new t1r0(true), new s9h1(14, true, false, false), new hgr0(egr0.a, 0, 2)}, false);
    }

    public final cbr0 a() {
        return this.i;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(1689733265, new ps11(this, (byte) 17), true));
    }
}
