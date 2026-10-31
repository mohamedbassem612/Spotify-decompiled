package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class cno0 implements pf40 {
    public static final cno0 a;
    private static final h661 descriptor;

    static {
        cno0 cno0Var = new cno0();
        a = cno0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.notifications.models.preferences.NotificationLocale", cno0Var, 3);
        m0v0Var.j("ulocale", false);
        m0v0Var.j("nativeDisplayName", false);
        m0v0Var.j("displayName", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var};
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
                strF3 = x1kVarB.f(h661Var, 2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new eno0(strF, strF2, i, strF3);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        eno0 eno0Var = (eno0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, eno0Var.a);
        z1kVarB.G(h661Var, 1, eno0Var.b);
        z1kVarB.G(h661Var, 2, eno0Var.c);
        z1kVarB.a(h661Var);
    }
}
