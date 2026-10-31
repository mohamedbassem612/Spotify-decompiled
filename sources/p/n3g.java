package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n3g {
    public final Object a;
    public final j2i b;

    public n3g(Object obj, j2i j2iVar) {
        this.a = obj;
        this.b = j2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n3g) {
            n3g n3gVar = (n3g) obj;
            return u890.j(this.a, n3gVar.a) && this.b == n3gVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
