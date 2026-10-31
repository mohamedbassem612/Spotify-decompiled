package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class vvw0 implements pf40 {
    public static final vvw0 a;
    private static final h661 descriptor;

    static {
        vvw0 vvw0Var = new vvw0();
        a = vvw0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.betamax.playerimpl.exo.model.Profile", vvw0Var, 13);
        m0v0Var.j("id", false);
        m0v0Var.j("video_bitrate", true);
        m0v0Var.j("video_codec", true);
        m0v0Var.j("video_resolution", true);
        m0v0Var.j("video_width", true);
        m0v0Var.j("video_height", true);
        m0v0Var.j("audio_bitrate", true);
        m0v0Var.j("audio_codec", true);
        m0v0Var.j("mime_type", false);
        m0v0Var.j("file_type", false);
        m0v0Var.j("max_bitrate", false);
        m0v0Var.j("encryption_index", true);
        m0v0Var.j("encryption_indices", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = aww0.o;
        nma0 nma0Var = wr80.a;
        nma0 nma0VarZ = m5n1.z(nma0Var);
        nma0 nma0Var2 = chc1.a;
        return new nma0[]{o5f0.a, nma0VarZ, m5n1.z(nma0Var2), m5n1.z(nma0Var), m5n1.z(nma0Var), m5n1.z(nma0Var), m5n1.z(nma0Var), m5n1.z(nma0Var2), nma0Var2, nma0Var2, nma0Var, m5n1.z(nma0Var), m5n1.z((nma0) znb0VarArr[12].getValue())};
    }

    public final Object deserialize(dar darVar) {
        znb0[] znb0VarArr;
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr2 = aww0.o;
        x1kVarB.getClass();
        long jI0 = 0;
        List list = null;
        Integer num = null;
        boolean z = true;
        Integer num2 = null;
        String str = null;
        Integer num3 = null;
        int i = 0;
        Integer num4 = null;
        String str2 = null;
        Integer num5 = null;
        Integer num6 = null;
        String strF = null;
        String strF2 = null;
        int iO = 0;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 0:
                    znb0VarArr = znb0VarArr2;
                    jI0 = x1kVarB.i0(h661Var, 0);
                    i |= 1;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 1:
                    znb0VarArr = znb0VarArr2;
                    num4 = (Integer) x1kVarB.B(h661Var, 1, wr80.a, num4);
                    i |= 2;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 2:
                    znb0VarArr = znb0VarArr2;
                    str2 = (String) x1kVarB.B(h661Var, 2, chc1.a, str2);
                    i |= 4;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 3:
                    znb0VarArr = znb0VarArr2;
                    num5 = (Integer) x1kVarB.B(h661Var, 3, wr80.a, num5);
                    i |= 8;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 4:
                    znb0VarArr = znb0VarArr2;
                    num6 = (Integer) x1kVarB.B(h661Var, 4, wr80.a, num6);
                    i |= 16;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 5:
                    znb0VarArr = znb0VarArr2;
                    num2 = (Integer) x1kVarB.B(h661Var, 5, wr80.a, num2);
                    i |= 32;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 6:
                    znb0VarArr = znb0VarArr2;
                    num3 = (Integer) x1kVarB.B(h661Var, 6, wr80.a, num3);
                    i |= 64;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 7:
                    znb0VarArr = znb0VarArr2;
                    str = (String) x1kVarB.B(h661Var, 7, chc1.a, str);
                    i |= 128;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 8:
                    strF = x1kVarB.f(h661Var, 8);
                    i |= 256;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 9:
                    strF2 = x1kVarB.f(h661Var, 9);
                    i |= 512;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 10:
                    iO = x1kVarB.o(h661Var, 10);
                    i |= 1024;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 11:
                    znb0VarArr = znb0VarArr2;
                    num = (Integer) x1kVarB.B(h661Var, 11, wr80.a, num);
                    i |= 2048;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 12:
                    znb0VarArr = znb0VarArr2;
                    list = (List) x1kVarB.B(h661Var, 12, (nma0) znb0VarArr[12].getValue(), list);
                    i |= 4096;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new aww0(i, jI0, num4, str2, num5, num6, num2, num3, str, strF, strF2, iO, num, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        aww0 aww0Var = (aww0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = aww0.o;
        long j = aww0Var.a;
        List list = aww0Var.m;
        z1kVarB.l(h661Var, 0, j);
        Integer num = aww0Var.b;
        if (num != null) {
            z1kVarB.s(h661Var, 1, wr80.a, num);
        }
        String str = aww0Var.c;
        if (str != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str);
        }
        Integer num2 = aww0Var.d;
        if (num2 != null) {
            z1kVarB.s(h661Var, 3, wr80.a, num2);
        }
        Integer num3 = aww0Var.e;
        if (num3 != null) {
            z1kVarB.s(h661Var, 4, wr80.a, num3);
        }
        Integer num4 = aww0Var.f;
        if (num4 != null) {
            z1kVarB.s(h661Var, 5, wr80.a, num4);
        }
        Integer num5 = aww0Var.g;
        if (num5 != null) {
            z1kVarB.s(h661Var, 6, wr80.a, num5);
        }
        String str2 = aww0Var.h;
        if (str2 != null) {
            z1kVarB.s(h661Var, 7, chc1.a, str2);
        }
        z1kVarB.G(h661Var, 8, aww0Var.i);
        z1kVarB.G(h661Var, 9, aww0Var.j);
        z1kVarB.e(10, aww0Var.k, h661Var);
        Integer num6 = aww0Var.l;
        if (num6 != null) {
            z1kVarB.s(h661Var, 11, wr80.a, num6);
        }
        if (list != null) {
            z1kVarB.s(h661Var, 12, (nma0) znb0VarArr[12].getValue(), list);
        }
        z1kVarB.a(h661Var);
    }
}
