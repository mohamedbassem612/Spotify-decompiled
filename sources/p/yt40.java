package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yt40 {
    public final boolean a;
    public final zt40 b;
    public final su40 c;
    public final su40 d;

    public yt40(boolean z, zt40 zt40Var, su40 su40Var, su40 su40Var2) {
        this.a = z;
        this.b = zt40Var;
        this.c = su40Var;
        this.d = su40Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yt40) {
            yt40 yt40Var = (yt40) obj;
            return this.a == yt40Var.a && this.b == yt40Var.b && this.c == yt40Var.c && this.d == yt40Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31);
    }
}
