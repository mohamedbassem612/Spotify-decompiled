package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class yid0 implements pf40 {
    public static final yid0 a;
    private static final h661 descriptor;

    static {
        yid0 yid0Var = new yid0();
        a = yid0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.prerelease.prerelease.datasource.ListeningPartyCard", yid0Var, 4);
        m0v0Var.j("party", false);
        m0v0Var.j("status", false);
        m0v0Var.j("organizer", false);
        m0v0Var.j("observe_party", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{sid0.a, zld0.a, nkd0.a, wip0.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        wid0 wid0Var = null;
        bmd0 bmd0Var = null;
        pkd0 pkd0Var = null;
        yip0 yip0Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                wid0Var = (wid0) x1kVarB.A(h661Var, 0, sid0.a, wid0Var);
                i |= 1;
            } else if (iP == 1) {
                bmd0Var = (bmd0) x1kVarB.A(h661Var, 1, zld0.a, bmd0Var);
                i |= 2;
            } else if (iP == 2) {
                pkd0Var = (pkd0) x1kVarB.A(h661Var, 2, nkd0.a, pkd0Var);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                yip0Var = (yip0) x1kVarB.A(h661Var, 3, wip0.a, yip0Var);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new ajd0(i, wid0Var, bmd0Var, pkd0Var, yip0Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ajd0 ajd0Var = (ajd0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, sid0.a, ajd0Var.a);
        z1kVarB.k(h661Var, 1, zld0.a, ajd0Var.b);
        z1kVarB.k(h661Var, 2, nkd0.a, ajd0Var.c);
        z1kVarB.k(h661Var, 3, wip0.a, ajd0Var.d);
        z1kVarB.a(h661Var);
    }
}
