package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ads0 {
    public final String a;
    public final String b;
    public final b9v0 c;

    public ads0(String str, String str2, b9v0 b9v0Var) {
        this.a = str;
        this.b = str2;
        this.c = b9v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads0)) {
            return false;
        }
        ads0 ads0Var = (ads0) obj;
        return this.a.equals(ads0Var.a) && u890.j(this.b, ads0Var.b) && u890.j(this.c, ads0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        b9v0 b9v0Var = this.c;
        return iD + (b9v0Var == null ? 0 : b9v0Var.hashCode());
    }
}
