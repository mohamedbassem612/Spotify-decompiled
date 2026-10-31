package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j880 implements k880 {
    public final haw0 a;

    public j880(haw0 haw0Var) {
        this.a = haw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j880) && this.a.equals(((j880) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
