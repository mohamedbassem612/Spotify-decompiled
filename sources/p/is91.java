package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class is91 implements qs91 {
    public final String a;
    public final gs91 b;

    public is91(String str, gs91 gs91Var) {
        this.a = str;
        this.b = gs91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is91)) {
            return false;
        }
        is91 is91Var = (is91) obj;
        return u890.j(this.a, is91Var.a) && this.b.equals(is91Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
