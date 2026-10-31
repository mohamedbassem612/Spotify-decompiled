package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wdf implements bef {
    public final t7q0 a;

    public wdf(t7q0 t7q0Var) {
        this.a = t7q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wdf) && u890.j(this.a, ((wdf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
