package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class amc0 implements pf40 {
    public static final amc0 a;
    private static final h661 descriptor;

    static {
        amc0 amc0Var = new amc0();
        a = amc0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.artist.creatorartist.model.LinksModel", amc0Var, 6);
        m0v0Var.j("twitter", true);
        m0v0Var.j("instagram", true);
        m0v0Var.j("wikipedia", true);
        m0v0Var.j("facebook", true);
        m0v0Var.j("whatsapp", true);
        m0v0Var.j("tiktok", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var)};
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
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new cmc0(str, str2, str3, str4, i, str5, str6);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        cmc0 cmc0Var = (cmc0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = cmc0Var.a;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        String str2 = cmc0Var.b;
        if (str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        String str3 = cmc0Var.c;
        if (str3 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str3);
        }
        String str4 = cmc0Var.d;
        if (str4 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str4);
        }
        String str5 = cmc0Var.e;
        if (str5 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str5);
        }
        String str6 = cmc0Var.f;
        if (str6 != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str6);
        }
        z1kVarB.a(h661Var);
    }
}
