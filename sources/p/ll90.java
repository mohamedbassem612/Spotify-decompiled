package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ll90 {
    public final int a;
    public final tka0 b;

    public ll90(int i, tka0 tka0Var) {
        this.a = i;
        this.b = tka0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll90)) {
            return false;
        }
        ll90 ll90Var = (ll90) obj;
        return this.a == ll90Var.a && u890.j(this.b, ll90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
