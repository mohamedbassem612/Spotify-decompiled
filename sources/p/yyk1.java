package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class yyk1 implements pf40 {
    public static final yyk1 a;
    private static final h661 descriptor;

    static {
        yyk1 yyk1Var = new yyk1();
        a = yyk1Var;
        m0v0 m0v0Var = new m0v0("didReceiveBetaMessage", yyk1Var, 2);
        m0v0Var.j("betaType", false);
        m0v0Var.j("data", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, m5n1.z(hga0.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        ega0 ega0Var = null;
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
                ega0Var = (ega0) x1kVarB.B(h661Var, 1, hga0.a, ega0Var);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new azk1(i, strF, ega0Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        azk1 azk1Var = (azk1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, azk1Var.b);
        ega0 ega0Var = azk1Var.c;
        if (ega0Var != null) {
            z1kVarB.s(h661Var, 1, hga0.a, ega0Var);
        }
        z1kVarB.a(h661Var);
    }
}
