package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fb31 implements jb31 {
    public final ega1 a;

    public fb31(ega1 ega1Var) {
        this.a = ega1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fb31) && this.a.equals(((fb31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
