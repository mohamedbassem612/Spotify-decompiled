package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pe90 {
    public final zis0 a;

    public pe90(zis0 zis0Var) {
        this.a = zis0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pe90) && this.a.equals(((pe90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
