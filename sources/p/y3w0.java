package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class y3w0 extends f4w0 {
    public final String a;
    public final boolean b;

    public y3w0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3w0)) {
            return false;
        }
        y3w0 y3w0Var = (y3w0) obj;
        return u890.j(this.a, y3w0Var.a) && this.b == y3w0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
