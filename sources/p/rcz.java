package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rcz {
    public final String a;
    public final String b;
    public final Long c;
    public final kcz d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final iu30 i;

    public rcz(String str, String str2, Long l, kcz kczVar, long j, boolean z, boolean z2, boolean z3, iu30 iu30Var) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = kczVar;
        this.e = j;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rcz)) {
            return false;
        }
        rcz rczVar = (rcz) obj;
        return u890.j(this.a, rczVar.a) && this.b.equals(rczVar.b) && u890.j(this.c, rczVar.c) && this.d == rczVar.d && this.e == rczVar.e && this.f == rczVar.f && this.g == rczVar.g && this.h == rczVar.h && u890.j(this.i, rczVar.i);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        return this.i.hashCode() + xcg1.g(xcg1.g(xcg1.g(cy30.f((this.d.hashCode() + ((iD + (l == null ? 0 : l.hashCode())) * 31)) * 31, this.e, 31), 31, this.f), 31, this.g), 31, this.h);
    }
}
