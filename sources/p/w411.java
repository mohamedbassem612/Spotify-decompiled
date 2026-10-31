package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class w411 implements pf40 {
    public static final w411 a;
    private static final h661 descriptor;

    static {
        w411 w411Var = new w411();
        a = w411Var;
        m0v0 m0v0Var = new m0v0("com.spotify.assistedcuration.content.model.RecsTrack", w411Var, 7);
        m0v0Var.j("uri", false);
        m0v0Var.j("name", false);
        m0v0Var.j("preview_id", true);
        m0v0Var.j("album", true);
        m0v0Var.j("artists", true);
        m0v0Var.j("explicit", false);
        m0v0Var.j("content_rating", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = y411.h;
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, m5n1.z(chc1Var), m5n1.z(l411.a), znb0VarArr[4].getValue(), gpb.a, znb0VarArr[6].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = y411.h;
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean zM = false;
        String strF = null;
        String strF2 = null;
        String str = null;
        n411 n411Var = null;
        List list = null;
        List list2 = null;
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
                    n411Var = (n411) x1kVarB.B(h661Var, 3, l411.a, n411Var);
                    i |= 8;
                    break;
                case 4:
                    list = (List) x1kVarB.A(h661Var, 4, (nma0) znb0VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    zM = x1kVarB.M(h661Var, 5);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) x1kVarB.A(h661Var, 6, (nma0) znb0VarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new y411(i, strF, strF2, str, n411Var, list, zM, list2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        y411 y411Var = (y411) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = y411.h;
        String str = y411Var.a;
        List list = y411Var.g;
        List list2 = y411Var.e;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, y411Var.b);
        String str2 = y411Var.c;
        if (str2 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str2);
        }
        n411 n411Var = y411Var.d;
        if (n411Var != null) {
            z1kVarB.s(h661Var, 3, l411.a, n411Var);
        }
        boolean zD0 = z1kVarB.d0();
        z6x z6xVar = z6x.a;
        if (zD0 || !u890.j(list2, z6xVar)) {
            z1kVarB.k(h661Var, 4, (nma0) znb0VarArr[4].getValue(), list2);
        }
        z1kVarB.E(h661Var, 5, y411Var.f);
        if (z1kVarB.d0() || !u890.j(list, z6xVar)) {
            z1kVarB.k(h661Var, 6, (nma0) znb0VarArr[6].getValue(), list);
        }
        z1kVarB.a(h661Var);
    }
}
