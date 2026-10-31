package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class cl30 implements pf40 {
    public static final cl30 a;
    private static final h661 descriptor;

    static {
        cl30 cl30Var = new cl30();
        a = cl30Var;
        m0v0 m0v0Var = new m0v0("com.spotify.payment.commercesafetyimpl.endpoint.FraudDataCollectionEndpoint.Event", cl30Var, 5);
        m0v0Var.j("eventType", false);
        m0v0Var.j("uuid", false);
        m0v0Var.j("client", false);
        m0v0Var.j("context", false);
        m0v0Var.j("data", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{el30.f[0].getValue(), chc1Var, chc1Var, chc1Var, zk30.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = el30.f;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        gl30 gl30Var = null;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        bl30 bl30Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                gl30Var = (gl30) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), gl30Var);
                i |= 1;
            } else if (iP == 1) {
                strF = x1kVarB.f(h661Var, 1);
                i |= 2;
            } else if (iP == 2) {
                strF2 = x1kVarB.f(h661Var, 2);
                i |= 4;
            } else if (iP == 3) {
                strF3 = x1kVarB.f(h661Var, 3);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                bl30Var = (bl30) x1kVarB.A(h661Var, 4, zk30.a, bl30Var);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new el30(i, gl30Var, strF, strF2, strF3, bl30Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        el30 el30Var = (el30) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, (nma0) el30.f[0].getValue(), el30Var.a);
        z1kVarB.G(h661Var, 1, el30Var.b);
        z1kVarB.G(h661Var, 2, el30Var.c);
        z1kVarB.G(h661Var, 3, el30Var.d);
        z1kVarB.k(h661Var, 4, zk30.a, el30Var.e);
        z1kVarB.a(h661Var);
    }
}
