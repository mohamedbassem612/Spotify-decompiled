package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class jo6 implements pf40 {
    public static final jo6 a;
    private static final h661 descriptor;

    static {
        jo6 jo6Var = new jo6();
        a = jo6Var;
        m0v0 m0v0Var = new m0v0("com.spotify.artist.creatorartist.model.ArtistFactResponse", jo6Var, 3);
        m0v0Var.j("type", true);
        m0v0Var.j("aiPersonaClassification", true);
        m0v0Var.j("localizedFact", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                i |= 1;
            } else if (iP == 1) {
                str2 = (String) x1kVarB.B(h661Var, 1, chc1.a, str2);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                str3 = (String) x1kVarB.B(h661Var, 2, chc1.a, str3);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new lo6(str, str2, i, str3);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        lo6 lo6Var = (lo6) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = lo6Var.a;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        String str2 = lo6Var.b;
        if (str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        String str3 = lo6Var.c;
        if (str3 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str3);
        }
        z1kVarB.a(h661Var);
    }
}
