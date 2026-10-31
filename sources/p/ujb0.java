package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ujb0 {
    public final eyb0 a;

    public ujb0(eyb0 eyb0Var) {
        this.a = eyb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ujb0) && this.a.equals(((ujb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
