package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class n3x implements i3x {
    public yx70 b;
    public oxe1 c;
    public gt40 a = et40.a;
    public int d = 1;

    @Override // p.i3x
    public final i3x a() {
        n3x n3xVar = new n3x();
        n3xVar.a = this.a;
        n3xVar.b = this.b;
        n3xVar.c = this.c;
        n3xVar.d = this.d;
        return n3xVar;
    }

    @Override // p.i3x
    public final gt40 b() {
        return this.a;
    }

    @Override // p.i3x
    public final void c(gt40 gt40Var) {
        this.a = gt40Var;
    }

    public final oxe1 d() {
        return this.c;
    }

    public final int e() {
        return this.d;
    }

    public final String toString() {
        return "EmittableImage(modifier=" + this.a + ", provider=" + this.b + ", colorFilterParams=" + this.c + ", contentScale=" + ((Object) i6m.c(this.d)) + ')';
    }
}
