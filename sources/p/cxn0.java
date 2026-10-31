package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cxn0 implements bbr0, o2q0 {
    public final mmo a;
    public final end0 b = new end0();

    public cxn0(mmo mmoVar) {
        this.a = mmoVar;
    }

    @Override // p.o2q0
    public final void b(String str, zf30 zf30Var) {
        kdn0 kdn0Var = this.b.a;
        e6w0 e6w0VarK = this.a.k();
        if (e6w0VarK == null) {
            e6w0VarK = a6w0.a;
        }
        kdn0Var.m(new f6w0(e6w0VarK));
    }

    @Override // p.bbr0
    public final war0 b0(Class cls) {
        end0 end0Var = cls.equals(f6w0.class) ? this.b : null;
        end0 end0Var2 = end0Var != null ? end0Var : null;
        return end0Var2 == null ? new end0() : end0Var2;
    }
}
