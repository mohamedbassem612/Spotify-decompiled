package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xex0 {
    public final int a;
    public final Integer b;

    public xex0(Integer num, int i) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xex0)) {
            return false;
        }
        xex0 xex0Var = (xex0) obj;
        return this.a == xex0Var.a && this.b.equals(xex0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
