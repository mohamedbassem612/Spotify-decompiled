package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class jv21 implements pf40 {
    public static final jv21 a;
    private static final h661 descriptor;

    static {
        jv21 jv21Var = new jv21();
        a = jv21Var;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.ResolvedJam", jv21Var, 5);
        m0v0Var.j("available_jam", false);
        m0v0Var.j("visibility", false);
        m0v0Var.j("resolved_token", true);
        m0v0Var.j("join_options", true);
        m0v0Var.j("correlation_id", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = lv21.f;
        return new nma0[]{p89.a, njk1.a, znb0VarArr[2].getValue(), znb0VarArr[3].getValue(), chc1.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = lv21.f;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        r89 r89Var = null;
        ujk1 ujk1Var = null;
        List list = null;
        List list2 = null;
        String strF = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                r89Var = (r89) x1kVarB.A(h661Var, 0, p89.a, r89Var);
                i |= 1;
            } else if (iP == 1) {
                ujk1Var = (ujk1) x1kVarB.A(h661Var, 1, njk1.a, ujk1Var);
                i |= 2;
            } else if (iP == 2) {
                list = (List) x1kVarB.A(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list);
                i |= 4;
            } else if (iP == 3) {
                list2 = (List) x1kVarB.A(h661Var, 3, (nma0) znb0VarArr[3].getValue(), list2);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                strF = x1kVarB.f(h661Var, 4);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new lv21(i, r89Var, ujk1Var, list, list2, strF);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        lv21 lv21Var = (lv21) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = lv21.f;
        p89 p89Var = p89.a;
        r89 r89Var = lv21Var.a;
        List list = lv21Var.d;
        List list2 = lv21Var.c;
        z1kVarB.k(h661Var, 0, p89Var, r89Var);
        z1kVarB.k(h661Var, 1, njk1.a, lv21Var.b);
        boolean zD0 = z1kVarB.d0();
        z6x z6xVar = z6x.a;
        if (zD0 || !u890.j(list2, z6xVar)) {
            z1kVarB.k(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list2);
        }
        if (z1kVarB.d0() || !u890.j(list, z6xVar)) {
            z1kVarB.k(h661Var, 3, (nma0) znb0VarArr[3].getValue(), list);
        }
        z1kVarB.G(h661Var, 4, lv21Var.e);
        z1kVarB.a(h661Var);
    }
}
