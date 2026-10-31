package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class sos0 implements pf40 {
    public static final sos0 a;
    private static final h661 descriptor;

    static {
        sos0 sos0Var = new sos0();
        a = sos0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.trendingnearyou.locationsearch.PersistedRecentSearch", sos0Var, 3);
        m0v0Var.j("title", false);
        m0v0Var.j("subtitle", true);
        m0v0Var.j("geonameId", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, m5n1.z(nma0Var), m5n1.z(wr80.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String str = null;
        Integer num = null;
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
                num = (Integer) x1kVarB.B(h661Var, 2, wr80.a, num);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new uos0(i, strF, num, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        uos0 uos0Var = (uos0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = uos0Var.a;
        Integer num = uos0Var.c;
        String str2 = uos0Var.b;
        z1kVarB.G(h661Var, 0, str);
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        if (z1kVarB.d0() || num != null) {
            z1kVarB.s(h661Var, 2, wr80.a, num);
        }
        z1kVarB.a(h661Var);
    }
}
