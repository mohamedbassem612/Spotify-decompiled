package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e860 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public e860(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e860)) {
            return false;
        }
        e860 e860Var = (e860) obj;
        return this.a == e860Var.a && this.b == e860Var.b && this.c == e860Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
