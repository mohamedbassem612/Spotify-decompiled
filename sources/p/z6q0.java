package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z6q0 {
    public final boolean a;
    public final boolean b;
    public final int c;

    public z6q0(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    public final boolean a() {
        return this.c == 1;
    }

    public final boolean b() {
        return this.c == 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6q0)) {
            return false;
        }
        z6q0 z6q0Var = (z6q0) obj;
        return this.a == z6q0Var.a && this.b == z6q0Var.b && this.c == z6q0Var.c;
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        int i = this.c;
        return iG + (i == 0 ? 0 : l1d.C(i));
    }
}
