package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class f3l1 implements pf40 {
    public static final f3l1 a;
    private static final h661 descriptor;

    static {
        f3l1 f3l1Var = new f3l1();
        a = f3l1Var;
        m0v0 m0v0Var = new m0v0("didRequestCreatePlaylist", f3l1Var, 5);
        m0v0Var.j("requestId", false);
        m0v0Var.j("name", false);
        m0v0Var.j("imageUrl", false);
        m0v0Var.j("description", false);
        m0v0Var.j("trackUris", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = h3l1.g;
        chc1 chc1Var = chc1.a;
        return new nma0[]{wr80.a, chc1Var, chc1Var, chc1Var, znb0VarArr[4].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = h3l1.g;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        int iO = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String[] strArr = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                iO = x1kVarB.o(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                strF = x1kVarB.f(h661Var, 1);
                i |= 2;
            } else if (iP == 2) {
                strF2 = x1kVarB.f(h661Var, 2);
                i |= 4;
            } else if (iP == 3) {
                strF3 = x1kVarB.f(h661Var, 3);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                strArr = (String[]) x1kVarB.A(h661Var, 4, (nma0) znb0VarArr[4].getValue(), strArr);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new h3l1(i, iO, strF, strF2, strF3, strArr);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h3l1 h3l1Var = (h3l1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = h3l1.g;
        z1kVarB.e(0, h3l1Var.b, h661Var);
        z1kVarB.G(h661Var, 1, h3l1Var.c);
        z1kVarB.G(h661Var, 2, h3l1Var.d);
        z1kVarB.G(h661Var, 3, h3l1Var.e);
        z1kVarB.k(h661Var, 4, (nma0) znb0VarArr[4].getValue(), h3l1Var.f);
        z1kVarB.a(h661Var);
    }
}
