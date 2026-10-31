package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nis0 {
    public final lis0 a;
    public final boolean b;
    public final boolean c;

    public nis0(lis0 lis0Var, boolean z, boolean z2) {
        this.a = lis0Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nis0)) {
            return false;
        }
        nis0 nis0Var = (nis0) obj;
        return this.a.equals(nis0Var.a) && this.b == nis0Var.b && this.c == nis0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
