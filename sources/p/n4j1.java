package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class n4j1 implements pf40 {
    public static final n4j1 a;
    private static final h661 descriptor;

    static {
        n4j1 n4j1Var = new n4j1();
        a = n4j1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.versionsunsetting.datasource.VersionSunsettingDataSourceModel.Versions", n4j1Var, 2);
        m0v0Var.j("recommended", true);
        m0v0Var.j("allowed", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        l4j1 l4j1Var = l4j1.a;
        return new nma0[]{m5n1.z(l4j1Var), m5n1.z(l4j1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        m4j1 m4j1Var = null;
        m4j1 m4j1Var2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                m4j1Var = (m4j1) x1kVarB.B(h661Var, 0, l4j1.a, m4j1Var);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                m4j1Var2 = (m4j1) x1kVarB.B(h661Var, 1, l4j1.a, m4j1Var2);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new p4j1(i, m4j1Var, m4j1Var2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        p4j1 p4j1Var = (p4j1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        m4j1 m4j1Var = p4j1Var.a;
        if (m4j1Var != null) {
            z1kVarB.s(h661Var, 0, l4j1.a, m4j1Var);
        }
        m4j1 m4j1Var2 = p4j1Var.b;
        if (m4j1Var2 != null) {
            z1kVarB.s(h661Var, 1, l4j1.a, m4j1Var2);
        }
        z1kVarB.a(h661Var);
    }
}
