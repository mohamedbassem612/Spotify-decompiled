package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uq0 {
    public final tq0 a;

    public uq0(tq0 tq0Var) {
        this.a = tq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uq0) && this.a.equals(((uq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
