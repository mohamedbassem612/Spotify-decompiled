package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class ubi1 implements pf40 {
    public static final ubi1 a;
    private static final h661 descriptor;

    static {
        ubi1 ubi1Var = new ubi1();
        a = ubi1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.yourupdates.domain.models.UserImage", ubi1Var, 2);
        m0v0Var.j("image_url", false);
        m0v0Var.j("user_display_name", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{m5n1.z(nma0Var), nma0Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String strF = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                strF = x1kVarB.f(h661Var, 1);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new ybi1(i, str, strF);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ybi1 ybi1Var = (ybi1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.s(h661Var, 0, chc1.a, ybi1Var.a);
        z1kVarB.G(h661Var, 1, ybi1Var.b);
        z1kVarB.a(h661Var);
    }
}
