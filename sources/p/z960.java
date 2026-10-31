package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z960 implements da60 {
    public final k37 a;

    public z960(k37 k37Var) {
        this.a = k37Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z960) && this.a.equals(((z960) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
