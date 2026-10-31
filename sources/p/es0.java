package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class es0 implements pf40 {
    public static final es0 a;
    private static final h661 descriptor;

    static {
        es0 es0Var = new es0();
        a = es0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.adonappopen.repository.network.AdOnAppOpenAd.Display", es0Var, 4);
        m0v0Var.j("height", true);
        m0v0Var.j("width", true);
        m0v0Var.j("mimetype", true);
        m0v0Var.j("mediaFile", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        wr80 wr80Var = wr80.a;
        nma0 nma0VarZ = m5n1.z(wr80Var);
        nma0 nma0VarZ2 = m5n1.z(wr80Var);
        chc1 chc1Var = chc1.a;
        return new nma0[]{nma0VarZ, nma0VarZ2, m5n1.z(chc1Var), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
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
                num2 = (Integer) x1kVarB.B(h661Var, 1, wr80.a, num2);
                i |= 2;
            } else if (iP == 2) {
                str = (String) x1kVarB.B(h661Var, 2, chc1.a, str);
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
        return new gs0(i, num, num2, str, str2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        gs0 gs0Var = (gs0) obj;
        String str = gs0Var.d;
        String str2 = gs0Var.c;
        Integer num = gs0Var.b;
        Integer num2 = gs0Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || num2 != null) {
            z1kVarB.s(h661Var, 0, wr80.a, num2);
        }
        if (z1kVarB.d0() || num != null) {
            z1kVarB.s(h661Var, 1, wr80.a, num);
        }
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str2);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
