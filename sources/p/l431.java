package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class l431 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public l431(boolean z, boolean z2, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l431)) {
            return false;
        }
        l431 l431Var = (l431) obj;
        return u890.j(this.a, l431Var.a) && u890.j(this.b, l431Var.b) && u890.j(this.c, l431Var.c) && this.d == l431Var.d && this.e == l431Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.e) + xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
