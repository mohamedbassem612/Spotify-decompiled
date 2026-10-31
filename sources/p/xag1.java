package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xag1 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public xag1(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xag1)) {
            return false;
        }
        xag1 xag1Var = (xag1) obj;
        return u890.j(this.a, xag1Var.a) && this.b == xag1Var.b && this.c == xag1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
