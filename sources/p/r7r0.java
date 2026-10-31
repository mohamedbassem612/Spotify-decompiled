package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r7r0 implements bbr0 {
    public final /* synthetic */ s7r0 a;

    public r7r0(s7r0 s7r0Var) {
        this.a = s7r0Var;
    }

    @Override // p.bbr0
    public final war0 b0(Class cls) {
        s7r0 s7r0Var = this.a;
        cbr0 cbr0VarA = s7r0Var.i;
        if (cbr0VarA == null) {
            h0r0 h0r0Var = s7r0Var.k;
            cbr0VarA = h0r0Var != null ? h0r0Var.a() : null;
            if (cbr0VarA == null) {
                cbr0 cbr0Var = cbr0.c;
                cbr0VarA = crn1.p();
            }
        }
        return cbr0VarA.b0(cls);
    }
}
