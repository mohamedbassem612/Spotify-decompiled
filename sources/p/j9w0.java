package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j9w0 implements k9w0 {
    public final String a;
    public final String b;
    public final h290 c;

    public j9w0(String str, String str2, h290 h290Var) {
        this.a = str;
        this.b = str2;
        this.c = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9w0)) {
            return false;
        }
        j9w0 j9w0Var = (j9w0) obj;
        return this.a.equals(j9w0Var.a) && this.b.equals(j9w0Var.b) && this.c.equals(j9w0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
