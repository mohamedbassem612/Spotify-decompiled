package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class olk0 {
    public final jo70 a;
    public final xkk1 b;

    public olk0(jo70 jo70Var, xkk1 xkk1Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olk0)) {
            return false;
        }
        olk0 olk0Var = (olk0) obj;
        return this.a.equals(olk0Var.a) && this.b.equals(olk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
