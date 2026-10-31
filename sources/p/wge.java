package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class wge implements pf40 {
    public static final wge a;
    private static final h661 descriptor;

    static {
        wge wgeVar = new wge();
        a = wgeVar;
        m0v0 m0v0Var = new m0v0("com.spotify.notifications.models.preferences.Channels", wgeVar, 2);
        m0v0Var.j("email", true);
        m0v0Var.j("push", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        gpb gpbVar = gpb.a;
        return new nma0[]{m5n1.z(gpbVar), m5n1.z(gpbVar)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                bool = (Boolean) x1kVarB.B(h661Var, 0, gpb.a, bool);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                bool2 = (Boolean) x1kVarB.B(h661Var, 1, gpb.a, bool2);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        yge ygeVar = new yge();
        if ((i & 1) == 0) {
            ygeVar.a = null;
        } else {
            ygeVar.a = bool;
        }
        if ((i & 2) == 0) {
            ygeVar.b = null;
            return ygeVar;
        }
        ygeVar.b = bool2;
        return ygeVar;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        yge ygeVar = (yge) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || ygeVar.a != null) {
            z1kVarB.s(h661Var, 0, gpb.a, ygeVar.a);
        }
        if (z1kVarB.d0() || ygeVar.b != null) {
            z1kVarB.s(h661Var, 1, gpb.a, ygeVar.b);
        }
        z1kVarB.a(h661Var);
    }
}
