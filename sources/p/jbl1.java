package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jbl1 {
    public final String a;
    public final String b;
    public final String c;

    public jbl1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbl1)) {
            return false;
        }
        jbl1 jbl1Var = (jbl1) obj;
        return this.a.equals(jbl1Var.a) && this.b.equals(jbl1Var.b) && this.c.equals(jbl1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
