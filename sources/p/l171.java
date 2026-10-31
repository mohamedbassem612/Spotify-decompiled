package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l171 {
    public final ibk0 a;
    public final boolean b;
    public final boolean c;

    public l171(ibk0 ibk0Var, boolean z, boolean z2) {
        this.a = ibk0Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l171)) {
            return false;
        }
        l171 l171Var = (l171) obj;
        return u890.j(this.a, l171Var.a) && this.b == l171Var.b && this.c == l171Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
