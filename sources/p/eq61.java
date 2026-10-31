package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eq61 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public eq61(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq61)) {
            return false;
        }
        eq61 eq61Var = (eq61) obj;
        return this.a == eq61Var.a && this.b == eq61Var.b && this.c == eq61Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
