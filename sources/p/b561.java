package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b561 {
    public final String a;
    public final String b;
    public final gb9 c;

    public b561(String str, String str2, gb9 gb9Var) {
        this.a = str;
        this.b = str2;
        this.c = gb9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b561)) {
            return false;
        }
        b561 b561Var = (b561) obj;
        return u890.j(this.a, b561Var.a) && u890.j(this.b, b561Var.b) && this.c.equals(b561Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
