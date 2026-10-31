package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qz50 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final int f;

    public qz50(int i, String str, String str2, String str3, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = str3;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz50)) {
            return false;
        }
        qz50 qz50Var = (qz50) obj;
        return u890.j(this.a, qz50Var.a) && this.b.equals(qz50Var.b) && this.c == qz50Var.c && this.d == qz50Var.d && this.e.equals(qz50Var.e) && this.f == qz50Var.f;
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(this.f) + cy30.d(xcg1.g(xcg1.g(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
