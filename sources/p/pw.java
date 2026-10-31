package p;

import com.spotify.messages.AccountSwitchingAddAccount;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final /* synthetic */ class pw implements pf40 {
    public static final pw a;
    private static final h661 descriptor;

    static {
        pw pwVar = new pw();
        a = pwVar;
        m0v0 m0v0Var = new m0v0("com.spotify.accountswitching.switcherimpl.AccountSwitchingUserInfoJsonAdapter.AuthUserInfoJson", pwVar, 9);
        m0v0Var.j("userName", false);
        m0v0Var.j("credentialString", false);
        m0v0Var.j("tokenInfo", true);
        m0v0Var.j("imageUrl", true);
        m0v0Var.j("displayName", true);
        m0v0Var.j("color", true);
        m0v0Var.j("pinRequired", true);
        m0v0Var.j("lastProfileInfoRefreshTimestampMs", true);
        m0v0Var.j("lastAccessTimestampMs", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        nma0 nma0VarZ = m5n1.z(mw.a);
        nma0 nma0VarZ2 = m5n1.z(nma0Var);
        nma0 nma0VarZ3 = m5n1.z(nma0Var);
        nma0 nma0VarZ4 = m5n1.z(wr80.a);
        o5f0 o5f0Var = o5f0.a;
        return new nma0[]{nma0Var, nma0Var, nma0VarZ, nma0VarZ2, nma0VarZ3, nma0VarZ4, gpb.a, m5n1.z(o5f0Var), m5n1.z(o5f0Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        Long l = null;
        String strF = null;
        String strF2 = null;
        ow owVar = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        Long l2 = null;
        int i = 0;
        boolean zM = false;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
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
                    owVar = (ow) x1kVarB.B(h661Var, 2, mw.a, owVar);
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
                    num = (Integer) x1kVarB.B(h661Var, 5, wr80.a, num);
                    i |= 32;
                    break;
                case AccountSwitchingAddAccount.ACCOUNT_AUTO_ADDED_FIELD_NUMBER /* 6 */:
                    zM = x1kVarB.M(h661Var, 6);
                    i |= 64;
                    break;
                case 7:
                    l2 = (Long) x1kVarB.B(h661Var, 7, o5f0.a, l2);
                    i |= 128;
                    break;
                case 8:
                    l = (Long) x1kVarB.B(h661Var, 8, o5f0.a, l);
                    i |= 256;
                    break;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new rw(i, strF, strF2, owVar, str, str2, num, zM, l2, l);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        rw rwVar = (rw) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = rwVar.a;
        boolean z = rwVar.g;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, rwVar.b);
        ow owVar = rwVar.c;
        if (owVar != null) {
            z1kVarB.s(h661Var, 2, mw.a, owVar);
        }
        String str2 = rwVar.d;
        if (str2 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str2);
        }
        String str3 = rwVar.e;
        if (str3 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str3);
        }
        Integer num = rwVar.f;
        if (num != null) {
            z1kVarB.s(h661Var, 5, wr80.a, num);
        }
        if (z1kVarB.d0() || z) {
            z1kVarB.E(h661Var, 6, z);
        }
        Long l = rwVar.h;
        if (l != null) {
            z1kVarB.s(h661Var, 7, o5f0.a, l);
        }
        Long l2 = rwVar.i;
        if (l2 != null) {
            z1kVarB.s(h661Var, 8, o5f0.a, l2);
        }
        z1kVarB.a(h661Var);
    }
}
