package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fvd0 {
    public final Integer a;
    public final String b;

    public fvd0(Integer num, String str) {
        this.a = num;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvd0)) {
            return false;
        }
        fvd0 fvd0Var = (fvd0) obj;
        return u890.j(this.a, fvd0Var.a) && u890.j(this.b, fvd0Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
