package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class kr5 implements pf40 {
    public static final kr5 a;
    private static final h661 descriptor;

    static {
        kr5 kr5Var = new kr5();
        a = kr5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.Image", kr5Var, 3);
        m0v0Var.j("image_data", true);
        m0v0Var.j("width", true);
        m0v0Var.j("height", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0VarZ = m5n1.z(chc1.a);
        wr80 wr80Var = wr80.a;
        return new nma0[]{nma0VarZ, m5n1.z(wr80Var), m5n1.z(wr80Var)};
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
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                num2 = (Integer) x1kVarB.B(h661Var, 2, wr80.a, num2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        mr5 mr5Var = new mr5();
        if ((i & 1) == 0) {
            mr5Var.b = null;
        } else {
            mr5Var.b = str;
        }
        if ((i & 2) == 0) {
            mr5Var.c = null;
        } else {
            mr5Var.c = num;
        }
        if ((i & 4) == 0) {
            mr5Var.d = null;
            return mr5Var;
        }
        mr5Var.d = num2;
        return mr5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        mr5 mr5Var = (mr5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = mr5Var.b;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        Integer num = mr5Var.c;
        if (num != null) {
            z1kVarB.s(h661Var, 1, wr80.a, num);
        }
        Integer num2 = mr5Var.d;
        if (num2 != null) {
            z1kVarB.s(h661Var, 2, wr80.a, num2);
        }
        z1kVarB.a(h661Var);
    }
}
