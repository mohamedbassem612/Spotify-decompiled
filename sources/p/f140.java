package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f140 {
    public final a140 a;
    public final String b;
    public final String c;
    public final String d;

    public f140(a140 a140Var, String str, String str2, String str3) {
        this.a = a140Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f140)) {
            return false;
        }
        f140 f140Var = (f140) obj;
        return u890.j(this.a, f140Var.a) && u890.j(this.b, f140Var.b) && u890.j(this.c, f140Var.c) && u890.j(this.d, f140Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
