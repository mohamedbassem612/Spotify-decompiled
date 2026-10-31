package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class udg1 implements vdg1 {
    public final String a;
    public final int b;
    public final int c;

    public udg1(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udg1)) {
            return false;
        }
        udg1 udg1Var = (udg1) obj;
        return u890.j(this.a, udg1Var.a) && this.b == udg1Var.b && this.c == udg1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
