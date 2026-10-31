package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class hb20 implements pf40 {
    public static final hb20 a;
    private static final h661 descriptor;

    static {
        hb20 hb20Var = new hb20();
        a = hb20Var;
        m0v0 m0v0Var = new m0v0("com.spotify.listuxplatformconsumers.wrapped.shared.FilterPillItem", hb20Var, 3);
        m0v0Var.j("id", false);
        m0v0Var.j("localized_text", false);
        m0v0Var.j("applied", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, gpb.a};
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
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                zM = x1kVarB.M(h661Var, 2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new jb20(i, strF, strF2, zM);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        jb20 jb20Var = (jb20) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = jb20Var.a;
        boolean z = jb20Var.c;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, jb20Var.b);
        if (z1kVarB.d0() || z) {
            z1kVarB.E(h661Var, 2, z);
        }
        z1kVarB.a(h661Var);
    }
}
