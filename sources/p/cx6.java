package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cx6 {
    public final zis0 a;

    public cx6(zis0 zis0Var) {
        this.a = zis0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cx6) && this.a.equals(((cx6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
