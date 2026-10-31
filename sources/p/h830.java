package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h830 {
    public final zis0 a;

    public h830(zis0 zis0Var) {
        this.a = zis0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h830) && this.a.equals(((h830) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
