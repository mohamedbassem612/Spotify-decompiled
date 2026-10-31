package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kc80 implements chu {
    public final fq0 a;

    public kc80(fq0 fq0Var) {
        this.a = fq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kc80) && this.a.equals(((kc80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
