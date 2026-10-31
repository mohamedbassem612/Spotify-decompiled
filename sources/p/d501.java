package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d501 implements f501 {
    public final l401 a;

    public d501(l401 l401Var) {
        this.a = l401Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d501) && this.a.equals(((d501) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
