package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dub0 extends o9r {
    public static final /* synthetic */ mma0[] i = {new cey0(dub0.class, "fragments", "getFragments()Ljava/util/List;", 0), new cey0(dub0.class, "empty", "getEmpty()Z", 0)};
    public final ajm0 d;
    public final kf30 e;
    public final toe0 f;
    public final toe0 g;
    public final iub0 h;

    /* JADX WARN: Illegal instructions before constructor call */
    public dub0(ajm0 ajm0Var, kf30 kf30Var, voe0 voe0Var) {
        eg5 eg5Var = rzs0.g;
        lf30 lf30Var = kf30Var.a;
        super(eg5Var, lf30Var.c() ? lf30.e : lf30Var.g());
        this.d = ajm0Var;
        this.e = kf30Var;
        this.f = new toe0(voe0Var, new cub0(this, (byte) 0));
        this.g = new toe0(voe0Var, new cub0(this, (byte) 1));
        this.h = new iub0(voe0Var, new cub0(this, (byte) 2));
    }

    public final boolean equals(Object obj) {
        dub0 dub0Var = obj instanceof dub0 ? (dub0) obj : null;
        return dub0Var != null && u890.j(this.e, dub0Var.e) && u890.j(this.d, dub0Var.d);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    @Override // p.n9r
    public final n9r k() {
        kf30 kf30Var = this.e;
        if (kf30Var.a.c()) {
            return null;
        }
        return this.d.D(kf30Var.b());
    }

    @Override // p.n9r
    public final Object r(r9r r9rVar, Object obj) {
        return r9rVar.B(this, obj);
    }
}
