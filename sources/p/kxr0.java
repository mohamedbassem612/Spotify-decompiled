package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kxr0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public kxr0(boolean z, boolean z2, String str, String str2, String str3) {
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
        if (!(obj instanceof kxr0)) {
            return false;
        }
        kxr0 kxr0Var = (kxr0) obj;
        return u890.j(this.a, kxr0Var.a) && u890.j(this.b, kxr0Var.b) && u890.j(this.c, kxr0Var.c) && this.d == kxr0Var.d && this.e == kxr0Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.e) + xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
