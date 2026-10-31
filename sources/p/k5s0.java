package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k5s0 implements x9l {
    public final z341 a;
    public final String b;
    public final vu30 c;
    public final idd1 d = new idd1(new g24(this, (byte) 6));

    public k5s0(z341 z341Var, String str, vu30 vu30Var) {
        this.a = z341Var;
        this.b = str;
        this.c = vu30Var;
    }

    @Override // p.x9l
    public final Object W(boolean z, vu30 vu30Var, onm onmVar) {
        j5s0 j5s0Var = (j5s0) onmVar.getContext().A(j5s0.b);
        i5s0 i5s0Var = j5s0Var != null ? j5s0Var.a : null;
        if (i5s0Var != null) {
            return vu30Var.invoke(i5s0Var, onmVar);
        }
        i5s0 i5s0Var2 = new i5s0(this.c, (y341) this.d.getValue());
        return c921.H(new j5s0(i5s0Var2), new cto0(vu30Var, i5s0Var2, (lnm) null, (byte) 24), onmVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        idd1 idd1Var = this.d;
        if (idd1Var.isInitialized()) {
            ((y341) idd1Var.getValue()).close();
        }
    }
}
