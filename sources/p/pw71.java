package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pw71 implements uw71 {
    public final lw71 a;
    public final String b;
    public final int c;

    public pw71(lw71 lw71Var, String str, int i) {
        this.a = lw71Var;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pw71)) {
            return false;
        }
        pw71 pw71Var = (pw71) obj;
        return u890.j(this.a, pw71Var.a) && u890.j(this.b, pw71Var.b) && this.c == pw71Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return l1d.C(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public /* synthetic */ pw71(lw71 lw71Var) {
        this(lw71Var, null, 1);
    }
}
