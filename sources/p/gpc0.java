package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gpc0 extends hpc0 {
    public final qnc0 a;

    public gpc0(qnc0 qnc0Var) {
        this.a = qnc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gpc0) && this.a.equals(((gpc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
