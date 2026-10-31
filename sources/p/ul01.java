package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ul01 {
    public final long a;
    public final int b;

    public ul01(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul01)) {
            return false;
        }
        ul01 ul01Var = (ul01) obj;
        return this.a == ul01Var.a && this.b == ul01Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (Long.hashCode(this.a) * 31);
    }
}
