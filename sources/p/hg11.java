package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hg11 extends x980 {
    public final /* synthetic */ jg11 d;

    public hg11(jg11 jg11Var) {
        this.d = jg11Var;
    }

    public final boolean contains(Object obj) {
        return this.d.contains(obj);
    }

    @Override // p.x980
    public final Object get(int i) {
        gfp0 gfp0Var = this.d.e;
        dm5.q(i, gfp0Var.c);
        return gfp0Var.a[i];
    }

    public final boolean i() {
        return true;
    }

    public final int size() {
        return this.d.e.c;
    }

    @Override // p.x980
    public Object writeReplace() {
        return super.writeReplace();
    }
}
