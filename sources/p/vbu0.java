package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class vbu0 implements pf40 {
    public static final vbu0 a;
    private static final h661 descriptor;

    static {
        vbu0 vbu0Var = new vbu0();
        a = vbu0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.PlayerOptions", vbu0Var, 2);
        m0v0Var.j("shuffle", false);
        m0v0Var.j("repeat", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{gpb.a, wr80.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        int iO = 0;
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
                iO = x1kVarB.o(h661Var, 1);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new ybu0(i, zM, iO);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ybu0 ybu0Var = (ybu0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.E(h661Var, 0, ybu0Var.a);
        z1kVarB.e(1, ybu0Var.b, h661Var);
        z1kVarB.a(h661Var);
    }
}
