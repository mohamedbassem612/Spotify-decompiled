package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bwk1 implements cwk1 {
    public final fwk1 a;

    public bwk1(fwk1 fwk1Var) {
        this.a = fwk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bwk1) && this.a.equals(((bwk1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
