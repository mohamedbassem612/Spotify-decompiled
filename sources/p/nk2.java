package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class nk2 implements pf40 {
    public static final nk2 a;
    private static final h661 descriptor;

    static {
        nk2 nk2Var = new nk2();
        a = nk2Var;
        m0v0 m0v0Var = new m0v0("com.spotify.ageverification.dialog.model.AgeVerificationDialogModel", nk2Var, 2);
        m0v0Var.j("color", false);
        m0v0Var.j("provider_url", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{wr80.a, chc1.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        int iO = 0;
        String strF = null;
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
                strF = x1kVarB.f(h661Var, 1);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new pk2(i, iO, strF);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        pk2 pk2Var = (pk2) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.e(0, pk2Var.a, h661Var);
        z1kVarB.G(h661Var, 1, pk2Var.b);
        z1kVarB.a(h661Var);
    }
}
