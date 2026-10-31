package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zg5 {
    public final hh5 a;
    public final boolean b;
    public final boolean c;

    public zg5(hh5 hh5Var, boolean z, boolean z2) {
        this.a = hh5Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg5)) {
            return false;
        }
        zg5 zg5Var = (zg5) obj;
        return u890.j(this.a, zg5Var.a) && this.b == zg5Var.b && this.c == zg5Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
