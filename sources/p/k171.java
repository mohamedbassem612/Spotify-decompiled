package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k171 {
    public final j171 a;
    public final boolean b;
    public final l171 c;

    public k171(j171 j171Var, boolean z, l171 l171Var) {
        this.a = j171Var;
        this.b = z;
        this.c = l171Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k171)) {
            return false;
        }
        k171 k171Var = (k171) obj;
        return this.a.equals(k171Var.a) && this.b == k171Var.b && u890.j(this.c, k171Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        l171 l171Var = this.c;
        return iG + (l171Var == null ? 0 : l171Var.hashCode());
    }
}
