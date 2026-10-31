package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ycx0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public ycx0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycx0)) {
            return false;
        }
        ycx0 ycx0Var = (ycx0) obj;
        return u890.j(this.a, ycx0Var.a) && u890.j(this.b, ycx0Var.b) && u890.j(this.c, ycx0Var.c) && this.d == ycx0Var.d;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
