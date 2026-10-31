package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class toa1 implements pf40 {
    public static final toa1 a;
    private static final h661 descriptor;

    static {
        toa1 toa1Var = new toa1();
        a = toa1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.puffin.crossdevicesyncing.data.SpecificEnabled", toa1Var, 7);
        m0v0Var.j("id", false);
        m0v0Var.j("brand", false);
        m0v0Var.j("model", false);
        m0v0Var.j("deviceName", false);
        m0v0Var.j("filterFiles", false);
        m0v0Var.j("revision", false);
        m0v0Var.j("format", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = voa1.h;
        chc1 chc1Var = chc1.a;
        wr80 wr80Var = wr80.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var, chc1Var, znb0VarArr[4].getValue(), wr80Var, wr80Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = voa1.h;
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        int iO = 0;
        int iO2 = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        List list = null;
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
                    strF3 = x1kVarB.f(h661Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strF4 = x1kVarB.f(h661Var, 3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) x1kVarB.A(h661Var, 4, (nma0) znb0VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    iO = x1kVarB.o(h661Var, 5);
                    i |= 32;
                    continue;
                case 6:
                    iO2 = x1kVarB.o(h661Var, 6);
                    i |= 64;
                    continue;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new voa1(i, iO, iO2, strF, strF2, strF3, strF4, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        voa1 voa1Var = (voa1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = voa1.h;
        z1kVarB.G(h661Var, 0, voa1Var.a);
        z1kVarB.G(h661Var, 1, voa1Var.b);
        z1kVarB.G(h661Var, 2, voa1Var.c);
        z1kVarB.G(h661Var, 3, voa1Var.d);
        z1kVarB.k(h661Var, 4, (nma0) znb0VarArr[4].getValue(), voa1Var.e);
        z1kVarB.e(5, voa1Var.f, h661Var);
        z1kVarB.e(6, voa1Var.g, h661Var);
        z1kVarB.a(h661Var);
    }
}
