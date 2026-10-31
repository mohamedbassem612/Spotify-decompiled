package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class ezq0 extends q9r implements dzq0 {
    public final kf30 f;
    public final String g;

    /* JADX WARN: Illegal instructions before constructor call */
    public ezq0(zim0 zim0Var, kf30 kf30Var) {
        eg5 eg5Var = rzs0.g;
        lf30 lf30Var = kf30Var.a;
        super(zim0Var, eg5Var, lf30Var.c() ? lf30.e : lf30Var.g(), mka1.m0);
        this.f = kf30Var;
        this.g = "package " + kf30Var + " of " + zim0Var;
    }

    @Override // p.q9r, p.p9r
    public mka1 getSource() {
        return mka1.m0;
    }

    @Override // p.q9r, p.n9r
    public final n9r k() {
        return (zim0) super.k();
    }

    @Override // p.n9r
    public final Object r(r9r r9rVar, Object obj) {
        return r9rVar.D(this, obj);
    }

    @Override // p.o9r
    public String toString() {
        return this.g;
    }

    public final zim0 x1() {
        return (zim0) super.k();
    }
}
