package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class k2b implements pf40 {
    public static final k2b a;
    private static final h661 descriptor;

    static {
        k2b k2bVar = new k2b();
        a = k2bVar;
        m0v0 m0v0Var = new m0v0("com.spotify.blend.endpoints.BlendMutateTrackListRequest", k2bVar, 3);
        m0v0Var.j("playlist_id", false);
        m0v0Var.j("track_uri", false);
        m0v0Var.j("mutate_type", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
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
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                strF3 = x1kVarB.f(h661Var, 2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new m2b(strF, strF2, i, strF3);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        m2b m2bVar = (m2b) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, m2bVar.a);
        z1kVarB.G(h661Var, 1, m2bVar.b);
        z1kVarB.G(h661Var, 2, m2bVar.c);
        z1kVarB.a(h661Var);
    }
}
