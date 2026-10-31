package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kpg0 implements xpw {
    public final xpw a;
    public final iu30 b;

    public kpg0(xpw xpwVar, iu30 iu30Var) {
        this.a = xpwVar;
        this.b = iu30Var;
    }

    @Override // p.avl1
    public final rqw a() {
        return y9g1.r(this.a.a(), this.b);
    }

    @Override // p.maa
    public final String b() {
        return this.a.b();
    }

    @Override // p.maa
    public final jsw c() {
        return this.a.c();
    }

    @Override // p.maa
    public final mqw getBehavior() {
        return y9g1.q(this.a.getBehavior(), this.b);
    }
}
