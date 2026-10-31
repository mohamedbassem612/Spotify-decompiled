package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eh7 {
    public final int a;
    public final int b;
    public final int c;

    public eh7(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh7)) {
            return false;
        }
        eh7 eh7Var = (eh7) obj;
        return this.a == eh7Var.a && this.b == eh7Var.b && this.c == eh7Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
