package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class fh31 implements pf40 {
    public static final fh31 a;
    private static final h661 descriptor;

    static {
        fh31 fh31Var = new fh31();
        a = fh31Var;
        m0v0 m0v0Var = new m0v0("com.spotify.externalintegration.http.RichSectionHeaderModel", fh31Var, 3);
        m0v0Var.j("format", true);
        m0v0Var.j("associated_item", true);
        m0v0Var.j("subtitle", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(wg51.a), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        yg51 yg51Var = null;
        String str2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                i |= 1;
            } else if (iP == 1) {
                yg51Var = (yg51) x1kVarB.B(h661Var, 1, wg51.a, yg51Var);
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
        return new hh31(i, str, yg51Var, str2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        hh31 hh31Var = (hh31) obj;
        String str = hh31Var.c;
        yg51 yg51Var = hh31Var.b;
        String str2 = hh31Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str2);
        }
        if (z1kVarB.d0() || yg51Var != null) {
            z1kVarB.s(h661Var, 1, wg51.a, yg51Var);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
