package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hbn0 {
    public final bbn0 a;

    public hbn0(bbn0 bbn0Var) {
        this.a = bbn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hbn0) && this.a.equals(((hbn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
