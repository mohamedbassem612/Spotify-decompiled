package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class g470 implements pf40 {
    public static final g470 a;
    private static final h661 descriptor;

    static {
        g470 g470Var = new g470();
        a = g470Var;
        m0v0 m0v0Var = new m0v0("com.spotify.culturalmoments.hubspage.data.HubResponse", g470Var, 1);
        m0v0Var.j("hubViewData", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{se70.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        re70 re70Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                re70Var = (re70) x1kVarB.A(h661Var, 0, se70.a, re70Var);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new i470(i, re70Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, se70.a, ((i470) obj).a);
        z1kVarB.a(h661Var);
    }
}
