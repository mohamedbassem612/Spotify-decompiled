package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xtz0 {
    public final String a;
    public final Integer b;

    public xtz0(Integer num, String str) {
        this.a = str;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtz0)) {
            return false;
        }
        xtz0 xtz0Var = (xtz0) obj;
        return u890.j(this.a, xtz0Var.a) && u890.j(this.b, xtz0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
