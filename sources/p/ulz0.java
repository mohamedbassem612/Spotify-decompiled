package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class ulz0 implements pf40 {
    public static final ulz0 a;
    private static final h661 descriptor;

    static {
        ulz0 ulz0Var = new ulz0();
        a = ulz0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.audiobookpremium.cappingdatasource.models.dto.QuotasViewCopyDto", ulz0Var, 12);
        m0v0Var.j("cappedInstruction", false);
        m0v0Var.j("topUpExpiry", false);
        m0v0Var.j("topUpsCard", true);
        m0v0Var.j("topUpsIntroCard", true);
        m0v0Var.j("paygListeningHoursCard", true);
        m0v0Var.j("paygListeningHoursIntroCard", true);
        m0v0Var.j("subscriptionUsageCard", true);
        m0v0Var.j("subscriptionUsageCardWithCta", true);
        m0v0Var.j("listeningHoursDetailsPageCard", true);
        m0v0Var.j("addonHoursCard", true);
        m0v0Var.j("listeningHoursTitle", true);
        m0v0Var.j("isSubaccountAddOnExpiring", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, qgf1.a, zgf1.a, elc1.a, ilc1.a, moc1.a, poc1.a, did0.a, yf1.a, chc1Var, gpb.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        ag1 ag1Var = null;
        boolean z = true;
        fid0 fid0Var = null;
        int i = 0;
        String strF = null;
        String strF2 = null;
        sgf1 sgf1Var = null;
        bhf1 bhf1Var = null;
        glc1 glc1Var = null;
        klc1 klc1Var = null;
        ooc1 ooc1Var = null;
        roc1 roc1Var = null;
        String strF3 = null;
        boolean zM = false;
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
                    sgf1Var = (sgf1) x1kVarB.A(h661Var, 2, qgf1.a, sgf1Var);
                    i |= 4;
                    break;
                case 3:
                    bhf1Var = (bhf1) x1kVarB.A(h661Var, 3, zgf1.a, bhf1Var);
                    i |= 8;
                    break;
                case 4:
                    glc1Var = (glc1) x1kVarB.A(h661Var, 4, elc1.a, glc1Var);
                    i |= 16;
                    break;
                case 5:
                    klc1Var = (klc1) x1kVarB.A(h661Var, 5, ilc1.a, klc1Var);
                    i |= 32;
                    break;
                case 6:
                    ooc1Var = (ooc1) x1kVarB.A(h661Var, 6, moc1.a, ooc1Var);
                    i |= 64;
                    break;
                case 7:
                    roc1Var = (roc1) x1kVarB.A(h661Var, 7, poc1.a, roc1Var);
                    i |= 128;
                    break;
                case 8:
                    fid0Var = (fid0) x1kVarB.A(h661Var, 8, did0.a, fid0Var);
                    i |= 256;
                    break;
                case 9:
                    ag1Var = (ag1) x1kVarB.A(h661Var, 9, yf1.a, ag1Var);
                    i |= 512;
                    break;
                case 10:
                    strF3 = x1kVarB.f(h661Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    zM = x1kVarB.M(h661Var, 11);
                    i |= 2048;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new wlz0(i, strF, strF2, sgf1Var, bhf1Var, glc1Var, klc1Var, ooc1Var, roc1Var, fid0Var, ag1Var, strF3, zM);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        wlz0 wlz0Var = (wlz0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = wlz0Var.a;
        boolean z = wlz0Var.l;
        String str2 = wlz0Var.k;
        ag1 ag1Var = wlz0Var.j;
        fid0 fid0Var = wlz0Var.i;
        roc1 roc1Var = wlz0Var.h;
        ooc1 ooc1Var = wlz0Var.g;
        klc1 klc1Var = wlz0Var.f;
        glc1 glc1Var = wlz0Var.e;
        bhf1 bhf1Var = wlz0Var.d;
        sgf1 sgf1Var = wlz0Var.c;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, wlz0Var.b);
        if (z1kVarB.d0() || !u890.j(sgf1Var, new sgf1())) {
            z1kVarB.k(h661Var, 2, qgf1.a, sgf1Var);
        }
        if (z1kVarB.d0() || !u890.j(bhf1Var, new bhf1())) {
            z1kVarB.k(h661Var, 3, zgf1.a, bhf1Var);
        }
        if (z1kVarB.d0() || !u890.j(glc1Var, new glc1())) {
            z1kVarB.k(h661Var, 4, elc1.a, glc1Var);
        }
        if (z1kVarB.d0() || !u890.j(klc1Var, new klc1())) {
            z1kVarB.k(h661Var, 5, ilc1.a, klc1Var);
        }
        if (z1kVarB.d0() || !u890.j(ooc1Var, new ooc1())) {
            z1kVarB.k(h661Var, 6, moc1.a, ooc1Var);
        }
        if (z1kVarB.d0() || !u890.j(roc1Var, new roc1())) {
            z1kVarB.k(h661Var, 7, poc1.a, roc1Var);
        }
        if (z1kVarB.d0() || !u890.j(fid0Var, new fid0())) {
            z1kVarB.k(h661Var, 8, did0.a, fid0Var);
        }
        if (z1kVarB.d0() || !u890.j(ag1Var, new ag1())) {
            z1kVarB.k(h661Var, 9, yf1.a, ag1Var);
        }
        if (z1kVarB.d0() || !u890.j(str2, "")) {
            z1kVarB.G(h661Var, 10, str2);
        }
        if (z1kVarB.d0() || z) {
            z1kVarB.E(h661Var, 11, z);
        }
        z1kVarB.a(h661Var);
    }
}
