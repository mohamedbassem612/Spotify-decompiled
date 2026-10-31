package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fsk1 implements qsk1 {
    public final String a;
    public final double b;
    public final boolean c;

    public fsk1(double d, String str, boolean z) {
        this.a = str;
        this.b = d;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsk1)) {
            return false;
        }
        fsk1 fsk1Var = (fsk1) obj;
        return u890.j(this.a, fsk1Var.a) && Double.compare(this.b, fsk1Var.b) == 0 && this.c == fsk1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.e(this.b, this.a.hashCode() * 31, 31);
    }
}
