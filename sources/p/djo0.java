package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class djo0 implements pf40 {
    public static final djo0 a;
    private static final h661 descriptor;

    static {
        djo0 djo0Var = new djo0();
        a = djo0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.yourupdates.domain.models.Notification", djo0Var, 9);
        m0v0Var.j("id", false);
        m0v0Var.j("created_timestamp", false);
        m0v0Var.j("title", false);
        m0v0Var.j("action", false);
        m0v0Var.j("image", false);
        m0v0Var.j("is_new", false);
        m0v0Var.j("storage_id", false);
        m0v0Var.j("messaging_metadata", false);
        m0v0Var.j("requestId", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = kjo0.t;
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, znb0VarArr[1].getValue(), chc1Var, ljo0.a, znb0VarArr[4].getValue(), gpb.a, chc1Var, ycj0.a, chc1Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = kjo0.t;
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        bdj0 bdj0Var = null;
        String strF = null;
        mxe1 mxe1Var = null;
        String strF2 = null;
        pjo0 pjo0Var = null;
        vmo0 vmo0Var = null;
        String strF3 = null;
        String strF4 = null;
        int i = 0;
        boolean zM = false;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strF = x1kVarB.f(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    mxe1Var = (mxe1) x1kVarB.A(h661Var, 1, (nma0) znb0VarArr[1].getValue(), mxe1Var);
                    i |= 2;
                    break;
                case 2:
                    strF2 = x1kVarB.f(h661Var, 2);
                    i |= 4;
                    break;
                case 3:
                    pjo0Var = (pjo0) x1kVarB.A(h661Var, 3, ljo0.a, pjo0Var);
                    i |= 8;
                    break;
                case 4:
                    vmo0Var = (vmo0) x1kVarB.A(h661Var, 4, (nma0) znb0VarArr[4].getValue(), vmo0Var);
                    i |= 16;
                    break;
                case 5:
                    zM = x1kVarB.M(h661Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strF3 = x1kVarB.f(h661Var, 6);
                    i |= 64;
                    break;
                case 7:
                    bdj0Var = (bdj0) x1kVarB.A(h661Var, 7, ycj0.a, bdj0Var);
                    i |= 128;
                    break;
                case 8:
                    strF4 = x1kVarB.f(h661Var, 8);
                    i |= 256;
                    break;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new kjo0(i, strF, mxe1Var, strF2, pjo0Var, vmo0Var, zM, strF3, bdj0Var, strF4);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        kjo0 kjo0Var = (kjo0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = kjo0.t;
        z1kVarB.G(h661Var, 0, kjo0Var.a);
        z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), kjo0Var.b);
        z1kVarB.G(h661Var, 2, kjo0Var.c);
        z1kVarB.k(h661Var, 3, ljo0.a, kjo0Var.d);
        z1kVarB.k(h661Var, 4, (nma0) znb0VarArr[4].getValue(), kjo0Var.e);
        z1kVarB.E(h661Var, 5, kjo0Var.f);
        z1kVarB.G(h661Var, 6, kjo0Var.g);
        z1kVarB.k(h661Var, 7, ycj0.a, kjo0Var.h);
        z1kVarB.G(h661Var, 8, kjo0Var.i);
        z1kVarB.a(h661Var);
    }
}
