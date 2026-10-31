package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ju80 extends j82 {
    public final int d;
    public final int e;

    public ju80(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju80)) {
            return false;
        }
        ju80 ju80Var = (ju80) obj;
        return this.d == ju80Var.d && this.e == ju80Var.e;
    }

    public final int hashCode() {
        return l1d.C(this.e) + (l1d.C(this.d) * 31);
    }
}
