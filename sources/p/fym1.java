package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fym1 {
    public final tzl0 a;

    public fym1(tzl0 tzl0Var) {
        this.a = tzl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fym1) && this.a == ((fym1) obj).a;
    }

    public final int hashCode() {
        return (bom1.g.hashCode() + (this.a.hashCode() * 31)) * 31;
    }
}
