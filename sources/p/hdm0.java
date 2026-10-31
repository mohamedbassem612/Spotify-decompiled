package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class hdm0 implements pf40 {
    public static final hdm0 a;
    private static final h661 descriptor;

    static {
        hdm0 hdm0Var = new hdm0();
        a = hdm0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.thestage.vtec.logic.ModPayload", hdm0Var, 2);
        m0v0Var.j("modType", false);
        m0v0Var.j("data", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, m5n1.z(nma0Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String str = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                str = (String) x1kVarB.B(h661Var, 1, chc1.a, str);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new jdm0(i, strF, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        jdm0 jdm0Var = (jdm0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, jdm0Var.a);
        String str = jdm0Var.b;
        if (str != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
