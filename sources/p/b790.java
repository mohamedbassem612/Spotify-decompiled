package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b790 {
    public final k980 a;
    public final String b;

    public b790(k980 k980Var, String str) {
        this.a = k980Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b790)) {
            return false;
        }
        b790 b790Var = (b790) obj;
        return u890.j(this.a, b790Var.a) && u890.j(this.b, b790Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
