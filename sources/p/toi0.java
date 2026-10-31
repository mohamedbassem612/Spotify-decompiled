package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class toi0 implements voi0 {
    public final l921 a;

    public toi0(l921 l921Var) {
        this.a = l921Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof toi0) && u890.j(this.a, ((toi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
