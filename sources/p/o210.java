package p;

import com.android.installreferrer.api.InstallReferrerClient$InstallReferrerResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class o210 implements pf40 {
    public static final o210 a;
    private static final h661 descriptor;

    static {
        o210 o210Var = new o210();
        a = o210Var;
        m0v0 m0v0Var = new m0v0("com.spotify.externalintegration.http.ExternalAccessoryDescriptionModel", o210Var, 10);
        m0v0Var.j("integration", false);
        m0v0Var.j("client_id", true);
        m0v0Var.j("name", true);
        m0v0Var.j("transport_type", false);
        m0v0Var.j("category", false);
        m0v0Var.j("company", true);
        m0v0Var.j("model", true);
        m0v0Var.j("version", true);
        m0v0Var.j("protocol", false);
        m0v0Var.j("sender_id", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, m5n1.z(nma0Var), m5n1.z(nma0Var), nma0Var, nma0Var, m5n1.z(nma0Var), m5n1.z(nma0Var), m5n1.z(nma0Var), nma0Var, m5n1.z(nma0Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        String str = null;
        String strF = null;
        String str2 = null;
        String str3 = null;
        String strF2 = null;
        String strF3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String strF4 = null;
        int i = 0;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case InstallReferrerClient$InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    continue;
                case 0:
                    strF = x1kVarB.f(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) x1kVarB.B(h661Var, 1, chc1.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) x1kVarB.B(h661Var, 2, chc1.a, str3);
                    i |= 4;
                    break;
                case 3:
                    strF2 = x1kVarB.f(h661Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strF3 = x1kVarB.f(h661Var, 4);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) x1kVarB.B(h661Var, 5, chc1.a, str4);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) x1kVarB.B(h661Var, 6, chc1.a, str5);
                    i |= 64;
                    break;
                case 7:
                    str6 = (String) x1kVarB.B(h661Var, 7, chc1.a, str6);
                    i |= 128;
                    break;
                case 8:
                    strF4 = x1kVarB.f(h661Var, 8);
                    i |= 256;
                    break;
                case 9:
                    str = (String) x1kVarB.B(h661Var, 9, chc1.a, str);
                    i |= 512;
                    break;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new q210(i, strF, str2, str3, strF2, strF3, str4, str5, str6, strF4, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        q210 q210Var = (q210) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, q210Var.a);
        String str = q210Var.b;
        if (str != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str);
        }
        String str2 = q210Var.c;
        if (str2 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str2);
        }
        z1kVarB.G(h661Var, 3, q210Var.d);
        z1kVarB.G(h661Var, 4, q210Var.e);
        String str3 = q210Var.f;
        if (str3 != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str3);
        }
        String str4 = q210Var.g;
        if (str4 != null) {
            z1kVarB.s(h661Var, 6, chc1.a, str4);
        }
        String str5 = q210Var.h;
        if (str5 != null) {
            z1kVarB.s(h661Var, 7, chc1.a, str5);
        }
        z1kVarB.G(h661Var, 8, q210Var.i);
        String str6 = q210Var.j;
        if (str6 != null) {
            z1kVarB.s(h661Var, 9, chc1.a, str6);
        }
        z1kVarB.a(h661Var);
    }
}
