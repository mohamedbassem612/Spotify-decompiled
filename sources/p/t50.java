package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t50 extends v50 {
    public final int c;
    public final int d;

    public t50(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t50)) {
            return false;
        }
        t50 t50Var = (t50) obj;
        return this.c == t50Var.c && this.d == t50Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (Integer.hashCode(this.c) * 31);
    }
}
