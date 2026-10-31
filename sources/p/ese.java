package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class ese implements pf40 {
    public static final ese a;
    private static final h661 descriptor;

    static {
        ese eseVar = new ese();
        a = eseVar;
        m0v0 m0v0Var = new m0v0("com.spotify.liveroom.listeningpartymessagesourceapi.api.ChatChannelEvent.UnpinMessageEvent", eseVar, 2);
        m0v0Var.j("common", false);
        m0v0Var.j("unpinMessage", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{dsh.a, tjh1.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        fsh fshVar = null;
        vjh1 vjh1Var = null;
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
                vjh1Var = (vjh1) x1kVarB.A(h661Var, 1, tjh1.a, vjh1Var);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new gse(i, fshVar, vjh1Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        gse gseVar = (gse) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, dsh.a, gseVar.a);
        z1kVarB.k(h661Var, 1, tjh1.a, gseVar.b);
        z1kVarB.a(h661Var);
    }
}
