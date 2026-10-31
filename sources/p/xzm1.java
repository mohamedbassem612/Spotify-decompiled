package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xzm1 {
    public final String a;
    public final String b;
    public final es41 c;

    public xzm1(String str, String str2, es41 es41Var) {
        this.a = str;
        this.b = str2;
        this.c = es41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xzm1) {
            xzm1 xzm1Var = (xzm1) obj;
            return this.a.equals(xzm1Var.a) && this.b.equals(xzm1Var.b) && this.c == xzm1Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
