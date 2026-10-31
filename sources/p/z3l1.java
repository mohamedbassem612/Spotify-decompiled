package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class z3l1 implements pf40 {
    public static final z3l1 a;
    private static final h661 descriptor;

    static {
        z3l1 z3l1Var = new z3l1();
        a = z3l1Var;
        m0v0 m0v0Var = new m0v0("didRequestShare", z3l1Var, 10);
        m0v0Var.j("requestId", false);
        m0v0Var.j("url", false);
        m0v0Var.j("imageUrl", true);
        m0v0Var.j("imageData", true);
        m0v0Var.j("message", true);
        m0v0Var.j("destinations", true);
        m0v0Var.j("linkPreviewUrl", true);
        m0v0Var.j("linkPreviewData", true);
        m0v0Var.j("allowAudioAttachment", true);
        m0v0Var.j("audioPreviewEntityUri", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = b4l1.l;
        nma0 nma0Var = chc1.a;
        return new nma0[]{wr80.a, nma0Var, m5n1.z(nma0Var), m5n1.z(nma0Var), m5n1.z(nma0Var), m5n1.z((nma0) znb0VarArr[5].getValue()), m5n1.z(nma0Var), m5n1.z(nma0Var), m5n1.z(gpb.a), m5n1.z(nma0Var)};
    }

    public final Object deserialize(dar darVar) {
        znb0[] znb0VarArr;
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr2 = b4l1.l;
        x1kVarB.getClass();
        String str = null;
        Boolean bool = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        int iO = 0;
        String strF = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list = null;
        String str6 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    znb0VarArr = znb0VarArr2;
                    z = false;
                    break;
                case 0:
                    znb0VarArr = znb0VarArr2;
                    iO = x1kVarB.o(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    znb0VarArr = znb0VarArr2;
                    strF = x1kVarB.f(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    znb0VarArr = znb0VarArr2;
                    str3 = (String) x1kVarB.B(h661Var, 2, chc1.a, str3);
                    i |= 4;
                    break;
                case 3:
                    znb0VarArr = znb0VarArr2;
                    str4 = (String) x1kVarB.B(h661Var, 3, chc1.a, str4);
                    i |= 8;
                    break;
                case 4:
                    znb0VarArr = znb0VarArr2;
                    str5 = (String) x1kVarB.B(h661Var, 4, chc1.a, str5);
                    i |= 16;
                    break;
                case 5:
                    znb0VarArr = znb0VarArr2;
                    list = (List) x1kVarB.B(h661Var, 5, (nma0) znb0VarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    znb0VarArr = znb0VarArr2;
                    str6 = (String) x1kVarB.B(h661Var, 6, chc1.a, str6);
                    i |= 64;
                    break;
                case 7:
                    znb0VarArr = znb0VarArr2;
                    str2 = (String) x1kVarB.B(h661Var, 7, chc1.a, str2);
                    i |= 128;
                    break;
                case 8:
                    znb0VarArr = znb0VarArr2;
                    bool = (Boolean) x1kVarB.B(h661Var, 8, gpb.a, bool);
                    i |= 256;
                    break;
                case 9:
                    znb0VarArr = znb0VarArr2;
                    str = (String) x1kVarB.B(h661Var, 9, chc1.a, str);
                    i |= 512;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
            znb0VarArr2 = znb0VarArr;
        }
        x1kVarB.a(h661Var);
        return new b4l1(i, iO, strF, str3, str4, str5, list, str6, str2, bool, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        b4l1 b4l1Var = (b4l1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = b4l1.l;
        int i = b4l1Var.b;
        List list = b4l1Var.g;
        z1kVarB.e(0, i, h661Var);
        z1kVarB.G(h661Var, 1, b4l1Var.c);
        String str = b4l1Var.d;
        if (str != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str);
        }
        String str2 = b4l1Var.e;
        if (str2 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str2);
        }
        String str3 = b4l1Var.f;
        if (str3 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str3);
        }
        if (list != null) {
            z1kVarB.s(h661Var, 5, (nma0) znb0VarArr[5].getValue(), list);
        }
        String str4 = b4l1Var.h;
        if (str4 != null) {
            z1kVarB.s(h661Var, 6, chc1.a, str4);
        }
        String str5 = b4l1Var.i;
        if (str5 != null) {
            z1kVarB.s(h661Var, 7, chc1.a, str5);
        }
        Boolean bool = b4l1Var.j;
        if (bool != null) {
            z1kVarB.s(h661Var, 8, gpb.a, bool);
        }
        String str6 = b4l1Var.k;
        if (str6 != null) {
            z1kVarB.s(h661Var, 9, chc1.a, str6);
        }
        z1kVarB.a(h661Var);
    }
}
