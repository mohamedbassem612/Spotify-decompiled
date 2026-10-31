package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class uti0 implements pf40 {
    public static final uti0 a;
    private static final h661 descriptor;

    static {
        uti0 uti0Var = new uti0();
        a = uti0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.prerelease.prerelease.datasource.Merch", uti0Var, 5);
        m0v0Var.j("id", true);
        m0v0Var.j("url", true);
        m0v0Var.j("image_uri", true);
        m0v0Var.j("name", true);
        m0v0Var.j("description", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var)};
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
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                i |= 1;
            } else if (iP == 1) {
                str2 = (String) x1kVarB.B(h661Var, 1, chc1.a, str2);
                i |= 2;
            } else if (iP == 2) {
                str3 = (String) x1kVarB.B(h661Var, 2, chc1.a, str3);
                i |= 4;
            } else if (iP == 3) {
                str4 = (String) x1kVarB.B(h661Var, 3, chc1.a, str4);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                str5 = (String) x1kVarB.B(h661Var, 4, chc1.a, str5);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new zti0(i, str, str2, str3, str4, str5);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        zti0 zti0Var = (zti0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = zti0Var.a;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        String str2 = zti0Var.b;
        if (str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        String str3 = zti0Var.c;
        if (str3 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str3);
        }
        String str4 = zti0Var.d;
        if (str4 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str4);
        }
        String str5 = zti0Var.e;
        if (str5 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str5);
        }
        z1kVarB.a(h661Var);
    }
}
