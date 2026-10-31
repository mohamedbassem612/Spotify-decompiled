package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class y89 implements pf40 {
    public static final y89 a;
    private static final h661 descriptor;

    static {
        y89 y89Var = new y89();
        a = y89Var;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.AvailableMember", y89Var, 5);
        m0v0Var.j("username", false);
        m0v0Var.j("display_name", true);
        m0v0Var.j("image_url", true);
        m0v0Var.j("is_host", false);
        m0v0Var.j("is_anonymous", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        nma0 nma0VarZ = m5n1.z(nma0Var);
        nma0 nma0VarZ2 = m5n1.z(nma0Var);
        gpb gpbVar = gpb.a;
        return new nma0[]{nma0Var, nma0VarZ, nma0VarZ2, gpbVar, gpbVar};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        boolean zM2 = false;
        String strF = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                str = (String) x1kVarB.B(h661Var, 1, chc1.a, str);
                i |= 2;
            } else if (iP == 2) {
                str2 = (String) x1kVarB.B(h661Var, 2, chc1.a, str2);
                i |= 4;
            } else if (iP == 3) {
                zM = x1kVarB.M(h661Var, 3);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                zM2 = x1kVarB.M(h661Var, 4);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new a99(i, strF, str, str2, zM, zM2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        a99 a99Var = (a99) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = a99Var.a;
        boolean z = a99Var.e;
        String str2 = a99Var.c;
        String str3 = a99Var.b;
        z1kVarB.G(h661Var, 0, str);
        if (z1kVarB.d0() || str3 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str3);
        }
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str2);
        }
        z1kVarB.E(h661Var, 3, a99Var.d);
        if (z1kVarB.d0() || z) {
            z1kVarB.E(h661Var, 4, z);
        }
        z1kVarB.a(h661Var);
    }
}
