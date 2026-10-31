package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cu60 extends ru60 {
    public final cto1 a;

    public cu60(cto1 cto1Var) {
        this.a = cto1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cu60) && this.a.equals(((cu60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
