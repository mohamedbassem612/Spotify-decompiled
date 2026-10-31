package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q1c0 implements b1c0 {
    public final kdn0 a = new kdn0();

    @Override // p.war0
    public final dbr0 a() {
        return (qod1) this.a.e();
    }

    @Override // p.o2q0
    public final void b(String str, zf30 zf30Var) {
        boolean z = zf30Var instanceof ug30;
        kdn0 kdn0Var = this.a;
        if (!z) {
            kdn0Var.m((Object) null);
        } else {
            String strS = ((ug30) zf30Var).s();
            kdn0Var.m(strS != null ? new qod1(strS) : null);
        }
    }

    @Override // p.war0
    public final void c(rjp0 rjp0Var) {
        this.a.k(rjp0Var);
    }

    @Override // p.war0
    public final void d(rjp0 rjp0Var) {
        this.a.g(rjp0Var);
    }
}
