package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tqz0 {
    public static final tqz0 d = new tqz0(0, 0);
    public final short a;
    public final byte b;
    public final int c;

    /* JADX WARN: Multi-variable type inference failed */
    public tqz0(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = i2 * 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqz0)) {
            return false;
        }
        tqz0 tqz0Var = (tqz0) obj;
        return this.a == tqz0Var.a && this.b == tqz0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
