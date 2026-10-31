package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e6a {
    public final z7a a;
    public final l8a b;

    public e6a(z7a z7aVar, l8a l8aVar) {
        this.a = z7aVar;
        this.b = l8aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e6a) {
            e6a e6aVar = (e6a) obj;
            return u890.j(this.a, e6aVar.a) && this.b == e6aVar.b;
        }
        return false;
    }

    public final int hashCode() {
        z7a z7aVar = this.a;
        return this.b.hashCode() + ((z7aVar == null ? 0 : z7aVar.hashCode()) * 31);
    }
}
