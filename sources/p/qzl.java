package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qzl extends zzl {
    public final gxs0 a;

    public qzl(gxs0 gxs0Var) {
        this.a = gxs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qzl) && this.a.equals(((qzl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
