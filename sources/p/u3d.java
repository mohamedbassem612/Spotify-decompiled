package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u3d {
    public final haw0 a;

    public u3d(haw0 haw0Var) {
        this.a = haw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u3d) && this.a.equals(((u3d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
