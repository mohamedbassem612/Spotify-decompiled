package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nux implements qux {
    public final hux a;
    public final hux b;

    public nux(hux huxVar, hux huxVar2) {
        this.a = huxVar;
        this.b = huxVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nux)) {
            return false;
        }
        nux nuxVar = (nux) obj;
        return u890.j(this.a, nuxVar.a) && u890.j(this.b, nuxVar.b);
    }

    public final int hashCode() {
        hux huxVar = this.a;
        int iHashCode = (huxVar == null ? 0 : huxVar.hashCode()) * 31;
        hux huxVar2 = this.b;
        return iHashCode + (huxVar2 != null ? huxVar2.hashCode() : 0);
    }
}
