package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lm2 implements mm2 {
    public final t2j1 a;

    public lm2(t2j1 t2j1Var) {
        this.a = t2j1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lm2) && this.a == ((lm2) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
