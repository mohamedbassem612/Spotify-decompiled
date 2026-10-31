package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class elc1 implements pf40 {
    public static final elc1 a;
    private static final h661 descriptor;

    static {
        elc1 elc1Var = new elc1();
        a = elc1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.audiobookpremium.cappingdatasource.models.domain.SubaccountCard", elc1Var, 8);
        m0v0Var.j("title", true);
        m0v0Var.j("subtitle", true);
        m0v0Var.j("cta", true);
        m0v0Var.j("ctaUrl", true);
        m0v0Var.j("ctaPrompt", true);
        m0v0Var.j("detailsRowText", true);
        m0v0Var.j("detailsRowUrl", true);
        m0v0Var.j("progressBarSubtitle", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, chc1Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        String strF8 = null;
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
                    strF3 = x1kVarB.f(h661Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strF4 = x1kVarB.f(h661Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strF5 = x1kVarB.f(h661Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strF6 = x1kVarB.f(h661Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strF7 = x1kVarB.f(h661Var, 6);
                    i |= 64;
                    break;
                case 7:
                    strF8 = x1kVarB.f(h661Var, 7);
                    i |= 128;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new glc1(i, strF, strF2, strF3, strF4, strF5, strF6, strF7, strF8);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        glc1 glc1Var = (glc1) obj;
        String str = glc1Var.h;
        String str2 = glc1Var.g;
        String str3 = glc1Var.f;
        String str4 = glc1Var.e;
        String str5 = glc1Var.d;
        String str6 = glc1Var.c;
        String str7 = glc1Var.b;
        String str8 = glc1Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || !u890.j(str8, "")) {
            z1kVarB.G(h661Var, 0, str8);
        }
        if (z1kVarB.d0() || !u890.j(str7, "")) {
            z1kVarB.G(h661Var, 1, str7);
        }
        if (z1kVarB.d0() || !u890.j(str6, "")) {
            z1kVarB.G(h661Var, 2, str6);
        }
        if (z1kVarB.d0() || !u890.j(str5, "")) {
            z1kVarB.G(h661Var, 3, str5);
        }
        if (z1kVarB.d0() || !u890.j(str4, "")) {
            z1kVarB.G(h661Var, 4, str4);
        }
        if (z1kVarB.d0() || !u890.j(str3, "")) {
            z1kVarB.G(h661Var, 5, str3);
        }
        if (z1kVarB.d0() || !u890.j(str2, "")) {
            z1kVarB.G(h661Var, 6, str2);
        }
        if (z1kVarB.d0() || !u890.j(str, "")) {
            z1kVarB.G(h661Var, 7, str);
        }
        z1kVarB.a(h661Var);
    }
}
