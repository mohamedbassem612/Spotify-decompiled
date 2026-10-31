package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class jp70 implements pf40 {
    public static final jp70 a;
    private static final h661 descriptor;

    static {
        jp70 jp70Var = new jp70();
        a = jp70Var;
        m0v0 m0v0Var = new m0v0("com.spotify.artist.creatorcommon.model.Image", jp70Var, 3);
        m0v0Var.j("uri", false);
        m0v0Var.j("width", false);
        m0v0Var.j("height", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        wr80 wr80Var = wr80.a;
        return new nma0[]{chc1.a, wr80Var, wr80Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        int iO = 0;
        int iO2 = 0;
        String strF = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                iO = x1kVarB.o(h661Var, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                iO2 = x1kVarB.o(h661Var, 2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new hq70(i, iO, iO2, strF);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        hq70 hq70Var = (hq70) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, hq70Var.a);
        z1kVarB.e(1, hq70Var.b, h661Var);
        z1kVarB.e(2, hq70Var.c, h661Var);
        z1kVarB.a(h661Var);
    }
}
