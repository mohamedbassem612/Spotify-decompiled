package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a980 {
    public final String a;
    public final d980 b;

    public a980(String str, d980 d980Var) {
        this.a = str;
        this.b = d980Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a980)) {
            return false;
        }
        a980 a980Var = (a980) obj;
        return u890.j(this.a, a980Var.a) && this.b == a980Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
