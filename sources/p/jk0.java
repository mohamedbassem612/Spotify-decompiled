package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jk0 {
    public final mj0 a;

    public jk0(mj0 mj0Var) {
        this.a = mj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jk0) && this.a.equals(((jk0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
