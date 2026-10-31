package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sl30 extends tl30 {
    public final ozh1 a;

    public sl30(ozh1 ozh1Var) {
        this.a = ozh1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sl30) && u890.j(this.a, ((sl30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
