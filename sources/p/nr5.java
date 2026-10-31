package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class nr5 implements pf40 {
    public static final nr5 a;
    private static final h661 descriptor;

    static {
        nr5 nr5Var = new nr5();
        a = nr5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.ImageIdentifier", nr5Var, 4);
        m0v0Var.j("id", true);
        m0v0Var.j("height", true);
        m0v0Var.j("width", true);
        m0v0Var.j("image_type", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        nma0 nma0VarZ = m5n1.z(chc1Var);
        wr80 wr80Var = wr80.a;
        return new nma0[]{nma0VarZ, m5n1.z(wr80Var), m5n1.z(wr80Var), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        String str2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                i |= 1;
            } else if (iP == 1) {
                num = (Integer) x1kVarB.B(h661Var, 1, wr80.a, num);
                i |= 2;
            } else if (iP == 2) {
                num2 = (Integer) x1kVarB.B(h661Var, 2, wr80.a, num2);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                str2 = (String) x1kVarB.B(h661Var, 3, chc1.a, str2);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        pr5 pr5Var = new pr5();
        if ((i & 1) == 0) {
            pr5Var.b = null;
        } else {
            pr5Var.b = str;
        }
        if ((i & 2) == 0) {
            pr5Var.c = null;
        } else {
            pr5Var.c = num;
        }
        if ((i & 4) == 0) {
            pr5Var.d = null;
        } else {
            pr5Var.d = num2;
        }
        if ((i & 8) == 0) {
            pr5Var.e = null;
            return pr5Var;
        }
        pr5Var.e = str2;
        return pr5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        pr5 pr5Var = (pr5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = pr5Var.b;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        Integer num = pr5Var.c;
        if (num != null) {
            z1kVarB.s(h661Var, 1, wr80.a, num);
        }
        Integer num2 = pr5Var.d;
        if (num2 != null) {
            z1kVarB.s(h661Var, 2, wr80.a, num2);
        }
        String str2 = pr5Var.e;
        if (str2 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str2);
        }
        z1kVarB.a(h661Var);
    }
}
