package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ozh1 {
    public final int a;
    public final int b;

    public ozh1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozh1)) {
            return false;
        }
        ozh1 ozh1Var = (ozh1) obj;
        return this.a == ozh1Var.a && this.b == ozh1Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (l1d.C(this.a) * 31);
    }
}
