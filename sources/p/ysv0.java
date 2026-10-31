package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ysv0 {
    public final ktv0 a;
    public final int b;

    public ysv0(ktv0 ktv0Var, int i) {
        this.a = ktv0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysv0)) {
            return false;
        }
        ysv0 ysv0Var = (ysv0) obj;
        return u890.j(this.a, ysv0Var.a) && this.b == ysv0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
