package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class ir8 implements pf40 {
    public static final ir8 a;
    private static final h661 descriptor;

    static {
        ir8 ir8Var = new ir8();
        a = ir8Var;
        m0v0 m0v0Var = new m0v0("com.spotify.wear.wearabledatalayer.AuthorizeRequest", ir8Var, 4);
        m0v0Var.j("client_id", false);
        m0v0Var.j("scopes", false);
        m0v0Var.j("code_challenge", false);
        m0v0Var.j("flow", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, nma0Var, m5n1.z(nma0Var), nma0Var};
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
        String strF3 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                strF2 = x1kVarB.f(h661Var, 1);
                i |= 2;
            } else if (iP == 2) {
                str = (String) x1kVarB.B(h661Var, 2, chc1.a, str);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                strF3 = x1kVarB.f(h661Var, 3);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new kr8(i, strF, strF2, str, strF3);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        kr8 kr8Var = (kr8) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, kr8Var.a);
        z1kVarB.G(h661Var, 1, kr8Var.b);
        z1kVarB.s(h661Var, 2, chc1.a, kr8Var.c);
        z1kVarB.G(h661Var, 3, kr8Var.d);
        z1kVarB.a(h661Var);
    }
}
