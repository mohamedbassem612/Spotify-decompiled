package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qdk implements rqw {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public qdk(n6r0 n6r0Var) {
        this.a = (byte) 1;
        this.b = new i7h1(new u430(n6r0Var, (byte) 0), je20.P0);
    }

    public final op80 a(Object obj, Object obj2, op80 op80Var) {
        iu30 iu30Var;
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                udk udkVar = (udk) obj;
                jdk jdkVar = (jdk) obj2;
                Integer numN = l0o1.n(op80Var);
                boolean z = false;
                int iIntValue = numN != null ? numN.intValue() : 0;
                h3h1 h3h1VarC = j0o1.C(op80Var);
                if (h3h1VarC == null || (iu30Var = h3h1VarC.b) == null) {
                    iu30Var = c6k.U0;
                }
                tdk tdkVar = (tdk) obj3;
                tdkVar.X0 = new z0e(iu30Var, iIntValue, (byte) 3);
                tdkVar.Y0 = new b30((byte) 7, iIntValue, iu30Var, z);
                return tdkVar.Z0.a(udkVar, jdkVar, op80Var);
            case 1:
                return null;
            case 2:
                hba0 hba0Var = (hba0) obj;
                return ((z72) obj3).f(hba0Var).a(hba0Var, (kba0) obj2, op80Var);
            default:
                tda0 tda0Var = (tda0) obj;
                return ((dea0) obj3).h(tda0Var).a(tda0Var, (wda0) obj2, op80Var);
        }
    }

    public final Object b(Object obj, Object obj2, Object obj3, op80 op80Var) {
        Object objInvoke;
        byte b = this.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                udk udkVar = (udk) obj;
                jdk jdkVar = (jdk) obj2;
                ddk ddkVar = (ddk) obj3;
                tdk tdkVar = (tdk) obj4;
                b30 b30Var = tdkVar.Y0;
                return (b30Var == null || (objInvoke = b30Var.invoke(jdkVar, ddkVar)) == null) ? tdkVar.Z0.b(udkVar, jdkVar, ddkVar, op80Var) : objInvoke;
            case 1:
                return ((i7h1) obj4).b((k430) obj, (s430) obj2, (r430) obj3, op80Var);
            case 2:
                hba0 hba0Var = (hba0) obj;
                return ((z72) obj4).f(hba0Var).b(hba0Var, (kba0) obj2, (gba0) obj3, op80Var);
            default:
                tda0 tda0Var = (tda0) obj;
                return ((dea0) obj4).h(tda0Var).b(tda0Var, (wda0) obj2, (sda0) obj3, op80Var);
        }
    }

    public final boolean c(Object obj, Object obj2, op80 op80Var) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                jdk jdkVar = (jdk) obj2;
                return (jdkVar instanceof hdk) && ((tdk) obj3).Z0.c((udk) obj, jdkVar, op80Var);
            case 1:
                return ((i7h1) obj3).c((k430) obj, (s430) obj2, op80Var);
            case 2:
                hba0 hba0Var = (hba0) obj;
                return ((z72) obj3).f(hba0Var).c(hba0Var, (kba0) obj2, op80Var);
            default:
                tda0 tda0Var = (tda0) obj;
                return ((dea0) obj3).h(tda0Var).c(tda0Var, (wda0) obj2, op80Var);
        }
    }

    public final Object d(Object obj, Object obj2, op80 op80Var) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                udk udkVar = (udk) obj;
                jdk jdkVar = (jdk) obj2;
                tdk tdkVar = (tdk) obj3;
                if (!(jdkVar instanceof hdk)) {
                    return null;
                }
                z0e z0eVar = tdkVar.X0;
                return z0eVar != null ? z0eVar.invoke(jdkVar) : tdkVar.Z0.d(udkVar, jdkVar, op80Var);
            case 1:
                return ((i7h1) obj3).d((k430) obj, (s430) obj2, op80Var);
            case 2:
                hba0 hba0Var = (hba0) obj;
                z72 z72Var = (z72) obj3;
                Object objD = z72Var.f(hba0Var).d(hba0Var, (kba0) obj2, op80Var);
                if (hba0Var.b != xea0.LISTENING_ACTIVITY && hba0Var.c) {
                    i8h1 i8h1Var = (i8h1) z72Var.i;
                    bbl0 bbl0Var = (bbl0) z72Var.t;
                    String str = hba0Var.a.a;
                    x6h1 x6h1VarC = bbl0Var.b.c();
                    x6h1VarC.i.add(new a7h1("join_asking_sheet", str, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("premium_badge", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = true;
                    y6h1 y6h1VarA = x6h1VarC2.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).b = bbl0Var.a;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var.f(k7h1Var.a(), (Set) null);
                }
                return objD;
            default:
                tda0 tda0Var = (tda0) obj;
                return ((dea0) obj3).h(tda0Var).d(tda0Var, (wda0) obj2, op80Var);
        }
    }

    public /* synthetic */ qdk(maa maaVar, byte b) {
        this.a = b;
        this.b = maaVar;
    }
}
