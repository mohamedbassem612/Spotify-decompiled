package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k6k {
    public final String a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;

    public k6k(long j, long j2, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6k)) {
            return false;
        }
        k6k k6kVar = (k6k) obj;
        return this.a.equals(k6kVar.a) && this.b == k6kVar.b && this.c == k6kVar.c && this.d.equals(k6kVar.d) && u890.j(this.e, k6kVar.e) && this.f.equals(k6kVar.f);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
