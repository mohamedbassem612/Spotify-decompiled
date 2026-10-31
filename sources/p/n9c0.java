package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class n9c0 implements pf40 {
    public static final n9c0 a;
    private static final h661 descriptor;

    static {
        n9c0 n9c0Var = new n9c0();
        a = n9c0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.liveroom.listeningpartymessagesourceapi.api.LifecycleChannelEvent.ClosePartyEvent", n9c0Var, 2);
        m0v0Var.j("common", false);
        m0v0Var.j("closeParty", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{dsh.a, asg.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        fsh fshVar = null;
        csg csgVar = null;
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
                csgVar = (csg) x1kVarB.A(h661Var, 1, asg.a, csgVar);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new p9c0(i, fshVar, csgVar);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        p9c0 p9c0Var = (p9c0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, dsh.a, p9c0Var.a);
        z1kVarB.k(h661Var, 1, asg.a, p9c0Var.b);
        z1kVarB.a(h661Var);
    }
}
