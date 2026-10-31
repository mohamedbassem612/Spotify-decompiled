package p;

import com.android.installreferrer.api.InstallReferrerClient$InstallReferrerResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class r510 implements pf40 {
    public static final r510 a;
    private static final h661 descriptor;

    static {
        r510 r510Var = new r510();
        a = r510Var;
        m0v0 m0v0Var = new m0v0("com.spotify.externalintegration.http.ExternalIntegrationSectionItemModel", r510Var, 10);
        m0v0Var.j("title", false);
        m0v0Var.j("subtitle", true);
        m0v0Var.j("uri", true);
        m0v0Var.j("image_url", true);
        m0v0Var.j("is_explicit", true);
        m0v0Var.j("is_19_plus", true);
        m0v0Var.j("episode_release_date", true);
        m0v0Var.j("duration", true);
        m0v0Var.j("num_items", true);
        m0v0Var.j("background_hex_color", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        nma0 nma0VarZ = m5n1.z(nma0Var);
        nma0 nma0VarZ2 = m5n1.z(nma0Var);
        nma0 nma0VarZ3 = m5n1.z(nma0Var);
        gpb gpbVar = gpb.a;
        nma0 nma0VarZ4 = m5n1.z(gpbVar);
        nma0 nma0VarZ5 = m5n1.z(gpbVar);
        o5f0 o5f0Var = o5f0.a;
        return new nma0[]{nma0Var, nma0VarZ, nma0VarZ2, nma0VarZ3, nma0VarZ4, nma0VarZ5, m5n1.z(o5f0Var), m5n1.z(o5f0Var), m5n1.z(wr80.a), m5n1.z(nma0Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        String str = null;
        boolean z = true;
        Integer num = null;
        int i = 0;
        String strF = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Long l = null;
        Long l2 = null;
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
                    str2 = (String) x1kVarB.B(h661Var, 1, chc1.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) x1kVarB.B(h661Var, 2, chc1.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) x1kVarB.B(h661Var, 3, chc1.a, str4);
                    i |= 8;
                    break;
                case 4:
                    bool = (Boolean) x1kVarB.B(h661Var, 4, gpb.a, bool);
                    i |= 16;
                    break;
                case 5:
                    bool2 = (Boolean) x1kVarB.B(h661Var, 5, gpb.a, bool2);
                    i |= 32;
                    break;
                case 6:
                    l = (Long) x1kVarB.B(h661Var, 6, o5f0.a, l);
                    i |= 64;
                    break;
                case 7:
                    l2 = (Long) x1kVarB.B(h661Var, 7, o5f0.a, l2);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) x1kVarB.B(h661Var, 8, wr80.a, num);
                    i |= 256;
                    break;
                case 9:
                    str = (String) x1kVarB.B(h661Var, 9, chc1.a, str);
                    i |= 512;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new t510(i, strF, str2, str3, str4, bool, bool2, l, l2, num, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        t510 t510Var = (t510) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = t510Var.a;
        String str2 = t510Var.j;
        Integer num = t510Var.i;
        Long l = t510Var.h;
        Long l2 = t510Var.g;
        Boolean bool = t510Var.f;
        Boolean bool2 = t510Var.e;
        String str3 = t510Var.d;
        String str4 = t510Var.c;
        String str5 = t510Var.b;
        z1kVarB.G(h661Var, 0, str);
        if (z1kVarB.d0() || str5 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str5);
        }
        if (z1kVarB.d0() || str4 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str4);
        }
        if (z1kVarB.d0() || str3 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str3);
        }
        if (z1kVarB.d0() || !u890.j(bool2, Boolean.FALSE)) {
            z1kVarB.s(h661Var, 4, gpb.a, bool2);
        }
        if (z1kVarB.d0() || !u890.j(bool, Boolean.FALSE)) {
            z1kVarB.s(h661Var, 5, gpb.a, bool);
        }
        if (z1kVarB.d0() || l2 == null || l2.longValue() != 0) {
            z1kVarB.s(h661Var, 6, o5f0.a, l2);
        }
        if (z1kVarB.d0() || l == null || l.longValue() != 0) {
            z1kVarB.s(h661Var, 7, o5f0.a, l);
        }
        if (z1kVarB.d0() || num == null || num.intValue() != 0) {
            z1kVarB.s(h661Var, 8, wr80.a, num);
        }
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 9, chc1.a, str2);
        }
        z1kVarB.a(h661Var);
    }
}
