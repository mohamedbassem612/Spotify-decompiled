package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class jbh1 implements pf40 {
    public static final jbh1 a;
    private static final h661 descriptor;

    static {
        jbh1 jbh1Var = new jbh1();
        a = jbh1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.promptedplaylists.ucpapi.UcpPrompt", jbh1Var, 6);
        m0v0Var.j("prompt_id", true);
        m0v0Var.j("text", true);
        m0v0Var.j("cadence", true);
        m0v0Var.j("weekly_day", true);
        m0v0Var.j("next_update_at", true);
        m0v0Var.j("is_running", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, nma0Var, m5n1.z(nma0Var), m5n1.z(nma0Var), m5n1.z(nma0Var), gpb.a};
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
        String str = null;
        String str2 = null;
        String str3 = null;
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
                    str = (String) x1kVarB.B(h661Var, 2, chc1.a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) x1kVarB.B(h661Var, 3, chc1.a, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) x1kVarB.B(h661Var, 4, chc1.a, str3);
                    i |= 16;
                    break;
                case 5:
                    zM = x1kVarB.M(h661Var, 5);
                    i |= 32;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new lbh1(i, strF, strF2, str, str2, str3, zM);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        lbh1 lbh1Var = (lbh1) obj;
        boolean z = lbh1Var.f;
        String str = lbh1Var.e;
        String str2 = lbh1Var.d;
        String str3 = lbh1Var.c;
        String str4 = lbh1Var.b;
        String str5 = lbh1Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || !u890.j(str5, "")) {
            z1kVarB.G(h661Var, 0, str5);
        }
        if (z1kVarB.d0() || !u890.j(str4, "")) {
            z1kVarB.G(h661Var, 1, str4);
        }
        if (z1kVarB.d0() || str3 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str3);
        }
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str2);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str);
        }
        if (z1kVarB.d0() || z) {
            z1kVarB.E(h661Var, 5, z);
        }
        z1kVarB.a(h661Var);
    }
}
