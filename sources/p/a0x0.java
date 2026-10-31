package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class a0x0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public a0x0(boolean z, boolean z2, String str, String str2, String str3) {
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
        if (!(obj instanceof a0x0)) {
            return false;
        }
        a0x0 a0x0Var = (a0x0) obj;
        return u890.j(this.a, a0x0Var.a) && u890.j(this.b, a0x0Var.b) && u890.j(this.c, a0x0Var.c) && this.d == a0x0Var.d && this.e == a0x0Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.e) + xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
