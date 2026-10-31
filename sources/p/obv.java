package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class obv implements pbv {
    public final lia1 a;

    public obv(lia1 lia1Var) {
        this.a = lia1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof obv) && this.a == ((obv) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
