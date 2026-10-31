package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hy00 implements rqw {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final cv30 d;

    public hy00(String str, zu30 zu30Var, zu30 zu30Var2) {
        this.a = (byte) 2;
        this.b = new ia00(str, zu30Var, zu30Var2);
        this.c = str;
        this.d = zu30Var2;
    }

    public final op80 a(Object obj, Object obj2, op80 op80Var) {
        yml0 yml0Var;
        mtl0 mtl0Var;
        byte b = this.a;
        Object obj3 = this.c;
        xu30 xu30Var = this.d;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                yml0 yml0VarC = mno1.C(op80Var);
                yml0Var = yml0VarC instanceof pnl0 ? (pnl0) yml0VarC : null;
                if (yml0Var == null) {
                    return ((ia00) obj3).a(obj, obj2, op80Var);
                }
                n8h1 n8h1Var = (n8h1) xu30Var.invoke(yml0Var, obj, obj2);
                g3h1 g3h1Var = new g3h1(n8h1Var);
                h3h1 h3h1Var = new h3h1(new gy00(n8h1Var, (byte) 0));
                q6x q6xVar = q6x.b;
                if (g3h1Var.equals(q6xVar) && h3h1Var.equals(q6xVar)) {
                    return q6xVar;
                }
                if (g3h1Var.equals(q6xVar)) {
                    return h3h1Var;
                }
                return h3h1Var.equals(q6xVar) ? g3h1Var : new wch(g3h1Var, h3h1Var);
            case 1:
                Integer numN = l0o1.n(op80Var);
                int iIntValue = numN != null ? numN.intValue() : 0;
                yml0 yml0VarC2 = mno1.C(op80Var);
                yml0Var = yml0VarC2 instanceof yml0 ? yml0VarC2 : null;
                if (yml0Var == null) {
                    return ((ia00) ((hy00) obj3).b).a(obj, obj2, op80Var);
                }
                n8h1 n8h1Var2 = (n8h1) ((zu30) xu30Var).J(yml0Var, obj, obj2, Integer.valueOf(iIntValue));
                g3h1 g3h1Var2 = new g3h1(n8h1Var2);
                h3h1 h3h1Var2 = new h3h1(new gy00(n8h1Var2, (byte) 1));
                q6x q6xVar2 = q6x.b;
                if (g3h1Var2.equals(q6xVar2) && h3h1Var2.equals(q6xVar2)) {
                    return q6xVar2;
                }
                if (g3h1Var2.equals(q6xVar2)) {
                    return h3h1Var2;
                }
                return h3h1Var2.equals(q6xVar2) ? g3h1Var2 : new wch(g3h1Var2, h3h1Var2);
            case 2:
                return ((ia00) obj4).a(obj, obj2, op80Var);
            case 3:
                n8h1 n8h1VarC = mno1.C(op80Var);
                if (n8h1VarC instanceof qtl0) {
                    mtl0Var = new mtl0(new ntl0((qtl0) n8h1VarC, ((j7h1) ((j4f1) obj4).b).a));
                } else {
                    mtl0Var = n8h1VarC instanceof ntl0 ? new mtl0((ntl0) n8h1VarC) : null;
                }
                if (mtl0Var == null) {
                    return null;
                }
                Integer numN2 = l0o1.n(op80Var);
                n8h1 n8h1Var3 = (n8h1) xu30Var.invoke(mtl0Var, obj, Integer.valueOf(numN2 != null ? numN2.intValue() : 0));
                g3h1 g3h1Var3 = new g3h1(n8h1Var3);
                h3h1 h3h1Var3 = new h3h1(new gy00(n8h1Var3, (byte) 2));
                op80 wchVar = q6x.b;
                if (!g3h1Var3.equals(wchVar) || !h3h1Var3.equals(wchVar)) {
                    if (g3h1Var3.equals(wchVar)) {
                        return h3h1Var3;
                    }
                    if (h3h1Var3.equals(wchVar)) {
                        return g3h1Var3;
                    }
                    wchVar = new wch(g3h1Var3, h3h1Var3);
                }
                return wchVar;
            default:
                return ((ia00) obj4).a(obj, obj2, op80Var);
        }
    }

    public final Object b(Object obj, Object obj2, Object obj3, op80 op80Var) {
        n8h1 n8h1VarC;
        byte b = this.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                return ((ia00) obj4).b(obj, obj2, obj3, op80Var);
            case 1:
                return ((hy00) obj4).e(obj, obj2, obj3, op80Var);
            case 2:
                return e(obj, obj2, obj3, op80Var);
            case 3:
                if (op80Var == null) {
                    n57.e("InstrumentationEnvironment must not be null in ReadalongLeafInstrumentation. Please make sure you have properly configured the environment.");
                }
                if ((op80Var != null ? mno1.C(op80Var) : null) == null) {
                    n57.e("InstrumentationEnvironment.ubiEventFactory must not be null in ReadalongLeafInstrumentation. Did you forget to add it to your environment?");
                }
                if (op80Var == null || (n8h1VarC = mno1.C(op80Var)) == null) {
                    return null;
                }
                return ((zu30) this.c).J(n8h1VarC, obj, obj2, obj3);
            default:
                return ((ia00) obj4).b(obj, obj2, obj3, op80Var);
        }
    }

    public final boolean c(Object obj, Object obj2, op80 op80Var) {
        n8h1 n8h1VarC;
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return ((ia00) obj3).c(obj, obj2, op80Var);
            case 1:
                return ((ia00) ((hy00) obj3).b).c(obj, obj2, op80Var);
            case 2:
                return ((ia00) obj3).c(obj, obj2, op80Var);
            case 3:
                if (op80Var == null || (n8h1VarC = mno1.C(op80Var)) == null) {
                    return false;
                }
                return (n8h1VarC instanceof p8h1) || (n8h1VarC instanceof o8h1);
            default:
                k1r k1rVar = (k1r) this.d.invoke(obj2);
                k1rVar.getClass();
                return (k1rVar instanceof i1r) && ((ia00) this.c).c(obj, obj2, op80Var);
        }
    }

    public final Object d(Object obj, Object obj2, op80 op80Var) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return ((ia00) obj3).d(obj, obj2, op80Var);
            case 1:
                return ((ia00) ((hy00) obj3).b).d(obj, obj2, op80Var);
            case 2:
                return ((ia00) obj3).d(obj, obj2, op80Var);
            case 3:
                if (op80Var == null) {
                    n57.e("InstrumentationEnvironment must not be null in ReadalongLeafInstrumentation. Please make sure you have properly configured the environment.");
                }
                if ((op80Var != null ? mno1.C(op80Var) : null) == null) {
                    n57.e("InstrumentationEnvironment.ubiEventFactory must not be null in ReadalongLeafInstrumentation. Did you forget to add it to your environment?");
                }
                n8h1 n8h1VarC = op80Var != null ? mno1.C(op80Var) : null;
                if (n8h1VarC instanceof o8h1) {
                    return ((o8h1) n8h1VarC).e();
                }
                if (n8h1VarC instanceof p8h1) {
                    return ((p8h1) n8h1VarC).e();
                }
                return null;
            default:
                return ((ia00) obj3).d(obj, obj2, op80Var);
        }
    }

    public w7h1 e(Object obj, Object obj2, Object obj3, op80 op80Var) {
        n3o1.x((String) this.c, op80Var);
        return (w7h1) this.d.J(op80Var != null ? mno1.C(op80Var) : null, obj, obj2, obj3);
    }

    public hy00(j4f1 j4f1Var, xu30 xu30Var, zu30 zu30Var) {
        this.a = (byte) 3;
        this.b = j4f1Var;
        this.d = xu30Var;
        this.c = zu30Var;
    }

    public /* synthetic */ hy00(rqw rqwVar, cv30 cv30Var, byte b) {
        this.a = b;
        this.c = rqwVar;
        this.d = cv30Var;
        this.b = rqwVar;
    }
}
