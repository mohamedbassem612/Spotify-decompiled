package p;

import com.spotify.localfiles.mediastoreimpl.LocalFilesProperties$TestHelper;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i1z {
    public final xwp0 A;
    public final d1z B;
    public final g1z C;
    public final tu00 D;
    public final int E;
    public final String a;
    public final String b;
    public final String c;
    public final cen d;
    public final cen e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f11p;
    public final int q;
    public final Integer r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final Long w;
    public final boolean x;
    public final int y;
    public final g281 z;

    public i1z(String str, String str2, String str3, cen cenVar, cen cenVar2, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, boolean z7, int i2, Integer num, boolean z8, boolean z9, boolean z10, boolean z11, Long l, boolean z12, int i3, g281 g281Var, xwp0 xwp0Var, d1z d1zVar, g1z g1zVar, tu00 tu00Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = cenVar;
        this.e = cenVar2;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.E = i;
        this.f11p = z7;
        this.q = i2;
        this.r = num;
        this.s = z8;
        this.t = z9;
        this.u = z10;
        this.v = z11;
        this.w = l;
        this.x = z12;
        this.y = i3;
        this.z = g281Var;
        this.A = xwp0Var;
        this.B = d1zVar;
        this.C = g1zVar;
        this.D = tu00Var;
    }

    public static i1z a(i1z i1zVar, String str) {
        return new i1z(str, i1zVar.b, i1zVar.c, i1zVar.d, i1zVar.e, i1zVar.f, i1zVar.g, i1zVar.h, i1zVar.i, i1zVar.j, i1zVar.k, i1zVar.l, i1zVar.m, i1zVar.n, i1zVar.o, i1zVar.E, i1zVar.f11p, i1zVar.q, i1zVar.r, i1zVar.s, i1zVar.t, i1zVar.u, i1zVar.v, i1zVar.w, i1zVar.x, i1zVar.y, i1zVar.z, i1zVar.A, i1zVar.B, i1zVar.C, i1zVar.D);
    }

    public final String b(int i) {
        g281 g281Var;
        String strA = this.d.a(i);
        if (strA.length() == 0) {
            strA = this.e.a(i);
        }
        return (strA.length() != 0 || (g281Var = this.z) == null) ? strA : g281Var.j.a(i);
    }

    public final int c() {
        return this.q;
    }

    public final LinkedHashMap d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        nmn1.k(linkedHashMap, "image_url", 1, this);
        nmn1.k(linkedHashMap, "image_small_url", 2, this);
        nmn1.k(linkedHashMap, "image_large_url", 3, this);
        nmn1.k(linkedHashMap, "image_xlarge_url", 4, this);
        String str = this.c;
        if (str.length() > 0) {
            linkedHashMap.put("title", str);
        }
        int iOrdinal = this.B.ordinal();
        String str2 = this.g;
        if (iOrdinal == 0) {
            linkedHashMap.put("media.type", "mixed");
            linkedHashMap.put("media.manifest_id", str2);
        } else if (iOrdinal == 1) {
            linkedHashMap.put("media.type", "audio");
        } else if (iOrdinal == 2) {
            linkedHashMap.put("media.type", "video");
            linkedHashMap.put("media.manifest_id", str2);
        }
        g281 g281Var = this.z;
        if (g281Var != null) {
            String str3 = g281Var.d;
            if (str3.length() > 0) {
                linkedHashMap.put("artist_name", str3);
            }
        }
        if (this.x) {
            linkedHashMap.put("is_backgroundable", LocalFilesProperties$TestHelper.TRUE);
        }
        return linkedHashMap;
    }

    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1z)) {
            return false;
        }
        i1z i1zVar = (i1z) obj;
        return this.a.equals(i1zVar.a) && u890.j(this.b, i1zVar.b) && this.c.equals(i1zVar.c) && this.d.equals(i1zVar.d) && this.e.equals(i1zVar.e) && this.f.equals(i1zVar.f) && this.g.equals(i1zVar.g) && this.h.equals(i1zVar.h) && u890.j(this.i, i1zVar.i) && this.j == i1zVar.j && this.k == i1zVar.k && this.l == i1zVar.l && this.m == i1zVar.m && this.n == i1zVar.n && this.o == i1zVar.o && this.E == i1zVar.E && this.f11p == i1zVar.f11p && this.q == i1zVar.q && u890.j(this.r, i1zVar.r) && this.s == i1zVar.s && this.t == i1zVar.t && this.u == i1zVar.u && this.v == i1zVar.v && u890.j(this.w, i1zVar.w) && this.x == i1zVar.x && this.y == i1zVar.y && u890.j(this.z, i1zVar.z) && u890.j(this.A, i1zVar.A) && this.B == i1zVar.B && this.C == i1zVar.C && u890.j(this.D, i1zVar.D);
    }

    public final int f() {
        return this.y;
    }

    public final String g() {
        return this.a;
    }

    public final boolean h() {
        return this.l;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iD = cy30.d(cy30.d(cy30.d((this.e.hashCode() + ((this.d.hashCode() + cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h);
        String str2 = this.i;
        int iF = kaa0.f(this.q, xcg1.g(ab80.k(this.E, xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iD + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31), 31, this.f11p), 31);
        Integer num = this.r;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g((iF + (num == null ? 0 : num.hashCode())) * 31, 31, this.s), 31, this.t), 31, this.u), 31, this.v);
        Long l = this.w;
        int iF2 = kaa0.f(this.y, xcg1.g((iG + (l == null ? 0 : l.hashCode())) * 31, 31, this.x), 31);
        g281 g281Var = this.z;
        return this.D.hashCode() + ((this.C.hashCode() + ((this.B.hashCode() + ((this.A.hashCode() + ((iF2 + (g281Var != null ? g281Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public final boolean i() {
        return this.k;
    }

    public final boolean j() {
        return this.s;
    }
}
