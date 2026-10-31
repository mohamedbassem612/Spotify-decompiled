package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a790 {
    public final k980 a;
    public final String b;

    public a790(k980 k980Var, String str) {
        this.a = k980Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a790)) {
            return false;
        }
        a790 a790Var = (a790) obj;
        return u890.j(this.a, a790Var.a) && u890.j(this.b, a790Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
