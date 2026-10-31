package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xxw0 {
    public final wzw0 a;

    public xxw0(wzw0 wzw0Var) {
        this.a = wzw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xxw0) && this.a.equals(((xxw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
