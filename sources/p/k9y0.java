package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k9y0 implements m9y0 {
    public final s9y0 a;

    public k9y0(s9y0 s9y0Var) {
        this.a = s9y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k9y0) && this.a.equals(((k9y0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
