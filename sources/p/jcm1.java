package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jcm1 extends hon1 {
    public final fdm0 e;

    public jcm1(fdm0 fdm0Var) {
        this.e = fdm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jcm1) && u890.j(this.e, ((jcm1) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
