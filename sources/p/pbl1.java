package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pbl1 {
    public final String a;
    public final tr80 b;
    public final boolean c;
    public final boolean d;

    public pbl1(String str, tr80 tr80Var, boolean z, boolean z2) {
        this.a = str;
        this.b = tr80Var;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbl1)) {
            return false;
        }
        pbl1 pbl1Var = (pbl1) obj;
        return this.a.equals(pbl1Var.a) && this.b.equals(pbl1Var.b) && this.c == pbl1Var.c && this.d == pbl1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(lf51.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
