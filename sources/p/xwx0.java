package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xwx0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Double f;
    public final Double g;
    public final Double h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final List m;
    public final Integer n;
    public final Integer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f52p;
    public final String q;
    public final String r;
    public final String s;
    public final Map t;

    public xwx0(String str, String str2, String str3, String str4, String str5, Double d, Double d2, Double d3, String str6, String str7, String str8, String str9, List list, Integer num, Integer num2, String str10, String str11, String str12, String str13, Map map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = d;
        this.g = d2;
        this.h = d3;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = list;
        this.n = num;
        this.o = num2;
        this.f52p = str10;
        this.q = str11;
        this.r = str12;
        this.s = str13;
        this.t = map;
    }

    public static xwx0 a(xwx0 xwx0Var, String str, String str2, int i) {
        return new xwx0(xwx0Var.a, xwx0Var.b, xwx0Var.c, xwx0Var.d, str, xwx0Var.f, xwx0Var.g, xwx0Var.h, xwx0Var.i, (i & 512) != 0 ? xwx0Var.j : str2, xwx0Var.k, xwx0Var.l, xwx0Var.m, xwx0Var.n, xwx0Var.o, xwx0Var.f52p, xwx0Var.q, xwx0Var.r, xwx0Var.s, xwx0Var.t);
    }

    public final LinkedHashMap b(mju mjuVar) {
        jju jjuVarC;
        String str = this.e;
        if (str == null || (jjuVarC = mju.c(str)) == null || !u890.j(jjuVarC.b, "select")) {
            return null;
        }
        List list = jjuVarC.c;
        ArrayList<mmr0> arrayList = new ArrayList();
        for (Object obj : list) {
            if (!u890.j(((mmr0) obj).a, "other")) {
                arrayList.add(obj);
            }
        }
        int iS = zno1.s(q7h.U(arrayList, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (mmr0 mmr0Var : arrayList) {
            String str2 = (String) mmr0Var.a;
            linkedHashMap.put(str2, mju.d((String) mmr0Var.b, Collections.singletonMap(jjuVarC.a, str2)));
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }

    public final int c() {
        String str = this.q;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            switch (lowerCase.hashCode()) {
                case -2000413939:
                    return !lowerCase.equals("numeric") ? 5 : 1;
                case -1627804910:
                    return !lowerCase.equals("segmented") ? 5 : 3;
                case -1298275357:
                    return !lowerCase.equals("entity") ? 5 : 2;
                case -899647263:
                    return !lowerCase.equals("slider") ? 5 : 1;
                case 541048721:
                    return !lowerCase.equals("cadence") ? 5 : 4;
                default:
                    return 5;
            }
        }
        if (this.f != null || this.g != null || this.h != null) {
            return 1;
        }
        String str2 = this.d;
        if (str2.equals("spotify_uri") || this.l != null) {
            return 2;
        }
        if (this.a.equals("cadence") || str2.equals("refresh_cadence")) {
            return 4;
        }
        String str3 = this.e;
        return (str3 == null || !ihc1.h0(str3, "select", false)) ? 5 : 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwx0)) {
            return false;
        }
        xwx0 xwx0Var = (xwx0) obj;
        return this.a.equals(xwx0Var.a) && this.b.equals(xwx0Var.b) && this.c.equals(xwx0Var.c) && this.d.equals(xwx0Var.d) && u890.j(this.e, xwx0Var.e) && u890.j(this.f, xwx0Var.f) && u890.j(this.g, xwx0Var.g) && u890.j(this.h, xwx0Var.h) && u890.j(this.i, xwx0Var.i) && u890.j(this.j, xwx0Var.j) && u890.j(this.k, xwx0Var.k) && u890.j(this.l, xwx0Var.l) && this.m.equals(xwx0Var.m) && u890.j(this.n, xwx0Var.n) && u890.j(this.o, xwx0Var.o) && u890.j(this.f52p, xwx0Var.f52p) && u890.j(this.q, xwx0Var.q) && this.r.equals(xwx0Var.r) && this.s.equals(xwx0Var.s) && this.t.equals(xwx0Var.t);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.g;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.h;
        int iHashCode4 = (iHashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        int iB = f4i1.b((iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.m);
        Integer num = this.n;
        int iHashCode8 = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.o;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.f52p;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.q;
        return this.t.hashCode() + cy30.d(cy30.d((iHashCode10 + (str7 != null ? str7.hashCode() : 0)) * 31, 31, this.r), 31, this.s);
    }
}
