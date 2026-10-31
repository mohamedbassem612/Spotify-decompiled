package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l3k0 implements k4k0 {
    public final bdk0 a;

    public l3k0(bdk0 bdk0Var) {
        this.a = bdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l3k0) && u890.j(this.a, ((l3k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
