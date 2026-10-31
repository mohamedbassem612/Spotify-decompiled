package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class it01 implements rqw {
    public static ryl0 e(aw01 aw01Var, vv01 vv01Var, op80 op80Var) {
        r6h1 r6h1Var;
        h3h1 h3h1VarC;
        iu30 iu30Var;
        Integer numN;
        int iIntValue = (op80Var == null || (numN = l0o1.n(op80Var)) == null) ? 0 : numN.intValue();
        if (op80Var == null || (h3h1VarC = j0o1.C(op80Var)) == null || (iu30Var = h3h1VarC.b) == null || (r6h1Var = (r6h1) iu30Var.invoke(Integer.valueOf(iIntValue))) == null) {
            r6h1Var = r6h1.c;
        }
        return new ryl0(Integer.valueOf(iIntValue), vv01Var.g() ? "has_sponsorship" : null, zxo1.s(aw01Var.b), r6h1Var);
    }

    public final Object b(Object obj, Object obj2, Object obj3, op80 op80Var) {
        uv01 uv01Var = (uv01) obj3;
        vv01 vv01Var = (zv01) obj2;
        ryl0 ryl0VarE = e((aw01) obj, vv01Var, op80Var);
        if (uv01Var.equals(sv01.a)) {
            return ryl0VarE.a(vv01Var.d());
        }
        if (uv01Var.equals(tv01.a)) {
            return ryl0VarE.g();
        }
        eg.o();
        return null;
    }

    public final boolean c(Object obj, Object obj2, op80 op80Var) {
        return ((zv01) obj2) instanceof vv01;
    }

    public final Object d(Object obj, Object obj2, op80 op80Var) {
        aw01 aw01Var = (aw01) obj;
        vv01 vv01Var = (zv01) obj2;
        vv01 vv01Var2 = vv01Var instanceof vv01 ? vv01Var : null;
        if (vv01Var2 == null) {
            return null;
        }
        return e(aw01Var, vv01Var2, op80Var).e();
    }
}
