package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s1n0 implements xnn0 {
    public final /* synthetic */ t1n0 a;

    public s1n0(t1n0 t1n0Var) {
        this.a = t1n0Var;
    }

    @Override // p.xnn0
    public final void a(car0 car0Var) {
        boolean z = car0Var instanceof x9r0;
        t1n0 t1n0Var = this.a;
        if (z) {
            x9r0 x9r0Var = (x9r0) car0Var;
            if (x9r0Var.c == null) {
                car0Var = x9r0.a(x9r0Var, t1n0Var.c());
            }
        }
        knn0 knn0Var = t1n0Var.b2;
        if (knn0Var != null) {
            knn0Var.a(car0Var);
        }
    }
}
