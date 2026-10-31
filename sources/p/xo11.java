package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xo11 {
    public final uod1 a;

    public xo11(uod1 uod1Var) {
        this.a = uod1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xo11) && u890.j(this.a, ((xo11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
