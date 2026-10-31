package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class i4l1 implements pf40 {
    public static final i4l1 a;
    private static final h661 descriptor;

    static {
        i4l1 i4l1Var = new i4l1();
        a = i4l1Var;
        m0v0 m0v0Var = new m0v0("didSendEvent", i4l1Var, 4);
        m0v0Var.j("category", false);
        m0v0Var.j("action", false);
        m0v0Var.j("label", true);
        m0v0Var.j("value", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, nma0Var, m5n1.z(nma0Var), m5n1.z(nma0Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                strF2 = x1kVarB.f(h661Var, 1);
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
        return new k4l1(i, strF, strF2, str, str2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        k4l1 k4l1Var = (k4l1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, k4l1Var.b);
        z1kVarB.G(h661Var, 1, k4l1Var.c);
        String str = k4l1Var.d;
        if (str != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str);
        }
        String str2 = k4l1Var.e;
        if (str2 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str2);
        }
        z1kVarB.a(h661Var);
    }
}
