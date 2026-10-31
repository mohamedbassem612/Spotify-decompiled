package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class cq40 implements pf40 {
    public static final cq40 a;
    private static final h661 descriptor;

    static {
        cq40 cq40Var = new cq40();
        a = cq40Var;
        m0v0 m0v0Var = new m0v0("com.spotify.thestage.vtec.datasource.GetSiteResponse", cq40Var, 1);
        m0v0Var.j("site", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{d291.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        f291 f291Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                f291Var = (f291) x1kVarB.A(h661Var, 0, d291.a, f291Var);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new eq40(i, f291Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, d291.a, ((eq40) obj).a);
        z1kVarB.a(h661Var);
    }
}
