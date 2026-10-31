package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class njk1 implements pf40 {
    public static final njk1 a;
    private static final h661 descriptor;

    static {
        njk1 njk1Var = new njk1();
        a = njk1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.Visibility", njk1Var, 3);
        m0v0Var.j("nudge", false);
        m0v0Var.j("persistent_surface", false);
        m0v0Var.j("invite_notification", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        gpb gpbVar = gpb.a;
        return new nma0[]{gpbVar, gpbVar, gpbVar};
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
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                zM = x1kVarB.M(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                zM2 = x1kVarB.M(h661Var, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                zM3 = x1kVarB.M(h661Var, 2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new ujk1(i, zM, zM2, zM3);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ujk1 ujk1Var = (ujk1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.E(h661Var, 0, ujk1Var.a);
        z1kVarB.E(h661Var, 1, ujk1Var.b);
        z1kVarB.E(h661Var, 2, ujk1Var.c);
        z1kVarB.a(h661Var);
    }
}
