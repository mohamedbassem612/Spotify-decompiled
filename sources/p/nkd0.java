package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class nkd0 implements pf40 {
    public static final nkd0 a;
    private static final h661 descriptor;

    static {
        nkd0 nkd0Var = new nkd0();
        a = nkd0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.prerelease.prerelease.datasource.ListeningPartyOrganizer", nkd0Var, 3);
        m0v0Var.j("uri", false);
        m0v0Var.j("name", false);
        m0v0Var.j("image_url", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, nma0Var, m5n1.z(nma0Var)};
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
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                str = (String) x1kVarB.B(h661Var, 2, chc1.a, str);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new pkd0(strF, strF2, i, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        pkd0 pkd0Var = (pkd0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, pkd0Var.a);
        z1kVarB.G(h661Var, 1, pkd0Var.b);
        String str = pkd0Var.c;
        if (str != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
