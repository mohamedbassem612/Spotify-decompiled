package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k6a implements o6a {
    public final String a;
    public final String b;
    public final e8a c;

    public k6a(String str, String str2, e8a e8aVar) {
        this.a = str;
        this.b = str2;
        this.c = e8aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6a)) {
            return false;
        }
        k6a k6aVar = (k6a) obj;
        return u890.j(this.a, k6aVar.a) && u890.j(this.b, k6aVar.b) && this.c == k6aVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
