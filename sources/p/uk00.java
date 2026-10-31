package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uk00 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public uk00(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk00)) {
            return false;
        }
        uk00 uk00Var = (uk00) obj;
        return this.a == uk00Var.a && this.b == uk00Var.b && this.c == uk00Var.c && this.d == uk00Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
