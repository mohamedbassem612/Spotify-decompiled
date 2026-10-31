package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class sgz0 implements pf40 {
    public static final sgz0 a;
    private static final h661 descriptor;

    static {
        sgz0 sgz0Var = new sgz0();
        a = sgz0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.quickstartpivot.playerimpl.endpoint.QuickstartPivotRequest", sgz0Var, 2);
        m0v0Var.j("requestContext", true);
        m0v0Var.j("recommendationOptions", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(xn21.a), m5n1.z(ly01.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        zn21 zn21Var = null;
        ny01 ny01Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                zn21Var = (zn21) x1kVarB.B(h661Var, 0, xn21.a, zn21Var);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                ny01Var = (ny01) x1kVarB.B(h661Var, 1, ly01.a, ny01Var);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new ugz0(i, zn21Var, ny01Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ugz0 ugz0Var = (ugz0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        zn21 zn21Var = ugz0Var.a;
        if (zn21Var != null) {
            z1kVarB.s(h661Var, 0, xn21.a, zn21Var);
        }
        ny01 ny01Var = ugz0Var.b;
        if (ny01Var != null) {
            z1kVarB.s(h661Var, 1, ly01.a, ny01Var);
        }
        z1kVarB.a(h661Var);
    }
}
