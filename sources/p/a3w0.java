package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a3w0 {
    public final String a;
    public final vgu0 b;

    public a3w0(String str, vgu0 vgu0Var) {
        this.a = str;
        this.b = vgu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3w0)) {
            return false;
        }
        a3w0 a3w0Var = (a3w0) obj;
        return u890.j(this.a, a3w0Var.a) && this.b.equals(a3w0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
