package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zus0 implements rqw {
    public final /* synthetic */ byte a;

    public final op80 a(Object obj, Object obj2, op80 op80Var) {
        r6h1 r6h1Var;
        sqk0 sqk0Var;
        iu30 iu30Var;
        switch (this.a) {
            case 0:
                ysk0 ysk0VarC = mno1.C(op80Var);
                ysk0 ysk0Var = ysk0VarC instanceof ysk0 ? ysk0VarC : null;
                if (ysk0Var == null) {
                    return null;
                }
                xsk0 xsk0Var = new xsk0(ysk0Var);
                g3h1 g3h1Var = new g3h1(xsk0Var);
                h3h1 h3h1Var = new h3h1(new fgs0(xsk0Var, (byte) 3));
                op80 wchVar = q6x.b;
                if (!g3h1Var.equals(wchVar) || !h3h1Var.equals(wchVar)) {
                    if (g3h1Var.equals(wchVar)) {
                        return h3h1Var;
                    }
                    if (h3h1Var.equals(wchVar)) {
                        return g3h1Var;
                    }
                    wchVar = new wch(g3h1Var, h3h1Var);
                }
                return wchVar;
            default:
                pth1 pth1Var = (pth1) obj;
                n8h1 n8h1VarC = mno1.C(op80Var);
                lfl0 lfl0Var = n8h1VarC instanceof lfl0 ? (lfl0) n8h1VarC : null;
                if (lfl0Var != null) {
                    sqk0Var = new sqk0(lfl0Var);
                } else {
                    Integer numN = l0o1.n(op80Var);
                    int iIntValue = numN != null ? numN.intValue() : 0;
                    h3h1 h3h1VarC = j0o1.C(op80Var);
                    if (h3h1VarC == null || (iu30Var = h3h1VarC.b) == null || (r6h1Var = (r6h1) iu30Var.invoke(Integer.valueOf(iIntValue))) == null) {
                        r6h1Var = r6h1.c;
                    }
                    String str = pth1Var.b;
                    String str2 = pth1Var.c;
                    if (ihc1.y0(str)) {
                        str = str2;
                    }
                    sqk0Var = new sqk0(new lfl0(str, str2, pth1Var.a, r6h1Var));
                }
                g3h1 g3h1Var2 = new g3h1(sqk0Var);
                h3h1 h3h1Var2 = new h3h1(new ymg1(sqk0Var, (byte) 17));
                op80 wchVar2 = q6x.b;
                if (!g3h1Var2.equals(wchVar2) || !h3h1Var2.equals(wchVar2)) {
                    if (g3h1Var2.equals(wchVar2)) {
                        return h3h1Var2;
                    }
                    if (h3h1Var2.equals(wchVar2)) {
                        return g3h1Var2;
                    }
                    wchVar2 = new wch(g3h1Var2, h3h1Var2);
                }
                return wchVar2;
        }
    }

    public final Object b(Object obj, Object obj2, Object obj3, op80 op80Var) {
        switch (this.a) {
            case 0:
                xus0 xus0Var = (xus0) obj3;
                n8h1 n8h1VarC = op80Var != null ? mno1.C(op80Var) : null;
                xsk0 xsk0Var = n8h1VarC instanceof xsk0 ? (xsk0) n8h1VarC : null;
                if (xsk0Var == null) {
                    return null;
                }
                r6h1 r6h1Var = xsk0Var.b.a;
                y6h1 y6h1Var = xsk0Var.a;
                boolean z = xus0Var instanceof vus0;
                b7x b7xVar = b7x.a;
                if (z) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("continue_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", ((vus0) xus0Var).a)), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
                }
                if (!xus0Var.equals(wus0.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC2 = y6h1Var.c();
                x6h1VarC2.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
            default:
                return null;
        }
    }

    public final Object d(Object obj, Object obj2, op80 op80Var) {
        switch (this.a) {
            case 0:
                n8h1 n8h1VarC = op80Var != null ? mno1.C(op80Var) : null;
                xsk0 xsk0Var = n8h1VarC instanceof xsk0 ? (xsk0) n8h1VarC : null;
                if (xsk0Var != null) {
                    return xsk0Var.e();
                }
                return null;
            default:
                n8h1 n8h1VarC2 = op80Var != null ? mno1.C(op80Var) : null;
                if (n8h1VarC2 instanceof p8h1) {
                    return ((p8h1) n8h1VarC2).e();
                }
                if (n8h1VarC2 instanceof o8h1) {
                    return ((o8h1) n8h1VarC2).e();
                }
                return null;
        }
    }
}
