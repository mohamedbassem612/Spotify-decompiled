package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fuf1 {
    public final String a;
    public final cvf1 b;
    public final String c;
    public final String d;

    public fuf1(String str, cvf1 cvf1Var, String str2, String str3) {
        this.a = str;
        this.b = cvf1Var;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuf1)) {
            return false;
        }
        fuf1 fuf1Var = (fuf1) obj;
        return this.a.equals(fuf1Var.a) && u890.j(this.b, fuf1Var.b) && this.c.equals(fuf1Var.c) && u890.j(this.d, fuf1Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        this.b.getClass();
        int iD = cy30.d((iHashCode + 1396393329) * 31, 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
