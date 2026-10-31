package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class dr5 implements pf40 {
    public static final dr5 a;
    private static final h661 descriptor;

    static {
        dr5 dr5Var = new dr5();
        a = dr5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.HelloDetailsAppProtocol.Roles", dr5Var, 4);
        m0v0Var.j("dealer", true);
        m0v0Var.j("broker", true);
        m0v0Var.j("subscriber", true);
        m0v0Var.j("caller", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        uq5 uq5Var = uq5.a;
        return new nma0[]{m5n1.z(uq5Var), m5n1.z(uq5Var), m5n1.z(uq5Var), m5n1.z(uq5Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        wq5 wq5Var = null;
        wq5 wq5Var2 = null;
        wq5 wq5Var3 = null;
        wq5 wq5Var4 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                wq5Var = (wq5) x1kVarB.B(h661Var, 0, uq5.a, wq5Var);
                i |= 1;
            } else if (iP == 1) {
                wq5Var2 = (wq5) x1kVarB.B(h661Var, 1, uq5.a, wq5Var2);
                i |= 2;
            } else if (iP == 2) {
                wq5Var3 = (wq5) x1kVarB.B(h661Var, 2, uq5.a, wq5Var3);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                wq5Var4 = (wq5) x1kVarB.B(h661Var, 3, uq5.a, wq5Var4);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        fr5 fr5Var = new fr5();
        if ((i & 1) == 0) {
            fr5Var.b = null;
        } else {
            fr5Var.b = wq5Var;
        }
        if ((i & 2) == 0) {
            fr5Var.c = null;
        } else {
            fr5Var.c = wq5Var2;
        }
        if ((i & 4) == 0) {
            fr5Var.d = null;
        } else {
            fr5Var.d = wq5Var3;
        }
        if ((i & 8) == 0) {
            fr5Var.e = null;
            return fr5Var;
        }
        fr5Var.e = wq5Var4;
        return fr5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        fr5 fr5Var = (fr5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        wq5 wq5Var = fr5Var.b;
        if (wq5Var != null) {
            z1kVarB.s(h661Var, 0, uq5.a, wq5Var);
        }
        wq5 wq5Var2 = fr5Var.c;
        if (wq5Var2 != null) {
            z1kVarB.s(h661Var, 1, uq5.a, wq5Var2);
        }
        wq5 wq5Var3 = fr5Var.d;
        if (wq5Var3 != null) {
            z1kVarB.s(h661Var, 2, uq5.a, wq5Var3);
        }
        wq5 wq5Var4 = fr5Var.e;
        if (wq5Var4 != null) {
            z1kVarB.s(h661Var, 3, uq5.a, wq5Var4);
        }
        z1kVarB.a(h661Var);
    }
}
