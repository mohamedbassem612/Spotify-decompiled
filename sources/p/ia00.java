package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ia00 implements rqw {
    public final String a;
    public final zu30 b;
    public final zu30 c;

    public ia00(String str, zu30 zu30Var, zu30 zu30Var2) {
        this.a = str;
        this.b = zu30Var;
        this.c = zu30Var2;
    }

    @Override // p.rqw
    public final op80 a(Object obj, Object obj2, op80 op80Var) {
        int iL = n3o1.l(op80Var);
        n8h1 n8h1Var = (n8h1) this.b.J(obj, obj2, Integer.valueOf(iL), (r6h1) n3o1.k(op80Var).invoke(Integer.valueOf(iL)));
        return j6p1.k(new g3h1(n8h1Var), new h3h1(new s20(n8h1Var, (byte) 25)));
    }

    @Override // p.rqw
    public final Object b(Object obj, Object obj2, Object obj3, op80 op80Var) {
        n3o1.j(this.a, op80Var);
        n8h1 n8h1VarC = op80Var != null ? mno1.C(op80Var) : null;
        if (n8h1VarC == null) {
            n8h1VarC = null;
        }
        if (n8h1VarC != null) {
            return (w7h1) this.c.J(n8h1VarC, obj, obj2, obj3);
        }
        return null;
    }

    @Override // p.rqw
    public final boolean c(Object obj, Object obj2, op80 op80Var) {
        n8h1 n8h1VarC = op80Var != null ? mno1.C(op80Var) : null;
        n8h1 n8h1Var = n8h1VarC != null ? n8h1VarC : null;
        if (n8h1Var != null) {
            return (n8h1Var instanceof p8h1) || (n8h1Var instanceof o8h1);
        }
        return false;
    }

    @Override // p.rqw
    public final Object d(Object obj, Object obj2, op80 op80Var) {
        n3o1.j(this.a, op80Var);
        n8h1 n8h1VarC = op80Var != null ? mno1.C(op80Var) : null;
        if (n8h1VarC == null) {
            n8h1VarC = null;
        }
        if (n8h1VarC instanceof p8h1) {
            return ((p8h1) n8h1VarC).e();
        }
        if (n8h1VarC instanceof o8h1) {
            return ((o8h1) n8h1VarC).e();
        }
        return null;
    }
}
