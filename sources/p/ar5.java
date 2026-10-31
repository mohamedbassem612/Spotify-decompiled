package p;

import com.comscore.streaming.State;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class ar5 implements pf40 {
    public static final ar5 a;
    private static final h661 descriptor;

    static {
        ar5 ar5Var = new ar5();
        a = ar5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.HelloDetailsAppProtocol.Info", ar5Var, 14);
        m0v0Var.j("protocol_version", true);
        m0v0Var.j("required_features", true);
        m0v0Var.j("id", true);
        m0v0Var.j("name", true);
        m0v0Var.j("model", true);
        m0v0Var.j("category", true);
        m0v0Var.j("version", true);
        m0v0Var.j("manufacturer", true);
        m0v0Var.j("image_type", true);
        m0v0Var.j("default_image_height", true);
        m0v0Var.j("default_image_width", true);
        m0v0Var.j("default_thumbnail_image_height", true);
        m0v0Var.j("default_thumbnail_image_width", true);
        m0v0Var.j("device_identifier", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = cr5.f6p;
        wr80 wr80Var = wr80.a;
        nma0 nma0VarZ = m5n1.z(wr80Var);
        nma0 nma0VarZ2 = m5n1.z((nma0) znb0VarArr[1].getValue());
        chc1 chc1Var = chc1.a;
        return new nma0[]{nma0VarZ, nma0VarZ2, m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(wr80Var), m5n1.z(wr80Var), m5n1.z(wr80Var), m5n1.z(wr80Var), m5n1.z(chc1Var)};
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final Object deserialize(dar darVar) {
        ?? r1;
        Integer num;
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = cr5.f6p;
        x1kVarB.getClass();
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        String str = null;
        Integer num5 = null;
        int i = 0;
        String str2 = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i2 = 1;
        boolean z = true;
        Integer num6 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case State.UNDEFINED /* -1 */:
                    num = num6;
                    z = false;
                    num2 = num2;
                    num6 = num;
                    str3 = str3;
                    num5 = num5;
                    str2 = str2;
                    i2 = 1;
                    break;
                case 0:
                    num = (Integer) x1kVarB.B(h661Var, 0, wr80.a, num6);
                    i |= 1;
                    list = list;
                    num2 = num2;
                    num6 = num;
                    str3 = str3;
                    num5 = num5;
                    str2 = str2;
                    i2 = 1;
                    break;
                case 1:
                    String str9 = str3;
                    int i3 = i2;
                    list = (List) x1kVarB.B(h661Var, i3, (nma0) znb0VarArr[i2].getValue(), list);
                    i |= 2;
                    i2 = i3;
                    num5 = num5;
                    str3 = str9;
                    str2 = str2;
                    break;
                case 2:
                    str3 = (String) x1kVarB.B(h661Var, 2, chc1.a, str3);
                    i |= 4;
                    list = list;
                    str2 = str2;
                    break;
                case 3:
                    str4 = (String) x1kVarB.B(h661Var, 3, chc1.a, str4);
                    i |= 8;
                    list = list;
                    str3 = str3;
                    break;
                case 4:
                    str5 = (String) x1kVarB.B(h661Var, 4, chc1.a, str5);
                    i |= 16;
                    list = list;
                    str3 = str3;
                    break;
                case 5:
                    str6 = (String) x1kVarB.B(h661Var, 5, chc1.a, str6);
                    i |= 32;
                    list = list;
                    str3 = str3;
                    break;
                case 6:
                    str7 = (String) x1kVarB.B(h661Var, 6, chc1.a, str7);
                    i |= 64;
                    list = list;
                    str3 = str3;
                    break;
                case 7:
                    str8 = (String) x1kVarB.B(h661Var, 7, chc1.a, str8);
                    i |= 128;
                    list = list;
                    str3 = str3;
                    break;
                case 8:
                    str = (String) x1kVarB.B(h661Var, 8, chc1.a, str);
                    i |= 256;
                    list = list;
                    str3 = str3;
                    break;
                case 9:
                    num4 = (Integer) x1kVarB.B(h661Var, 9, wr80.a, num4);
                    i |= 512;
                    list = list;
                    str3 = str3;
                    break;
                case 10:
                    num3 = (Integer) x1kVarB.B(h661Var, 10, wr80.a, num3);
                    i |= 1024;
                    list = list;
                    str3 = str3;
                    break;
                case 11:
                    num2 = (Integer) x1kVarB.B(h661Var, 11, wr80.a, num2);
                    i |= 2048;
                    list = list;
                    str3 = str3;
                    break;
                case 12:
                    num5 = (Integer) x1kVarB.B(h661Var, 12, wr80.a, num5);
                    i |= 4096;
                    list = list;
                    str3 = str3;
                    break;
                case 13:
                    str2 = (String) x1kVarB.B(h661Var, 13, chc1.a, str2);
                    i |= 8192;
                    list = list;
                    str3 = str3;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        Integer num7 = num5;
        String str10 = str2;
        String str11 = str3;
        Integer num8 = num6;
        Integer num9 = num2;
        List list2 = list;
        x1kVarB.a(h661Var);
        cr5 cr5Var = new cr5();
        if ((i & 1) == 0) {
            r1 = 0;
            cr5Var.b = null;
        } else {
            r1 = 0;
            cr5Var.b = num8;
        }
        if ((i & 2) == 0) {
            cr5Var.c = r1;
        } else {
            cr5Var.c = list2;
        }
        if ((i & 4) == 0) {
            cr5Var.d = r1;
        } else {
            cr5Var.d = str11;
        }
        if ((i & 8) == 0) {
            cr5Var.e = r1;
        } else {
            cr5Var.e = str4;
        }
        if ((i & 16) == 0) {
            cr5Var.f = r1;
        } else {
            cr5Var.f = str5;
        }
        if ((i & 32) == 0) {
            cr5Var.g = r1;
        } else {
            cr5Var.g = str6;
        }
        if ((i & 64) == 0) {
            cr5Var.h = r1;
        } else {
            cr5Var.h = str7;
        }
        if ((i & 128) == 0) {
            cr5Var.i = r1;
        } else {
            cr5Var.i = str8;
        }
        if ((i & 256) == 0) {
            cr5Var.j = r1;
        } else {
            cr5Var.j = str;
        }
        if ((i & 512) == 0) {
            cr5Var.k = r1;
        } else {
            cr5Var.k = num4;
        }
        if ((i & 1024) == 0) {
            cr5Var.l = r1;
        } else {
            cr5Var.l = num3;
        }
        if ((i & 2048) == 0) {
            cr5Var.m = r1;
        } else {
            cr5Var.m = num9;
        }
        if ((i & 4096) == 0) {
            cr5Var.n = r1;
        } else {
            cr5Var.n = num7;
        }
        if ((i & 8192) == 0) {
            cr5Var.o = r1;
            return cr5Var;
        }
        cr5Var.o = str10;
        return cr5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        cr5 cr5Var = (cr5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = cr5.f6p;
        Integer num = cr5Var.b;
        List list = cr5Var.c;
        if (num != null) {
            z1kVarB.s(h661Var, 0, wr80.a, num);
        }
        if (list != null) {
            z1kVarB.s(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
        }
        String str = cr5Var.d;
        if (str != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str);
        }
        String str2 = cr5Var.e;
        if (str2 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str2);
        }
        String str3 = cr5Var.f;
        if (str3 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str3);
        }
        String str4 = cr5Var.g;
        if (str4 != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str4);
        }
        String str5 = cr5Var.h;
        if (str5 != null) {
            z1kVarB.s(h661Var, 6, chc1.a, str5);
        }
        String str6 = cr5Var.i;
        if (str6 != null) {
            z1kVarB.s(h661Var, 7, chc1.a, str6);
        }
        String str7 = cr5Var.j;
        if (str7 != null) {
            z1kVarB.s(h661Var, 8, chc1.a, str7);
        }
        Integer num2 = cr5Var.k;
        if (num2 != null) {
            z1kVarB.s(h661Var, 9, wr80.a, num2);
        }
        Integer num3 = cr5Var.l;
        if (num3 != null) {
            z1kVarB.s(h661Var, 10, wr80.a, num3);
        }
        Integer num4 = cr5Var.m;
        if (num4 != null) {
            z1kVarB.s(h661Var, 11, wr80.a, num4);
        }
        Integer num5 = cr5Var.n;
        if (num5 != null) {
            z1kVarB.s(h661Var, 12, wr80.a, num5);
        }
        String str8 = cr5Var.o;
        if (str8 != null) {
            z1kVarB.s(h661Var, 13, chc1.a, str8);
        }
        z1kVarB.a(h661Var);
    }
}
