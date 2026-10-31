package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tp80 extends jap1 {
    public final int c;
    public final int d;
    public final int e;

    public tp80(int i, int i2, int i3) {
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp80)) {
            return false;
        }
        tp80 tp80Var = (tp80) obj;
        return this.c == tp80Var.c && this.d == tp80Var.d && this.e == tp80Var.e;
    }

    public final int hashCode() {
        return l1d.C(this.e) + ab80.k(this.d, l1d.C(this.c) * 31, 31);
    }
}
