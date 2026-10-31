package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l291 {
    public static final l291 c = new l291(-1, -1);
    public final int a;
    public final int b;

    static {
        new l291(0, 0);
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public l291(int i, int i2) {
        dm5.m((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof l291) {
            l291 l291Var = (l291) obj;
            if (this.a == l291Var.a && this.b == l291Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i << 16;
        return this.b ^ ((i >>> 16) | i2);
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
