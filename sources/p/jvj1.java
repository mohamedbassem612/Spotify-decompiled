package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class jvj1 implements pf40 {
    public static final jvj1 a;
    private static final h661 descriptor;

    static {
        jvj1 jvj1Var = new jvj1();
        a = jvj1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.betamax.playerimpl.exo.model.VideoProfile", jvj1Var, 11);
        m0v0Var.j("id", false);
        m0v0Var.j("bitrate", false);
        m0v0Var.j("codec", false);
        m0v0Var.j("resolution", false);
        m0v0Var.j("width", false);
        m0v0Var.j("height", false);
        m0v0Var.j("mime_type", false);
        m0v0Var.j("key_id", true);
        m0v0Var.j("file_type", false);
        m0v0Var.j("max_bitrate", false);
        m0v0Var.j("encryption_indices", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = mvj1.l;
        nma0 nma0Var = chc1.a;
        nma0 nma0VarZ = m5n1.z(nma0Var);
        nma0 nma0VarZ2 = m5n1.z((nma0) znb0VarArr[10].getValue());
        wr80 wr80Var = wr80.a;
        return new nma0[]{o5f0.a, wr80Var, nma0Var, wr80Var, wr80Var, wr80Var, nma0Var, nma0VarZ, nma0Var, wr80Var, nma0VarZ2};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = mvj1.l;
        x1kVarB.getClass();
        Object obj = null;
        long jI0 = 0;
        String str = null;
        List list = null;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        int i = 0;
        int iO = 0;
        int iO2 = 0;
        int iO3 = 0;
        int iO4 = 0;
        int iO5 = 0;
        boolean z = true;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
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
                    iO2 = x1kVarB.o(h661Var, 3);
                    i |= 8;
                    break;
                case 4:
                    iO3 = x1kVarB.o(h661Var, 4);
                    i |= 16;
                    break;
                case 5:
                    iO4 = x1kVarB.o(h661Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strF2 = x1kVarB.f(h661Var, 6);
                    i |= 64;
                    break;
                case 7:
                    str = (String) x1kVarB.B(h661Var, 7, chc1.a, str);
                    i |= 128;
                    break;
                case 8:
                    strF3 = x1kVarB.f(h661Var, 8);
                    i |= 256;
                    break;
                case 9:
                    iO5 = x1kVarB.o(h661Var, 9);
                    i |= 512;
                    break;
                case 10:
                    list = (List) x1kVarB.B(h661Var, 10, (nma0) znb0VarArr[10].getValue(), list);
                    i |= 1024;
                    break;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new mvj1(i, jI0, iO, strF, iO2, iO3, iO4, strF2, str, strF3, iO5, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        mvj1 mvj1Var = (mvj1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = mvj1.l;
        long j = mvj1Var.a;
        List list = mvj1Var.k;
        z1kVarB.l(h661Var, 0, j);
        z1kVarB.e(1, mvj1Var.b, h661Var);
        z1kVarB.G(h661Var, 2, mvj1Var.c);
        z1kVarB.e(3, mvj1Var.d, h661Var);
        z1kVarB.e(4, mvj1Var.e, h661Var);
        z1kVarB.e(5, mvj1Var.f, h661Var);
        z1kVarB.G(h661Var, 6, mvj1Var.g);
        String str = mvj1Var.h;
        if (str != null) {
            z1kVarB.s(h661Var, 7, chc1.a, str);
        }
        z1kVarB.G(h661Var, 8, mvj1Var.i);
        z1kVarB.e(9, mvj1Var.j, h661Var);
        if (list != null) {
            z1kVarB.s(h661Var, 10, (nma0) znb0VarArr[10].getValue(), list);
        }
        z1kVarB.a(h661Var);
    }
}
