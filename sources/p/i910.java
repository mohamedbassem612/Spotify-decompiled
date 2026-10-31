package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i910 {
    public final int a;
    public final boolean b;
    public final boolean c;

    public i910(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i910)) {
            return false;
        }
        i910 i910Var = (i910) obj;
        return this.a == i910Var.a && this.b == i910Var.b && this.c == i910Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(l1d.C(this.a) * 31, 31, this.b);
    }
}
