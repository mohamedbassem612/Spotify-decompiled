package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c40 {
    public final iix0 a;
    public final boolean b;
    public final boolean c;

    public c40(iix0 iix0Var, boolean z, boolean z2) {
        this.a = iix0Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c40)) {
            return false;
        }
        c40 c40Var = (c40) obj;
        return u890.j(this.a, c40Var.a) && this.b == c40Var.b && this.c == c40Var.c;
    }

    public final int hashCode() {
        iix0 iix0Var = this.a;
        return Boolean.hashCode(this.c) + xcg1.g((iix0Var == null ? 0 : iix0Var.hashCode()) * 31, 31, this.b);
    }
}
