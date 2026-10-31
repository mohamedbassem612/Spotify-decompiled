package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l160 {
    public final int a;
    public final int b;

    public /* synthetic */ l160(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l160)) {
            return false;
        }
        l160 l160Var = (l160) obj;
        return this.a == l160Var.a && this.b == l160Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public l160(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
