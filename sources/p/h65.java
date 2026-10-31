package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final /* synthetic */ class h65 implements pf40 {
    public static final h65 a;
    private static final h661 descriptor;

    static {
        h65 h65Var = new h65();
        a = h65Var;
        m0v0 m0v0Var = new m0v0("com.spotify.connect.core.model.AndroidUris", h65Var, 4);
        m0v0Var.j("uri", true);
        m0v0Var.j("redirectBackAppParam", true);
        m0v0Var.j("deviceNameParam", true);
        m0v0Var.j("fallbackUrl", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var)};
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
        String str4 = null;
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
            } else if (iP == 2) {
                str3 = (String) x1kVarB.B(h661Var, 2, chc1.a, str3);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                str4 = (String) x1kVarB.B(h661Var, 3, chc1.a, str4);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new j65(i, str, str2, str3, str4);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        j65 j65Var = (j65) obj;
        String str = j65Var.d;
        String str2 = j65Var.c;
        String str3 = j65Var.b;
        String str4 = j65Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || str4 != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str4);
        }
        if (z1kVarB.d0() || str3 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str3);
        }
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str2);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
