package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class b3k0 implements k4k0 {
    public final lyj0 a;

    public b3k0(lyj0 lyj0Var) {
        this.a = lyj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b3k0) && this.a.equals(((b3k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
