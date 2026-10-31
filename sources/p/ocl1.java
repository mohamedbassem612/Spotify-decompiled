package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class ocl1 implements pf40 {
    public static final ocl1 a;
    private static final h661 descriptor;

    static {
        ocl1 ocl1Var = new ocl1();
        a = ocl1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.prerelease.prerelease.datasource.WatchFeedVideo", ocl1Var, 6);
        m0v0Var.j("uri", false);
        m0v0Var.j("manifest_id", false);
        m0v0Var.j("image_url", false);
        m0v0Var.j("is_explicit", true);
        m0v0Var.j("is_19_plus", true);
        m0v0Var.j("is_animated", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        gpb gpbVar = gpb.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var, gpbVar, gpbVar, gpbVar};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strF = x1kVarB.f(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strF2 = x1kVarB.f(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strF3 = x1kVarB.f(h661Var, 2);
                    i |= 4;
                    break;
                case 3:
                    zM = x1kVarB.M(h661Var, 3);
                    i |= 8;
                    break;
                case 4:
                    zM2 = x1kVarB.M(h661Var, 4);
                    i |= 16;
                    break;
                case 5:
                    zM3 = x1kVarB.M(h661Var, 5);
                    i |= 32;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new qcl1(i, strF, strF2, strF3, zM, zM2, zM3);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        qcl1 qcl1Var = (qcl1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = qcl1Var.a;
        boolean z = qcl1Var.f;
        boolean z2 = qcl1Var.e;
        boolean z3 = qcl1Var.d;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, qcl1Var.b);
        z1kVarB.G(h661Var, 2, qcl1Var.c);
        if (z1kVarB.d0() || z3) {
            z1kVarB.E(h661Var, 3, z3);
        }
        if (z1kVarB.d0() || z2) {
            z1kVarB.E(h661Var, 4, z2);
        }
        if (z1kVarB.d0() || z) {
            z1kVarB.E(h661Var, 5, z);
        }
        z1kVarB.a(h661Var);
    }
}
