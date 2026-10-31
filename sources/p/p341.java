package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p341 extends r341 {
    public final sq81 a;

    public p341(sq81 sq81Var) {
        this.a = sq81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p341) && this.a.equals(((p341) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
