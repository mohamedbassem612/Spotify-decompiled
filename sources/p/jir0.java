package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jir0 implements xnn0 {
    public final xnn0 a;
    public nir0 b;
    public oir0 c;

    public jir0(xnn0 xnn0Var) {
        this.a = xnn0Var;
    }

    @Override // p.xnn0
    public final void a(car0 car0Var) {
        oir0 oir0Var = this.c;
        if (oir0Var != null) {
            oir0Var.b.addLast(car0Var);
            return;
        }
        nir0 nir0Var = this.b;
        if (car0Var instanceof x9r0) {
            x9r0 x9r0Var = (x9r0) car0Var;
            if (x9r0Var.c == null && nir0Var != null) {
                car0Var = x9r0.a(x9r0Var, nir0Var.c());
            }
        }
        this.a.a(car0Var);
    }
}
