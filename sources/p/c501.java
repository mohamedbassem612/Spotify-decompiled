package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class c501 implements f501 {
    public final l401 a;

    public c501(l401 l401Var) {
        this.a = l401Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c501) && this.a.equals(((c501) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
