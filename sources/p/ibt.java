package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ibt {
    public final String a;
    public final Object b;

    public ibt(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibt)) {
            return false;
        }
        ibt ibtVar = (ibt) obj;
        return u890.j(this.a, ibtVar.a) && u890.j(this.b, ibtVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
