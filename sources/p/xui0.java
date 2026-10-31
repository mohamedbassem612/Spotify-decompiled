package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class xui0 implements pf40 {
    public static final xui0 a;
    private static final h661 descriptor;

    static {
        xui0 xui0Var = new xui0();
        a = xui0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.merch.merchdataloader.MerchNPVResponse", xui0Var, 5);
        m0v0Var.j("merchSectionTitle", false);
        m0v0Var.j("merchItems", false);
        m0v0Var.j("showAllText", true);
        m0v0Var.j("showAllNavigationUrl", true);
        m0v0Var.j("showSeeAllMerchButton", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = zui0.f;
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, znb0VarArr[1].getValue(), m5n1.z(chc1Var), m5n1.z(chc1Var), gpb.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = zui0.f;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        String strF = null;
        String str = null;
        String str2 = null;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                list = (List) x1kVarB.A(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
                i |= 2;
            } else if (iP == 2) {
                str = (String) x1kVarB.B(h661Var, 2, chc1.a, str);
                i |= 4;
            } else if (iP == 3) {
                str2 = (String) x1kVarB.B(h661Var, 3, chc1.a, str2);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                zM = x1kVarB.M(h661Var, 4);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new zui0(i, strF, str, str2, list, zM);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        zui0 zui0Var = (zui0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = zui0.f;
        z1kVarB.G(h661Var, 0, zui0Var.a);
        z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), zui0Var.b);
        String str = zui0Var.c;
        if (str != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str);
        }
        String str2 = zui0Var.d;
        if (str2 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str2);
        }
        z1kVarB.E(h661Var, 4, zui0Var.e);
        z1kVarB.a(h661Var);
    }
}
