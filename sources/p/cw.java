package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cw implements ew {
    public final n4f0 a;

    public cw(n4f0 n4f0Var) {
        this.a = n4f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cw) && u890.j(this.a, ((cw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
