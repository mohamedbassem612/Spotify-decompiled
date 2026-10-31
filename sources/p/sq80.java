package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sq80 {
    public final int a;
    public final int b;

    public sq80(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq80)) {
            return false;
        }
        sq80 sq80Var = (sq80) obj;
        return this.a == sq80Var.a && this.b == sq80Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (l1d.C(this.a) * 31);
    }
}
