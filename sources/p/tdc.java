package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class tdc implements pf40 {
    public static final tdc a;
    private static final h661 descriptor;

    static {
        tdc tdcVar = new tdc();
        a = tdcVar;
        m0v0 m0v0Var = new m0v0("com.spotify.blend.tastematch.api.Button", tdcVar, 2);
        m0v0Var.j("story_text", false);
        m0v0Var.j("navigation_uri", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{o9c1.a, chc1.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        q9c1 q9c1Var = null;
        String strF = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                q9c1Var = (q9c1) x1kVarB.A(h661Var, 0, o9c1.a, q9c1Var);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                strF = x1kVarB.f(h661Var, 1);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new ydc(i, q9c1Var, strF);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ydc ydcVar = (ydc) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, o9c1.a, ydcVar.a);
        z1kVarB.G(h661Var, 1, ydcVar.b);
        z1kVarB.a(h661Var);
    }
}
