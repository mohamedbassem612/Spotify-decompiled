package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class idh implements pf40 {
    public static final idh a;
    private static final h661 descriptor;

    static {
        idh idhVar = new idh();
        a = idhVar;
        m0v0 m0v0Var = new m0v0("com.spotify.hubs.model.Command", idhVar, 2);
        m0v0Var.j("name", true);
        m0v0Var.j("data", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(chc1.a), m5n1.z(xga0.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        uga0 uga0Var = null;
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
                uga0Var = (uga0) x1kVarB.B(h661Var, 1, xga0.a, uga0Var);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new rdh(i, str, uga0Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        rdh rdhVar = (rdh) obj;
        uga0 uga0Var = rdhVar.b;
        String str = rdhVar.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        if (z1kVarB.d0() || uga0Var != null) {
            z1kVarB.s(h661Var, 1, xga0.a, uga0Var);
        }
        z1kVarB.a(h661Var);
    }
}
