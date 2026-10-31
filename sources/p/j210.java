package p;

import com.android.installreferrer.api.InstallReferrerClient$InstallReferrerResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class j210 implements pf40 {
    public static final j210 a;
    private static final h661 descriptor;

    static {
        j210 j210Var = new j210();
        a = j210Var;
        m0v0 m0v0Var = new m0v0("com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription", j210Var, 11);
        m0v0Var.j("integration_type", true);
        m0v0Var.j("client_id", true);
        m0v0Var.j("name", true);
        m0v0Var.j("transport_type", true);
        m0v0Var.j("connection_label", true);
        m0v0Var.j("category", true);
        m0v0Var.j("company", true);
        m0v0Var.j("model", true);
        m0v0Var.j("version", true);
        m0v0Var.j("protocol", true);
        m0v0Var.j("sender_id", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, chc1Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        String strF8 = null;
        String strF9 = null;
        String strF10 = null;
        String strF11 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case InstallReferrerClient$InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
                case 0:
                    strF = x1kVarB.f(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strF2 = x1kVarB.f(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strF3 = x1kVarB.f(h661Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strF4 = x1kVarB.f(h661Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strF5 = x1kVarB.f(h661Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strF6 = x1kVarB.f(h661Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strF7 = x1kVarB.f(h661Var, 6);
                    i |= 64;
                    break;
                case 7:
                    strF8 = x1kVarB.f(h661Var, 7);
                    i |= 128;
                    break;
                case 8:
                    strF9 = x1kVarB.f(h661Var, 8);
                    i |= 256;
                    break;
                case 9:
                    strF10 = x1kVarB.f(h661Var, 9);
                    i |= 512;
                    break;
                case 10:
                    strF11 = x1kVarB.f(h661Var, 10);
                    i |= 1024;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new m210(i, strF, strF2, strF3, strF4, strF5, strF6, strF7, strF8, strF9, strF10, strF11);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        m210 m210Var = (m210) obj;
        String str = m210Var.k;
        String str2 = m210Var.j;
        String str3 = m210Var.i;
        String str4 = m210Var.h;
        String str5 = m210Var.g;
        String str6 = m210Var.f;
        String str7 = m210Var.e;
        String str8 = m210Var.d;
        String str9 = m210Var.c;
        String str10 = m210Var.b;
        String str11 = m210Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || !u890.j(str11, "")) {
            z1kVarB.G(h661Var, 0, str11);
        }
        if (z1kVarB.d0() || !u890.j(str10, "")) {
            z1kVarB.G(h661Var, 1, str10);
        }
        if (z1kVarB.d0() || !u890.j(str9, "")) {
            z1kVarB.G(h661Var, 2, str9);
        }
        if (z1kVarB.d0() || !u890.j(str8, "")) {
            z1kVarB.G(h661Var, 3, str8);
        }
        if (z1kVarB.d0() || !u890.j(str7, "")) {
            z1kVarB.G(h661Var, 4, str7);
        }
        if (z1kVarB.d0() || !u890.j(str6, "")) {
            z1kVarB.G(h661Var, 5, str6);
        }
        if (z1kVarB.d0() || !u890.j(str5, "")) {
            z1kVarB.G(h661Var, 6, str5);
        }
        if (z1kVarB.d0() || !u890.j(str4, "")) {
            z1kVarB.G(h661Var, 7, str4);
        }
        if (z1kVarB.d0() || !u890.j(str3, "")) {
            z1kVarB.G(h661Var, 8, str3);
        }
        if (z1kVarB.d0() || !u890.j(str2, "")) {
            z1kVarB.G(h661Var, 9, str2);
        }
        if (z1kVarB.d0() || !u890.j(str, "")) {
            z1kVarB.G(h661Var, 10, str);
        }
        z1kVarB.a(h661Var);
    }
}
