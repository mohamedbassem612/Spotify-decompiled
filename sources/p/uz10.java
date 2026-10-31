package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class uz10 implements pf40 {
    public static final uz10 a;
    private static final h661 descriptor;

    static {
        uz10 uz10Var = new uz10();
        a = uz10Var;
        m0v0 m0v0Var = new m0v0("com.spotify.yourupdates.data.FetchNotificationsResponse", uz10Var, 4);
        m0v0Var.j("notifications", false);
        m0v0Var.j("latestCursor", true);
        m0v0Var.j("forwardCursor", true);
        m0v0Var.j("requestId", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{wz10.e[0].getValue(), m5n1.z(chc1Var), m5n1.z(chc1Var), chc1Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = wz10.e;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String strF = null;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                list = (List) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
                i |= 1;
            } else if (iP == 1) {
                str = (String) x1kVarB.B(h661Var, 1, chc1.a, str);
                i |= 2;
            } else if (iP == 2) {
                str2 = (String) x1kVarB.B(h661Var, 2, chc1.a, str2);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                strF = x1kVarB.f(h661Var, 3);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new wz10(i, str, str2, strF, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        wz10 wz10Var = (wz10) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        nma0 nma0Var = (nma0) wz10.e[0].getValue();
        List list = wz10Var.a;
        String str = wz10Var.c;
        String str2 = wz10Var.b;
        z1kVarB.k(h661Var, 0, nma0Var, list);
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str);
        }
        z1kVarB.G(h661Var, 3, wz10Var.d);
        z1kVarB.a(h661Var);
    }
}
