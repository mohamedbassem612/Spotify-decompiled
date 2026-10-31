package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gci0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public gci0(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gci0)) {
            return false;
        }
        gci0 gci0Var = (gci0) obj;
        return this.a == gci0Var.a && this.b == gci0Var.b && this.c == gci0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, false), 31, this.b);
    }
}
