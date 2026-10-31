package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class vh51 implements pf40 {
    public static final vh51 a;
    private static final h661 descriptor;

    static {
        vh51 vh51Var = new vh51();
        a = vh51Var;
        m0v0 m0v0Var = new m0v0("com.spotify.externalintegration.http.SectionItem", vh51Var, 5);
        m0v0Var.j("image", false);
        m0v0Var.j("links", false);
        m0v0Var.j("title", false);
        m0v0Var.j("subtitle", true);
        m0v0Var.j("spotify_uri", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{hp70.a, ulc0.a, nma0Var, m5n1.z(nma0Var), m5n1.z(nma0Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        zp70 zp70Var = null;
        wlc0 wlc0Var = null;
        String strF = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                zp70Var = (zp70) x1kVarB.A(h661Var, 0, hp70.a, zp70Var);
                i |= 1;
            } else if (iP == 1) {
                wlc0Var = (wlc0) x1kVarB.A(h661Var, 1, ulc0.a, wlc0Var);
                i |= 2;
            } else if (iP == 2) {
                strF = x1kVarB.f(h661Var, 2);
                i |= 4;
            } else if (iP == 3) {
                str = (String) x1kVarB.B(h661Var, 3, chc1.a, str);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                str2 = (String) x1kVarB.B(h661Var, 4, chc1.a, str2);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new bi51(i, zp70Var, wlc0Var, strF, str, str2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        bi51 bi51Var = (bi51) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        hp70 hp70Var = hp70.a;
        zp70 zp70Var = bi51Var.a;
        String str = bi51Var.e;
        String str2 = bi51Var.d;
        z1kVarB.k(h661Var, 0, hp70Var, zp70Var);
        z1kVarB.k(h661Var, 1, ulc0.a, bi51Var.b);
        z1kVarB.G(h661Var, 2, bi51Var.c);
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str2);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
