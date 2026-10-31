package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class k9c0 implements pf40 {
    public static final k9c0 a;
    private static final h661 descriptor;

    static {
        k9c0 k9c0Var = new k9c0();
        a = k9c0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.liveroom.listeningpartymessagesourceapi.api.LifecycleChannelEvent.ArchivePartyEvent", k9c0Var, 2);
        m0v0Var.j("common", false);
        m0v0Var.j("archiveParty", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{dsh.a, r26.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        fsh fshVar = null;
        t26 t26Var = null;
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
                t26Var = (t26) x1kVarB.A(h661Var, 1, r26.a, t26Var);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new m9c0(i, fshVar, t26Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        m9c0 m9c0Var = (m9c0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, dsh.a, m9c0Var.a);
        z1kVarB.k(h661Var, 1, r26.a, m9c0Var.b);
        z1kVarB.a(h661Var);
    }
}
