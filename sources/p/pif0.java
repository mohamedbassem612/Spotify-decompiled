package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pif0 implements yif0 {
    public final xpf0 a;

    public pif0(xpf0 xpf0Var) {
        this.a = xpf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pif0) && this.a.equals(((pif0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
