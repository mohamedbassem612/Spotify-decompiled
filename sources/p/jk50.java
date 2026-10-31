package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jk50 implements kk50 {
    public final eji0 a;

    public jk50(eji0 eji0Var) {
        this.a = eji0Var;
    }

    public final eji0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jk50) && this.a.equals(((jk50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
