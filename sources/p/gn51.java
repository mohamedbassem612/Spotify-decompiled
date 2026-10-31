package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class gn51 implements pf40 {
    public static final gn51 a;
    private static final h661 descriptor;

    static {
        gn51 gn51Var = new gn51();
        a = gn51Var;
        m0v0 m0v0Var = new m0v0("com.spotify.betamax.playerimpl.exo.model.SeekPanelVariant", gn51Var, 9);
        m0v0Var.j("id", false);
        m0v0Var.j("template_index", true);
        m0v0Var.j("mime_type", false);
        m0v0Var.j("frame_height", false);
        m0v0Var.j("frame_width", false);
        m0v0Var.j("rows", false);
        m0v0Var.j("columns", false);
        m0v0Var.j("panel_ids", true);
        m0v0Var.j("frames", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = in51.j;
        nma0 nma0Var = wr80.a;
        nma0 nma0VarZ = m5n1.z(nma0Var);
        nma0 nma0VarZ2 = m5n1.z((nma0) znb0VarArr[7].getValue());
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, nma0VarZ, chc1Var, nma0Var, nma0Var, nma0Var, nma0Var, nma0VarZ2, jk30.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = in51.j;
        x1kVarB.getClass();
        lk30 lk30Var = null;
        boolean z = true;
        List list = null;
        int i = 0;
        String strF = null;
        Integer num = null;
        String strF2 = null;
        int iO = 0;
        int iO2 = 0;
        int iO3 = 0;
        int iO4 = 0;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strF = x1kVarB.f(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) x1kVarB.B(h661Var, 1, wr80.a, num);
                    i |= 2;
                    break;
                case 2:
                    strF2 = x1kVarB.f(h661Var, 2);
                    i |= 4;
                    break;
                case 3:
                    iO = x1kVarB.o(h661Var, 3);
                    i |= 8;
                    break;
                case 4:
                    iO2 = x1kVarB.o(h661Var, 4);
                    i |= 16;
                    break;
                case 5:
                    iO3 = x1kVarB.o(h661Var, 5);
                    i |= 32;
                    break;
                case 6:
                    iO4 = x1kVarB.o(h661Var, 6);
                    i |= 64;
                    break;
                case 7:
                    list = (List) x1kVarB.B(h661Var, 7, (nma0) znb0VarArr[7].getValue(), list);
                    i |= 128;
                    break;
                case 8:
                    lk30Var = (lk30) x1kVarB.A(h661Var, 8, jk30.a, lk30Var);
                    i |= 256;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new in51(i, strF, num, strF2, iO, iO2, iO3, iO4, list, lk30Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        in51 in51Var = (in51) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = in51.j;
        String str = in51Var.a;
        List list = in51Var.h;
        z1kVarB.G(h661Var, 0, str);
        Integer num = in51Var.b;
        if (num == null || num.intValue() != 0) {
            z1kVarB.s(h661Var, 1, wr80.a, num);
        }
        z1kVarB.G(h661Var, 2, in51Var.c);
        z1kVarB.e(3, in51Var.d, h661Var);
        z1kVarB.e(4, in51Var.e, h661Var);
        z1kVarB.e(5, in51Var.f, h661Var);
        z1kVarB.e(6, in51Var.g, h661Var);
        if (list != null) {
            z1kVarB.s(h661Var, 7, (nma0) znb0VarArr[7].getValue(), list);
        }
        z1kVarB.k(h661Var, 8, jk30.a, in51Var.i);
        z1kVarB.a(h661Var);
    }
}
