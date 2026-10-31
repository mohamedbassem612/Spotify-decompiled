package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jiu {
    public final ji0 a;

    public jiu(ji0 ji0Var) {
        this.a = ji0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jiu) && this.a.equals(((jiu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
