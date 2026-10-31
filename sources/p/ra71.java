package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ra71 {
    public final Uri a;
    public final String b;
    public final h3i0 c;
    public final jdj1 d;
    public final long e;
    public final long f;
    public final Long g;
    public final boolean h;
    public final boolean i;
    public final h4p1 j;
    public final String k;
    public final String l;

    public ra71(Uri uri, String str, h3i0 h3i0Var, jdj1 jdj1Var, long j, long j2, Long l, boolean z, boolean z2, h4p1 h4p1Var, String str2, String str3) {
        this.a = uri;
        this.b = str;
        this.c = h3i0Var;
        this.d = jdj1Var;
        this.e = j;
        this.f = j2;
        this.g = l;
        this.h = z;
        this.i = z2;
        this.j = h4p1Var;
        this.k = str2;
        this.l = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra71)) {
            return false;
        }
        ra71 ra71Var = (ra71) obj;
        return u890.j(this.a, ra71Var.a) && u890.j(this.b, ra71Var.b) && this.c == ra71Var.c && this.d.equals(ra71Var.d) && this.e == ra71Var.e && this.f == ra71Var.f && u890.j(this.g, ra71Var.g) && this.h == ra71Var.h && this.i == ra71Var.i && this.j.equals(ra71Var.j) && u890.j(this.k, ra71Var.k) && u890.j(this.l, ra71Var.l);
    }

    public final int hashCode() {
        int iF = cy30.f(cy30.f((this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, this.e, 31), this.f, 31);
        Long l = this.g;
        int iHashCode = (this.j.hashCode() + xcg1.g(xcg1.g((iF + (l == null ? 0 : l.hashCode())) * 31, 31, this.h), 31, this.i)) * 31;
        String str = this.k;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
