package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class jrs0 implements pf40 {
    public static final jrs0 a;
    private static final h661 descriptor;

    static {
        jrs0 jrs0Var = new jrs0();
        a = jrs0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.notifications.models.message.Person", jrs0Var, 3);
        m0v0Var.j("username", false);
        m0v0Var.j("display_name", true);
        m0v0Var.j("avatar", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, m5n1.z(nma0Var), m5n1.z(eb9.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String str = null;
        ib9 ib9Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                str = (String) x1kVarB.B(h661Var, 1, chc1.a, str);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                ib9Var = (ib9) x1kVarB.B(h661Var, 2, eb9.a, ib9Var);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new lrs0(i, strF, str, ib9Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        lrs0 lrs0Var = (lrs0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = lrs0Var.a;
        ib9 ib9Var = lrs0Var.c;
        String str2 = lrs0Var.b;
        z1kVarB.G(h661Var, 0, str);
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        if (z1kVarB.d0() || ib9Var != null) {
            z1kVarB.s(h661Var, 2, eb9.a, ib9Var);
        }
        z1kVarB.a(h661Var);
    }
}
