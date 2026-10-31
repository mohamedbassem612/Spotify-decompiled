package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jeh0 {
    public final vo90 a;

    public jeh0(vo90 vo90Var) {
        this.a = vo90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jeh0) && u890.j(this.a, ((jeh0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
