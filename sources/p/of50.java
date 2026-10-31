package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class of50 {
    public final int a;
    public final int b;
    public final boolean c;

    public of50(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of50)) {
            return false;
        }
        of50 of50Var = (of50) obj;
        return this.a == of50Var.a && this.b == of50Var.b && this.c == of50Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
