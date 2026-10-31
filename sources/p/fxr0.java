package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class fxr0 implements pf40 {
    public static final fxr0 a;
    private static final h661 descriptor;

    static {
        fxr0 fxr0Var = new fxr0();
        a = fxr0Var;
        m0v0 m0v0Var = new m0v0("ParentalControls", fxr0Var, 2);
        m0v0Var.j("explicitContent", false);
        m0v0Var.j("video", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        gpb gpbVar = gpb.a;
        return new nma0[]{gpbVar, gpbVar};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        boolean zM2 = false;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                zM = x1kVarB.M(h661Var, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                zM2 = x1kVarB.M(h661Var, 1);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new hxr0(i, zM, zM2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        hxr0 hxr0Var = (hxr0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.E(h661Var, 0, hxr0Var.a);
        z1kVarB.E(h661Var, 1, hxr0Var.b);
        z1kVarB.a(h661Var);
    }
}
