package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d4h {
    public final int a;
    public final int b;

    public d4h(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4h)) {
            return false;
        }
        d4h d4hVar = (d4h) obj;
        return this.a == d4hVar.a && this.b == d4hVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return l1d.j(this.a, this.b, "CollectionInfo(rowCount=", ", columnCount=", ")");
    }
}
