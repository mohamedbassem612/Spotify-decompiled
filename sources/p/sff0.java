package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class sff0 implements pf40 {
    public static final sff0 a;
    private static final h661 descriptor;

    static {
        sff0 sff0Var = new sff0();
        a = sff0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.lyrics.offlineimpl.database.LyricsDatabaseEntity.Syllable", sff0Var, 2);
        m0v0Var.j("startTimeInMs", false);
        m0v0Var.j("characterCount", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        wr80 wr80Var = wr80.a;
        return new nma0[]{wr80Var, wr80Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        int iO = 0;
        int iO2 = 0;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                iO = x1kVarB.o(h661Var, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                iO2 = x1kVarB.o(h661Var, 1);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new uff0(i, iO, iO2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        uff0 uff0Var = (uff0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.e(0, uff0Var.a, h661Var);
        z1kVarB.e(1, uff0Var.b, h661Var);
        z1kVarB.a(h661Var);
    }
}
