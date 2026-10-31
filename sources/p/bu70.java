package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bu70 {
    public final int a;
    public final int b;
    public final int c;

    public bu70(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int a() {
        return this.a + this.b + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu70)) {
            return false;
        }
        bu70 bu70Var = (bu70) obj;
        return this.a == bu70Var.a && this.b == bu70Var.b && this.c == bu70Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
