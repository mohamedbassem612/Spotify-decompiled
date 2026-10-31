package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class w320 implements pf40 {
    public static final w320 a;
    private static final h661 descriptor;

    static {
        w320 w320Var = new w320();
        a = w320Var;
        m0v0 m0v0Var = new m0v0("com.spotify.oopsplatform.diagnosticreports.FileDiagnosticReportStore.Manifest", w320Var, 2);
        m0v0Var.j("schemaVersion", false);
        m0v0Var.j("report", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{wr80.a, t0u.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        int iO = 0;
        v0u v0uVar = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                iO = x1kVarB.o(h661Var, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                v0uVar = (v0u) x1kVarB.A(h661Var, 1, t0u.a, v0uVar);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new y320(i, iO, v0uVar);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        y320 y320Var = (y320) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.e(0, y320Var.a, h661Var);
        z1kVarB.k(h661Var, 1, t0u.a, y320Var.b);
        z1kVarB.a(h661Var);
    }
}
