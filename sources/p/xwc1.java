package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xwc1 {
    public final String a;
    public final int b;
    public final String c;

    public xwc1(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwc1)) {
            return false;
        }
        xwc1 xwc1Var = (xwc1) obj;
        return this.a.equals(xwc1Var.a) && this.b == xwc1Var.b && this.c.equals(xwc1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
