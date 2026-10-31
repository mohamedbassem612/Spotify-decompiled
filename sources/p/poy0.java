package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class poy0 implements mqw {
    public final iu30 a;
    public final iu30 b;
    public final vu30 c;
    public final qtr d;
    public final boolean e;
    public final o8n f;

    public poy0(iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var, qtr qtrVar, boolean z, o8n o8nVar) {
        this.a = iu30Var;
        this.b = iu30Var2;
        this.c = vu30Var;
        this.d = qtrVar;
        this.e = z;
        this.f = o8nVar;
    }

    public final lqw a(Object obj, ipb1 ipb1Var) {
        return new is20(this, obj, (h141) ipb1Var);
    }

    public final mc41 c() {
        rm5 rm5Var = this.d.g;
        return rm5Var == null ? new o7x() : rm5Var;
    }

    public final Object d(Object obj) {
        return this.b.invoke(obj);
    }
}
