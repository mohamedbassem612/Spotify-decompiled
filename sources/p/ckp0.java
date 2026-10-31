package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class ckp0 implements pf40 {
    public static final ckp0 a;
    private static final h661 descriptor;

    static {
        ckp0 ckp0Var = new ckp0();
        a = ckp0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.liveroom.listeningpartymessagesourceapi.api.OccupancyChannelEvent", ckp0Var, 2);
        m0v0Var.j("common", false);
        m0v0Var.j("occupancy", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{dsh.a, zjp0.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        fsh fshVar = null;
        bkp0 bkp0Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                fshVar = (fsh) x1kVarB.A(h661Var, 0, dsh.a, fshVar);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                bkp0Var = (bkp0) x1kVarB.A(h661Var, 1, zjp0.a, bkp0Var);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new ekp0(i, fshVar, bkp0Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ekp0 ekp0Var = (ekp0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, dsh.a, ekp0Var.a);
        z1kVarB.k(h661Var, 1, zjp0.a, ekp0Var.b);
        z1kVarB.a(h661Var);
    }
}
