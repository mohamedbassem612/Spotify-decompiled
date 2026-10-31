package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class h78 implements pf40 {
    public static final h78 a;
    private static final h661 descriptor;

    static {
        h78 h78Var = new h78();
        a = h78Var;
        m0v0 m0v0Var = new m0v0("com.spotify.audiobook.ccbottomsheetimpl.data.AudiobookCappedExplanationResponse", h78Var, 7);
        m0v0Var.j("title", true);
        m0v0Var.j("body", true);
        m0v0Var.j("cta", true);
        m0v0Var.j("ctaUrl", true);
        m0v0Var.j("dismiss", true);
        m0v0Var.j("secondaryCta", true);
        m0v0Var.j("secondaryCtaUrl", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) x1kVarB.B(h661Var, 1, chc1.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) x1kVarB.B(h661Var, 2, chc1.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) x1kVarB.B(h661Var, 3, chc1.a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) x1kVarB.B(h661Var, 4, chc1.a, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) x1kVarB.B(h661Var, 5, chc1.a, str6);
                    i |= 32;
                    break;
                case 6:
                    str7 = (String) x1kVarB.B(h661Var, 6, chc1.a, str7);
                    i |= 64;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new j78(i, str, str2, str3, str4, str5, str6, str7);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        j78 j78Var = (j78) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = j78Var.a;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        String str2 = j78Var.b;
        if (str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        String str3 = j78Var.c;
        if (str3 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str3);
        }
        String str4 = j78Var.d;
        if (str4 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str4);
        }
        String str5 = j78Var.e;
        if (str5 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str5);
        }
        String str6 = j78Var.f;
        if (str6 != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str6);
        }
        String str7 = j78Var.g;
        if (str7 != null) {
            z1kVarB.s(h661Var, 6, chc1.a, str7);
        }
        z1kVarB.a(h661Var);
    }
}
