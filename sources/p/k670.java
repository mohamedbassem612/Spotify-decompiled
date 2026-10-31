package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k670 {
    public v570 a;
    public vd70 b;
    public de70 c;
    public e670 d;
    public c670 e;
    public e670 f;
    public n570 g;
    public aj20 h;
    public boolean i;

    public final l670 a() {
        n570 n570Var = this.g;
        if (n570Var != null) {
            return new l670(this.a, this.b, this.e, this.d, this.f, this.c, n570Var, this.h, this.i);
        }
        eg.m("No fallback binder set!");
        return null;
    }

    public final void b(int i, String str, n570 n570Var) {
        c(w361.r(i, n570Var));
        d(d670.single(str, i));
    }

    public final void c(c670... c670VarArr) {
        this.e = w361.p(new c670[]{this.e, w361.p(c670VarArr)});
    }

    public final void d(e670 e670Var) {
        e670Var.getClass();
        e670 e670VarWithFallback = d670.withFallback(e670Var, this.d);
        e670VarWithFallback.getClass();
        this.d = e670VarWithFallback;
    }
}
