package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s830 {
    public final zis0 a;

    public s830(zis0 zis0Var) {
        this.a = zis0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s830) && this.a.equals(((s830) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
