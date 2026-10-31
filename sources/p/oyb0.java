package p;

import com.comscore.streaming.State;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class oyb0 implements pf40 {
    public static final oyb0 a;
    private static final h661 descriptor;

    static {
        oyb0 oyb0Var = new oyb0();
        a = oyb0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.leavebehindads.ctaimpl.model.LeavebehindAd", oyb0Var, 12);
        m0v0Var.j("advertiser", true);
        m0v0Var.j("clickthroughUrl", true);
        m0v0Var.j("buttonMessage", true);
        m0v0Var.j("tagline", true);
        m0v0Var.j("displayImage", true);
        m0v0Var.j("logoImage", true);
        m0v0Var.j("lineitemId", true);
        m0v0Var.j("creativeId", true);
        m0v0Var.j("trackingEvents", true);
        m0v0Var.j("adId", true);
        m0v0Var.j("crossPromo", true);
        m0v0Var.j("product_name", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0VarZ = m5n1.z(d3g1.a);
        nma0 nma0VarZ2 = m5n1.z(w8o.a);
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, nma0VarZ, chc1Var, nma0VarZ2, chc1Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        y8o y8oVar = null;
        boolean z = true;
        f3g1 f3g1Var = null;
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
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case State.UNDEFINED /* -1 */:
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
                    f3g1Var = (f3g1) x1kVarB.B(h661Var, 8, d3g1.a, f3g1Var);
                    i |= 256;
                    break;
                case 9:
                    strF9 = x1kVarB.f(h661Var, 9);
                    i |= 512;
                    break;
                case 10:
                    y8oVar = (y8o) x1kVarB.B(h661Var, 10, w8o.a, y8oVar);
                    i |= 1024;
                    break;
                case 11:
                    strF10 = x1kVarB.f(h661Var, 11);
                    i |= 2048;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new qyb0(i, strF, strF2, strF3, strF4, strF5, strF6, strF7, strF8, f3g1Var, strF9, y8oVar, strF10);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        qyb0 qyb0Var = (qyb0) obj;
        String str = qyb0Var.l;
        y8o y8oVar = qyb0Var.k;
        String str2 = qyb0Var.j;
        f3g1 f3g1Var = qyb0Var.i;
        String str3 = qyb0Var.h;
        String str4 = qyb0Var.g;
        String str5 = qyb0Var.f;
        String str6 = qyb0Var.e;
        String str7 = qyb0Var.d;
        String str8 = qyb0Var.c;
        String str9 = qyb0Var.b;
        String str10 = qyb0Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || !u890.j(str10, "")) {
            z1kVarB.G(h661Var, 0, str10);
        }
        if (z1kVarB.d0() || !u890.j(str9, "")) {
            z1kVarB.G(h661Var, 1, str9);
        }
        if (z1kVarB.d0() || !u890.j(str8, "")) {
            z1kVarB.G(h661Var, 2, str8);
        }
        if (z1kVarB.d0() || !u890.j(str7, "")) {
            z1kVarB.G(h661Var, 3, str7);
        }
        if (z1kVarB.d0() || !u890.j(str6, "")) {
            z1kVarB.G(h661Var, 4, str6);
        }
        if (z1kVarB.d0() || !u890.j(str5, "")) {
            z1kVarB.G(h661Var, 5, str5);
        }
        if (z1kVarB.d0() || !u890.j(str4, "")) {
            z1kVarB.G(h661Var, 6, str4);
        }
        if (z1kVarB.d0() || !u890.j(str3, "")) {
            z1kVarB.G(h661Var, 7, str3);
        }
        if (z1kVarB.d0() || f3g1Var != null) {
            z1kVarB.s(h661Var, 8, d3g1.a, f3g1Var);
        }
        if (z1kVarB.d0() || !u890.j(str2, "")) {
            z1kVarB.G(h661Var, 9, str2);
        }
        if (z1kVarB.d0() || y8oVar != null) {
            z1kVarB.s(h661Var, 10, w8o.a, y8oVar);
        }
        if (z1kVarB.d0() || !u890.j(str, "")) {
            z1kVarB.G(h661Var, 11, str);
        }
        z1kVarB.a(h661Var);
    }
}
