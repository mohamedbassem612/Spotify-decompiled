package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qmo implements bbr0, o2q0 {
    public zf30 b;
    public final o5t a = new o5t();
    public final ek2 c = new ek2(this, (byte) 6);

    public final void a() {
        bbr0 bbr0Var = this.b;
        if (!(bbr0Var instanceof bbr0) || !((zf30) bbr0Var).s1.i.a(w8c0.c)) {
            bbr0Var = null;
        }
        o5t o5tVar = this.a;
        if (o5tVar.a() != bbr0Var) {
            o5tVar.b(bbr0Var);
        }
    }

    @Override // p.o2q0
    public final void b(String str, zf30 zf30Var) {
        tac0 tac0Var;
        zf30 zf30Var2 = this.b;
        ek2 ek2Var = this.c;
        if (zf30Var2 != null && (tac0Var = zf30Var2.s1) != null) {
            tac0Var.d(ek2Var);
        }
        this.b = zf30Var;
        a();
        if (zf30Var instanceof bbr0) {
            zf30Var.s1.a(ek2Var);
        }
    }

    @Override // p.bbr0
    public final war0 b0(Class cls) {
        return this.a.b0(cls);
    }
}
