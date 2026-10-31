package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pul implements cwl {
    public final tw01 a;

    public pul(tw01 tw01Var) {
        this.a = tw01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pul) && this.a.equals(((pul) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
