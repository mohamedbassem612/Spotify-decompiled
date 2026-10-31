package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class m4i1 implements pf40 {
    public static final m4i1 a;
    private static final h661 descriptor;

    static {
        m4i1 m4i1Var = new m4i1();
        a = m4i1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.liveroom.listeningpartymessagesourceapi.api.User", m4i1Var, 3);
        m0v0Var.j("ident", false);
        m0v0Var.j("displayName", true);
        m0v0Var.j("avatar", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{tbi1.d, m5n1.z(chc1Var), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        obi1 obi1Var = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                obi1Var = (obi1) x1kVarB.A(h661Var, 0, tbi1.d, obi1Var);
                i |= 1;
            } else if (iP == 1) {
                str = (String) x1kVarB.B(h661Var, 1, chc1.a, str);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                str2 = (String) x1kVarB.B(h661Var, 2, chc1.a, str2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new y4i1(i, obi1Var, str, str2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        y4i1 y4i1Var = (y4i1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        tbi1 tbi1Var = tbi1.d;
        obi1 obi1Var = y4i1Var.a;
        String str = y4i1Var.c;
        String str2 = y4i1Var.b;
        z1kVarB.k(h661Var, 0, tbi1Var, obi1Var);
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
