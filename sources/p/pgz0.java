package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class pgz0 implements pf40 {
    public static final pgz0 a;
    private static final h661 descriptor;

    static {
        pgz0 pgz0Var = new pgz0();
        a = pgz0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.quickstartpivot.playerimpl.endpoint.QuickstartPivotRecommendResponse", pgz0Var, 7);
        m0v0Var.j("action", false);
        m0v0Var.j("contextUri", false);
        m0v0Var.j("contextUrl", true);
        m0v0Var.j("itemUri", true);
        m0v0Var.j("playbackPosition", true);
        m0v0Var.j("playbackOptions", true);
        m0v0Var.j("ttsLens", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, nma0Var, m5n1.z(nma0Var), m5n1.z(nma0Var), m5n1.z(o5f0.a), m5n1.z(h2u0.a), m5n1.z(nma0Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        String str = null;
        String str2 = null;
        Long l = null;
        j2u0 j2u0Var = null;
        String str3 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
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
                    str = (String) x1kVarB.B(h661Var, 2, chc1.a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) x1kVarB.B(h661Var, 3, chc1.a, str2);
                    i |= 8;
                    break;
                case 4:
                    l = (Long) x1kVarB.B(h661Var, 4, o5f0.a, l);
                    i |= 16;
                    break;
                case 5:
                    j2u0Var = (j2u0) x1kVarB.B(h661Var, 5, h2u0.a, j2u0Var);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) x1kVarB.B(h661Var, 6, chc1.a, str3);
                    i |= 64;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new rgz0(i, strF, strF2, str, str2, l, j2u0Var, str3);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        rgz0 rgz0Var = (rgz0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, rgz0Var.a);
        z1kVarB.G(h661Var, 1, rgz0Var.b);
        String str = rgz0Var.c;
        if (str != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str);
        }
        String str2 = rgz0Var.d;
        if (str2 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str2);
        }
        Long l = rgz0Var.e;
        if (l != null) {
            z1kVarB.s(h661Var, 4, o5f0.a, l);
        }
        j2u0 j2u0Var = rgz0Var.f;
        if (j2u0Var != null) {
            z1kVarB.s(h661Var, 5, h2u0.a, j2u0Var);
        }
        String str3 = rgz0Var.g;
        if (str3 != null) {
            z1kVarB.s(h661Var, 6, chc1.a, str3);
        }
        z1kVarB.a(h661Var);
    }
}
