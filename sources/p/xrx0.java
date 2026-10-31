package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xrx0 extends ktx0 {
    public final dwi0 a;

    public xrx0(dwi0 dwi0Var) {
        this.a = dwi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xrx0) && this.a.equals(((xrx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
