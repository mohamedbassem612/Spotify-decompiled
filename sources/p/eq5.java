package p;

import com.comscore.streaming.State;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class eq5 implements pf40 {
    public static final eq5 a;
    private static final h661 descriptor;

    static {
        eq5 eq5Var = new eq5();
        a = eq5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.Challenge", eq5Var, 7);
        m0v0Var.j("nonce", true);
        m0v0Var.j("authprovider", true);
        m0v0Var.j("authid", true);
        m0v0Var.j("timestamp", true);
        m0v0Var.j("authrole", true);
        m0v0Var.j("authmethod", true);
        m0v0Var.j("session", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(wr80.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Integer num = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case State.UNDEFINED /* -1 */:
                    z = false;
                    break;
                case 0:
                    str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
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
                    str5 = (String) x1kVarB.B(h661Var, 4, chc1.a, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) x1kVarB.B(h661Var, 5, chc1.a, str6);
                    i |= 32;
                    break;
                case 6:
                    num = (Integer) x1kVarB.B(h661Var, 6, wr80.a, num);
                    i |= 64;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        gq5 gq5Var = new gq5();
        if ((i & 1) == 0) {
            gq5Var.b = null;
        } else {
            gq5Var.b = str;
        }
        if ((i & 2) == 0) {
            gq5Var.c = null;
        } else {
            gq5Var.c = str2;
        }
        if ((i & 4) == 0) {
            gq5Var.d = null;
        } else {
            gq5Var.d = str3;
        }
        if ((i & 8) == 0) {
            gq5Var.e = null;
        } else {
            gq5Var.e = str4;
        }
        if ((i & 16) == 0) {
            gq5Var.f = null;
        } else {
            gq5Var.f = str5;
        }
        if ((i & 32) == 0) {
            gq5Var.g = null;
        } else {
            gq5Var.g = str6;
        }
        if ((i & 64) == 0) {
            gq5Var.h = null;
            return gq5Var;
        }
        gq5Var.h = num;
        return gq5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        gq5 gq5Var = (gq5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = gq5Var.b;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        String str2 = gq5Var.c;
        if (str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        String str3 = gq5Var.d;
        if (str3 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str3);
        }
        String str4 = gq5Var.e;
        if (str4 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str4);
        }
        String str5 = gq5Var.f;
        if (str5 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str5);
        }
        String str6 = gq5Var.g;
        if (str6 != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str6);
        }
        Integer num = gq5Var.h;
        if (num != null) {
            z1kVarB.s(h661Var, 6, wr80.a, num);
        }
        z1kVarB.a(h661Var);
    }
}
