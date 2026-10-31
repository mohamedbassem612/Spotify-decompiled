package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class y1b implements pf40 {
    public static final y1b a;
    private static final h661 descriptor;

    static {
        y1b y1bVar = new y1b();
        a = y1bVar;
        m0v0 m0v0Var = new m0v0("com.spotify.listplatform.contextmenuimpl.providers.items.celebrityblendleave.BlendLeaveRequest", y1bVar, 1);
        m0v0Var.j("playlist_uri", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                strF = x1kVarB.f(h661Var, 0);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new c2b(i, strF);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, ((c2b) obj).a);
        z1kVarB.a(h661Var);
    }
}
