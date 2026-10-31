package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class ly01 implements pf40 {
    public static final ly01 a;
    private static final h661 descriptor;

    static {
        ly01 ly01Var = new ly01();
        a = ly01Var;
        m0v0 m0v0Var = new m0v0("com.spotify.quickstartpivot.playerimpl.endpoint.RecommendationOptions", ly01Var, 3);
        m0v0Var.j("contentType", true);
        m0v0Var.j("targetDeviceId", true);
        m0v0Var.j("withTts", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(gpb.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Boolean bool = null;
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
                bool = (Boolean) x1kVarB.B(h661Var, 2, gpb.a, bool);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new ny01(i, str, str2, bool);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ny01 ny01Var = (ny01) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = ny01Var.a;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        String str2 = ny01Var.b;
        if (str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        Boolean bool = ny01Var.c;
        if (bool != null) {
            z1kVarB.s(h661Var, 2, gpb.a, bool);
        }
        z1kVarB.a(h661Var);
    }
}
