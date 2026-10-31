package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iwn implements jwn {
    public final String a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final dwn h;
    public final Map i;
    public final boolean j;
    public final Map k;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ iwn(String str, long j, long j2, String str2, String str3, String str4, List list, dwn dwnVar, Map map, boolean z, Map map2, int i) {
        String str5 = (i & 8) != 0 ? null : str2;
        String str6 = (i & 16) != 0 ? "" : str3;
        String str7 = (i & 32) != 0 ? "" : str4;
        List list2 = (i & 64) != 0 ? z6x.a : list;
        dwn dwnVar2 = (i & 128) != 0 ? cwn.a : dwnVar;
        int i2 = i & 256;
        Map map3 = b7x.a;
        this(str, j, j2, str5, str6, str7, list2, dwnVar2, i2 != 0 ? map3 : map, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? map3 : map2);
    }

    public static iwn h(iwn iwnVar, String str, List list, dwn dwnVar, Map map, boolean z, Map map2, int i) {
        return new iwn(iwnVar.a, iwnVar.b, iwnVar.c, iwnVar.d, iwnVar.e, (i & 32) != 0 ? iwnVar.f : str, (i & 64) != 0 ? iwnVar.g : list, (i & 128) != 0 ? iwnVar.h : dwnVar, (i & 256) != 0 ? iwnVar.i : map, (i & 512) != 0 ? iwnVar.j : z, (i & 1024) != 0 ? iwnVar.k : map2);
    }

    public final Map a() {
        return this.i;
    }

    public final String b() {
        return this.f;
    }

    public final boolean c() {
        return this.j;
    }

    public final List d() {
        return this.g;
    }

    public final Map e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwn)) {
            return false;
        }
        iwn iwnVar = (iwn) obj;
        return u890.j(this.a, iwnVar.a) && this.b == iwnVar.b && this.c == iwnVar.c && u890.j(this.d, iwnVar.d) && u890.j(this.e, iwnVar.e) && u890.j(this.f, iwnVar.f) && u890.j(this.g, iwnVar.g) && u890.j(this.h, iwnVar.h) && u890.j(this.i, iwnVar.i) && this.j == iwnVar.j && u890.j(this.k, iwnVar.k);
    }

    public final String f() {
        return this.e;
    }

    public final dwn g() {
        return this.h;
    }

    public final int hashCode() {
        int iF = cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        String str = this.d;
        return this.k.hashCode() + xcg1.g(cy30.e((this.h.hashCode() + f4i1.b(cy30.d(cy30.d((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g)) * 31, 31, this.i), 31, this.j);
    }

    public iwn(String str, long j, long j2, String str2, String str3, String str4, List list, dwn dwnVar, Map map, boolean z, Map map2) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = list;
        this.h = dwnVar;
        this.i = map;
        this.j = z;
        this.k = map2;
    }
}
