package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class gzk1 implements pf40 {
    public static final gzk1 a;
    private static final h661 descriptor;

    static {
        gzk1 gzk1Var = new gzk1();
        a = gzk1Var;
        m0v0 m0v0Var = new m0v0("didCreatePlaylist", gzk1Var, 3);
        m0v0Var.j("requestId", false);
        m0v0Var.j("playlistUri", true);
        m0v0Var.j("error", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{wr80.a, m5n1.z(chc1Var), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        int iO = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                iO = x1kVarB.o(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                str = (String) x1kVarB.B(h661Var, 1, chc1.a, str);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                str2 = (String) x1kVarB.B(h661Var, 2, chc1.a, str2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new izk1(i, str, iO, str2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        izk1 izk1Var = (izk1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.e(0, izk1Var.b, h661Var);
        String str = izk1Var.c;
        if (str != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str);
        }
        String str2 = izk1Var.d;
        if (str2 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str2);
        }
        z1kVarB.a(h661Var);
    }
}
