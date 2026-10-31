package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t1c0 implements b1c0 {
    public final mmo a;
    public final fai0 b;

    public t1c0(mmo mmoVar) {
        this.a = mmoVar;
        this.b = w6d1.h(w6d1.q(mmoVar.d(), k8b0.d));
    }

    @Override // p.war0
    public final dbr0 a() {
        String str = (String) this.a.d().e();
        if (str != null) {
            return new yxe1(new ehc1(str));
        }
        return null;
    }

    @Override // p.war0
    public final void c(rjp0 rjp0Var) {
        this.b.k(rjp0Var);
    }

    @Override // p.war0
    public final void d(rjp0 rjp0Var) {
        this.b.g(rjp0Var);
    }

    @Override // p.o2q0
    public final void b(String str, zf30 zf30Var) {
    }
}
