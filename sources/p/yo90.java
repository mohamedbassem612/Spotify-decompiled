package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yo90 {
    public final xo90 a;

    public yo90(xo90 xo90Var) {
        this.a = xo90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yo90) && this.a == ((yo90) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
