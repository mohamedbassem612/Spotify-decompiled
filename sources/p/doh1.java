package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class doh1 implements pf40 {
    public static final doh1 a;
    private static final h661 descriptor;

    static {
        doh1 doh1Var = new doh1();
        a = doh1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.adsdisplay.adsprivacycenter.UpdateAdCategoryAdPreferenceResponse", doh1Var, 2);
        m0v0Var.j("successfullyUpdated", true);
        m0v0Var.j("errorMessage", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(gpb.a), m5n1.z(chc1.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        String str = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                bool = (Boolean) x1kVarB.B(h661Var, 0, gpb.a, bool);
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
        return new foh1(i, bool, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        foh1 foh1Var = (foh1) obj;
        String str = foh1Var.b;
        Boolean bool = foh1Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || bool != null) {
            z1kVarB.s(h661Var, 0, gpb.a, bool);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
