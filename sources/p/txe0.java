package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class txe0 implements w11 {
    public final w341 a;

    public txe0(w341 w341Var) {
        this.a = w341Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof txe0) && this.a.equals(((txe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
