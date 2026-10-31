package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bc51 {
    public final int a;
    public final int b;

    public bc51(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc51)) {
            return false;
        }
        bc51 bc51Var = (bc51) obj;
        return this.a == bc51Var.a && this.b == bc51Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
