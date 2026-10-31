package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hxz0 {
    public final c380 a;
    public final int b;

    public hxz0(int i, c380 c380Var) {
        this.a = c380Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxz0)) {
            return false;
        }
        hxz0 hxz0Var = (hxz0) obj;
        return u890.j(this.a, hxz0Var.a) && this.b == hxz0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
