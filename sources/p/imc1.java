package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class imc1 implements pf40 {
    public static final imc1 a;
    private static final h661 descriptor;

    static {
        imc1 imc1Var = new imc1();
        a = imc1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.promptedplaylists.feedback.SubmitFeedbackPayload", imc1Var, 4);
        m0v0Var.j("message_id", false);
        m0v0Var.j("rating", false);
        m0v0Var.j("reason", false);
        m0v0Var.j("additional_info", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var, chc1Var};
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
        String strF4 = null;
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
                strF4 = x1kVarB.f(h661Var, 3);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new kmc1(i, strF, strF2, strF3, strF4);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        kmc1 kmc1Var = (kmc1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, kmc1Var.a);
        z1kVarB.G(h661Var, 1, kmc1Var.b);
        z1kVarB.G(h661Var, 2, kmc1Var.c);
        z1kVarB.G(h661Var, 3, kmc1Var.d);
        z1kVarB.a(h661Var);
    }
}
