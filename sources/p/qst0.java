package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class qst0 implements pf40 {
    public static final qst0 a;
    private static final h661 descriptor;

    static {
        qst0 qst0Var = new qst0();
        a = qst0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.wear.datalayermessages.PlayUriMessageRequest", qst0Var, 11);
        m0v0Var.j("contextUri", false);
        m0v0Var.j("skipToUri", true);
        m0v0Var.j("skipToUid", true);
        m0v0Var.j("shuffle", true);
        m0v0Var.j("referrer", true);
        m0v0Var.j("interactionId", true);
        m0v0Var.j("seekToMs", true);
        m0v0Var.j("contextMetadata", true);
        m0v0Var.j("listConfiguration", true);
        m0v0Var.j("pageInstanceId", true);
        m0v0Var.j("smartShuffle", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = sst0.l;
        nma0 nma0Var = chc1.a;
        nma0 nma0VarZ = m5n1.z(nma0Var);
        nma0 nma0VarZ2 = m5n1.z(nma0Var);
        gpb gpbVar = gpb.a;
        return new nma0[]{nma0Var, nma0VarZ, nma0VarZ2, m5n1.z(gpbVar), m5n1.z(nma0Var), m5n1.z(nma0Var), m5n1.z(o5f0.a), m5n1.z((nma0) znb0VarArr[7].getValue()), m5n1.z(enc0.a), m5n1.z(nma0Var), m5n1.z(gpbVar)};
    }

    public final Object deserialize(dar darVar) {
        znb0[] znb0VarArr;
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr2 = sst0.l;
        x1kVarB.getClass();
        Boolean bool = null;
        String str = null;
        hnc0 hnc0Var = null;
        boolean z = true;
        Map map = null;
        int i = 0;
        String strF = null;
        String str2 = null;
        String str3 = null;
        Boolean bool2 = null;
        String str4 = null;
        String str5 = null;
        Long l = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    znb0VarArr2 = znb0VarArr2;
                    continue;
                case 0:
                    znb0VarArr = znb0VarArr2;
                    strF = x1kVarB.f(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    znb0VarArr = znb0VarArr2;
                    str2 = (String) x1kVarB.B(h661Var, 1, chc1.a, str2);
                    i |= 2;
                    break;
                case 2:
                    znb0VarArr = znb0VarArr2;
                    str3 = (String) x1kVarB.B(h661Var, 2, chc1.a, str3);
                    i |= 4;
                    break;
                case 3:
                    znb0VarArr = znb0VarArr2;
                    bool2 = (Boolean) x1kVarB.B(h661Var, 3, gpb.a, bool2);
                    i |= 8;
                    break;
                case 4:
                    znb0VarArr = znb0VarArr2;
                    str4 = (String) x1kVarB.B(h661Var, 4, chc1.a, str4);
                    i |= 16;
                    break;
                case 5:
                    znb0VarArr = znb0VarArr2;
                    str5 = (String) x1kVarB.B(h661Var, 5, chc1.a, str5);
                    i |= 32;
                    break;
                case 6:
                    znb0VarArr = znb0VarArr2;
                    l = (Long) x1kVarB.B(h661Var, 6, o5f0.a, l);
                    i |= 64;
                    break;
                case 7:
                    znb0VarArr = znb0VarArr2;
                    map = (Map) x1kVarB.B(h661Var, 7, (nma0) znb0VarArr[7].getValue(), map);
                    i |= 128;
                    break;
                case 8:
                    znb0VarArr = znb0VarArr2;
                    hnc0Var = (hnc0) x1kVarB.B(h661Var, 8, enc0.a, hnc0Var);
                    i |= 256;
                    break;
                case 9:
                    znb0VarArr = znb0VarArr2;
                    str = (String) x1kVarB.B(h661Var, 9, chc1.a, str);
                    i |= 512;
                    break;
                case 10:
                    znb0VarArr = znb0VarArr2;
                    bool = (Boolean) x1kVarB.B(h661Var, 10, gpb.a, bool);
                    i |= 1024;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
            znb0VarArr2 = znb0VarArr;
            z = z;
        }
        x1kVarB.a(h661Var);
        return new sst0(i, strF, str2, str3, bool2, str4, str5, l, map, hnc0Var, str, bool);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        sst0 sst0Var = (sst0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = sst0.l;
        String str = sst0Var.a;
        Map map = sst0Var.h;
        z1kVarB.G(h661Var, 0, str);
        String str2 = sst0Var.b;
        if (str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        String str3 = sst0Var.c;
        if (str3 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str3);
        }
        Boolean bool = sst0Var.d;
        if (bool != null) {
            z1kVarB.s(h661Var, 3, gpb.a, bool);
        }
        String str4 = sst0Var.e;
        if (str4 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str4);
        }
        String str5 = sst0Var.f;
        if (str5 != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str5);
        }
        Long l = sst0Var.g;
        if (l != null) {
            z1kVarB.s(h661Var, 6, o5f0.a, l);
        }
        if (map != null) {
            z1kVarB.s(h661Var, 7, (nma0) znb0VarArr[7].getValue(), map);
        }
        hnc0 hnc0Var = sst0Var.i;
        if (hnc0Var != null) {
            z1kVarB.s(h661Var, 8, enc0.a, hnc0Var);
        }
        String str6 = sst0Var.j;
        if (str6 != null) {
            z1kVarB.s(h661Var, 9, chc1.a, str6);
        }
        Boolean bool2 = sst0Var.k;
        if (bool2 != null) {
            z1kVarB.s(h661Var, 10, gpb.a, bool2);
        }
        z1kVarB.a(h661Var);
    }
}
