package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jp90 {
    public final boolean a;
    public final boolean b;
    public final kp90 c;

    public jp90(boolean z, boolean z2, kp90 kp90Var) {
        this.a = z;
        this.b = z2;
        this.c = kp90Var;
    }

    public final kp90 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp90)) {
            return false;
        }
        jp90 jp90Var = (jp90) obj;
        return this.a == jp90Var.a && this.b == jp90Var.b && u890.j(this.c, jp90Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        kp90 kp90Var = this.c;
        return iG + (kp90Var == null ? 0 : kp90Var.a.hashCode());
    }
}
