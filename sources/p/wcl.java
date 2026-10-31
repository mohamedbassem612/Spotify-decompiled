package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class wcl implements pf40 {
    public static final wcl a;
    private static final h661 descriptor;

    static {
        wcl wclVar = new wcl();
        a = wclVar;
        m0v0 m0v0Var = new m0v0("com.spotify.bluejay.data.impl.network.ConnectorAppResponse", wclVar, 8);
        m0v0Var.j("id", false);
        m0v0Var.j("name", false);
        m0v0Var.j("description", true);
        m0v0Var.j("icon_url", false);
        m0v0Var.j("connected", false);
        m0v0Var.j("connected_user", true);
        m0v0Var.j("web_view_url", false);
        m0v0Var.j("enabled_for_feature", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        nma0 nma0VarZ = m5n1.z(nma0Var);
        nma0 nma0VarZ2 = m5n1.z(nma0Var);
        gpb gpbVar = gpb.a;
        return new nma0[]{nma0Var, nma0Var, nma0VarZ, nma0Var, gpbVar, nma0VarZ2, nma0Var, gpbVar};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean zM = false;
        boolean zM2 = false;
        String strF = null;
        String strF2 = null;
        String str = null;
        String strF3 = null;
        String str2 = null;
        String strF4 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strF = x1kVarB.f(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strF2 = x1kVarB.f(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) x1kVarB.B(h661Var, 2, chc1.a, str);
                    i |= 4;
                    break;
                case 3:
                    strF3 = x1kVarB.f(h661Var, 3);
                    i |= 8;
                    break;
                case 4:
                    zM = x1kVarB.M(h661Var, 4);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) x1kVarB.B(h661Var, 5, chc1.a, str2);
                    i |= 32;
                    break;
                case 6:
                    strF4 = x1kVarB.f(h661Var, 6);
                    i |= 64;
                    continue;
                case 7:
                    zM2 = x1kVarB.M(h661Var, 7);
                    i |= 128;
                    continue;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new ycl(i, strF, strF2, str, strF3, zM, str2, strF4, zM2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ycl yclVar = (ycl) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = yclVar.a;
        String str2 = yclVar.f;
        String str3 = yclVar.c;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, yclVar.b);
        if (z1kVarB.d0() || str3 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str3);
        }
        z1kVarB.G(h661Var, 3, yclVar.d);
        z1kVarB.E(h661Var, 4, yclVar.e);
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str2);
        }
        z1kVarB.G(h661Var, 6, yclVar.g);
        z1kVarB.E(h661Var, 7, yclVar.h);
        z1kVarB.a(h661Var);
    }
}
