package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class z4o0 implements pf40 {
    public static final z4o0 a;
    private static final h661 descriptor;

    static {
        z4o0 z4o0Var = new z4o0();
        a = z4o0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.usersnearby.usersnearbypage.domain.eventsources.NearbyUserFoundPayload", z4o0Var, 2);
        m0v0Var.j("nearbyUsername", false);
        m0v0Var.j("featureId", false);
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
        return new b5o0(i, strF, strF2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        b5o0 b5o0Var = (b5o0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, b5o0Var.a);
        z1kVarB.G(h661Var, 1, b5o0Var.b);
        z1kVarB.a(h661Var);
    }
}
