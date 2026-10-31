package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v1y0 {
    public final tv80 a;

    public v1y0(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1y0) && this.a.equals(((v1y0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
