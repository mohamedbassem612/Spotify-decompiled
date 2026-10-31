package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bmh1 {
    public final float a;
    public final c9n b;
    public final hnf c;
    public final drr0 d = new drr0(0.0f);
    public xab1 e;
    public boolean f;

    public bmh1(float f, c9n c9nVar, hnf hnfVar) {
        this.a = f;
        this.b = c9nVar;
        this.c = hnfVar;
    }

    public final void a(float f) {
        drr0 drr0Var = this.d;
        float fS = drr0Var.s() + f;
        float f2 = this.a;
        drr0Var.t(yoi1.o(fS, -f2, f2));
        if (this.f || Math.abs(drr0Var.s()) != f2) {
            return;
        }
        this.f = true;
        this.c.invoke();
    }
}
