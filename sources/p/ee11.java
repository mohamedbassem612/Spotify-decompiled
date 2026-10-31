package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ee11 {
    public final int a;
    public final int b;

    public ee11(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee11)) {
            return false;
        }
        ee11 ee11Var = (ee11) obj;
        return this.a == ee11Var.a && this.b == ee11Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (l1d.C(this.a) * 31);
    }
}
