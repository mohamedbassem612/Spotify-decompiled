package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class vf70 implements pf40 {
    public static final vf70 a;
    private static final h661 descriptor;

    static {
        vf70 vf70Var = new vf70();
        a = vf70Var;
        m0v0 m0v0Var = new m0v0("com.spotify.externalintegration.http.HydrogenSubtitle", vf70Var, 2);
        m0v0Var.j("value", false);
        m0v0Var.j("rendering", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, rf70.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        qf70 qf70Var = null;
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
                qf70Var = (qf70) x1kVarB.A(h661Var, 1, rf70.a, qf70Var);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new xf70(i, strF, qf70Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        xf70 xf70Var = (xf70) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, xf70Var.a);
        z1kVarB.k(h661Var, 1, rf70.a, xf70Var.b);
        z1kVarB.a(h661Var);
    }
}
