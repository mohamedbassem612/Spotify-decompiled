package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class rtc implements pf40 {
    public static final rtc a;
    private static final h661 descriptor;

    static {
        rtc rtcVar = new rtc();
        a = rtcVar;
        m0v0 m0v0Var = new m0v0("com.spotify.widgets.mediabrowserdatasource.CachedRecommendationItem", rtcVar, 4);
        m0v0Var.j("title", false);
        m0v0Var.j("subtitle", false);
        m0v0Var.j("artwork_uri", false);
        m0v0Var.j("uri", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var, chc1Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                strF2 = x1kVarB.f(h661Var, 1);
                i |= 2;
            } else if (iP == 2) {
                strF3 = x1kVarB.f(h661Var, 2);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                strF4 = x1kVarB.f(h661Var, 3);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new ttc(i, strF, strF2, strF3, strF4);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ttc ttcVar = (ttc) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, ttcVar.a);
        z1kVarB.G(h661Var, 1, ttcVar.b);
        z1kVarB.G(h661Var, 2, ttcVar.c);
        z1kVarB.G(h661Var, 3, ttcVar.d);
        z1kVarB.a(h661Var);
    }
}
