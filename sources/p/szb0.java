package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class szb0 {
    public final ji0 a;
    public final int b;
    public final boolean c;

    public szb0(ji0 ji0Var, int i, boolean z) {
        this.a = ji0Var;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szb0)) {
            return false;
        }
        szb0 szb0Var = (szb0) obj;
        return u890.j(this.a, szb0Var.a) && this.b == szb0Var.b && this.c == szb0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
