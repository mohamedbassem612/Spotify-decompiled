package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class em8 implements pf40 {
    public static final em8 a;
    private static final h661 descriptor;

    static {
        em8 em8Var = new em8();
        a = em8Var;
        m0v0 m0v0Var = new m0v0("com.spotify.login.credentialmanager.passkeys.AuthenticatorSelectionCriteria", em8Var, 3);
        m0v0Var.j("authenticatorAttachment", true);
        m0v0Var.j("residentKey", true);
        m0v0Var.j("userVerification", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var)};
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
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                i |= 1;
            } else if (iP == 1) {
                str2 = (String) x1kVarB.B(h661Var, 1, chc1.a, str2);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                str3 = (String) x1kVarB.B(h661Var, 2, chc1.a, str3);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new gm8(str, str2, i, str3);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        gm8 gm8Var = (gm8) obj;
        String str = gm8Var.c;
        String str2 = gm8Var.b;
        String str3 = gm8Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || str3 != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str3);
        }
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
