package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class e5i1 implements pf40 {
    public static final e5i1 a;
    private static final h661 descriptor;

    static {
        e5i1 e5i1Var = new e5i1();
        a = e5i1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.listeningactivity.data.impl.UserActivityPayload", e5i1Var, 2);
        m0v0Var.j("username", false);
        m0v0Var.j("activity", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, m5n1.z(efd0.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        gfd0 gfd0Var = null;
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
                gfd0Var = (gfd0) x1kVarB.B(h661Var, 1, efd0.a, gfd0Var);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new g5i1(i, strF, gfd0Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        g5i1 g5i1Var = (g5i1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, g5i1Var.a);
        gfd0 gfd0Var = g5i1Var.b;
        if (gfd0Var != null) {
            z1kVarB.s(h661Var, 1, efd0.a, gfd0Var);
        }
        z1kVarB.a(h661Var);
    }
}
