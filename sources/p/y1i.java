package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y1i {
    public final Object a;
    public final String b;

    public y1i(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1i)) {
            return false;
        }
        y1i y1iVar = (y1i) obj;
        return u890.j(this.a, y1iVar.a) && u890.j(this.b, y1iVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
