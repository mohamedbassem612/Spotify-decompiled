package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class of11 implements pf40 {
    public static final of11 a;
    private static final h661 descriptor;

    static {
        of11 of11Var = new of11();
        a = of11Var;
        m0v0 m0v0Var = new m0v0("com.spotify.login.credentialmanager.passkeys.RegistrationResponseJson", of11Var, 4);
        m0v0Var.j("id", false);
        m0v0Var.j("rawId", false);
        m0v0Var.j("type", false);
        m0v0Var.j("response", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var, kf11.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        mf11 mf11Var = null;
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
            } else if (iP == 2) {
                strF3 = x1kVarB.f(h661Var, 2);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                mf11Var = (mf11) x1kVarB.A(h661Var, 3, kf11.a, mf11Var);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new qf11(i, strF, strF2, strF3, mf11Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        qf11 qf11Var = (qf11) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, qf11Var.a);
        z1kVarB.G(h661Var, 1, qf11Var.b);
        z1kVarB.G(h661Var, 2, qf11Var.c);
        z1kVarB.k(h661Var, 3, kf11.a, qf11Var.d);
        z1kVarB.a(h661Var);
    }
}
