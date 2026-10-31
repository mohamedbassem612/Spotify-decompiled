package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ur31 {
    public final boolean a;
    public final int b;
    public final int c;

    public ur31(boolean z, int i, int i2) {
        this.a = z;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur31)) {
            return false;
        }
        ur31 ur31Var = (ur31) obj;
        return this.a == ur31Var.a && this.b == ur31Var.b && this.c == ur31Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Boolean.hashCode(this.a) * 31, 31);
    }
}
