package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xzl1 implements g0m1 {
    public final String a;
    public final String b;
    public final String c;

    public xzl1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzl1)) {
            return false;
        }
        xzl1 xzl1Var = (xzl1) obj;
        return u890.j(this.a, xzl1Var.a) && u890.j(this.b, xzl1Var.b) && this.c.equals(xzl1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
