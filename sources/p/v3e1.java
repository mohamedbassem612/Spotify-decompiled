package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v3e1 {
    public final int a;
    public final int b;

    public v3e1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3e1)) {
            return false;
        }
        v3e1 v3e1Var = (v3e1) obj;
        return this.a == v3e1Var.a && this.b == v3e1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
