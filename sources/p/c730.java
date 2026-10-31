package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c730 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public c730(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c730)) {
            return false;
        }
        c730 c730Var = (c730) obj;
        return this.a == c730Var.a && this.b == c730Var.b && this.c == c730Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
