package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class vt5 implements pf40 {
    public static final vt5 a;
    private static final h661 descriptor;

    static {
        vt5 vt5Var = new vt5();
        a = vt5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.Status", vt5Var, 3);
        m0v0Var.j("code", true);
        m0v0Var.j("short_text", true);
        m0v0Var.j("long_text", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0VarZ = m5n1.z(wr80.a);
        chc1 chc1Var = chc1.a;
        return new nma0[]{nma0VarZ, m5n1.z(chc1Var), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                num = (Integer) x1kVarB.B(h661Var, 0, wr80.a, num);
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
        xt5 xt5Var = new xt5();
        if ((i & 1) == 0) {
            xt5Var.b = null;
        } else {
            xt5Var.b = num;
        }
        if ((i & 2) == 0) {
            xt5Var.c = null;
        } else {
            xt5Var.c = str;
        }
        if ((i & 4) == 0) {
            xt5Var.d = null;
            return xt5Var;
        }
        xt5Var.d = str2;
        return xt5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        xt5 xt5Var = (xt5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        Integer num = xt5Var.b;
        if (num != null) {
            z1kVarB.s(h661Var, 0, wr80.a, num);
        }
        String str = xt5Var.c;
        if (str != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str);
        }
        String str2 = xt5Var.d;
        if (str2 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str2);
        }
        z1kVarB.a(h661Var);
    }
}
