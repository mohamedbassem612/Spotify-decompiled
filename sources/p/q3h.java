package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class q3h implements pf40 {
    public static final q3h a;
    private static final h661 descriptor;

    static {
        q3h q3hVar = new q3h();
        a = q3hVar;
        m0v0 m0v0Var = new m0v0("com.spotify.podcast.endpoints.collection.CollectionEpisodesPolicy.Policy", q3hVar, 1);
        m0v0Var.j("policy", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{l3h.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        n3h n3hVar = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                n3hVar = (n3h) x1kVarB.A(h661Var, 0, l3h.a, n3hVar);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new s3h(i, n3hVar);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, l3h.a, ((s3h) obj).a);
        z1kVarB.a(h661Var);
    }
}
