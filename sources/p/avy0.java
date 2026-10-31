package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class avy0 implements pf40 {
    public static final avy0 a;
    private static final h661 descriptor;

    static {
        avy0 avy0Var = new avy0();
        a = avy0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.notifications.models.message.PushContext", avy0Var, 7);
        m0v0Var.j("opportunityId", true);
        m0v0Var.j("messageId", true);
        m0v0Var.j("appDeviceId", false);
        m0v0Var.j("collapse_key", true);
        m0v0Var.j("pushRequestId", true);
        m0v0Var.j("feature", true);
        m0v0Var.j("featureData", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = dvy0.h;
        nma0 nma0Var = chc1.a;
        return new nma0[]{m5n1.z(nma0Var), m5n1.z(nma0Var), nma0Var, m5n1.z(nma0Var), m5n1.z(nma0Var), m5n1.z(nma0Var), m5n1.z((nma0) znb0VarArr[6].getValue())};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = dvy0.h;
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String strF = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Map map = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) x1kVarB.B(h661Var, 1, chc1.a, str2);
                    i |= 2;
                    break;
                case 2:
                    strF = x1kVarB.f(h661Var, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) x1kVarB.B(h661Var, 3, chc1.a, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) x1kVarB.B(h661Var, 4, chc1.a, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) x1kVarB.B(h661Var, 5, chc1.a, str5);
                    i |= 32;
                    break;
                case 6:
                    map = (Map) x1kVarB.B(h661Var, 6, (nma0) znb0VarArr[6].getValue(), map);
                    i |= 64;
                    break;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new dvy0(i, str, str2, strF, str3, str4, str5, map);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        dvy0 dvy0Var = (dvy0) obj;
        String str = dvy0Var.b;
        String str2 = dvy0Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = dvy0.h;
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str2);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str);
        }
        String str3 = dvy0Var.c;
        Map map = dvy0Var.g;
        String str4 = dvy0Var.f;
        String str5 = dvy0Var.e;
        String str6 = dvy0Var.d;
        z1kVarB.G(h661Var, 2, str3);
        if (z1kVarB.d0() || str6 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str6);
        }
        if (z1kVarB.d0() || str5 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str5);
        }
        if (z1kVarB.d0() || str4 != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str4);
        }
        if (z1kVarB.d0() || map != null) {
            z1kVarB.s(h661Var, 6, (nma0) znb0VarArr[6].getValue(), map);
        }
        z1kVarB.a(h661Var);
    }
}
