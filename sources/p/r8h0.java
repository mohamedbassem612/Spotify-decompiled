package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class r8h0 implements pf40 {
    public static final r8h0 a;
    private static final h661 descriptor;

    static {
        r8h0 r8h0Var = new r8h0();
        a = r8h0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.deeplink.deferreddeeplink.MatchRequest", r8h0Var, 2);
        m0v0Var.j("platform", true);
        m0v0Var.j("install_referrer", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, m5n1.z(nma0Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String str = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                str = (String) x1kVarB.B(h661Var, 1, chc1.a, str);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new t8h0(i, strF, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        t8h0 t8h0Var = (t8h0) obj;
        String str = t8h0Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || !u890.j(str, "ANDROID")) {
            z1kVarB.G(h661Var, 0, str);
        }
        String str2 = t8h0Var.b;
        if (str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        z1kVarB.a(h661Var);
    }
}
