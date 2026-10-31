package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class s661 implements pf40 {
    public static final s661 a;
    private static final h661 descriptor;

    static {
        s661 s661Var = new s661();
        a = s661Var;
        m0v0 m0v0Var = new m0v0("com.spotify.follow.manager.SerializedCount", s661Var, 2);
        m0v0Var.j("followers_count", false);
        m0v0Var.j("following_count", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        wr80 wr80Var = wr80.a;
        return new nma0[]{wr80Var, wr80Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        int iO = 0;
        int iO2 = 0;
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
                iO2 = x1kVarB.o(h661Var, 1);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new u661(i, iO, iO2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        u661 u661Var = (u661) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.e(0, u661Var.a, h661Var);
        z1kVarB.e(1, u661Var.b, h661Var);
        z1kVarB.a(h661Var);
    }
}
