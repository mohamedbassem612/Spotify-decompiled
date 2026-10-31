package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class aoh1 implements pf40 {
    public static final aoh1 a;
    private static final h661 descriptor;

    static {
        aoh1 aoh1Var = new aoh1();
        a = aoh1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.adsdisplay.adsprivacycenter.UpdateAdCategoryAdPreferenceRequest", aoh1Var, 1);
        m0v0Var.j("adCategoryAdPreference", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{yk0.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        al0 al0Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                al0Var = (al0) x1kVarB.A(h661Var, 0, yk0.a, al0Var);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new coh1(i, al0Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, yk0.a, ((coh1) obj).a);
        z1kVarB.a(h661Var);
    }
}
