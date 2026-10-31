package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class s1d1 implements pf40 {
    public static final s1d1 a;
    private static final h661 descriptor;

    static {
        s1d1 s1d1Var = new s1d1();
        a = s1d1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.puffin.crossdevicesyncing.data.SupportedDevice", s1d1Var, 3);
        m0v0Var.j("identifier", false);
        m0v0Var.j("connectionType", false);
        m0v0Var.j("specificEnabled", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, toa1.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        voa1 voa1Var = null;
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
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                voa1Var = (voa1) x1kVarB.A(h661Var, 2, toa1.a, voa1Var);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new u1d1(i, strF, strF2, voa1Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        u1d1 u1d1Var = (u1d1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, u1d1Var.a);
        z1kVarB.G(h661Var, 1, u1d1Var.b);
        z1kVarB.k(h661Var, 2, toa1.a, u1d1Var.c);
        z1kVarB.a(h661Var);
    }
}
