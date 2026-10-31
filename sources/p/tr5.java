package p;

import com.comscore.streaming.State;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class tr5 implements pf40 {
    public static final tr5 a;
    private static final h661 descriptor;

    static {
        tr5 tr5Var = new tr5();
        a = tr5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.ListItem", tr5Var, 10);
        m0v0Var.j("id", true);
        m0v0Var.j("uid", true);
        m0v0Var.j("uri", true);
        m0v0Var.j("image_id", true);
        m0v0Var.j("title", true);
        m0v0Var.j("subtitle", true);
        m0v0Var.j("playable", true);
        m0v0Var.j("has_children", true);
        m0v0Var.j("available_offline", true);
        m0v0Var.j("metadata", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        nma0 nma0VarZ = m5n1.z(chc1Var);
        nma0 nma0VarZ2 = m5n1.z(chc1Var);
        nma0 nma0VarZ3 = m5n1.z(chc1Var);
        nma0 nma0VarZ4 = m5n1.z(chc1Var);
        nma0 nma0VarZ5 = m5n1.z(chc1Var);
        nma0 nma0VarZ6 = m5n1.z(chc1Var);
        gpb gpbVar = gpb.a;
        return new nma0[]{nma0VarZ, nma0VarZ2, nma0VarZ3, nma0VarZ4, nma0VarZ5, nma0VarZ6, m5n1.z(gpbVar), m5n1.z(gpbVar), m5n1.z(gpbVar), m5n1.z(fs5.a)};
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.String, p.hs5] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final Object deserialize(dar darVar) {
        ?? r1;
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        hs5 hs5Var = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
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
                    bool = (Boolean) x1kVarB.B(h661Var, 6, gpb.a, bool);
                    i |= 64;
                    break;
                case 7:
                    bool2 = (Boolean) x1kVarB.B(h661Var, 7, gpb.a, bool2);
                    i |= 128;
                    break;
                case 8:
                    bool3 = (Boolean) x1kVarB.B(h661Var, 8, gpb.a, bool3);
                    i |= 256;
                    break;
                case 9:
                    hs5Var = (hs5) x1kVarB.B(h661Var, 9, fs5.a, hs5Var);
                    i |= 512;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        vr5 vr5Var = new vr5();
        if ((i & 1) == 0) {
            r1 = 0;
            vr5Var.b = null;
        } else {
            r1 = 0;
            vr5Var.b = str;
        }
        if ((i & 2) == 0) {
            vr5Var.c = r1;
        } else {
            vr5Var.c = str2;
        }
        if ((i & 4) == 0) {
            vr5Var.d = r1;
        } else {
            vr5Var.d = str3;
        }
        if ((i & 8) == 0) {
            vr5Var.e = r1;
        } else {
            vr5Var.e = str4;
        }
        if ((i & 16) == 0) {
            vr5Var.f = r1;
        } else {
            vr5Var.f = str5;
        }
        if ((i & 32) == 0) {
            vr5Var.g = r1;
        } else {
            vr5Var.g = str6;
        }
        if ((i & 64) == 0) {
            vr5Var.h = r1;
        } else {
            vr5Var.h = bool;
        }
        if ((i & 128) == 0) {
            vr5Var.i = r1;
        } else {
            vr5Var.i = bool2;
        }
        if ((i & 256) == 0) {
            vr5Var.j = r1;
        } else {
            vr5Var.j = bool3;
        }
        if ((i & 512) == 0) {
            vr5Var.k = r1;
            return vr5Var;
        }
        vr5Var.k = hs5Var;
        return vr5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        vr5 vr5Var = (vr5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = vr5Var.b;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        String str2 = vr5Var.c;
        if (str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        String str3 = vr5Var.d;
        if (str3 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str3);
        }
        String str4 = vr5Var.e;
        if (str4 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str4);
        }
        String str5 = vr5Var.f;
        if (str5 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str5);
        }
        String str6 = vr5Var.g;
        if (str6 != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str6);
        }
        Boolean bool = vr5Var.h;
        if (bool != null) {
            z1kVarB.s(h661Var, 6, gpb.a, bool);
        }
        Boolean bool2 = vr5Var.i;
        if (bool2 != null) {
            z1kVarB.s(h661Var, 7, gpb.a, bool2);
        }
        Boolean bool3 = vr5Var.j;
        if (bool3 != null) {
            z1kVarB.s(h661Var, 8, gpb.a, bool3);
        }
        hs5 hs5Var = vr5Var.k;
        if (hs5Var != null) {
            z1kVarB.s(h661Var, 9, fs5.a, hs5Var);
        }
        z1kVarB.a(h661Var);
    }
}
