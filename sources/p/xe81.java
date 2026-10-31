package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xe81 {
    public final we81 a;
    public final boolean b;
    public final boolean c;

    public xe81(we81 we81Var, boolean z, boolean z2) {
        this.a = we81Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe81)) {
            return false;
        }
        xe81 xe81Var = (xe81) obj;
        return this.a == xe81Var.a && this.b == xe81Var.b && this.c == xe81Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
