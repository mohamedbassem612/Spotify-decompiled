package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bs9 {
    public final int a;
    public final boolean b;

    public bs9(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs9)) {
            return false;
        }
        bs9 bs9Var = (bs9) obj;
        return this.a == bs9Var.a && this.b == bs9Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + ((y2k1.d.hashCode() + (l1d.C(this.a) * 31)) * 31);
    }
}
