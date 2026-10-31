package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vu00 {
    public final String a;
    public final ez00 b;

    public vu00(String str, ez00 ez00Var) {
        this.a = str;
        this.b = ez00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu00)) {
            return false;
        }
        vu00 vu00Var = (vu00) obj;
        return u890.j(this.a, vu00Var.a) && u890.j(this.b, vu00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
