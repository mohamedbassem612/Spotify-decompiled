package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dwj1 {
    public final zvj1 a;

    public dwj1(zvj1 zvj1Var) {
        this.a = zvj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dwj1) && this.a.equals(((dwj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
