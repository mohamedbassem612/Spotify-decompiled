package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class qu5 implements pf40 {
    public static final qu5 a;
    private static final h661 descriptor;

    static {
        qu5 qu5Var = new qu5();
        a = qu5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.UriWithNamedOptions", qu5Var, 5);
        m0v0Var.j("uri", true);
        m0v0Var.j("skipToURI", true);
        m0v0Var.j("skipToIndex", true);
        m0v0Var.j("skipToUid", true);
        m0v0Var.j("feature_identifier", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(wr80.a), m5n1.z(chc1Var), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        String str4 = null;
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
                num = (Integer) x1kVarB.B(h661Var, 2, wr80.a, num);
                i |= 4;
            } else if (iP == 3) {
                str3 = (String) x1kVarB.B(h661Var, 3, chc1.a, str3);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                str4 = (String) x1kVarB.B(h661Var, 4, chc1.a, str4);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        su5 su5Var = new su5();
        if ((i & 1) == 0) {
            su5Var.b = null;
        } else {
            su5Var.b = str;
        }
        if ((i & 2) == 0) {
            su5Var.c = null;
        } else {
            su5Var.c = str2;
        }
        if ((i & 4) == 0) {
            su5Var.d = null;
        } else {
            su5Var.d = num;
        }
        if ((i & 8) == 0) {
            su5Var.e = null;
        } else {
            su5Var.e = str3;
        }
        if ((i & 16) == 0) {
            su5Var.f = null;
            return su5Var;
        }
        su5Var.f = str4;
        return su5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        su5 su5Var = (su5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = su5Var.b;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        String str2 = su5Var.c;
        if (str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        Integer num = su5Var.d;
        if (num != null) {
            z1kVarB.s(h661Var, 2, wr80.a, num);
        }
        String str3 = su5Var.e;
        if (str3 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str3);
        }
        String str4 = su5Var.f;
        if (str4 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str4);
        }
        z1kVarB.a(h661Var);
    }
}
