package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class ocg1 implements pf40 {
    public static final ocg1 a;
    private static final h661 descriptor;

    static {
        ocg1 ocg1Var = new ocg1();
        a = ocg1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.watchfeed.transcript.datasource.TranscriptRawResponse.Offset", ocg1Var, 2);
        m0v0Var.j("start", false);
        m0v0Var.j("end", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
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
                strF2 = x1kVarB.f(h661Var, 1);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new qcg1(i, strF, strF2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        qcg1 qcg1Var = (qcg1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, qcg1Var.a);
        z1kVarB.G(h661Var, 1, qcg1Var.b);
        z1kVarB.a(h661Var);
    }
}
