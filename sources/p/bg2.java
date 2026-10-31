package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bg2 extends cg2 {
    public final int a;
    public final int b;
    public final int c;

    public bg2(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg2)) {
            return false;
        }
        bg2 bg2Var = (bg2) obj;
        return this.a == bg2Var.a && this.b == bg2Var.b && this.c == bg2Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
