package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o830 {
    public final zis0 a;

    public o830(zis0 zis0Var) {
        this.a = zis0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o830) && this.a.equals(((o830) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
