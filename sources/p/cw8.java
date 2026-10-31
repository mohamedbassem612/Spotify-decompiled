package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cw8 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public cw8(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw8)) {
            return false;
        }
        cw8 cw8Var = (cw8) obj;
        return this.a == cw8Var.a && this.b == cw8Var.b && this.c == cw8Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public /* synthetic */ cw8() {
        this(false, false, true);
    }
}
