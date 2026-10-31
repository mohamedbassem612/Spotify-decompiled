package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xfh0 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;

    public xfh0(int i, int i2, String str, String str2, String str3, String str4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i2;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfh0)) {
            return false;
        }
        xfh0 xfh0Var = (xfh0) obj;
        return this.a == xfh0Var.a && this.b.equals(xfh0Var.b) && this.c.equals(xfh0Var.c) && u890.j(this.d, xfh0Var.d) && this.e == xfh0Var.e && this.f.equals(xfh0Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.f.hashCode() + ab80.k(this.e, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
