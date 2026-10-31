package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jdv implements pdv {
    public final du1 a;

    public jdv(du1 du1Var) {
        this.a = du1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jdv) && this.a.equals(((jdv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
