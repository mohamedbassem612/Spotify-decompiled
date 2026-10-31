package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class sp5 implements pf40 {
    public static final sp5 a;
    private static final h661 descriptor;

    static {
        sp5 sp5Var = new sp5();
        a = sp5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.Album", sp5Var, 3);
        m0v0Var.j("name", true);
        m0v0Var.j("type", true);
        m0v0Var.j("uri", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var)};
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
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                str3 = (String) x1kVarB.B(h661Var, 2, chc1.a, str3);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        up5 up5Var = new up5();
        if ((i & 1) == 0) {
            up5Var.b = null;
        } else {
            up5Var.b = str;
        }
        if ((i & 2) == 0) {
            up5Var.c = null;
        } else {
            up5Var.c = str2;
        }
        if ((i & 4) == 0) {
            up5Var.d = null;
            return up5Var;
        }
        up5Var.d = str3;
        return up5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        up5 up5Var = (up5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = up5Var.b;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        String str2 = up5Var.c;
        if (str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        String str3 = up5Var.d;
        if (str3 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str3);
        }
        z1kVarB.a(h661Var);
    }
}
