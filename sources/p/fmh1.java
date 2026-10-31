package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fmh1 implements dmh1 {
    public final qua0 a;
    public final zjd1 b;
    public final wla1 c;

    public fmh1(qua0 qua0Var) {
        this.a = qua0Var;
        zjd1 zjd1VarD = qua0Var.d();
        this.b = zjd1VarD;
        this.c = new wla1(zjd1VarD);
    }

    @Override // p.dmh1
    public final void b(ses0 ses0Var) {
        this.a.b(ses0Var);
    }

    @Override // p.dmh1
    public final cmh1 c(iu30 iu30Var) {
        pua0 pua0VarC = this.a.c(new rzf1(iu30Var, this, (byte) 15));
        return new emh1(this, new hcf1(pua0VarC, (byte) 13), new k6g1(pua0VarC, (lnm) null, (byte) 14), new hcf1(pua0VarC, (byte) 14), new sjf1(pua0VarC));
    }

    @Override // p.dmh1
    public final yla1 e() {
        return this.c;
    }
}
