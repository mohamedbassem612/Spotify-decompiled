package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class w7u implements pf40 {
    public static final w7u a;
    private static final h661 descriptor;

    static {
        w7u w7uVar = new w7u();
        a = w7uVar;
        m0v0 m0v0Var = new m0v0("com.spotify.connect.castbasic.core.model.DiscoveredDevice", w7uVar, 20);
        m0v0Var.j("deviceID", false);
        m0v0Var.j("remoteName", false);
        m0v0Var.j("brandDisplayName", false);
        m0v0Var.j("modelDisplayName", false);
        m0v0Var.j("deviceAPI_ipAddress", false);
        m0v0Var.j("version", true);
        m0v0Var.j("deviceAPI_isGroup", true);
        m0v0Var.j("deviceType", true);
        m0v0Var.j("accountReq", true);
        m0v0Var.j("status", true);
        m0v0Var.j("publicKey", true);
        m0v0Var.j("libraryVersion", true);
        m0v0Var.j("spotifyError", true);
        m0v0Var.j("tokenType", true);
        m0v0Var.j("scope", true);
        m0v0Var.j("clientID", true);
        m0v0Var.j("deviceAPI_deviceClass", true);
        m0v0Var.j("activeUser", true);
        m0v0Var.j("statusString", true);
        m0v0Var.j("supportsStreamExpansion", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        nma0 nma0Var2 = wr80.a;
        return new nma0[]{nma0Var, nma0Var, nma0Var, nma0Var, nma0Var, nma0Var, nma0Var2, nma0Var, nma0Var, nma0Var2, nma0Var, nma0Var, m5n1.z(nma0Var2), nma0Var, m5n1.z(nma0Var), m5n1.z(nma0Var), nma0Var, nma0Var, nma0Var, gpb.a};
    }

    public final Object deserialize(dar darVar) {
        int i;
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        String str = null;
        String str2 = null;
        boolean z = true;
        Integer num = null;
        int i2 = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        int iO = 0;
        String strF7 = null;
        String strF8 = null;
        int iO2 = 0;
        String strF9 = null;
        String strF10 = null;
        String strF11 = null;
        String strF12 = null;
        String strF13 = null;
        String strF14 = null;
        boolean zM = false;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strF = x1kVarB.f(h661Var, 0);
                    i2 |= 1;
                    z = z;
                    break;
                case 1:
                    strF2 = x1kVarB.f(h661Var, 1);
                    i2 |= 2;
                    break;
                case 2:
                    strF3 = x1kVarB.f(h661Var, 2);
                    i2 |= 4;
                    break;
                case 3:
                    strF4 = x1kVarB.f(h661Var, 3);
                    i2 |= 8;
                    break;
                case 4:
                    strF5 = x1kVarB.f(h661Var, 4);
                    i2 |= 16;
                    break;
                case 5:
                    strF6 = x1kVarB.f(h661Var, 5);
                    i2 |= 32;
                    break;
                case 6:
                    iO = x1kVarB.o(h661Var, 6);
                    i2 |= 64;
                    break;
                case 7:
                    strF7 = x1kVarB.f(h661Var, 7);
                    i2 |= 128;
                    break;
                case 8:
                    strF8 = x1kVarB.f(h661Var, 8);
                    i2 |= 256;
                    break;
                case 9:
                    iO2 = x1kVarB.o(h661Var, 9);
                    i2 |= 512;
                    break;
                case 10:
                    strF9 = x1kVarB.f(h661Var, 10);
                    i2 |= 1024;
                    break;
                case 11:
                    strF10 = x1kVarB.f(h661Var, 11);
                    i2 |= 2048;
                    break;
                case 12:
                    num = (Integer) x1kVarB.B(h661Var, 12, wr80.a, num);
                    i2 |= 4096;
                    z = z;
                    break;
                case 13:
                    strF11 = x1kVarB.f(h661Var, 13);
                    i2 |= 8192;
                    break;
                case 14:
                    str2 = (String) x1kVarB.B(h661Var, 14, chc1.a, str2);
                    i2 |= 16384;
                    z = z;
                    break;
                case 15:
                    str = (String) x1kVarB.B(h661Var, 15, chc1.a, str);
                    i2 |= 32768;
                    z = z;
                    break;
                case 16:
                    strF12 = x1kVarB.f(h661Var, 16);
                    i = 65536;
                    i2 |= i;
                    break;
                case 17:
                    strF13 = x1kVarB.f(h661Var, 17);
                    i = 131072;
                    i2 |= i;
                    break;
                case 18:
                    strF14 = x1kVarB.f(h661Var, 18);
                    i = 262144;
                    i2 |= i;
                    break;
                case 19:
                    zM = x1kVarB.M(h661Var, 19);
                    i = 524288;
                    i2 |= i;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new y7u(i2, strF, strF2, strF3, strF4, strF5, strF6, iO, strF7, strF8, iO2, strF9, strF10, num, strF11, str2, str, strF12, strF13, strF14, zM);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        y7u y7uVar = (y7u) obj;
        boolean z = y7uVar.t;
        String str = y7uVar.s;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str2 = y7uVar.a;
        String str3 = y7uVar.r;
        String str4 = y7uVar.q;
        String str5 = y7uVar.n;
        String str6 = y7uVar.l;
        String str7 = y7uVar.k;
        int i = y7uVar.j;
        String str8 = y7uVar.i;
        String str9 = y7uVar.h;
        int i2 = y7uVar.g;
        String str10 = y7uVar.f;
        z1kVarB.G(h661Var, 0, str2);
        z1kVarB.G(h661Var, 1, y7uVar.b);
        z1kVarB.G(h661Var, 2, y7uVar.c);
        z1kVarB.G(h661Var, 3, y7uVar.d);
        z1kVarB.G(h661Var, 4, y7uVar.e);
        if (z1kVarB.d0() || !u890.j(str10, "2.2.0")) {
            z1kVarB.G(h661Var, 5, str10);
        }
        if (z1kVarB.d0() || i2 != 0) {
            z1kVarB.e(6, i2, h661Var);
        }
        if (z1kVarB.d0() || !u890.j(str9, "CASTVIDEO")) {
            z1kVarB.G(h661Var, 7, str9);
        }
        if (z1kVarB.d0() || !u890.j(str8, "FREE")) {
            z1kVarB.G(h661Var, 8, str8);
        }
        if (z1kVarB.d0() || i != 101) {
            z1kVarB.e(9, i, h661Var);
        }
        if (z1kVarB.d0() || !u890.j(str7, "SU5WQUxJRA==")) {
            z1kVarB.G(h661Var, 10, str7);
        }
        if (z1kVarB.d0() || !u890.j(str6, "")) {
            z1kVarB.G(h661Var, 11, str6);
        }
        Integer num = y7uVar.m;
        if (num != null) {
            z1kVarB.s(h661Var, 12, wr80.a, num);
        }
        if (z1kVarB.d0() || !u890.j(str5, "")) {
            z1kVarB.G(h661Var, 13, str5);
        }
        String str11 = y7uVar.o;
        if (str11 != null) {
            z1kVarB.s(h661Var, 14, chc1.a, str11);
        }
        String str12 = y7uVar.p;
        if (str12 != null) {
            z1kVarB.s(h661Var, 15, chc1.a, str12);
        }
        if (z1kVarB.d0() || !u890.j(str4, "cast-js")) {
            z1kVarB.G(h661Var, 16, str4);
        }
        if (z1kVarB.d0() || !u890.j(str3, "")) {
            z1kVarB.G(h661Var, 17, str3);
        }
        if (z1kVarB.d0() || !u890.j(str, "")) {
            z1kVarB.G(h661Var, 18, str);
        }
        if (z1kVarB.d0() || z) {
            z1kVarB.E(h661Var, 19, z);
        }
        z1kVarB.a(h661Var);
    }
}
