package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qq80 {
    public final String a;
    public final sq80 b;

    public qq80(String str, sq80 sq80Var) {
        this.a = str;
        this.b = sq80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq80)) {
            return false;
        }
        qq80 qq80Var = (qq80) obj;
        return u890.j(this.a, qq80Var.a) && this.b.equals(qq80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
