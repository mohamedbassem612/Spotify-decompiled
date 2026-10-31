package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class dxn implements pf40 {
    public static final dxn a;
    private static final h661 descriptor;

    static {
        dxn dxnVar = new dxn();
        a = dxnVar;
        m0v0 m0v0Var = new m0v0("com.spotify.artist.creatorartist.model.CreatorAboutModel", dxnVar, 9);
        m0v0Var.j("monthlyListeners", true);
        m0v0Var.j("globalChartPosition", true);
        m0v0Var.j("images", true);
        m0v0Var.j("biography", true);
        m0v0Var.j("name", true);
        m0v0Var.j("mainImageUrl", true);
        m0v0Var.j("autobiography", true);
        m0v0Var.j("isVerified", true);
        m0v0Var.j("artistFacts", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = fxn.t;
        wr80 wr80Var = wr80.a;
        chc1 chc1Var = chc1.a;
        return new nma0[]{wr80Var, wr80Var, znb0VarArr[2].getValue(), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(t29.a), gpb.a, m5n1.z(po6.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = fxn.t;
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        ro6 ro6Var = null;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        v29 v29Var = null;
        int i = 0;
        int iO = 0;
        int iO2 = 0;
        boolean zM = false;
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
                    list = (List) x1kVarB.A(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    str = (String) x1kVarB.B(h661Var, 3, chc1.a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) x1kVarB.B(h661Var, 4, chc1.a, str2);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) x1kVarB.B(h661Var, 5, chc1.a, str3);
                    i |= 32;
                    break;
                case 6:
                    v29Var = (v29) x1kVarB.B(h661Var, 6, t29.a, v29Var);
                    i |= 64;
                    break;
                case 7:
                    zM = x1kVarB.M(h661Var, 7);
                    i |= 128;
                    break;
                case 8:
                    ro6Var = (ro6) x1kVarB.B(h661Var, 8, po6.a, ro6Var);
                    i |= 256;
                    break;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new fxn(i, iO, iO2, list, str, str2, str3, v29Var, zM, ro6Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        fxn fxnVar = (fxn) obj;
        List list = fxnVar.c;
        int i = fxnVar.b;
        int i2 = fxnVar.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = fxn.t;
        if (z1kVarB.d0() || i2 != 0) {
            z1kVarB.e(0, i2, h661Var);
        }
        if (z1kVarB.d0() || i != 0) {
            z1kVarB.e(1, i, h661Var);
        }
        if (z1kVarB.d0() || !u890.j(list, z6x.a)) {
            z1kVarB.k(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list);
        }
        String str = fxnVar.d;
        boolean z = fxnVar.h;
        if (str != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str);
        }
        String str2 = fxnVar.e;
        if (str2 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str2);
        }
        String str3 = fxnVar.f;
        if (str3 != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str3);
        }
        v29 v29Var = fxnVar.g;
        if (v29Var != null) {
            z1kVarB.s(h661Var, 6, t29.a, v29Var);
        }
        if (z1kVarB.d0() || z) {
            z1kVarB.E(h661Var, 7, z);
        }
        ro6 ro6Var = fxnVar.i;
        if (ro6Var != null) {
            z1kVarB.s(h661Var, 8, po6.a, ro6Var);
        }
        z1kVarB.a(h661Var);
    }
}
