package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f6w0 implements dbr0 {
    public final e6w0 a;

    public f6w0(e6w0 e6w0Var) {
        this.a = e6w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f6w0) && this.a.equals(((f6w0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
