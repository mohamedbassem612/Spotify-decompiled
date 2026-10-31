package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l6a implements o6a {
    public final String a;
    public final e8a b;

    public l6a(String str, e8a e8aVar) {
        this.a = str;
        this.b = e8aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6a)) {
            return false;
        }
        l6a l6aVar = (l6a) obj;
        return u890.j(this.a, l6aVar.a) && this.b == l6aVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
