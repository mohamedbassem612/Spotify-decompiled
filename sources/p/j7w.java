package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class j7w implements pf40 {
    public static final j7w a;
    private static final h661 descriptor;

    static {
        j7w j7wVar = new j7w();
        a = j7wVar;
        m0v0 m0v0Var = new m0v0("com.spotify.search.ondemandsharedpreferences.editorial.cache.EditorialOnDemandCachedInfo", j7wVar, 2);
        m0v0Var.j("playlistUri", false);
        m0v0Var.j("playedTimeInMillis", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, o5f0.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        long jI0 = 0;
        boolean z = true;
        int i = 0;
        String strF = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                jI0 = x1kVarB.i0(h661Var, 1);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new l7w(jI0, i, strF);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        l7w l7wVar = (l7w) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, l7wVar.a);
        z1kVarB.l(h661Var, 1, l7wVar.b);
        z1kVarB.a(h661Var);
    }
}
