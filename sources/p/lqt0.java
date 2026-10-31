package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lqt0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public lqt0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqt0)) {
            return false;
        }
        lqt0 lqt0Var = (lqt0) obj;
        return u890.j(this.a, lqt0Var.a) && u890.j(this.b, lqt0Var.b) && this.c.equals(lqt0Var.c) && u890.j(this.d, lqt0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
