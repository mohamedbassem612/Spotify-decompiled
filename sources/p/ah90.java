package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class ah90 implements pf40 {
    public static final ah90 a;
    private static final h661 descriptor;

    static {
        ah90 ah90Var = new ah90();
        a = ah90Var;
        m0v0 m0v0Var = new m0v0("com.spotify.listuxplatformconsumers.standard.sections.extender.datasource.Item", ah90Var, 4);
        m0v0Var.j("id", true);
        m0v0Var.j("name", true);
        m0v0Var.j("imageUrl", true);
        m0v0Var.j("largeImageUrl", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var)};
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
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                str4 = (String) x1kVarB.B(h661Var, 3, chc1.a, str4);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new pi90(i, str, str2, str3, str4);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        pi90 pi90Var = (pi90) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = pi90Var.a;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        String str2 = pi90Var.b;
        if (str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        String str3 = pi90Var.c;
        if (str3 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str3);
        }
        String str4 = pi90Var.d;
        if (str4 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str4);
        }
        z1kVarB.a(h661Var);
    }
}
