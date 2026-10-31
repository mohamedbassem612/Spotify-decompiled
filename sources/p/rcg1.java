package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class rcg1 implements pf40 {
    public static final rcg1 a;
    private static final h661 descriptor;

    static {
        rcg1 rcg1Var = new rcg1();
        a = rcg1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.watchfeed.transcript.datasource.TranscriptRawResponse.Word", rcg1Var, 2);
        m0v0Var.j("word", false);
        m0v0Var.j("offsets", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, ocg1.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        qcg1 qcg1Var = null;
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
                qcg1Var = (qcg1) x1kVarB.A(h661Var, 1, ocg1.a, qcg1Var);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new tcg1(i, strF, qcg1Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        tcg1 tcg1Var = (tcg1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, tcg1Var.a);
        z1kVarB.k(h661Var, 1, ocg1.a, tcg1Var.b);
        z1kVarB.a(h661Var);
    }
}
