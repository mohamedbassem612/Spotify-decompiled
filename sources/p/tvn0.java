package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tvn0 extends wvn0 {
    public final int a;
    public final nsn0 b;

    public tvn0(int i, nsn0 nsn0Var) {
        this.a = i;
        this.b = nsn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvn0)) {
            return false;
        }
        tvn0 tvn0Var = (tvn0) obj;
        return this.a == tvn0Var.a && u890.j(this.b, tvn0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }

    @Override // p.wvn0
    public final String toString() {
        return super.toString();
    }
}
