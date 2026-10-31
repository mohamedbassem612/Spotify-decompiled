package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class zg80 implements pf40 {
    public static final zg80 a;
    private static final h661 descriptor;

    static {
        zg80 zg80Var = new zg80();
        a = zg80Var;
        m0v0 m0v0Var = new m0v0("com.spotify.promptedplaylists.ucpapiimpl.InlinePromptSuggestionsRequest", zg80Var, 3);
        m0v0Var.j("prompt_text", false);
        m0v0Var.j("playlist_uri", false);
        m0v0Var.j("num_suggestions", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, m5n1.z(nma0Var), wr80.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        int iO = 0;
        String strF = null;
        String str = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                str = (String) x1kVarB.B(h661Var, 1, chc1.a, str);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                iO = x1kVarB.o(h661Var, 2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new bh80(i, strF, str, iO);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        bh80 bh80Var = (bh80) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, bh80Var.a);
        z1kVarB.s(h661Var, 1, chc1.a, bh80Var.b);
        z1kVarB.e(2, bh80Var.c, h661Var);
        z1kVarB.a(h661Var);
    }
}
