package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mni0 {
    public final hji0 a;

    public mni0(hji0 hji0Var) {
        this.a = hji0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mni0) && this.a.equals(((mni0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
