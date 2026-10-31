package p;

import com.spotify.adsinternal.adscore.model.Format;
import com.spotify.casita.v1.resolved.EmbeddedAdMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d4c implements c4c {
    public final fn60 a;

    public d4c(fn60 fn60Var) {
        this.a = fn60Var;
    }

    public static niu a(wv0 wv0Var, yz21 yz21Var) {
        String str = wv0Var.j;
        String str2 = wv0Var.a;
        String str3 = wv0Var.o;
        String str4 = wv0Var.n;
        String strM = l1d.m("spotify:ad:", str2);
        String str5 = wv0Var.k;
        String str6 = wv0Var.b;
        xkg0 xkg0Var = new xkg0();
        String str7 = wv0Var.p;
        if (str7.length() <= 0) {
            str7 = null;
        }
        if (str7 != null) {
        }
        xkg0Var.put("product_name", str4);
        xkg0 xkg0VarB = xkg0Var.b();
        List list = wv0Var.h;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strA = ((sv0) it.next()).a();
            if (strA == null) {
                strA = "";
            }
            arrayList.add(new gq70(0, 0, p57.a(strA)));
        }
        fgh0 fgh0Var = new fgh0(6, arrayList, (List) null);
        String str8 = wv0Var.l;
        Format format = Format.BANNER;
        Map map = wv0Var.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), (List) entry.getValue());
        }
        ji0 ji0Var = new ji0(str2, strM, str5, "", str6, 1, xkg0VarB, fgh0Var, str3, str8, "", false, false, format, false, z6x.a, str, linkedHashMap, 262144);
        String hexString = Integer.toHexString(wv0Var.hashCode());
        j1x j1xVarV = EmbeddedAdMetadata.v();
        j1xVarV.q(str2);
        j1xVarV.n(wv0Var.l);
        j1xVarV.r(str3);
        j1xVarV.s(str4);
        j1xVarV.t(str);
        return new niu(hexString, str2, yz21Var, new viu(str2, ji0Var, j1xVarV.build()));
    }

    public static zbj1 b(wv0 wv0Var, yz21 yz21Var) {
        String str = wv0Var.j;
        String str2 = wv0Var.a;
        String str3 = wv0Var.o;
        String str4 = wv0Var.n;
        String strM = l1d.m("spotify:ad:", str2);
        String str5 = wv0Var.k;
        String str6 = wv0Var.b;
        xkg0 xkg0Var = new xkg0();
        String str7 = wv0Var.p;
        if (str7.length() <= 0) {
            str7 = null;
        }
        if (str7 != null) {
        }
        xkg0Var.put("product_name", str4);
        xkg0 xkg0VarB = xkg0Var.b();
        List<vv0> list = wv0Var.g;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (vv0 vv0Var : list) {
            Integer numC = vv0Var.c();
            int iIntValue = numC != null ? numC.intValue() : 0;
            Integer numB = vv0Var.b();
            int iIntValue2 = numB != null ? numB.intValue() : 0;
            Long lA = vv0Var.a();
            arrayList.add(new a7j1("video/mp4", iIntValue, iIntValue2, 0, o57.a(wv0Var.m), Long.valueOf(lA != null ? lA.longValue() : 0L)));
        }
        fgh0 fgh0Var = new fgh0(5, (List) null, arrayList);
        String str8 = wv0Var.l;
        Format format = Format.VIDEO;
        Map map = wv0Var.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), (List) entry.getValue());
        }
        ji0 ji0Var = new ji0(str2, strM, str5, "", str6, 1, xkg0VarB, fgh0Var, str3, str8, "", false, false, format, false, z6x.a, str, linkedHashMap, 262144);
        String hexString = Integer.toHexString(wv0Var.hashCode());
        j1x j1xVarV = EmbeddedAdMetadata.v();
        j1xVarV.q(str2);
        j1xVarV.n(wv0Var.l);
        j1xVarV.r(str3);
        j1xVarV.s(str4);
        j1xVarV.t(str);
        return new zbj1(hexString, str2, yz21Var, new ucj1(str2, ji0Var, j1xVarV.build()));
    }
}
