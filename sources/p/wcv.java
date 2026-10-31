package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wcv implements ycv {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;

    public wcv(int i, int i2, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z;
        this.f = i;
        this.g = i2;
    }

    @Override // p.ycv
    public final String a() {
        return this.c;
    }

    @Override // p.ycv
    public final boolean b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wcv)) {
            return false;
        }
        wcv wcvVar = (wcv) obj;
        return this.a.equals(wcvVar.a) && this.b.equals(wcvVar.b) && this.c.equals(wcvVar.c) && this.d == wcvVar.d && this.e == wcvVar.e && this.f == wcvVar.f && this.g == wcvVar.g;
    }

    @Override // p.ycv
    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + kaa0.f(this.f, xcg1.g(xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }
}
