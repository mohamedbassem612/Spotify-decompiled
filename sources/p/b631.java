package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b631 {
    public final String a;
    public final String b;
    public final String c;

    public b631(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b631)) {
            return false;
        }
        b631 b631Var = (b631) obj;
        return this.a.equals(b631Var.a) && this.b.equals(b631Var.b) && this.c.equals(b631Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
