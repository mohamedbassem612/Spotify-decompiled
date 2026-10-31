package p;

import com.comscore.streaming.State;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class slu0 implements pf40 {
    public static final slu0 a;
    private static final h661 descriptor;

    static {
        slu0 slu0Var = new slu0();
        a = slu0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.listuxplatformconsumers.standard.sections.extender.datasource.PlaylistExtenderRecommendation", slu0Var, 8);
        m0v0Var.j("id", false);
        m0v0Var.j("name", false);
        m0v0Var.j("album", false);
        m0v0Var.j("duration", true);
        m0v0Var.j("artists", false);
        m0v0Var.j("isExplicit", true);
        m0v0Var.j("isTagged19plus", true);
        m0v0Var.j("isCurrentlyPlayable", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = ulu0.i;
        chc1 chc1Var = chc1.a;
        gpb gpbVar = gpb.a;
        return new nma0[]{chc1Var, chc1Var, ah90.a, wr80.a, znb0VarArr[4].getValue(), gpbVar, gpbVar, gpbVar};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = ulu0.i;
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        int iO = 0;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        String strF = null;
        String strF2 = null;
        pi90 pi90Var = null;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case State.UNDEFINED /* -1 */:
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
                    pi90Var = (pi90) x1kVarB.A(h661Var, 2, ah90.a, pi90Var);
                    i |= 4;
                    break;
                case 3:
                    iO = x1kVarB.o(h661Var, 3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) x1kVarB.A(h661Var, 4, (nma0) znb0VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    zM = x1kVarB.M(h661Var, 5);
                    i |= 32;
                    continue;
                case 6:
                    zM2 = x1kVarB.M(h661Var, 6);
                    i |= 64;
                    continue;
                case 7:
                    zM3 = x1kVarB.M(h661Var, 7);
                    i |= 128;
                    continue;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new ulu0(i, strF, strF2, pi90Var, iO, list, zM, zM2, zM3);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ulu0 ulu0Var = (ulu0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = ulu0.i;
        String str = ulu0Var.a;
        boolean z = ulu0Var.h;
        boolean z2 = ulu0Var.g;
        boolean z3 = ulu0Var.f;
        int i = ulu0Var.d;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, ulu0Var.b);
        z1kVarB.k(h661Var, 2, ah90.a, ulu0Var.c);
        if (z1kVarB.d0() || i != 0) {
            z1kVarB.e(3, i, h661Var);
        }
        z1kVarB.k(h661Var, 4, (nma0) znb0VarArr[4].getValue(), ulu0Var.e);
        if (z1kVarB.d0() || z3) {
            z1kVarB.E(h661Var, 5, z3);
        }
        if (z1kVarB.d0() || z2) {
            z1kVarB.E(h661Var, 6, z2);
        }
        if (z1kVarB.d0() || z) {
            z1kVarB.E(h661Var, 7, z);
        }
        z1kVarB.a(h661Var);
    }
}
