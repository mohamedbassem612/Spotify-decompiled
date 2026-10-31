package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class meb0 implements pf40 {
    public static final meb0 a;
    private static final h661 descriptor;

    static {
        meb0 meb0Var = new meb0();
        a = meb0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.language.applanguagesettingsimpl.data.LanguageSettingsRequest", meb0Var, 2);
        m0v0Var.j("setting_identifier", false);
        m0v0Var.j("new_value", false);
        descriptor = m0v0Var;
    }

    @Override // p.pf40
    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, qeb0.a};
    }

    @Override // p.nma0
    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        seb0 seb0Var = null;
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
                seb0Var = (seb0) x1kVarB.A(h661Var, 1, qeb0.a, seb0Var);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new oeb0(i, strF, seb0Var);
    }

    @Override // p.nma0
    public final h661 getDescriptor() {
        return descriptor;
    }

    @Override // p.nma0
    public final void serialize(uax uaxVar, Object obj) {
        oeb0 oeb0Var = (oeb0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, oeb0Var.a);
        z1kVarB.k(h661Var, 1, qeb0.a, oeb0Var.b);
        z1kVarB.a(h661Var);
    }
}
