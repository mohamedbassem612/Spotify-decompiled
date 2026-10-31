package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jhf0 implements yhf0 {
    public final xpf0 a;

    public jhf0(xpf0 xpf0Var) {
        this.a = xpf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jhf0) && this.a.equals(((jhf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
