package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class l3w0 implements pf40 {
    public static final l3w0 a;
    private static final h661 descriptor;

    static {
        l3w0 l3w0Var = new l3w0();
        a = l3w0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.prerelease.prerelease.datasource.PrereleaseTrack", l3w0Var, 6);
        m0v0Var.j("uri", true);
        m0v0Var.j("title", false);
        m0v0Var.j("artist_names", false);
        m0v0Var.j("interactivity_enabled", true);
        m0v0Var.j("row_id", true);
        m0v0Var.j("isAvailableInCatalogue", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = n3w0.g;
        chc1 chc1Var = chc1.a;
        gpb gpbVar = gpb.a;
        return new nma0[]{m5n1.z(chc1Var), chc1Var, znb0VarArr[2].getValue(), m5n1.z(gpbVar), m5n1.z(chc1Var), gpbVar};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = n3w0.g;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        String str = null;
        String strF = null;
        List list = null;
        Boolean bool = null;
        String str2 = null;
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
                    strF = x1kVarB.f(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) x1kVarB.A(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) x1kVarB.B(h661Var, 3, gpb.a, bool);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) x1kVarB.B(h661Var, 4, chc1.a, str2);
                    i |= 16;
                    break;
                case 5:
                    zM = x1kVarB.M(h661Var, 5);
                    i |= 32;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new n3w0(i, str, strF, list, bool, str2, zM);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        n3w0 n3w0Var = (n3w0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = n3w0.g;
        String str = n3w0Var.a;
        Boolean bool = n3w0Var.d;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        z1kVarB.G(h661Var, 1, n3w0Var.b);
        z1kVarB.k(h661Var, 2, (nma0) znb0VarArr[2].getValue(), n3w0Var.c);
        if (!u890.j(bool, Boolean.FALSE)) {
            z1kVarB.s(h661Var, 3, gpb.a, bool);
        }
        String str2 = n3w0Var.e;
        if (str2 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str2);
        }
        boolean z = n3w0Var.f;
        if (z) {
            z1kVarB.E(h661Var, 5, z);
        }
        z1kVarB.a(h661Var);
    }
}
