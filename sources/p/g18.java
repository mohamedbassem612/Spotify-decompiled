package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class g18 implements pf40 {
    public static final g18 a;
    private static final h661 descriptor;

    static {
        g18 g18Var = new g18();
        a = g18Var;
        m0v0 m0v0Var = new m0v0("com.spotify.betamax.playerimpl.exo.model.AudioProfile", g18Var, 10);
        m0v0Var.j("id", false);
        m0v0Var.j("bitrate", false);
        m0v0Var.j("codec", false);
        m0v0Var.j("mime_type", false);
        m0v0Var.j("key_id", true);
        m0v0Var.j("file_type", false);
        m0v0Var.j("max_bitrate", false);
        m0v0Var.j("encryption_indices", true);
        m0v0Var.j("language", true);
        m0v0Var.j("original_language", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = i18.k;
        nma0 nma0Var = chc1.a;
        nma0 nma0VarZ = m5n1.z(nma0Var);
        nma0 nma0VarZ2 = m5n1.z((nma0) znb0VarArr[7].getValue());
        nma0 nma0VarZ3 = m5n1.z(nma0Var);
        nma0 nma0VarZ4 = m5n1.z(gpb.a);
        wr80 wr80Var = wr80.a;
        return new nma0[]{o5f0.a, wr80Var, nma0Var, nma0Var, nma0VarZ, nma0Var, wr80Var, nma0VarZ2, nma0VarZ3, nma0VarZ4};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = i18.k;
        x1kVarB.getClass();
        long jI0 = 0;
        boolean z = true;
        List list = null;
        Boolean bool = null;
        String str = null;
        int i = 0;
        int iO = 0;
        String strF = null;
        String strF2 = null;
        String str2 = null;
        String strF3 = null;
        int iO2 = 0;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jI0 = x1kVarB.i0(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    iO = x1kVarB.o(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strF = x1kVarB.f(h661Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strF2 = x1kVarB.f(h661Var, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) x1kVarB.B(h661Var, 4, chc1.a, str2);
                    i |= 16;
                    break;
                case 5:
                    strF3 = x1kVarB.f(h661Var, 5);
                    i |= 32;
                    break;
                case 6:
                    iO2 = x1kVarB.o(h661Var, 6);
                    i |= 64;
                    break;
                case 7:
                    list = (List) x1kVarB.B(h661Var, 7, (nma0) znb0VarArr[7].getValue(), list);
                    i |= 128;
                    break;
                case 8:
                    str = (String) x1kVarB.B(h661Var, 8, chc1.a, str);
                    i |= 256;
                    break;
                case 9:
                    bool = (Boolean) x1kVarB.B(h661Var, 9, gpb.a, bool);
                    i |= 512;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new i18(i, jI0, iO, strF, strF2, str2, strF3, iO2, list, str, bool);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        i18 i18Var = (i18) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = i18.k;
        long j = i18Var.a;
        Boolean bool = i18Var.j;
        List list = i18Var.h;
        z1kVarB.l(h661Var, 0, j);
        z1kVarB.e(1, i18Var.b, h661Var);
        z1kVarB.G(h661Var, 2, i18Var.c);
        z1kVarB.G(h661Var, 3, i18Var.d);
        String str = i18Var.e;
        if (str != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str);
        }
        z1kVarB.G(h661Var, 5, i18Var.f);
        z1kVarB.e(6, i18Var.g, h661Var);
        if (list != null) {
            z1kVarB.s(h661Var, 7, (nma0) znb0VarArr[7].getValue(), list);
        }
        String str2 = i18Var.i;
        if (str2 != null) {
            z1kVarB.s(h661Var, 8, chc1.a, str2);
        }
        if (!u890.j(bool, Boolean.FALSE)) {
            z1kVarB.s(h661Var, 9, gpb.a, bool);
        }
        z1kVarB.a(h661Var);
    }
}
