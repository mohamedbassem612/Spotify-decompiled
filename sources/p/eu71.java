package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class eu71 implements pf40 {
    public static final eu71 a;
    private static final h661 descriptor;

    static {
        eu71 eu71Var = new eu71();
        a = eu71Var;
        m0v0 m0v0Var = new m0v0("com.spotify.previewcard.localstorage.impl.SharedPreferencesLocalProgressStorage.ProgressEntry", eu71Var, 2);
        m0v0Var.j("position", false);
        m0v0Var.j("createdAtTimestamp", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        o5f0 o5f0Var = o5f0.a;
        return new nma0[]{o5f0Var, o5f0Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        int i = 0;
        long jI0 = 0;
        long jI1 = 0;
        boolean z = true;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                jI0 = x1kVarB.i0(h661Var, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                jI1 = x1kVarB.i0(h661Var, 1);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new gu71(i, jI0, jI1);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        gu71 gu71Var = (gu71) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.l(h661Var, 0, gu71Var.a);
        z1kVarB.l(h661Var, 1, gu71Var.b);
        z1kVarB.a(h661Var);
    }
}
