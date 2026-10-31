package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k6o {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;

    public k6o(int i, String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6o)) {
            return false;
        }
        k6o k6oVar = (k6o) obj;
        return u890.j(this.a, k6oVar.a) && this.b.equals(k6oVar.b) && this.c.equals(k6oVar.c) && this.d == k6oVar.d && this.e == k6oVar.e;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.e) + kaa0.f(this.d, cy30.d(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31);
    }
}
