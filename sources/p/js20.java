package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class js20 implements mqw {
    public final iu30 a;
    public final iu30 b;
    public final vu30 c;
    public final qtr d;
    public final boolean e;
    public final o8n f;
    public final boolean g;

    public js20(iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var, qtr qtrVar, boolean z, o8n o8nVar, boolean z2) {
        this.a = iu30Var;
        this.b = iu30Var2;
        this.c = vu30Var;
        this.d = qtrVar;
        this.e = z;
        this.f = o8nVar;
        this.g = z2;
    }

    @Override // p.mqw
    public final lqw a(Object obj, ipb1 ipb1Var) {
        return new is20(this, obj, (h141) ipb1Var);
    }

    @Override // p.mqw
    public final mc41 c() {
        mc41 mc41VarA = this.d.a();
        return mc41VarA == null ? new o7x() : mc41VarA;
    }

    @Override // p.mqw
    public final Object d(Object obj) {
        return this.b.invoke(obj);
    }
}
