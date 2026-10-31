package p;

import com.android.installreferrer.api.InstallReferrerClient$InstallReferrerResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class ezf implements pf40 {
    public static final ezf a;
    private static final h661 descriptor;

    static {
        ezf ezfVar = new ezf();
        a = ezfVar;
        m0v0 m0v0Var = new m0v0("com.spotify.genalpha.entities.ChildAccount", ezfVar, 7);
        m0v0Var.j("childId", false);
        m0v0Var.j("name", false);
        m0v0Var.j("avatar", false);
        m0v0Var.j("popularMusicAllowed", false);
        m0v0Var.j("dateOfBirth", false);
        m0v0Var.j("color", true);
        m0v0Var.j("isFree", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        nma0 nma0VarZ = m5n1.z(nma0Var);
        nma0 nma0VarZ2 = m5n1.z(wr80.a);
        gpb gpbVar = gpb.a;
        return new nma0[]{nma0Var, nma0Var, nma0Var, gpbVar, nma0VarZ, nma0VarZ2, gpbVar};
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
        String strF2 = null;
        String strF3 = null;
        String str = null;
        Integer num = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case InstallReferrerClient$InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
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
                    zM = x1kVarB.M(h661Var, 3);
                    i |= 8;
                    break;
                case 4:
                    str = (String) x1kVarB.B(h661Var, 4, chc1.a, str);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) x1kVarB.B(h661Var, 5, wr80.a, num);
                    i |= 32;
                    break;
                case 6:
                    zM2 = x1kVarB.M(h661Var, 6);
                    i |= 64;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new gzf(i, strF, strF2, strF3, zM, str, num, zM2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        gzf gzfVar = (gzf) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = gzfVar.a;
        boolean z = gzfVar.g;
        Integer num = gzfVar.f;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, gzfVar.b);
        z1kVarB.G(h661Var, 2, gzfVar.c);
        z1kVarB.E(h661Var, 3, gzfVar.d);
        z1kVarB.s(h661Var, 4, chc1.a, gzfVar.e);
        if (z1kVarB.d0() || num != null) {
            z1kVarB.s(h661Var, 5, wr80.a, num);
        }
        if (z1kVarB.d0() || z) {
            z1kVarB.E(h661Var, 6, z);
        }
        z1kVarB.a(h661Var);
    }
}
