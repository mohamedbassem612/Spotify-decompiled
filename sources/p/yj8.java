package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class yj8 implements pf40 {
    public static final yj8 a;
    private static final h661 descriptor;

    static {
        yj8 yj8Var = new yj8();
        a = yj8Var;
        m0v0 m0v0Var = new m0v0("com.spotify.login.credentialmanager.passkeys.AuthenticationInnerResponse", yj8Var, 4);
        m0v0Var.j("clientDataJSON", false);
        m0v0Var.j("authenticatorData", false);
        m0v0Var.j("signature", false);
        m0v0Var.j("userHandle", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, nma0Var, nma0Var, m5n1.z(nma0Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String str = null;
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
                strF3 = x1kVarB.f(h661Var, 2);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                str = (String) x1kVarB.B(h661Var, 3, chc1.a, str);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new ak8(i, strF, strF2, strF3, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ak8 ak8Var = (ak8) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = ak8Var.a;
        String str2 = ak8Var.d;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, ak8Var.b);
        z1kVarB.G(h661Var, 2, ak8Var.c);
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str2);
        }
        z1kVarB.a(h661Var);
    }
}
