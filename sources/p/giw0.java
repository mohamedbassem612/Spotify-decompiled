package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class giw0 {
    public final int a;
    public final boolean b;
    public final boolean c;

    public giw0(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof giw0)) {
            return false;
        }
        giw0 giw0Var = (giw0) obj;
        return this.a == giw0Var.a && this.b == giw0Var.b && this.c == giw0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
