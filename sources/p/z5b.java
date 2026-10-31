package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class z5b implements pf40 {
    public static final z5b a;
    private static final h661 descriptor;

    static {
        z5b z5bVar = new z5b();
        a = z5bVar;
        m0v0 m0v0Var = new m0v0("com.spotify.blend.attribution.domain.BlendUserAttributionMetadata", z5bVar, 5);
        m0v0Var.j("username", false);
        m0v0Var.j("display_name", false);
        m0v0Var.j("image_url", false);
        m0v0Var.j("description", false);
        m0v0Var.j("can_change_attribution", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var, chc1Var, gpb.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
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
            } else if (iP == 3) {
                strF4 = x1kVarB.f(h661Var, 3);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                zM = x1kVarB.M(h661Var, 4);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new b6b(strF, i, strF2, strF3, zM, strF4);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        b6b b6bVar = (b6b) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, b6bVar.a);
        z1kVarB.G(h661Var, 1, b6bVar.b);
        z1kVarB.G(h661Var, 2, b6bVar.c);
        z1kVarB.G(h661Var, 3, b6bVar.d);
        z1kVarB.E(h661Var, 4, b6bVar.e);
        z1kVarB.a(h661Var);
    }
}
