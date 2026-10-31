package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kl31 implements ll31 {
    public final qa31 a;

    public kl31(qa31 qa31Var) {
        this.a = qa31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kl31) && u890.j(this.a, ((kl31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
