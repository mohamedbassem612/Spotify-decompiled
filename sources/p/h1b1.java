package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class h1b1 implements pf40 {
    public static final h1b1 a;
    private static final h661 descriptor;

    static {
        h1b1 h1b1Var = new h1b1();
        a = h1b1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.adsdisplay.sponsorshipimpl.model.Sponsorship", h1b1Var, 5);
        m0v0Var.j("startTime", true);
        m0v0Var.j("endTime", true);
        m0v0Var.j("spotifyUri", false);
        m0v0Var.j("advertiser", true);
        m0v0Var.j("version", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        o5f0 o5f0Var = o5f0.a;
        nma0 nma0VarZ = m5n1.z(o5f0Var);
        nma0 nma0VarZ2 = m5n1.z(o5f0Var);
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0VarZ, nma0VarZ2, nma0Var, m5n1.z(nma0Var), m5n1.z(wr80.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        Long l = null;
        Long l2 = null;
        String strF = null;
        String str = null;
        Integer num = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                l = (Long) x1kVarB.B(h661Var, 0, o5f0.a, l);
                i |= 1;
            } else if (iP == 1) {
                l2 = (Long) x1kVarB.B(h661Var, 1, o5f0.a, l2);
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
                num = (Integer) x1kVarB.B(h661Var, 4, wr80.a, num);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new n1b1(i, l, l2, strF, str, num);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        n1b1 n1b1Var = (n1b1) obj;
        Long l = n1b1Var.b;
        Long l2 = n1b1Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || l2 != null) {
            z1kVarB.s(h661Var, 0, o5f0.a, l2);
        }
        if (z1kVarB.d0() || l != null) {
            z1kVarB.s(h661Var, 1, o5f0.a, l);
        }
        String str = n1b1Var.c;
        Integer num = n1b1Var.e;
        String str2 = n1b1Var.d;
        z1kVarB.G(h661Var, 2, str);
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str2);
        }
        if (z1kVarB.d0() || num != null) {
            z1kVarB.s(h661Var, 4, wr80.a, num);
        }
        z1kVarB.a(h661Var);
    }
}
