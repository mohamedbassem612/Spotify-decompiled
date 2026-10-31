package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kul implements cwl {
    public final x78 a;

    public kul(x78 x78Var) {
        this.a = x78Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kul) && this.a.equals(((kul) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
