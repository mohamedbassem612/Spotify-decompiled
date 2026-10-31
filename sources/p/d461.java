package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class d461 implements pf40 {
    public static final d461 a;
    private static final h661 descriptor;

    static {
        d461 d461Var = new d461();
        a = d461Var;
        m0v0 m0v0Var = new m0v0("com.spotify.liveroom.listeningpartymessagesourceapi.api.SendMessage", d461Var, 1);
        m0v0Var.j("message", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{ebf.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        ibf ibfVar = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                ibfVar = (ibf) x1kVarB.A(h661Var, 0, ebf.a, ibfVar);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new f461(i, ibfVar);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, ebf.a, ((f461) obj).a);
        z1kVarB.a(h661Var);
    }
}
