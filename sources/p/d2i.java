package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d2i implements uyl {
    public final j2i a;
    public final Object b;

    public d2i(Object obj, j2i j2iVar) {
        this.a = j2iVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d2i) {
            d2i d2iVar = (d2i) obj;
            if (this.a == d2iVar.a && u890.j(this.b, d2iVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final Object getId() {
        return this.b;
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
    }
}
