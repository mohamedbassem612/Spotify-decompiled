package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l0l1 extends f1l1 {
    public final l2l1 a;

    public l0l1(l2l1 l2l1Var) {
        this.a = l2l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0l1) && this.a.equals(((l0l1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
