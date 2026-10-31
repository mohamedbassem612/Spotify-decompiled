package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class r881 implements pf40 {
    public static final r881 a;
    private static final h661 descriptor;

    static {
        r881 r881Var = new r881();
        a = r881Var;
        m0v0 m0v0Var = new m0v0("com.spotify.podcast.endpoints.policy.ShowPolicy", r881Var, 1);
        m0v0Var.j("policy", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(u381.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        y381 y381Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                y381Var = (y381) x1kVarB.B(h661Var, 0, u381.a, y381Var);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new t881(i, y381Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        y381 y381Var = ((t881) obj).a;
        if (y381Var != null) {
            z1kVarB.s(h661Var, 0, u381.a, y381Var);
        }
        z1kVarB.a(h661Var);
    }
}
