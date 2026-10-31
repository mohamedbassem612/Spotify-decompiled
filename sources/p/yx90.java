package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yx90 implements ay90 {
    public final String a;
    public final int b;

    public yx90(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx90)) {
            return false;
        }
        yx90 yx90Var = (yx90) obj;
        return u890.j(this.a, yx90Var.a) && this.b == yx90Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.b;
        return iHashCode + (i == 0 ? 0 : l1d.C(i));
    }
}
