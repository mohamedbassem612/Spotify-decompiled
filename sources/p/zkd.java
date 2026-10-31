package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class zkd implements pf40 {
    public static final zkd a;
    private static final h661 descriptor;

    static {
        zkd zkdVar = new zkd();
        a = zkdVar;
        m0v0 m0v0Var = new m0v0("com.spotify.thestage.vtec.logic.Capabilities", zkdVar, 10);
        m0v0Var.j("playback", false);
        m0v0Var.j("checkout", false);
        m0v0Var.j("detectScreenshot", false);
        m0v0Var.j("localPrefs", false);
        m0v0Var.j("createPlaylist", false);
        m0v0Var.j("links", false);
        m0v0Var.j("toolbarVis", false);
        m0v0Var.j("presentEditProfile", false);
        m0v0Var.j("sharing", false);
        m0v0Var.j("mod", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0VarZ = m5n1.z((nma0) cld.k[9].getValue());
        wr80 wr80Var = wr80.a;
        return new nma0[]{wr80Var, wr80Var, wr80Var, wr80Var, wr80Var, wr80Var, wr80Var, wr80Var, wr80Var, nma0VarZ};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = cld.k;
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        Map map = null;
        int i = 0;
        int iO = 0;
        int iO2 = 0;
        int iO3 = 0;
        int iO4 = 0;
        int iO5 = 0;
        int iO6 = 0;
        int iO7 = 0;
        int iO8 = 0;
        int iO9 = 0;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    iO = x1kVarB.o(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    iO2 = x1kVarB.o(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    iO3 = x1kVarB.o(h661Var, 2);
                    i |= 4;
                    break;
                case 3:
                    iO4 = x1kVarB.o(h661Var, 3);
                    i |= 8;
                    break;
                case 4:
                    iO5 = x1kVarB.o(h661Var, 4);
                    i |= 16;
                    break;
                case 5:
                    iO6 = x1kVarB.o(h661Var, 5);
                    i |= 32;
                    break;
                case 6:
                    iO7 = x1kVarB.o(h661Var, 6);
                    i |= 64;
                    break;
                case 7:
                    iO8 = x1kVarB.o(h661Var, 7);
                    i |= 128;
                    break;
                case 8:
                    iO9 = x1kVarB.o(h661Var, 8);
                    i |= 256;
                    break;
                case 9:
                    map = (Map) x1kVarB.B(h661Var, 9, (nma0) znb0VarArr[9].getValue(), map);
                    i |= 512;
                    break;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new cld(i, iO, iO2, iO3, iO4, iO5, iO6, iO7, iO8, iO9, map);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        cld cldVar = (cld) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = cld.k;
        z1kVarB.e(0, cldVar.a, h661Var);
        z1kVarB.e(1, cldVar.b, h661Var);
        z1kVarB.e(2, cldVar.c, h661Var);
        z1kVarB.e(3, cldVar.d, h661Var);
        z1kVarB.e(4, cldVar.e, h661Var);
        z1kVarB.e(5, cldVar.f, h661Var);
        z1kVarB.e(6, cldVar.g, h661Var);
        z1kVarB.e(7, cldVar.h, h661Var);
        z1kVarB.e(8, cldVar.i, h661Var);
        Map map = cldVar.j;
        if (map != null) {
            z1kVarB.s(h661Var, 9, (nma0) znb0VarArr[9].getValue(), map);
        }
        z1kVarB.a(h661Var);
    }
}
