package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class goi0 implements hoi0 {
    public final l921 a;

    public goi0(l921 l921Var) {
        this.a = l921Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof goi0) && u890.j(this.a, ((goi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
