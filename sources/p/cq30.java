package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cq30 implements eq30 {
    public final qij1 a;

    public cq30(qij1 qij1Var) {
        this.a = qij1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cq30) && this.a.equals(((cq30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
