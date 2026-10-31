package p;

import com.android.installreferrer.api.InstallReferrerClient$InstallReferrerResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class l0b0 implements pf40 {
    public static final l0b0 a;
    private static final h661 descriptor;

    static {
        l0b0 l0b0Var = new l0b0();
        a = l0b0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.genalphagraduation.graduationimpl.KidsGraduationInfoJsonAdapter.AuthUserInfoJson", l0b0Var, 8);
        m0v0Var.j("userName", false);
        m0v0Var.j("credentialString", false);
        m0v0Var.j("tokenInfo", true);
        m0v0Var.j("imageUrl", true);
        m0v0Var.j("displayName", true);
        m0v0Var.j("pinRequired", true);
        m0v0Var.j("lastProfileInfoRefreshTimestampMs", true);
        m0v0Var.j("lastAccessTimestampMs", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        nma0 nma0VarZ = m5n1.z(i0b0.a);
        nma0 nma0VarZ2 = m5n1.z(nma0Var);
        nma0 nma0VarZ3 = m5n1.z(nma0Var);
        o5f0 o5f0Var = o5f0.a;
        return new nma0[]{nma0Var, nma0Var, nma0VarZ, nma0VarZ2, nma0VarZ3, gpb.a, m5n1.z(o5f0Var), m5n1.z(o5f0Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean zM = false;
        String strF = null;
        String strF2 = null;
        k0b0 k0b0Var = null;
        String str = null;
        String str2 = null;
        Long l = null;
        Long l2 = null;
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
                    strF2 = x1kVarB.f(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    k0b0Var = (k0b0) x1kVarB.B(h661Var, 2, i0b0.a, k0b0Var);
                    i |= 4;
                    break;
                case 3:
                    str = (String) x1kVarB.B(h661Var, 3, chc1.a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) x1kVarB.B(h661Var, 4, chc1.a, str2);
                    i |= 16;
                    break;
                case 5:
                    zM = x1kVarB.M(h661Var, 5);
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
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new n0b0(i, strF, strF2, k0b0Var, str, str2, zM, l, l2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        n0b0 n0b0Var = (n0b0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = n0b0Var.a;
        boolean z = n0b0Var.f;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, n0b0Var.b);
        k0b0 k0b0Var = n0b0Var.c;
        if (k0b0Var != null) {
            z1kVarB.s(h661Var, 2, i0b0.a, k0b0Var);
        }
        String str2 = n0b0Var.d;
        if (str2 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str2);
        }
        String str3 = n0b0Var.e;
        if (str3 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str3);
        }
        if (z1kVarB.d0() || z) {
            z1kVarB.E(h661Var, 5, z);
        }
        Long l = n0b0Var.g;
        if (l != null) {
            z1kVarB.s(h661Var, 6, o5f0.a, l);
        }
        Long l2 = n0b0Var.h;
        if (l2 != null) {
            z1kVarB.s(h661Var, 7, o5f0.a, l2);
        }
        z1kVarB.a(h661Var);
    }
}
