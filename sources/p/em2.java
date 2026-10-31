package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class em2 implements mm2 {
    public final t2j1 a;

    public em2(t2j1 t2j1Var) {
        this.a = t2j1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof em2) && this.a == ((em2) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
