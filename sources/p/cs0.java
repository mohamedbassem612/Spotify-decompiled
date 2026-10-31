package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class cs0 implements pf40 {
    public static final cs0 a;
    private static final h661 descriptor;

    static {
        cs0 cs0Var = new cs0();
        a = cs0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.adonappopen.repository.network.AdOnAppOpenAd", cs0Var, 6);
        m0v0Var.j("id", false);
        m0v0Var.j("clickthrough", false);
        m0v0Var.j("trackingEvents", true);
        m0v0Var.j("metadata", true);
        m0v0Var.j("video", true);
        m0v0Var.j("display", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = ks0.n;
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, znb0VarArr[2].getValue(), znb0VarArr[3].getValue(), znb0VarArr[4].getValue(), znb0VarArr[5].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = ks0.n;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        Map map = null;
        Map map2 = null;
        List list = null;
        List list2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case SplitInstallErrorCode.ACTIVE_SESSIONS_LIMIT_EXCEEDED /* -1 */:
                    z = false;
                    break;
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    strF = x1kVarB.f(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strF2 = x1kVarB.f(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    map = (Map) x1kVarB.A(h661Var, 2, (nma0) znb0VarArr[2].getValue(), map);
                    i |= 4;
                    break;
                case 3:
                    map2 = (Map) x1kVarB.A(h661Var, 3, (nma0) znb0VarArr[3].getValue(), map2);
                    i |= 8;
                    break;
                case 4:
                    list = (List) x1kVarB.A(h661Var, 4, (nma0) znb0VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) x1kVarB.A(h661Var, 5, (nma0) znb0VarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new ks0(i, strF, strF2, map, map2, list, list2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ks0 ks0Var = (ks0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = ks0.n;
        String str = ks0Var.a;
        List list = ks0Var.f;
        List list2 = ks0Var.e;
        Map map = ks0Var.d;
        Map map2 = ks0Var.c;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, ks0Var.b);
        boolean zD0 = z1kVarB.d0();
        b7x b7xVar = b7x.a;
        if (zD0 || !u890.j(map2, b7xVar)) {
            z1kVarB.k(h661Var, 2, (nma0) znb0VarArr[2].getValue(), map2);
        }
        if (z1kVarB.d0() || !u890.j(map, b7xVar)) {
            z1kVarB.k(h661Var, 3, (nma0) znb0VarArr[3].getValue(), map);
        }
        boolean zD1 = z1kVarB.d0();
        z6x z6xVar = z6x.a;
        if (zD1 || !u890.j(list2, z6xVar)) {
            z1kVarB.k(h661Var, 4, (nma0) znb0VarArr[4].getValue(), list2);
        }
        if (z1kVarB.d0() || !u890.j(list, z6xVar)) {
            z1kVarB.k(h661Var, 5, (nma0) znb0VarArr[5].getValue(), list);
        }
        z1kVarB.a(h661Var);
    }
}
