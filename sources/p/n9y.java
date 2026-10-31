package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n9y implements s9y {
    public final nxb1 a;

    public n9y(nxb1 nxb1Var) {
        this.a = nxb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n9y) && this.a.equals(((n9y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
