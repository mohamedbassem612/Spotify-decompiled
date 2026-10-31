package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c9w0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;

    public c9w0(int i, String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9w0)) {
            return false;
        }
        c9w0 c9w0Var = (c9w0) obj;
        return this.a.equals(c9w0Var.a) && this.b.equals(c9w0Var.b) && u890.j(this.c, c9w0Var.c) && this.d == c9w0Var.d && this.e == c9w0Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.e) + ab80.k(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
