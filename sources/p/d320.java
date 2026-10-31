package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d320 implements f320 {
    public final qgo1 a;

    public d320(qgo1 qgo1Var) {
        this.a = qgo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d320) && this.a.equals(((d320) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
