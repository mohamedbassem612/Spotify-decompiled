package p;

import com.comscore.streaming.State;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class zu5 implements pf40 {
    public static final zu5 a;
    private static final h661 descriptor;

    static {
        zu5 zu5Var = new zu5();
        a = zu5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.WelcomeDetails", zu5Var, 7);
        m0v0Var.j("roles", true);
        m0v0Var.j("app_version", true);
        m0v0Var.j("authprovider", true);
        m0v0Var.j("authid", true);
        m0v0Var.j("authrole", true);
        m0v0Var.j("authmethod", true);
        m0v0Var.j("date_time", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0VarZ = m5n1.z(dr5.a);
        chc1 chc1Var = chc1.a;
        return new nma0[]{nma0VarZ, m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        fr5 fr5Var = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case State.UNDEFINED /* -1 */:
                    z = false;
                    break;
                case 0:
                    fr5Var = (fr5) x1kVarB.B(h661Var, 0, dr5.a, fr5Var);
                    i |= 1;
                    break;
                case 1:
                    str = (String) x1kVarB.B(h661Var, 1, chc1.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) x1kVarB.B(h661Var, 2, chc1.a, str2);
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
                    str6 = (String) x1kVarB.B(h661Var, 6, chc1.a, str6);
                    i |= 64;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        bv5 bv5Var = new bv5();
        if ((i & 1) == 0) {
            bv5Var.b = null;
        } else {
            bv5Var.b = fr5Var;
        }
        if ((i & 2) == 0) {
            bv5Var.c = null;
        } else {
            bv5Var.c = str;
        }
        if ((i & 4) == 0) {
            bv5Var.d = null;
        } else {
            bv5Var.d = str2;
        }
        if ((i & 8) == 0) {
            bv5Var.e = null;
        } else {
            bv5Var.e = str3;
        }
        if ((i & 16) == 0) {
            bv5Var.f = null;
        } else {
            bv5Var.f = str4;
        }
        if ((i & 32) == 0) {
            bv5Var.g = null;
        } else {
            bv5Var.g = str5;
        }
        if ((i & 64) == 0) {
            bv5Var.h = null;
            return bv5Var;
        }
        bv5Var.h = str6;
        return bv5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        bv5 bv5Var = (bv5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        fr5 fr5Var = bv5Var.b;
        if (fr5Var != null) {
            z1kVarB.s(h661Var, 0, dr5.a, fr5Var);
        }
        String str = bv5Var.c;
        if (str != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str);
        }
        String str2 = bv5Var.d;
        if (str2 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str2);
        }
        String str3 = bv5Var.e;
        if (str3 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str3);
        }
        String str4 = bv5Var.f;
        if (str4 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str4);
        }
        String str5 = bv5Var.g;
        if (str5 != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str5);
        }
        String str6 = bv5Var.h;
        if (str6 != null) {
            z1kVarB.s(h661Var, 6, chc1.a, str6);
        }
        z1kVarB.a(h661Var);
    }
}
