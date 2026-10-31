package p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xrn1 implements yqn1 {
    public final mxa1 a;
    public final dmj1 b;
    public final ayh c = sap1.a();

    public xrn1(mxa1 mxa1Var, dmj1 dmj1Var) {
        this.a = mxa1Var;
        this.b = dmj1Var;
    }

    public final Object a(jqn1 jqn1Var) {
        return this.c.Q(jqn1Var);
    }

    public final void b() {
        e();
    }

    public final void e() {
        ((AtomicReference) ((utw0) this.a.f).a).set(null);
    }
}
