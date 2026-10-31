package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class lmo0 implements pf40 {
    public static final lmo0 a;
    private static final h661 descriptor;

    static {
        lmo0 lmo0Var = new lmo0();
        a = lmo0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.yourupdates.domain.models.NotificationImage.EntityImage", lmo0Var, 2);
        m0v0Var.j("image_url", false);
        m0v0Var.j("entity_url", false);
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
        return new nmo0(i, strF, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        nmo0 nmo0Var = (nmo0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, nmo0Var.b);
        z1kVarB.s(h661Var, 1, chc1.a, nmo0Var.c);
        z1kVarB.a(h661Var);
    }
}
