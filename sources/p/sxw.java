package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class sxw implements pf40 {
    public static final sxw a;
    private static final h661 descriptor;

    static {
        sxw sxwVar = new sxw();
        a = sxwVar;
        m0v0 m0v0Var = new m0v0("com.spotify.email.models.EmailProfileResponse", sxwVar, 2);
        m0v0Var.j("email", true);
        m0v0Var.j("options", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(chc1.a), m5n1.z(vxw.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        xxw xxwVar = null;
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
                xxwVar = (xxw) x1kVarB.B(h661Var, 1, vxw.a, xxwVar);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new uxw(i, str, xxwVar);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        uxw uxwVar = (uxw) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = uxwVar.a;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        xxw xxwVar = uxwVar.b;
        if (xxwVar != null) {
            z1kVarB.s(h661Var, 1, vxw.a, xxwVar);
        }
        z1kVarB.a(h661Var);
    }
}
