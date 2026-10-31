package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ncm1 extends qcm1 {
    public final qcm0 a;

    public ncm1(qcm0 qcm0Var) {
        this.a = qcm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ncm1) && this.a.equals(((ncm1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
