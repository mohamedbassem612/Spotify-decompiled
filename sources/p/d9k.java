package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d9k implements rqw {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xpw b;

    public /* synthetic */ d9k(xpw xpwVar, byte b) {
        this.a = b;
        this.b = xpwVar;
    }

    public final op80 a(Object obj, Object obj2, op80 op80Var) {
        iu30 iu30Var;
        byte b = this.a;
        xpw xpwVar = this.b;
        switch (b) {
            case 0:
                f9k f9kVar = (f9k) obj;
                a9k a9kVar = (a9k) obj2;
                Integer numN = l0o1.n(op80Var);
                boolean z = false;
                int iIntValue = numN != null ? numN.intValue() : 0;
                h3h1 h3h1VarC = j0o1.C(op80Var);
                if (h3h1VarC == null || (iu30Var = h3h1VarC.b) == null) {
                    iu30Var = c6k.c;
                }
                pt ptVar = (pt) xpwVar;
                ptVar.h = new z0e(iu30Var, iIntValue, (byte) 2);
                ptVar.i = new b30((byte) 6, iIntValue, iu30Var, z);
                return ((ia00) ptVar.b).a(f9kVar, a9kVar, op80Var);
            case 1:
                uca0 uca0Var = (uca0) obj;
                return ((pzw) xpwVar).e(uca0Var).a(uca0Var, (xca0) obj2, op80Var);
            default:
                dvk1 dvk1Var = (dvk1) obj;
                syk1 syk1Var = (syk1) obj2;
                ia00 ia00VarE = e(syk1Var);
                if (ia00VarE != null) {
                    return ia00VarE.a(dvk1Var, syk1Var, op80Var);
                }
                return null;
        }
    }

    public final Object b(Object obj, Object obj2, Object obj3, op80 op80Var) {
        Object objInvoke;
        byte b = this.a;
        xpw xpwVar = this.b;
        switch (b) {
            case 0:
                f9k f9kVar = (f9k) obj;
                a9k a9kVar = (a9k) obj2;
                z8k z8kVar = (z8k) obj3;
                pt ptVar = (pt) xpwVar;
                b30 b30Var = (b30) ptVar.i;
                return (b30Var == null || (objInvoke = b30Var.invoke(a9kVar, z8kVar)) == null) ? ((ia00) ptVar.b).b(f9kVar, a9kVar, z8kVar, op80Var) : objInvoke;
            case 1:
                uca0 uca0Var = (uca0) obj;
                return ((pzw) xpwVar).e(uca0Var).b(uca0Var, (xca0) obj2, (tca0) obj3, op80Var);
            default:
                dvk1 dvk1Var = (dvk1) obj;
                syk1 syk1Var = (syk1) obj2;
                yuk1 yuk1Var = (yuk1) obj3;
                ia00 ia00VarE = e(syk1Var);
                if (ia00VarE != null) {
                    return ia00VarE.b(dvk1Var, syk1Var, yuk1Var, op80Var);
                }
                return null;
        }
    }

    public final boolean c(Object obj, Object obj2, op80 op80Var) {
        byte b = this.a;
        xpw xpwVar = this.b;
        switch (b) {
            case 0:
                a9k a9kVar = (a9k) obj2;
                return a9kVar.g != null && ((ia00) ((pt) xpwVar).b).c((f9k) obj, a9kVar, op80Var);
            case 1:
                uca0 uca0Var = (uca0) obj;
                return ((pzw) xpwVar).e(uca0Var).c(uca0Var, (xca0) obj2, op80Var);
            default:
                dvk1 dvk1Var = (dvk1) obj;
                syk1 syk1Var = (syk1) obj2;
                ia00 ia00VarE = e(syk1Var);
                if (ia00VarE != null) {
                    return ia00VarE.c(dvk1Var, syk1Var, op80Var);
                }
                return false;
        }
    }

    public final Object d(Object obj, Object obj2, op80 op80Var) {
        byte b = this.a;
        xpw xpwVar = this.b;
        switch (b) {
            case 0:
                f9k f9kVar = (f9k) obj;
                a9k a9kVar = (a9k) obj2;
                pt ptVar = (pt) xpwVar;
                if (a9kVar.g == null) {
                    return null;
                }
                z0e z0eVar = (z0e) ptVar.h;
                return z0eVar != null ? z0eVar.invoke(a9kVar) : ((ia00) ptVar.b).d(f9kVar, a9kVar, op80Var);
            case 1:
                uca0 uca0Var = (uca0) obj;
                return ((pzw) xpwVar).e(uca0Var).d(uca0Var, (xca0) obj2, op80Var);
            default:
                dvk1 dvk1Var = (dvk1) obj;
                syk1 syk1Var = (syk1) obj2;
                ia00 ia00VarE = e(syk1Var);
                if (ia00VarE != null) {
                    return ia00VarE.d(dvk1Var, syk1Var, op80Var);
                }
                return null;
        }
    }

    public ia00 e(syk1 syk1Var) {
        if (syk1Var.equals(ryk1.a)) {
            return null;
        }
        if (!(syk1Var instanceof qyk1)) {
            eg.o();
            return null;
        }
        int i = ((qyk1) syk1Var).f;
        tuk1 tuk1Var = this.b;
        return i == 1 ? tuk1Var.X : tuk1Var.Y;
    }
}
