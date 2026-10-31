package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class zwf implements pf40 {
    public static final zwf a;
    private static final h661 descriptor;

    static {
        zwf zwfVar = new zwf();
        a = zwfVar;
        m0v0 m0v0Var = new m0v0("com.spotify.contentaccess.gatedcontent.service.CheckoutSessionRequest", zwfVar, 3);
        m0v0Var.j("show_uri", false);
        m0v0Var.j("currency", false);
        m0v0Var.j("price", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, dru.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        int i = 0;
        String strF = null;
        String strF2 = null;
        double D = 0.0d;
        boolean z = true;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                strF2 = x1kVarB.f(h661Var, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                D = x1kVarB.D(h661Var, 2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new bxf(i, strF, strF2, D);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        bxf bxfVar = (bxf) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, bxfVar.a);
        z1kVarB.G(h661Var, 1, bxfVar.b);
        z1kVarB.g(h661Var, 2, bxfVar.c);
        z1kVarB.a(h661Var);
    }
}
