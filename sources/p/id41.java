package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class id41 implements ky11 {
    public cf41 a;
    public nd41 b;
    public String c;
    public Object d;
    public Object[] e;
    public md41 f;
    public final ww21 g = new ww21(this, (byte) 2);

    public id41(cf41 cf41Var, nd41 nd41Var, String str, Object obj, Object[] objArr) {
        this.a = cf41Var;
        this.b = nd41Var;
        this.c = str;
        this.d = obj;
        this.e = objArr;
    }

    public final void a() {
        nd41 nd41Var = this.b;
        md41 md41Var = this.f;
        if (md41Var != null) {
            bhn0.k("entry(", md41Var, ") is not null");
        } else if (nd41Var != null) {
            ww21 ww21Var = this.g;
            k5p1.k(nd41Var, ww21Var.invoke());
            this.f = nd41Var.a(this.c, ww21Var);
        }
    }

    @Override // p.ky11
    public final void b() {
        a();
    }

    @Override // p.ky11
    public final void f() {
        md41 md41Var = this.f;
        if (md41Var != null) {
            md41Var.unregister();
        }
    }

    @Override // p.ky11
    public final void h() {
        md41 md41Var = this.f;
        if (md41Var != null) {
            md41Var.unregister();
        }
    }
}
