package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z7l1 {
    public final y7l1 a;

    public z7l1(y7l1 y7l1Var) {
        this.a = y7l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z7l1) && this.a.equals(((z7l1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
