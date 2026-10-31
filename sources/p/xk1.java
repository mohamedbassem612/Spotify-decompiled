package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xk1 implements z0i {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public xk1(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk1)) {
            return false;
        }
        xk1 xk1Var = (xk1) obj;
        return this.a.equals(xk1Var.a) && this.b.equals(xk1Var.b) && this.c.equals(xk1Var.c) && this.d.equals(xk1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
