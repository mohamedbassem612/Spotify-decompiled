package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fq01 implements iq01 {
    public final j47 a;

    public fq01(j47 j47Var) {
        this.a = j47Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fq01) && u890.j(this.a, ((fq01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
