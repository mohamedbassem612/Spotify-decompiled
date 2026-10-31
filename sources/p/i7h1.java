package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i7h1 implements rqw {
    public final /* synthetic */ zu30 a;
    public final /* synthetic */ zu30 b;

    public i7h1(zu30 zu30Var, zu30 zu30Var2) {
        this.a = zu30Var;
        this.b = zu30Var2;
    }

    @Override // p.rqw
    public final Object b(Object obj, Object obj2, Object obj3, op80 op80Var) {
        int iL = n3o1.l(op80Var);
        return this.b.J(this.a.J(obj, obj2, Integer.valueOf(iL), n3o1.k(op80Var).invoke(Integer.valueOf(iL))), obj, obj2, obj3);
    }

    @Override // p.rqw
    public final boolean c(Object obj, Object obj2, op80 op80Var) {
        n8h1 n8h1VarC = op80Var != null ? mno1.C(op80Var) : null;
        return (n8h1VarC instanceof p8h1) || (n8h1VarC instanceof o8h1);
    }

    @Override // p.rqw
    public final Object d(Object obj, Object obj2, op80 op80Var) {
        int iL = n3o1.l(op80Var);
        Object objJ = this.a.J(obj, obj2, Integer.valueOf(iL), n3o1.k(op80Var).invoke(Integer.valueOf(iL)));
        if (objJ instanceof p8h1) {
            return ((p8h1) objJ).e();
        }
        if (objJ instanceof o8h1) {
            return ((o8h1) objJ).e();
        }
        return null;
    }
}
