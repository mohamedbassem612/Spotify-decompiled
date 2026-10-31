package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class gt5 implements pf40 {
    public static final gt5 a;
    private static final h661 descriptor;

    static {
        gt5 gt5Var = new gt5();
        a = gt5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.SearchQuery", gt5Var, 3);
        m0v0Var.j("query", true);
        m0v0Var.j("limit", true);
        m0v0Var.j("offset", true);
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
        it5 it5Var = new it5();
        if ((i & 1) == 0) {
            it5Var.b = null;
        } else {
            it5Var.b = str;
        }
        if ((i & 2) == 0) {
            it5Var.c = null;
        } else {
            it5Var.c = num;
        }
        if ((i & 4) == 0) {
            it5Var.d = null;
            return it5Var;
        }
        it5Var.d = num2;
        return it5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        it5 it5Var = (it5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = it5Var.b;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        Integer num = it5Var.c;
        if (num != null) {
            z1kVarB.s(h661Var, 1, wr80.a, num);
        }
        Integer num2 = it5Var.d;
        if (num2 != null) {
            z1kVarB.s(h661Var, 2, wr80.a, num2);
        }
        z1kVarB.a(h661Var);
    }
}
