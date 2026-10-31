package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f7c1 extends h7c1 {
    public final u6c1 a;

    public f7c1(u6c1 u6c1Var) {
        this.a = u6c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f7c1) && this.a.equals(((f7c1) obj).a);
    }

    public final int hashCode() {
        return l1d.C(this.a.a);
    }
}
