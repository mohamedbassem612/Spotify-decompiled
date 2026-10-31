package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class qeb0 implements pf40 {
    public static final qeb0 a;
    private static final h661 descriptor;

    static {
        qeb0 qeb0Var = new qeb0();
        a = qeb0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.language.applanguagesettingsimpl.data.LanguageSettingsValue", qeb0Var, 1);
        m0v0Var.j("string_value", false);
        descriptor = m0v0Var;
    }

    @Override // p.pf40
    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a};
    }

    @Override // p.nma0
    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                strF = x1kVarB.f(h661Var, 0);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new seb0(i, strF);
    }

    @Override // p.nma0
    public final h661 getDescriptor() {
        return descriptor;
    }

    @Override // p.nma0
    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, ((seb0) obj).a);
        z1kVarB.a(h661Var);
    }
}
