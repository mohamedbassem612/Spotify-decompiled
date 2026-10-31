package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xod implements y0h1 {
    public final y0h1 a;
    public final n9r b;
    public final int c;

    public xod(y0h1 y0h1Var, n9r n9rVar, int i) {
        this.a = y0h1Var;
        this.b = n9rVar;
        this.c = i;
    }

    @Override // p.y0h1
    public final s1c1 J() {
        return this.a.J();
    }

    @Override // p.y0h1
    public final boolean N() {
        return true;
    }

    @Override // p.jfg
    /* JADX INFO: renamed from: a */
    public final jfg w1() {
        return this.a.w1();
    }

    @Override // p.y0h1, p.jfg
    public final h0h1 g() {
        return this.a.g();
    }

    public final fg5 getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // p.y0h1
    public final int getIndex() {
        return this.a.getIndex() + this.c;
    }

    @Override // p.n9r
    public final ajn0 getName() {
        return this.a.getName();
    }

    @Override // p.p9r
    public final mka1 getSource() {
        return this.a.getSource();
    }

    @Override // p.y0h1
    public final List getUpperBounds() {
        return this.a.getUpperBounds();
    }

    @Override // p.n9r
    public final n9r k() {
        return this.b;
    }

    @Override // p.jfg
    public final qx81 m() {
        return this.a.m();
    }

    @Override // p.n9r
    public final Object r(r9r r9rVar, Object obj) {
        return this.a.r(r9rVar, obj);
    }

    public final String toString() {
        return this.a + "[inner-copy]";
    }

    @Override // p.y0h1
    public final boolean u() {
        return this.a.u();
    }

    @Override // p.y0h1
    public final int x() {
        return this.a.x();
    }

    @Override // p.n9r, p.jfg
    /* JADX INFO: renamed from: a */
    public final n9r w1() {
        return this.a.w1();
    }

    @Override // p.y0h1, p.jfg
    /* JADX INFO: renamed from: a */
    public final y0h1 w1() {
        return this.a.w1();
    }
}
