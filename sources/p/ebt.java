package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class ebt implements pf40 {
    public static final ebt a;
    private static final h661 descriptor;

    static {
        ebt ebtVar = new ebt();
        a = ebtVar;
        m0v0 m0v0Var = new m0v0("com.spotify.mediabrowserservice.allowlistpackagevalidator.denylist.data.DenylistResponse", ebtVar, 1);
        m0v0Var.j("android", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{rc4.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        tc4 tc4Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                tc4Var = (tc4) x1kVarB.A(h661Var, 0, rc4.a, tc4Var);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new gbt(i, tc4Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, rc4.a, ((gbt) obj).a);
        z1kVarB.a(h661Var);
    }
}
