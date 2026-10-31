package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class nlz0 implements pf40 {
    public static final nlz0 a;
    private static final h661 descriptor;

    static {
        nlz0 nlz0Var = new nlz0();
        a = nlz0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.audiobookpremium.cappingdatasource.models.dto.QuotaDto", nlz0Var, 6);
        m0v0Var.j("quotaType", true);
        m0v0Var.j("validFrom", true);
        m0v0Var.j("validTo", true);
        m0v0Var.j("totalQuota", true);
        m0v0Var.j("usedQuota", true);
        m0v0Var.j("consumptionOrder", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{plz0.g[0].getValue(), chc1Var, chc1Var, chc1Var, chc1Var, wr80.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = plz0.g;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        int iO = 0;
        slz0 slz0Var = null;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    slz0Var = (slz0) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), slz0Var);
                    i |= 1;
                    break;
                case 1:
                    strF = x1kVarB.f(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strF2 = x1kVarB.f(h661Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strF3 = x1kVarB.f(h661Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strF4 = x1kVarB.f(h661Var, 4);
                    i |= 16;
                    break;
                case 5:
                    iO = x1kVarB.o(h661Var, 5);
                    i |= 32;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new plz0(i, slz0Var, strF, strF2, strF3, strF4, iO);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        plz0 plz0Var = (plz0) obj;
        int i = plz0Var.f;
        String str = plz0Var.e;
        String str2 = plz0Var.d;
        String str3 = plz0Var.c;
        String str4 = plz0Var.b;
        slz0 slz0Var = plz0Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = plz0.g;
        if (z1kVarB.d0() || slz0Var != slz0.b) {
            z1kVarB.k(h661Var, 0, (nma0) znb0VarArr[0].getValue(), slz0Var);
        }
        if (z1kVarB.d0() || !u890.j(str4, "")) {
            z1kVarB.G(h661Var, 1, str4);
        }
        if (z1kVarB.d0() || !u890.j(str3, "")) {
            z1kVarB.G(h661Var, 2, str3);
        }
        if (z1kVarB.d0() || !u890.j(str2, "")) {
            z1kVarB.G(h661Var, 3, str2);
        }
        if (z1kVarB.d0() || !u890.j(str, "")) {
            z1kVarB.G(h661Var, 4, str);
        }
        if (z1kVarB.d0() || i != 0) {
            z1kVarB.e(5, i, h661Var);
        }
        z1kVarB.a(h661Var);
    }
}
