package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f7j0 {
    public final String a;
    public final String b;
    public final String c;

    public f7j0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7j0)) {
            return false;
        }
        f7j0 f7j0Var = (f7j0) obj;
        return u890.j(this.a, f7j0Var.a) && u890.j(this.b, f7j0Var.b) && this.c.equals(f7j0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
