package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nqu0 {
    public final String a;
    public final Integer b;

    public nqu0(Integer num, String str) {
        this.a = str;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqu0)) {
            return false;
        }
        nqu0 nqu0Var = (nqu0) obj;
        return this.a.equals(nqu0Var.a) && u890.j(this.b, nqu0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
