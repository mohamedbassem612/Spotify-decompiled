package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i1r implements k1r {
    public final Object a;
    public final Integer b;

    public i1r(Object obj, Integer num) {
        this.a = obj;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1r)) {
            return false;
        }
        i1r i1rVar = (i1r) obj;
        return u890.j(this.a, i1rVar.a) && u890.j(this.b, i1rVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
