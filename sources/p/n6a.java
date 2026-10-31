package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n6a implements o6a {
    public final String a;
    public final e8a b;

    public n6a(String str, e8a e8aVar) {
        this.a = str;
        this.b = e8aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6a)) {
            return false;
        }
        n6a n6aVar = (n6a) obj;
        return u890.j(this.a, n6aVar.a) && this.b == n6aVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
