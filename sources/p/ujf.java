package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ujf extends vjf {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;

    public ujf(String str, String str2, int i, int i2, int i3, long j, long j2, int i4) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = j;
        this.g = j2;
        this.h = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujf)) {
            return false;
        }
        ujf ujfVar = (ujf) obj;
        return this.a.equals(ujfVar.a) && this.b.equals(ujfVar.b) && this.c == ujfVar.c && this.d == ujfVar.d && this.e == ujfVar.e && this.f == ujfVar.f && this.g == ujfVar.g && this.h == ujfVar.h;
    }

    public final int hashCode() {
        return l1d.C(this.h) + cy30.f(cy30.f(kaa0.f(this.e, kaa0.f(this.d, ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), this.f, 31), this.g, 31);
    }
}
