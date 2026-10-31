package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r6a0 {
    public final pp90 a;
    public final zo90 b;

    public r6a0(pp90 pp90Var, zo90 zo90Var) {
        this.a = pp90Var;
        this.b = zo90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6a0)) {
            return false;
        }
        r6a0 r6a0Var = (r6a0) obj;
        return u890.j(this.a, r6a0Var.a) && u890.j(this.b, r6a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
