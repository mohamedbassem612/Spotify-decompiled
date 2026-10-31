package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class rar implements pf40 {
    public static final rar a;
    private static final h661 descriptor;

    static {
        rar rarVar = new rar();
        a = rarVar;
        m0v0 m0v0Var = new m0v0("com.spotify.podcast.endpoints.policy.DecorationPolicy", rarVar, 1);
        m0v0Var.j("episode", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(f3z.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        e3z e3zVar = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                e3zVar = (e3z) x1kVarB.B(h661Var, 0, f3z.a, e3zVar);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new zar(i, e3zVar);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        e3z e3zVar = ((zar) obj).a;
        if (e3zVar != null) {
            z1kVarB.s(h661Var, 0, f3z.a, e3zVar);
        }
        z1kVarB.a(h661Var);
    }
}
