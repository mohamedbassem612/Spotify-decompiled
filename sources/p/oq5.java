package p;

import com.comscore.streaming.State;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class oq5 implements pf40 {
    public static final oq5 a;
    private static final h661 descriptor;

    static {
        oq5 oq5Var = new oq5();
        a = oq5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.Context", oq5Var, 11);
        m0v0Var.j("id", true);
        m0v0Var.j("uri", true);
        m0v0Var.j("title", true);
        m0v0Var.j("subtitle", true);
        m0v0Var.j("type", true);
        m0v0Var.j("repeat_track", true);
        m0v0Var.j("repeat_context", true);
        m0v0Var.j("shuffle", true);
        m0v0Var.j("can_repeat_track", true);
        m0v0Var.j("can_repeat_context", true);
        m0v0Var.j("can_shuffle", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        nma0 nma0VarZ = m5n1.z(chc1Var);
        nma0 nma0VarZ2 = m5n1.z(chc1Var);
        nma0 nma0VarZ3 = m5n1.z(chc1Var);
        nma0 nma0VarZ4 = m5n1.z(chc1Var);
        nma0 nma0VarZ5 = m5n1.z(chc1Var);
        gpb gpbVar = gpb.a;
        return new nma0[]{nma0VarZ, nma0VarZ2, nma0VarZ3, nma0VarZ4, nma0VarZ5, m5n1.z(gpbVar), m5n1.z(gpbVar), m5n1.z(gpbVar), m5n1.z(gpbVar), m5n1.z(gpbVar), m5n1.z(gpbVar)};
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final Object deserialize(dar darVar) {
        ?? r1;
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        Boolean bool = null;
        Boolean bool2 = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case State.UNDEFINED /* -1 */:
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
                    bool3 = (Boolean) x1kVarB.B(h661Var, 5, gpb.a, bool3);
                    i |= 32;
                    break;
                case 6:
                    bool4 = (Boolean) x1kVarB.B(h661Var, 6, gpb.a, bool4);
                    i |= 64;
                    break;
                case 7:
                    bool5 = (Boolean) x1kVarB.B(h661Var, 7, gpb.a, bool5);
                    i |= 128;
                    break;
                case 8:
                    bool6 = (Boolean) x1kVarB.B(h661Var, 8, gpb.a, bool6);
                    i |= 256;
                    break;
                case 9:
                    bool2 = (Boolean) x1kVarB.B(h661Var, 9, gpb.a, bool2);
                    i |= 512;
                    break;
                case 10:
                    bool = (Boolean) x1kVarB.B(h661Var, 10, gpb.a, bool);
                    i |= 1024;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
            z = z;
        }
        x1kVarB.a(h661Var);
        qq5 qq5Var = new qq5();
        if ((i & 1) == 0) {
            r1 = 0;
            qq5Var.b = null;
        } else {
            r1 = 0;
            qq5Var.b = str;
        }
        if ((i & 2) == 0) {
            qq5Var.c = r1;
        } else {
            qq5Var.c = str2;
        }
        if ((i & 4) == 0) {
            qq5Var.d = r1;
        } else {
            qq5Var.d = str3;
        }
        if ((i & 8) == 0) {
            qq5Var.e = r1;
        } else {
            qq5Var.e = str4;
        }
        if ((i & 16) == 0) {
            qq5Var.f = r1;
        } else {
            qq5Var.f = str5;
        }
        if ((i & 32) == 0) {
            qq5Var.g = r1;
        } else {
            qq5Var.g = bool3;
        }
        if ((i & 64) == 0) {
            qq5Var.h = r1;
        } else {
            qq5Var.h = bool4;
        }
        if ((i & 128) == 0) {
            qq5Var.i = r1;
        } else {
            qq5Var.i = bool5;
        }
        if ((i & 256) == 0) {
            qq5Var.j = r1;
        } else {
            qq5Var.j = bool6;
        }
        if ((i & 512) == 0) {
            qq5Var.k = r1;
        } else {
            qq5Var.k = bool2;
        }
        if ((i & 1024) == 0) {
            qq5Var.l = r1;
            return qq5Var;
        }
        qq5Var.l = bool;
        return qq5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        qq5 qq5Var = (qq5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = qq5Var.b;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        String str2 = qq5Var.c;
        if (str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        String str3 = qq5Var.d;
        if (str3 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str3);
        }
        String str4 = qq5Var.e;
        if (str4 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str4);
        }
        String str5 = qq5Var.f;
        if (str5 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str5);
        }
        Boolean bool = qq5Var.g;
        if (bool != null) {
            z1kVarB.s(h661Var, 5, gpb.a, bool);
        }
        Boolean bool2 = qq5Var.h;
        if (bool2 != null) {
            z1kVarB.s(h661Var, 6, gpb.a, bool2);
        }
        Boolean bool3 = qq5Var.i;
        if (bool3 != null) {
            z1kVarB.s(h661Var, 7, gpb.a, bool3);
        }
        Boolean bool4 = qq5Var.j;
        if (bool4 != null) {
            z1kVarB.s(h661Var, 8, gpb.a, bool4);
        }
        Boolean bool5 = qq5Var.k;
        if (bool5 != null) {
            z1kVarB.s(h661Var, 9, gpb.a, bool5);
        }
        Boolean bool6 = qq5Var.l;
        if (bool6 != null) {
            z1kVarB.s(h661Var, 10, gpb.a, bool6);
        }
        z1kVarB.a(h661Var);
    }
}
