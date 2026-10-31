package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gc50 {
    public final String a;
    public final v850 b;

    public gc50(String str, v850 v850Var) {
        this.a = str;
        this.b = v850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc50)) {
            return false;
        }
        gc50 gc50Var = (gc50) obj;
        return u890.j(this.a, gc50Var.a) && this.b == gc50Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public /* synthetic */ gc50(String str) {
        this(str, v850.a);
    }
}
