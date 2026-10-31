package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ssx0 extends ktx0 {
    public final xvi0 a;

    public ssx0(xvi0 xvi0Var) {
        this.a = xvi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ssx0) && this.a.equals(((ssx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
