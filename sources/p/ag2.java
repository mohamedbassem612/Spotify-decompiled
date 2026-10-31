package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ag2 extends cg2 {
    public final int a;
    public final int b;
    public final int c;

    public ag2(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag2)) {
            return false;
        }
        ag2 ag2Var = (ag2) obj;
        return this.a == ag2Var.a && this.b == ag2Var.b && this.c == ag2Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
