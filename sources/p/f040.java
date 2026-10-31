package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f040 {
    public final sqe a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final boolean f;

    public f040(sqe sqeVar, String str, String str2, boolean z, String str3, boolean z2) {
        this.a = sqeVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f040)) {
            return false;
        }
        f040 f040Var = (f040) obj;
        return this.a.equals(f040Var.a) && this.b.equals(f040Var.b) && u890.j(this.c, f040Var.c) && this.d == f040Var.d && this.e.equals(f040Var.e) && this.f == f040Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + cy30.d(xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
