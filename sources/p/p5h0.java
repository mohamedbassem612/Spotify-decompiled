package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p5h0 implements z5h0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public p5h0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5h0)) {
            return false;
        }
        p5h0 p5h0Var = (p5h0) obj;
        return this.a.equals(p5h0Var.a) && this.b.equals(p5h0Var.b) && u890.j(this.c, p5h0Var.c) && this.d == p5h0Var.d;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(cy30.d(this.a.hashCode() * 961, 31, this.b), 31, this.c);
    }
}
