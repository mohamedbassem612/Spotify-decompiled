package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class bfh1 implements pf40 {
    public static final bfh1 a;
    private static final h661 descriptor;

    static {
        bfh1 bfh1Var = new bfh1();
        a = bfh1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.aipartner.promptsuggestionsprovider.UnauthenticatedPromptSuggestion", bfh1Var, 2);
        m0v0Var.j("text", false);
        m0v0Var.j("prompt_uri", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, m5n1.z(nma0Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String str = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                str = (String) x1kVarB.B(h661Var, 1, chc1.a, str);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new dfh1(i, strF, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        dfh1 dfh1Var = (dfh1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = dfh1Var.a;
        String str2 = dfh1Var.b;
        z1kVarB.G(h661Var, 0, str);
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        z1kVarB.a(h661Var);
    }
}
