package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c9g1 implements d9g1 {
    public final gcg1 a;

    public c9g1(gcg1 gcg1Var) {
        this.a = gcg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c9g1) && this.a.equals(((c9g1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
