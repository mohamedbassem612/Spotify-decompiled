package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z5t0 extends m5n1 {
    public final j4b1 h;

    public z5t0(j4b1 j4b1Var) {
        this.h = j4b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z5t0) && this.h == ((z5t0) obj).h;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}
