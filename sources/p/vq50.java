package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vq50 implements od10, u811 {
    public final ynb1 a;
    public boolean b;
    public tq50 c;
    public int d = -1;
    public int e = -1;
    public float f = 0.0f;
    public String g;

    public vq50(ynb1 ynb1Var) {
        this.a = ynb1Var;
    }

    @Override // p.u811
    public final void a(cjl cjlVar) {
        if (cjlVar instanceof tq50) {
            this.c = (tq50) cjlVar;
        } else {
            this.c = null;
        }
    }

    @Override // p.od10
    public final void apply() {
        this.c.X(this.b ? 1 : 0);
        int i = this.d;
        if (i != -1) {
            tq50 tq50Var = this.c;
            if (i <= -1) {
                tq50Var.getClass();
                return;
            }
            tq50Var.u0 = -1.0f;
            tq50Var.v0 = i;
            tq50Var.w0 = -1;
            return;
        }
        int i2 = this.e;
        tq50 tq50Var2 = this.c;
        if (i2 != -1) {
            if (i2 <= -1) {
                tq50Var2.getClass();
                return;
            }
            tq50Var2.u0 = -1.0f;
            tq50Var2.v0 = -1;
            tq50Var2.w0 = i2;
            return;
        }
        float f = this.f;
        if (f <= -1.0f) {
            tq50Var2.getClass();
            return;
        }
        tq50Var2.u0 = f;
        tq50Var2.v0 = -1;
        tq50Var2.w0 = -1;
    }

    @Override // p.u811
    public final cjl b() {
        tq50 tq50Var = this.c;
        if (tq50Var != null) {
            return tq50Var;
        }
        tq50 tq50Var2 = new tq50();
        this.c = tq50Var2;
        return tq50Var2;
    }

    @Override // p.u811
    public final od10 c() {
        return null;
    }

    public final void d(Float f) {
        this.d = -1;
        this.e = this.a.c(f);
        this.f = 0.0f;
    }

    public final void e(float f) {
        this.d = -1;
        this.e = -1;
        this.f = f;
    }

    public final void f(Float f) {
        this.d = this.a.c(f);
        this.e = -1;
        this.f = 0.0f;
    }

    @Override // p.u811
    public final Object getKey() {
        return this.g;
    }
}
