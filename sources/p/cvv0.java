package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cvv0 {
    public final osv0 a;
    public final int b;
    public final boolean c;

    public cvv0(osv0 osv0Var, int i, boolean z) {
        this.a = osv0Var;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvv0)) {
            return false;
        }
        cvv0 cvv0Var = (cvv0) obj;
        return this.a.equals(cvv0Var.a) && this.b == cvv0Var.b && this.c == cvv0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
