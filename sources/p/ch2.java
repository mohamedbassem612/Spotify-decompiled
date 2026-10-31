package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ch2 {
    public final int a;
    public final int b;
    public final int c;

    public ch2(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch2)) {
            return false;
        }
        ch2 ch2Var = (ch2) obj;
        return this.a == ch2Var.a && this.b == ch2Var.b && this.c == ch2Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
