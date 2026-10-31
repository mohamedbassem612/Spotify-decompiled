package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s2w0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final ArrayList f;
    public final h290 g;
    public final Long h;

    public s2w0(String str, String str2, String str3, String str4, long j, ArrayList arrayList, h290 h290Var, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = arrayList;
        this.g = h290Var;
        this.h = l;
    }

    public final String a() {
        return this.b;
    }

    public final List b() {
        return this.f;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final List e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2w0)) {
            return false;
        }
        s2w0 s2w0Var = (s2w0) obj;
        return this.a.equals(s2w0Var.a) && this.b.equals(s2w0Var.b) && this.c.equals(s2w0Var.c) && this.d.equals(s2w0Var.d) && this.e == s2w0Var.e && this.f.equals(s2w0Var.f) && this.g.equals(s2w0Var.g) && u890.j(this.h, s2w0Var.h);
    }

    public final Long f() {
        return this.h;
    }

    public final long g() {
        return this.e;
    }

    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        int iG = kk0.g(this.g, p3d1.f(this.f, cy30.f(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), this.e, 31), 31), 31);
        Long l = this.h;
        return iG + (l == null ? 0 : l.hashCode());
    }
}
