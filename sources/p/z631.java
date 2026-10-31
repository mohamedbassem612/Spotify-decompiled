package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z631 {
    public final s731 a;

    public z631(s731 s731Var) {
        this.a = s731Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z631) && this.a.equals(((z631) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
