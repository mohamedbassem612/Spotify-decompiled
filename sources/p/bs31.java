package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bs31 {
    public final String a;
    public final int b;
    public final int c;
    public final CharSequence d;
    public final int e;

    public bs31(String str, int i, int i2, int i3, String str2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs31)) {
            return false;
        }
        bs31 bs31Var = (bs31) obj;
        return u890.j(this.a, bs31Var.a) && this.b == bs31Var.b && this.c == bs31Var.c && u890.j(this.d, bs31Var.d) && this.e == bs31Var.e;
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, ab80.k(this.b, this.a.hashCode() * 31, 31), 31);
        CharSequence charSequence = this.d;
        return Integer.hashCode(this.e) + ((iK + (charSequence == null ? 0 : charSequence.hashCode())) * 31);
    }
}
