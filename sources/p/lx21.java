package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lx21 {
    public final Integer a;
    public final int b;
    public final int c;
    public final Integer d;
    public final int e;

    public lx21(Integer num, int i, int i2, Integer num2, int i3) {
        this.a = num;
        this.b = i;
        this.c = i2;
        this.d = num2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx21)) {
            return false;
        }
        lx21 lx21Var = (lx21) obj;
        return u890.j(this.a, lx21Var.a) && this.b == lx21Var.b && this.c == lx21Var.c && u890.j(this.d, lx21Var.d) && this.e == lx21Var.e;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iF = kaa0.f(this.c, kaa0.f(this.b, (num == null ? 0 : num.hashCode()) * 31, 31), 31);
        Integer num2 = this.d;
        return Integer.hashCode(this.e) + ((iF + (num2 != null ? num2.hashCode() : 0)) * 31);
    }
}
