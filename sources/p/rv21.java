package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rv21 {
    public final String a;
    public final String b;
    public final String c;

    public rv21(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv21)) {
            return false;
        }
        rv21 rv21Var = (rv21) obj;
        return this.a.equals(rv21Var.a) && this.b.equals(rv21Var.b) && this.c.equals(rv21Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
