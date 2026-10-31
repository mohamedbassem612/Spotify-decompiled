package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class izx implements pf40 {
    public static final izx a;
    private static final h661 descriptor;

    static {
        izx izxVar = new izx();
        a = izxVar;
        m0v0 m0v0Var = new m0v0("com.spotify.betamax.playerimpl.exo.model.EncryptionInfo", izxVar, 4);
        m0v0Var.j("key_system", false);
        m0v0Var.j("encryption_scheme", true);
        m0v0Var.j("license_server_endpoint", true);
        m0v0Var.j("encryption_data", true);
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
        return new kzx(i, strF, strF2, strF3, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        kzx kzxVar = (kzx) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = kzxVar.a;
        String str2 = kzxVar.c;
        String str3 = kzxVar.b;
        z1kVarB.G(h661Var, 0, str);
        if (z1kVarB.d0() || !u890.j(str3, "cenc")) {
            z1kVarB.G(h661Var, 1, str3);
        }
        if (z1kVarB.d0() || !u890.j(str2, "/widevine-license/v1/video/license")) {
            z1kVarB.G(h661Var, 2, str2);
        }
        String str4 = kzxVar.d;
        if (str4 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str4);
        }
        z1kVarB.a(h661Var);
    }
}
