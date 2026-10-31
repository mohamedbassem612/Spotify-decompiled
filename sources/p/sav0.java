package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class sav0 implements pf40 {
    public static final sav0 a;
    private static final h661 descriptor;

    static {
        sav0 sav0Var = new sav0();
        a = sav0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.podcast.endpoints.policy.Policy", sav0Var, 1);
        m0v0Var.j("policy", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(rar.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        zar zarVar = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                zarVar = (zar) x1kVarB.B(h661Var, 0, rar.a, zarVar);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new uav0(i, zarVar);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        zar zarVar = ((uav0) obj).a;
        if (zarVar != null) {
            z1kVarB.s(h661Var, 0, rar.a, zarVar);
        }
        z1kVarB.a(h661Var);
    }
}
