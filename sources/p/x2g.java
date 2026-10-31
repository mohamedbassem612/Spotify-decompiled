package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x2g {
    public final int a;
    public final r2g b;

    public x2g(int i, r2g r2gVar) {
        this.a = i;
        this.b = r2gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2g)) {
            return false;
        }
        x2g x2gVar = (x2g) obj;
        return this.a == x2gVar.a && u890.j(this.b, x2gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
