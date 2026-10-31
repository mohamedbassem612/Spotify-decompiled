package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jat {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final int f;
    public final boolean g;

    public jat(int i, int i2, String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = i2;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jat)) {
            return false;
        }
        jat jatVar = (jat) obj;
        return this.a.equals(jatVar.a) && this.b.equals(jatVar.b) && this.c.equals(jatVar.c) && this.d == jatVar.d && this.e.equals(jatVar.e) && this.f == jatVar.f && this.g == jatVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + kaa0.f(this.f, cy30.d(ab80.k(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31);
    }
}
