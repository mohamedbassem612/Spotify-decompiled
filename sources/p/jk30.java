package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class jk30 implements pf40 {
    public static final jk30 a;
    private static final h661 descriptor;

    static {
        jk30 jk30Var = new jk30();
        a = jk30Var;
        m0v0 m0v0Var = new m0v0("com.spotify.betamax.playerimpl.exo.model.Frames", jk30Var, 1);
        m0v0Var.j("frame_deltas_in_seconds", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{pgv.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        rgv rgvVar = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                rgvVar = (rgv) x1kVarB.A(h661Var, 0, pgv.a, rgvVar);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new lk30(i, rgvVar);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, pgv.a, ((lk30) obj).a);
        z1kVarB.a(h661Var);
    }
}
