package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wfn0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public wfn0(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfn0)) {
            return false;
        }
        wfn0 wfn0Var = (wfn0) obj;
        return this.a == wfn0Var.a && this.b == wfn0Var.b && this.c == wfn0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
