package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class yf1 implements pf40 {
    public static final yf1 a;
    private static final h661 descriptor;

    static {
        yf1 yf1Var = new yf1();
        a = yf1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.audiobookpremium.cappingdatasource.models.domain.AddOnHoursCard", yf1Var, 4);
        m0v0Var.j("title", true);
        m0v0Var.j("subtitle", true);
        m0v0Var.j("cta", true);
        m0v0Var.j("ctaUrl", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var, chc1Var};
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
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                strF2 = x1kVarB.f(h661Var, 1);
                i |= 2;
            } else if (iP == 2) {
                strF3 = x1kVarB.f(h661Var, 2);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                strF4 = x1kVarB.f(h661Var, 3);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new ag1(i, strF, strF2, strF3, strF4);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ag1 ag1Var = (ag1) obj;
        String str = ag1Var.d;
        String str2 = ag1Var.c;
        String str3 = ag1Var.b;
        String str4 = ag1Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || !u890.j(str4, "")) {
            z1kVarB.G(h661Var, 0, str4);
        }
        if (z1kVarB.d0() || !u890.j(str3, "")) {
            z1kVarB.G(h661Var, 1, str3);
        }
        if (z1kVarB.d0() || !u890.j(str2, "")) {
            z1kVarB.G(h661Var, 2, str2);
        }
        if (z1kVarB.d0() || !u890.j(str, "")) {
            z1kVarB.G(h661Var, 3, str);
        }
        z1kVarB.a(h661Var);
    }
}
