package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ms90 implements os90 {
    public final String a;
    public final xo90 b;

    public ms90(String str, xo90 xo90Var) {
        this.a = str;
        this.b = xo90Var;
    }

    public final xo90 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms90)) {
            return false;
        }
        ms90 ms90Var = (ms90) obj;
        return u890.j(this.a, ms90Var.a) && this.b == ms90Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
