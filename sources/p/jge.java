package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jge extends gge {
    public final xu30 e;

    public jge(xu30 xu30Var, mr20 mr20Var, o8n o8nVar, int i, int i2) {
        super(i, i2, o8nVar, mr20Var);
        this.e = xu30Var;
    }

    @Override // p.age
    public final age h(o8n o8nVar, int i, int i2) {
        return new jge(this.e, this.d, o8nVar, i, i2);
    }

    @Override // p.gge
    public final Object k(vr20 vr20Var, lnm lnmVar) {
        Object objS = smo1.s(new zfe(this, vr20Var, null), lnmVar);
        return objS == d9n.a ? objS : rih1.a;
    }
}
