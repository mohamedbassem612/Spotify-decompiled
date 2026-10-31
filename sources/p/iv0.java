package p;

import com.android.installreferrer.api.InstallReferrerClient$InstallReferrerResponse;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class iv0 implements pf40 {
    public static final iv0 a;
    private static final h661 descriptor;

    static {
        iv0 iv0Var = new iv0();
        a = iv0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.adsdisplay.preview.model.AdPreview", iv0Var, 15);
        m0v0Var.j("id", false);
        m0v0Var.j("clickthrough", false);
        m0v0Var.j("tracking_events", true);
        m0v0Var.j("metadata", true);
        m0v0Var.j("cover_art", true);
        m0v0Var.j("audio", true);
        m0v0Var.j("video", true);
        m0v0Var.j("display", true);
        m0v0Var.j("is_dsa_eligible", true);
        m0v0Var.j("advertiser", true);
        m0v0Var.j("creativeId", true);
        m0v0Var.j("manifestId", true);
        m0v0Var.j("productName", true);
        m0v0Var.j("lineItemId", true);
        m0v0Var.j("ctaText", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = wv0.q;
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, znb0VarArr[2].getValue(), znb0VarArr[3].getValue(), znb0VarArr[4].getValue(), znb0VarArr[5].getValue(), znb0VarArr[6].getValue(), znb0VarArr[7].getValue(), gpb.a, chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, chc1Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = wv0.q;
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        List list = null;
        String strF = null;
        String strF2 = null;
        Map map = null;
        Map map2 = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        String strF8 = null;
        int i = 0;
        boolean zM = false;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case InstallReferrerClient$InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
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
                    map = (Map) x1kVarB.A(h661Var, 2, (nma0) znb0VarArr[2].getValue(), map);
                    i |= 4;
                    break;
                case 3:
                    map2 = (Map) x1kVarB.A(h661Var, 3, (nma0) znb0VarArr[3].getValue(), map2);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) x1kVarB.A(h661Var, 4, (nma0) znb0VarArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    list3 = (List) x1kVarB.A(h661Var, 5, (nma0) znb0VarArr[5].getValue(), list3);
                    i |= 32;
                    break;
                case 6:
                    list4 = (List) x1kVarB.A(h661Var, 6, (nma0) znb0VarArr[6].getValue(), list4);
                    i |= 64;
                    break;
                case 7:
                    list = (List) x1kVarB.A(h661Var, 7, (nma0) znb0VarArr[7].getValue(), list);
                    i |= 128;
                    break;
                case 8:
                    zM = x1kVarB.M(h661Var, 8);
                    i |= 256;
                    break;
                case 9:
                    strF3 = x1kVarB.f(h661Var, 9);
                    i |= 512;
                    break;
                case 10:
                    strF4 = x1kVarB.f(h661Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    strF5 = x1kVarB.f(h661Var, 11);
                    i |= 2048;
                    break;
                case 12:
                    strF6 = x1kVarB.f(h661Var, 12);
                    i |= 4096;
                    break;
                case 13:
                    strF7 = x1kVarB.f(h661Var, 13);
                    i |= 8192;
                    break;
                case 14:
                    strF8 = x1kVarB.f(h661Var, 14);
                    i |= 16384;
                    break;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new wv0(i, strF, strF2, map, map2, list2, list3, list4, list, zM, strF3, strF4, strF5, strF6, strF7, strF8);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:60:0x0119  */
    /* JADX WARN: Code duplicated, block: B:69:0x0136  */
    /* JADX WARN: Code duplicated, block: B:78:0x0153  */
    /* JADX WARN: Code duplicated, block: B:90:0x017f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0182  */
    /* JADX WARN: Code duplicated, block: B:94:0x018f  */
    public final void serialize(uax uaxVar, Object obj) {
        String str;
        String str2;
        String str3;
        wv0 wv0Var = (wv0) obj;
        String str4 = wv0Var.p;
        String str5 = wv0Var.o;
        String str6 = wv0Var.n;
        String str7 = wv0Var.m;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = wv0.q;
        String str8 = wv0Var.a;
        String str9 = wv0Var.l;
        String str10 = wv0Var.k;
        boolean z = wv0Var.i;
        List list = wv0Var.h;
        List list2 = wv0Var.g;
        List list3 = wv0Var.f;
        List list4 = wv0Var.e;
        Map map = wv0Var.c;
        Map map2 = wv0Var.d;
        z1kVarB.G(h661Var, 0, str8);
        z1kVarB.G(h661Var, 1, wv0Var.b);
        boolean zD0 = z1kVarB.d0();
        b7x b7xVar = b7x.a;
        if (zD0 || !u890.j(map, b7xVar)) {
            z1kVarB.k(h661Var, 2, (nma0) znb0VarArr[2].getValue(), map);
        }
        if (z1kVarB.d0() || !u890.j(map2, b7xVar)) {
            z1kVarB.k(h661Var, 3, (nma0) znb0VarArr[3].getValue(), map2);
        }
        boolean zD1 = z1kVarB.d0();
        z6x z6xVar = z6x.a;
        if (zD1 || !u890.j(list4, z6xVar)) {
            z1kVarB.k(h661Var, 4, (nma0) znb0VarArr[4].getValue(), list4);
        }
        if (z1kVarB.d0() || !u890.j(list3, z6xVar)) {
            z1kVarB.k(h661Var, 5, (nma0) znb0VarArr[5].getValue(), list3);
        }
        if (z1kVarB.d0() || !u890.j(list2, z6xVar)) {
            z1kVarB.k(h661Var, 6, (nma0) znb0VarArr[6].getValue(), list2);
        }
        if (z1kVarB.d0() || !u890.j(list, z6xVar)) {
            z1kVarB.k(h661Var, 7, (nma0) znb0VarArr[7].getValue(), list);
        }
        if (z1kVarB.d0() || z) {
            z1kVarB.E(h661Var, 8, z);
        }
        if (z1kVarB.d0()) {
            z1kVarB.G(h661Var, 9, str10);
        } else {
            String str11 = (String) map2.get("advertiser");
            if (str11 == null) {
                str11 = "";
            }
            if (!u890.j(str10, str11)) {
                z1kVarB.G(h661Var, 9, str10);
            }
        }
        if (z1kVarB.d0()) {
            z1kVarB.G(h661Var, 10, str9);
        } else {
            String str12 = (String) map2.get("creative_id");
            if (str12 == null) {
                str12 = "";
            }
            if (!u890.j(str9, str12)) {
                z1kVarB.G(h661Var, 10, str9);
            }
        }
        if (z1kVarB.d0()) {
            z1kVarB.G(h661Var, 11, str7);
        } else {
            String str13 = (String) map2.get("manifestId");
            if (str13 == null) {
                str13 = "";
            }
            if (!u890.j(str7, str13)) {
                z1kVarB.G(h661Var, 11, str7);
            }
        }
        if (z1kVarB.d0()) {
            z1kVarB.G(h661Var, 12, str6);
        } else {
            String str14 = (String) map2.get("product_name");
            if (str14 == null) {
                str14 = "";
            }
            if (!u890.j(str6, str14)) {
                z1kVarB.G(h661Var, 12, str6);
            }
        }
        if (!z1kVarB.d0()) {
            String str15 = (String) map2.get("lineitem_id");
            if (str15 == null) {
                str15 = "";
            }
            str = str5;
            if (!u890.j(str, str15)) {
            }
            if (z1kVarB.d0()) {
                String str16 = (String) map2.get("buttonMessage");
                str2 = str16 != null ? str16 : "";
                str3 = str4;
                if (!u890.j(str3, str2)) {
                }
                z1kVarB.a(h661Var);
            }
            str3 = str4;
            z1kVarB.G(h661Var, 14, str3);
            z1kVarB.a(h661Var);
        }
        str = str5;
        z1kVarB.G(h661Var, 13, str);
        if (z1kVarB.d0()) {
            String str17 = (String) map2.get("buttonMessage");
            if (str17 != null) {
            }
            str3 = str4;
            if (!u890.j(str3, str2)) {
            }
            z1kVarB.a(h661Var);
        }
        str3 = str4;
        z1kVarB.G(h661Var, 14, str3);
        z1kVarB.a(h661Var);
    }
}
