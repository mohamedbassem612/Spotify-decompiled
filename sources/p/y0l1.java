package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y0l1 extends f1l1 {
    public final c0l1 a;

    public y0l1(c0l1 c0l1Var) {
        this.a = c0l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0l1) && u890.j(this.a, ((y0l1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
