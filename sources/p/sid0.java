package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class sid0 implements pf40 {
    public static final sid0 a;
    private static final h661 descriptor;

    static {
        sid0 sid0Var = new sid0();
        a = sid0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.prerelease.prerelease.datasource.ListeningParty", sid0Var, 5);
        m0v0Var.j("uri", false);
        m0v0Var.j("organizer_uri", false);
        m0v0Var.j("image_url", true);
        m0v0Var.j("premium_only", false);
        m0v0Var.j("scheduled_for", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, nma0Var, m5n1.z(nma0Var), gpb.a, nma0Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
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
            } else if (iP == 3) {
                zM = x1kVarB.M(h661Var, 3);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                strF3 = x1kVarB.f(h661Var, 4);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new wid0(strF, i, strF2, str, zM, strF3);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        wid0 wid0Var = (wid0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, wid0Var.a);
        z1kVarB.G(h661Var, 1, wid0Var.b);
        String str = wid0Var.c;
        if (str != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str);
        }
        z1kVarB.E(h661Var, 3, wid0Var.d);
        z1kVarB.G(h661Var, 4, wid0Var.e);
        z1kVarB.a(h661Var);
    }
}
