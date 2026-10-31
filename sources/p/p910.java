package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p910 {
    public final int a;
    public final boolean b;
    public final boolean c;

    public p910(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p910)) {
            return false;
        }
        p910 p910Var = (p910) obj;
        return this.a == p910Var.a && this.b == p910Var.b && this.c == p910Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(l1d.C(this.a) * 31, 31, this.b);
    }
}
