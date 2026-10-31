package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class bwy0 implements pf40 {
    public static final bwy0 a;
    private static final h661 descriptor;

    static {
        bwy0 bwy0Var = new bwy0();
        a = bwy0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.musicappplatform.state.processor.PushNotificationPendingIntentRegistryImpl.CachedIntentInfo", bwy0Var, 5);
        m0v0Var.j("action", false);
        m0v0Var.j("category", false);
        m0v0Var.j("className", false);
        m0v0Var.j("type", false);
        m0v0Var.j("data", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, nma0Var, nma0Var, nma0Var, m5n1.z(nma0Var)};
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
        String str = null;
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
                str = (String) x1kVarB.B(h661Var, 4, chc1.a, str);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new dwy0(i, strF, strF2, strF3, strF4, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        dwy0 dwy0Var = (dwy0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = dwy0Var.a;
        String str2 = dwy0Var.e;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, dwy0Var.b);
        z1kVarB.G(h661Var, 2, dwy0Var.c);
        z1kVarB.G(h661Var, 3, dwy0Var.d);
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str2);
        }
        z1kVarB.a(h661Var);
    }
}
