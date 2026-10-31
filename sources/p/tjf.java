package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tjf extends vjf {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;

    public tjf(int i, int i2, int i3, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjf)) {
            return false;
        }
        tjf tjfVar = (tjf) obj;
        return this.a.equals(tjfVar.a) && this.b.equals(tjfVar.b) && this.c.equals(tjfVar.c) && this.d == tjfVar.d && this.e == tjfVar.e && this.f == tjfVar.f && u890.j(this.g, tjfVar.g);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.f, kaa0.f(this.e, ab80.k(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31);
        String str = this.g;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
