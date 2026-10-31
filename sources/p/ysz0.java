package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ysz0 {
    public final hy50 a;
    public final String b;

    public ysz0(hy50 hy50Var, String str) {
        this.a = hy50Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysz0)) {
            return false;
        }
        ysz0 ysz0Var = (ysz0) obj;
        return this.a.equals(ysz0Var.a) && this.b.equals(ysz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
