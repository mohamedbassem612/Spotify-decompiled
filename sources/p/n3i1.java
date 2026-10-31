package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class n3i1 implements pf40 {
    public static final n3i1 a;
    private static final h661 descriptor;

    static {
        n3i1 n3i1Var = new n3i1();
        a = n3i1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.payment.paymentimpl.UrlEntry", n3i1Var, 3);
        m0v0Var.j("sessionId", false);
        m0v0Var.j("url", false);
        m0v0Var.j("timestamp", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, o5f0.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        int i = 0;
        String strF = null;
        String strF2 = null;
        long jI0 = 0;
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
                jI0 = x1kVarB.i0(h661Var, 2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new p3i1(i, strF, strF2, jI0);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        p3i1 p3i1Var = (p3i1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, p3i1Var.a);
        z1kVarB.G(h661Var, 1, p3i1Var.b);
        z1kVarB.l(h661Var, 2, p3i1Var.c);
        z1kVarB.a(h661Var);
    }
}
