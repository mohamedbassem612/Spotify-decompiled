package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hjt0 implements mjt0 {
    public final yq31 a;

    public hjt0(yq31 yq31Var) {
        this.a = yq31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hjt0) && this.a.equals(((hjt0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
