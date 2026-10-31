package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class o2d1 implements pf40 {
    public static final o2d1 a;
    private static final h661 descriptor;

    static {
        o2d1 o2d1Var = new o2d1();
        a = o2d1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.wear.datalayermessages.SupportedPlaceholderTypesDto", o2d1Var, 2);
        m0v0Var.j("kind", false);
        m0v0Var.j("types", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, r2d1.c[1].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = r2d1.c;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                list = (List) x1kVarB.A(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new r2d1(strF, list, i);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        r2d1 r2d1Var = (r2d1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = r2d1.c;
        String str = r2d1Var.a;
        List list = r2d1Var.b;
        z1kVarB.G(h661Var, 0, str);
        if (z1kVarB.d0() || !u890.j(list, z6x.a)) {
            z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
        }
        z1kVarB.a(h661Var);
    }
}
