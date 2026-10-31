package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nvj0 implements uvj0 {
    public final int a;
    public final int b;

    public nvj0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvj0)) {
            return false;
        }
        nvj0 nvj0Var = (nvj0) obj;
        return this.a == nvj0Var.a && this.b == nvj0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
