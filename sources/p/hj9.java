package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hj9 implements uj9 {
    public final boolean a;
    public final boolean b;

    public hj9(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj9)) {
            return false;
        }
        hj9 hj9Var = (hj9) obj;
        return this.a == hj9Var.a && this.b == hj9Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
