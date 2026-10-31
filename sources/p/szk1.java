package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class szk1 implements pf40 {
    public static final szk1 a;
    private static final h661 descriptor;

    static {
        szk1 szk1Var = new szk1();
        a = szk1Var;
        m0v0 m0v0Var = new m0v0("ready", szk1Var, 9);
        m0v0Var.j("capabilities", false);
        m0v0Var.j("windowHasFocus", false);
        m0v0Var.j("playbackState", true);
        m0v0Var.j("isCheckoutActive", false);
        m0v0Var.j("appVersion", false);
        m0v0Var.j("sessionId", false);
        m0v0Var.j("rawLocalPrefs", true);
        m0v0Var.j("lookupToken", false);
        m0v0Var.j("shareDestinations", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = uzk1.k;
        gpb gpbVar = gpb.a;
        chc1 chc1Var = chc1.a;
        return new nma0[]{zkd.a, gpbVar, m5n1.z(pzk1.a), gpbVar, chc1Var, chc1Var, m5n1.z(chc1Var), chc1Var, znb0VarArr[8].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = uzk1.k;
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        List list = null;
        cld cldVar = null;
        rzk1 rzk1Var = null;
        String strF = null;
        String strF2 = null;
        String str = null;
        String strF3 = null;
        int i = 0;
        boolean zM = false;
        boolean zM2 = false;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    cldVar = (cld) x1kVarB.A(h661Var, 0, zkd.a, cldVar);
                    i |= 1;
                    break;
                case 1:
                    zM = x1kVarB.M(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    rzk1Var = (rzk1) x1kVarB.B(h661Var, 2, pzk1.a, rzk1Var);
                    i |= 4;
                    break;
                case 3:
                    zM2 = x1kVarB.M(h661Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strF = x1kVarB.f(h661Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strF2 = x1kVarB.f(h661Var, 5);
                    i |= 32;
                    break;
                case 6:
                    str = (String) x1kVarB.B(h661Var, 6, chc1.a, str);
                    i |= 64;
                    break;
                case 7:
                    strF3 = x1kVarB.f(h661Var, 7);
                    i |= 128;
                    break;
                case 8:
                    list = (List) x1kVarB.A(h661Var, 8, (nma0) znb0VarArr[8].getValue(), list);
                    i |= 256;
                    break;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new uzk1(i, cldVar, zM, rzk1Var, zM2, strF, strF2, str, strF3, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        uzk1 uzk1Var = (uzk1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = uzk1.k;
        z1kVarB.k(h661Var, 0, zkd.a, uzk1Var.b);
        z1kVarB.E(h661Var, 1, uzk1Var.c);
        rzk1 rzk1Var = uzk1Var.d;
        if (rzk1Var != null) {
            z1kVarB.s(h661Var, 2, pzk1.a, rzk1Var);
        }
        z1kVarB.E(h661Var, 3, uzk1Var.e);
        z1kVarB.G(h661Var, 4, uzk1Var.f);
        z1kVarB.G(h661Var, 5, uzk1Var.g);
        String str = uzk1Var.h;
        if (str != null) {
            z1kVarB.s(h661Var, 6, chc1.a, str);
        }
        z1kVarB.G(h661Var, 7, uzk1Var.i);
        z1kVarB.k(h661Var, 8, (nma0) znb0VarArr[8].getValue(), uzk1Var.j);
        z1kVarB.a(h661Var);
    }
}
