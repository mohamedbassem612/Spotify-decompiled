package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tv00 {
    public final String a;
    public final ez00 b;
    public final sv00 c;

    public tv00(String str, ez00 ez00Var, sv00 sv00Var) {
        this.a = str;
        this.b = ez00Var;
        this.c = sv00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv00)) {
            return false;
        }
        tv00 tv00Var = (tv00) obj;
        return u890.j(this.a, tv00Var.a) && u890.j(this.b, tv00Var.b) && this.c.equals(tv00Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ez00 ez00Var = this.b;
        return this.c.hashCode() + ((iHashCode + (ez00Var == null ? 0 : ez00Var.hashCode())) * 31);
    }
}
