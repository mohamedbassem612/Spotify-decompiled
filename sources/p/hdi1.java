package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class hdi1 implements pf40 {
    public static final hdi1 a;
    private static final h661 descriptor;

    static {
        hdi1 hdi1Var = new hdi1();
        a = hdi1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.wear.datalayermessages.UserInfoResponse", hdi1Var, 4);
        m0v0Var.j("name", true);
        m0v0Var.j("pictureUrl", true);
        m0v0Var.j("isSuccessful", false);
        m0v0Var.j("errorMessage", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var), gpb.a, m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                i |= 1;
            } else if (iP == 1) {
                str2 = (String) x1kVarB.B(h661Var, 1, chc1.a, str2);
                i |= 2;
            } else if (iP == 2) {
                zM = x1kVarB.M(h661Var, 2);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                str3 = (String) x1kVarB.B(h661Var, 3, chc1.a, str3);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new jdi1(i, str, str2, zM, str3);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        jdi1 jdi1Var = (jdi1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = jdi1Var.a;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        String str2 = jdi1Var.b;
        if (str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        z1kVarB.E(h661Var, 2, jdi1Var.c);
        String str3 = jdi1Var.d;
        if (str3 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str3);
        }
        z1kVarB.a(h661Var);
    }
}
