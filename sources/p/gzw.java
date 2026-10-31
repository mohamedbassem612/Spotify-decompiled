package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gzw {
    public final iac0 a;

    public gzw(iac0 iac0Var) {
        this.a = iac0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gzw) && this.a.equals(((gzw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
