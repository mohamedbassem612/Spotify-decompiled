package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class n0z implements pf40 {
    public static final n0z a;
    private static final h661 descriptor;

    static {
        n0z n0zVar = new n0z();
        a = n0zVar;
        m0v0 m0v0Var = new m0v0("com.spotify.culturalmoments.culturalmomentsscrollcarddataelementimpl.data.EntrypointResponse", n0zVar, 1);
        m0v0Var.j("entrypoint", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{k0z.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        m0z m0zVar = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                m0zVar = (m0z) x1kVarB.A(h661Var, 0, k0z.a, m0zVar);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new p0z(i, m0zVar);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, k0z.a, ((p0z) obj).a);
        z1kVarB.a(h661Var);
    }
}
