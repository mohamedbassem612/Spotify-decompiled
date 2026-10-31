package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iww extends jww {
    public final ug8 a;

    public iww(ug8 ug8Var) {
        this.a = ug8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iww) && this.a.equals(((iww) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
