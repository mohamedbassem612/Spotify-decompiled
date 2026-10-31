package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rdw0 implements kew0 {
    public final sbw0 a;

    public rdw0(sbw0 sbw0Var) {
        this.a = sbw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rdw0) && u890.j(this.a, ((rdw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
