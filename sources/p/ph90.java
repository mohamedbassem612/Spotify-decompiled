package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class ph90 implements pf40 {
    public static final ph90 a;
    private static final h661 descriptor;

    static {
        ph90 ph90Var = new ph90();
        a = ph90Var;
        m0v0 m0v0Var = new m0v0("com.spotify.notifications.models.preferences.Item.Preference", ph90Var, 5);
        m0v0Var.j("type", false);
        m0v0Var.j("key", false);
        m0v0Var.j("name", false);
        m0v0Var.j("description", false);
        m0v0Var.j("channels", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var, chc1Var, wge.a};
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
        yge ygeVar = null;
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
                ygeVar = (yge) x1kVarB.A(h661Var, 4, wge.a, ygeVar);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new rh90(i, strF, strF2, strF3, strF4, ygeVar);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        rh90 rh90Var = (rh90) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, rh90Var.a);
        z1kVarB.G(h661Var, 1, rh90Var.b);
        z1kVarB.G(h661Var, 2, rh90Var.c);
        z1kVarB.G(h661Var, 3, rh90Var.d);
        z1kVarB.k(h661Var, 4, wge.a, rh90Var.e);
        z1kVarB.a(h661Var);
    }
}
