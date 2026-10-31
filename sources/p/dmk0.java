package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dmk0 {
    public final int a;
    public final hnk0 b;

    public dmk0(int i, hnk0 hnk0Var) {
        this.a = i;
        this.b = hnk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmk0)) {
            return false;
        }
        dmk0 dmk0Var = (dmk0) obj;
        return this.a == dmk0Var.a && this.b.equals(dmk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
