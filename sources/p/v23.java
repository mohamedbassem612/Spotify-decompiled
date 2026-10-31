package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v23 implements d33 {
    public final cwi0 a;

    public v23(cwi0 cwi0Var) {
        this.a = cwi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v23) && this.a.equals(((v23) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
