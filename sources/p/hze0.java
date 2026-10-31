package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hze0 extends kze0 {
    public final String a;
    public final String b;
    public final String c;

    public hze0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hze0)) {
            return false;
        }
        hze0 hze0Var = (hze0) obj;
        return u890.j(this.a, hze0Var.a) && u890.j(this.b, hze0Var.b) && u890.j(this.c, hze0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
