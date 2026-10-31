package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class cv8 implements pf40 {
    public static final cv8 a;
    private static final h661 descriptor;

    static {
        cv8 cv8Var = new cv8();
        a = cv8Var;
        m0v0 m0v0Var = new m0v0("com.spotify.wear.datalayermessages.AutoLoginMessageRequest", cv8Var, 3);
        m0v0Var.j("clientId", false);
        m0v0Var.j("scopes", false);
        m0v0Var.j("codeChallenge", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var};
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
                strF3 = x1kVarB.f(h661Var, 2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new ev8(strF, strF2, i, strF3);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ev8 ev8Var = (ev8) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, ev8Var.a);
        z1kVarB.G(h661Var, 1, ev8Var.b);
        z1kVarB.G(h661Var, 2, ev8Var.c);
        z1kVarB.a(h661Var);
    }
}
