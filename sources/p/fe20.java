package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fe20 {
    public final yf20 a;
    public final String b;

    public fe20(yf20 yf20Var, String str) {
        this.a = yf20Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe20)) {
            return false;
        }
        fe20 fe20Var = (fe20) obj;
        return u890.j(this.a, fe20Var.a) && u890.j(this.b, fe20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
