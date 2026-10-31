package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class una implements tna {
    public final l1p0 a;
    public final rma b;
    public final ynb0 c;

    public una(l1p0 l1p0Var, rma rmaVar, ynb0 ynb0Var) {
        this.a = l1p0Var;
        this.b = rmaVar;
        this.c = ynb0Var;
    }

    @Override // p.tna
    public final void a(String str, upa0 upa0Var) {
        ie30 ie30VarG = upa0Var.g();
        if (ie30VarG == null) {
            return;
        }
        e8c0 e8c0Var = this.b.a().b;
        tym0 tym0VarA = this.a.a(hon1.x(str) ? e8c0Var.a : e8c0Var.b);
        try {
            byte[] bArrD = tym0VarA.d(ie30VarG);
            vna vnaVar = (vna) this.c.get();
            b8c0 b8c0Var = new b8c0(bArrD);
            btp0 btp0VarU = vnaVar.a.u();
            qyo1.x(btp0VarU.a, false, true, new j9n0(btp0VarU, new ctp0[]{new ctp0(str, b8c0Var.a())}, (byte) 27));
        } finally {
            tym0VarA.k();
        }
    }
}
