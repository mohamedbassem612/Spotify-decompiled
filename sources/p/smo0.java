package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class smo0 implements pf40 {
    public static final smo0 a;
    private static final h661 descriptor;

    static {
        smo0 smo0Var = new smo0();
        a = smo0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.yourupdates.domain.models.NotificationImage.UserAndEntityImage", smo0Var, 2);
        m0v0Var.j("user_image", false);
        m0v0Var.j("entity_image", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{ubi1.a, lmo0.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        ybi1 ybi1Var = null;
        nmo0 nmo0Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                ybi1Var = (ybi1) x1kVarB.A(h661Var, 0, ubi1.a, ybi1Var);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                nmo0Var = (nmo0) x1kVarB.A(h661Var, 1, lmo0.a, nmo0Var);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new umo0(i, ybi1Var, nmo0Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        umo0 umo0Var = (umo0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        tmo0 tmo0Var = umo0.Companion;
        z1kVarB.k(h661Var, 0, ubi1.a, umo0Var.b);
        z1kVarB.k(h661Var, 1, lmo0.a, umo0Var.c);
        z1kVarB.a(h661Var);
    }
}
