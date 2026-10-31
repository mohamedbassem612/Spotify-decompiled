package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class jrc1 implements pf40 {
    public static final jrc1 a;
    private static final h661 descriptor;

    static {
        jrc1 jrc1Var = new jrc1();
        a = jrc1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.betamax.playerimpl.exo.model.SubtitleVariant", jrc1Var, 6);
        m0v0Var.j("path", false);
        m0v0Var.j("language_code", false);
        m0v0Var.j("closed_caption", false);
        m0v0Var.j("type", true);
        m0v0Var.j("supplier", true);
        m0v0Var.j("generation_type", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = lrc1.g;
        nma0 nma0VarZ = m5n1.z((nma0) znb0VarArr[3].getValue());
        nma0 nma0VarZ2 = m5n1.z((nma0) znb0VarArr[4].getValue());
        nma0 nma0VarZ3 = m5n1.z((nma0) znb0VarArr[5].getValue());
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, gpb.a, nma0VarZ, nma0VarZ2, nma0VarZ3};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = lrc1.g;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        String strF = null;
        String strF2 = null;
        hrc1 hrc1Var = null;
        vqc1 vqc1Var = null;
        zpc1 zpc1Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strF = x1kVarB.f(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strF2 = x1kVarB.f(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    zM = x1kVarB.M(h661Var, 2);
                    i |= 4;
                    break;
                case 3:
                    hrc1Var = (hrc1) x1kVarB.B(h661Var, 3, (nma0) znb0VarArr[3].getValue(), hrc1Var);
                    i |= 8;
                    break;
                case 4:
                    vqc1Var = (vqc1) x1kVarB.B(h661Var, 4, (nma0) znb0VarArr[4].getValue(), vqc1Var);
                    i |= 16;
                    break;
                case 5:
                    zpc1Var = (zpc1) x1kVarB.B(h661Var, 5, (nma0) znb0VarArr[5].getValue(), zpc1Var);
                    i |= 32;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new lrc1(i, strF, strF2, zM, hrc1Var, vqc1Var, zpc1Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        lrc1 lrc1Var = (lrc1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = lrc1.g;
        String str = lrc1Var.a;
        zpc1 zpc1Var = lrc1Var.f;
        vqc1 vqc1Var = lrc1Var.e;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, lrc1Var.b);
        z1kVarB.E(h661Var, 2, lrc1Var.c);
        hrc1 hrc1Var = lrc1Var.d;
        if (hrc1Var != null) {
            z1kVarB.s(h661Var, 3, (nma0) znb0VarArr[3].getValue(), hrc1Var);
        }
        if (vqc1Var != null) {
            z1kVarB.s(h661Var, 4, (nma0) znb0VarArr[4].getValue(), vqc1Var);
        }
        if (zpc1Var != null) {
            z1kVarB.s(h661Var, 5, (nma0) znb0VarArr[5].getValue(), zpc1Var);
        }
        z1kVarB.a(h661Var);
    }
}
