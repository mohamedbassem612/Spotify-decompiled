package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class x8h0 implements pf40 {
    public static final x8h0 a;
    private static final h661 descriptor;

    static {
        x8h0 x8h0Var = new x8h0();
        a = x8h0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.deeplink.deferreddeeplink.MatchResultRequest", x8h0Var, 10);
        m0v0Var.j("match_attempted", true);
        m0v0Var.j("match_success", false);
        m0v0Var.j("match_method", true);
        m0v0Var.j("match_confidence", false);
        m0v0Var.j("deep_link", true);
        m0v0Var.j("time_to_match_ms", false);
        m0v0Var.j("platform", true);
        m0v0Var.j("install_referrer_available", false);
        m0v0Var.j("click_id", true);
        m0v0Var.j("match_id", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        nma0 nma0VarZ = m5n1.z(nma0Var);
        nma0 nma0VarZ2 = m5n1.z(nma0Var);
        nma0 nma0VarZ3 = m5n1.z(nma0Var);
        nma0 nma0VarZ4 = m5n1.z(nma0Var);
        gpb gpbVar = gpb.a;
        return new nma0[]{gpbVar, gpbVar, nma0VarZ, dru.a, nma0VarZ2, o5f0.a, nma0Var, gpbVar, nma0VarZ3, nma0VarZ4};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        Object obj = null;
        int i = 0;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        String str = null;
        String strF = null;
        double D = 0.0d;
        long jI0 = 0;
        boolean z = true;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    zM = x1kVarB.M(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    zM2 = x1kVarB.M(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) x1kVarB.B(h661Var, 2, chc1.a, str);
                    i |= 4;
                    break;
                case 3:
                    D = x1kVarB.D(h661Var, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) x1kVarB.B(h661Var, 4, chc1.a, str2);
                    i |= 16;
                    break;
                case 5:
                    jI0 = x1kVarB.i0(h661Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strF = x1kVarB.f(h661Var, 6);
                    i |= 64;
                    break;
                case 7:
                    zM3 = x1kVarB.M(h661Var, 7);
                    i |= 128;
                    break;
                case 8:
                    str3 = (String) x1kVarB.B(h661Var, 8, chc1.a, str3);
                    i |= 256;
                    break;
                case 9:
                    str4 = (String) x1kVarB.B(h661Var, 9, chc1.a, str4);
                    i |= 512;
                    break;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new z8h0(i, zM, zM2, str, D, str2, jI0, strF, zM3, str3, str4);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        z8h0 z8h0Var = (z8h0) obj;
        boolean z = z8h0Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || !z) {
            z1kVarB.E(h661Var, 0, z);
        }
        boolean z2 = z8h0Var.b;
        String str = z8h0Var.g;
        z1kVarB.E(h661Var, 1, z2);
        String str2 = z8h0Var.c;
        if (str2 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str2);
        }
        z1kVarB.g(h661Var, 3, z8h0Var.d);
        String str3 = z8h0Var.e;
        if (str3 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str3);
        }
        z1kVarB.l(h661Var, 5, z8h0Var.f);
        if (z1kVarB.d0() || !u890.j(str, "ANDROID")) {
            z1kVarB.G(h661Var, 6, str);
        }
        z1kVarB.E(h661Var, 7, z8h0Var.h);
        String str4 = z8h0Var.i;
        if (str4 != null) {
            z1kVarB.s(h661Var, 8, chc1.a, str4);
        }
        String str5 = z8h0Var.j;
        if (str5 != null) {
            z1kVarB.s(h661Var, 9, chc1.a, str5);
        }
        z1kVarB.a(h661Var);
    }
}
