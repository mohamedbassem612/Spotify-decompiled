package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class jff0 implements pf40 {
    public static final jff0 a;
    private static final h661 descriptor;

    static {
        jff0 jff0Var = new jff0();
        a = jff0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.lyrics.offlineimpl.database.LyricsDatabaseEntity.Colors", jff0Var, 3);
        m0v0Var.j("background", false);
        m0v0Var.j("text", false);
        m0v0Var.j("highlightedText", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        wr80 wr80Var = wr80.a;
        return new nma0[]{wr80Var, wr80Var, wr80Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        int iO = 0;
        int iO2 = 0;
        int iO3 = 0;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                iO = x1kVarB.o(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                iO2 = x1kVarB.o(h661Var, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                iO3 = x1kVarB.o(h661Var, 2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new lff0(i, iO, iO2, iO3);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        lff0 lff0Var = (lff0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.e(0, lff0Var.a, h661Var);
        z1kVarB.e(1, lff0Var.b, h661Var);
        z1kVarB.e(2, lff0Var.c, h661Var);
        z1kVarB.a(h661Var);
    }
}
