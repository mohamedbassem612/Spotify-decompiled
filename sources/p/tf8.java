package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tf8 extends zxo1 {
    public final String c;
    public final bg8 d;
    public final yf8 e;

    public tf8(String str, bg8 bg8Var, yf8 yf8Var) {
        this.c = str;
        this.d = bg8Var;
        this.e = yf8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tf8) {
            tf8 tf8Var = (tf8) obj;
            return this.c.equals(tf8Var.c) && this.d == tf8Var.d && this.e == tf8Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
