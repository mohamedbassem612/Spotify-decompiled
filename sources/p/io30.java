package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class io30 {
    public final zis0 a;

    public io30(zis0 zis0Var) {
        this.a = zis0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof io30) && this.a.equals(((io30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
