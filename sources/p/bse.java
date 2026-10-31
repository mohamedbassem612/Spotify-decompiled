package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class bse implements pf40 {
    public static final bse a;
    private static final h661 descriptor;

    static {
        bse bseVar = new bse();
        a = bseVar;
        m0v0 m0v0Var = new m0v0("com.spotify.liveroom.listeningpartymessagesourceapi.api.ChatChannelEvent.SendMessageEvent", bseVar, 2);
        m0v0Var.j("common", false);
        m0v0Var.j("sendMessage", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{dsh.a, d461.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        fsh fshVar = null;
        f461 f461Var = null;
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
                f461Var = (f461) x1kVarB.A(h661Var, 1, d461.a, f461Var);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new dse(i, fshVar, f461Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        dse dseVar = (dse) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, dsh.a, dseVar.a);
        z1kVarB.k(h661Var, 1, d461.a, dseVar.b);
        z1kVarB.a(h661Var);
    }
}
