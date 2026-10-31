package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class hpe1 implements pf40 {
    public static final hpe1 a;
    private static final h661 descriptor;

    static {
        hpe1 hpe1Var = new hpe1();
        a = hpe1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.watchfeed.transcript.datasource.TimeSyncedApiRequestResponse.TimeSyncedText", hpe1Var, 5);
        m0v0Var.j("word", false);
        m0v0Var.j("startTimeMs", false);
        m0v0Var.j("endTimeMs", false);
        m0v0Var.j("speakerId", false);
        m0v0Var.j("segmentId", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        o5f0 o5f0Var = o5f0.a;
        wr80 wr80Var = wr80.a;
        return new nma0[]{chc1.a, o5f0Var, o5f0Var, wr80Var, wr80Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        int i = 0;
        int iO = 0;
        int iO2 = 0;
        String strF = null;
        long jI0 = 0;
        long jI1 = 0;
        boolean z = true;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                jI0 = x1kVarB.i0(h661Var, 1);
                i |= 2;
            } else if (iP == 2) {
                jI1 = x1kVarB.i0(h661Var, 2);
                i |= 4;
            } else if (iP == 3) {
                iO = x1kVarB.o(h661Var, 3);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                iO2 = x1kVarB.o(h661Var, 4);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new jpe1(i, strF, jI0, jI1, iO, iO2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        jpe1 jpe1Var = (jpe1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, jpe1Var.a);
        z1kVarB.l(h661Var, 1, jpe1Var.b);
        z1kVarB.l(h661Var, 2, jpe1Var.c);
        z1kVarB.e(3, jpe1Var.d, h661Var);
        z1kVarB.e(4, jpe1Var.e, h661Var);
        z1kVarB.a(h661Var);
    }
}
