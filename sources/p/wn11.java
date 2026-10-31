package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wn11 {
    public final xn11 a;

    public wn11(xn11 xn11Var) {
        this.a = xn11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wn11) && this.a.equals(((wn11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
