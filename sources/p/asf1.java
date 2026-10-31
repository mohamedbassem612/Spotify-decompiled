package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class asf1 {
    public final int a;
    public final int b;

    public asf1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asf1)) {
            return false;
        }
        asf1 asf1Var = (asf1) obj;
        return this.a == asf1Var.a && this.b == asf1Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (l1d.C(this.a) * 31);
    }
}
