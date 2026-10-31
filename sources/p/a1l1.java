package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a1l1 extends f1l1 {
    public final b4l1 a;
    public final boolean b;
    public final String c;
    public final String d;

    public a1l1(b4l1 b4l1Var, boolean z, String str, String str2) {
        this.a = b4l1Var;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1l1)) {
            return false;
        }
        a1l1 a1l1Var = (a1l1) obj;
        return this.a.equals(a1l1Var.a) && this.b == a1l1Var.b && this.c.equals(a1l1Var.c) && u890.j(this.d, a1l1Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
