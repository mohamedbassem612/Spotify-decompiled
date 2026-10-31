package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nt6 {
    public final String a;
    public final String b;
    public final String c;

    public nt6(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt6)) {
            return false;
        }
        nt6 nt6Var = (nt6) obj;
        return u890.j(this.a, nt6Var.a) && u890.j(this.b, nt6Var.b) && u890.j(this.c, nt6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
