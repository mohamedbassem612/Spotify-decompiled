package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class ds80 implements pf40 {
    public static final ds80 a;
    private static final h661 descriptor;

    static {
        ds80 ds80Var = new ds80();
        a = ds80Var;
        m0v0 m0v0Var = new m0v0("com.spotify.partneraccountlinking.googleassistant.linkstate.Integration", ds80Var, 2);
        m0v0Var.j("isConnected", false);
        m0v0Var.j("partnerIntegrationId", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{gpb.a, chc1.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        String strF = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                zM = x1kVarB.M(h661Var, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                strF = x1kVarB.f(h661Var, 1);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new fs80(strF, i, zM);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        fs80 fs80Var = (fs80) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.E(h661Var, 0, fs80Var.a);
        z1kVarB.G(h661Var, 1, fs80Var.b);
        z1kVarB.a(h661Var);
    }
}
