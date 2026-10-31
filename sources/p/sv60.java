package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sv60 implements tv60 {
    public final boolean a;
    public final int b;
    public final ls60 c;

    public sv60(boolean z, int i, ls60 ls60Var) {
        this.a = z;
        this.b = i;
        this.c = ls60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv60)) {
            return false;
        }
        sv60 sv60Var = (sv60) obj;
        return this.a == sv60Var.a && this.b == sv60Var.b && this.c.equals(sv60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ab80.k(this.b, Boolean.hashCode(this.a) * 31, 31);
    }
}
