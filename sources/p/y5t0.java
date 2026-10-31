package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y5t0 extends m5n1 {
    public final rk70 h;

    public y5t0(rk70 rk70Var) {
        this.h = rk70Var;
    }

    public final rk70 Y() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y5t0) && u890.j(this.h, ((y5t0) obj).h);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}
