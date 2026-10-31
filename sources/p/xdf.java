package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xdf implements bef {
    public final f7q0 a;

    public xdf(f7q0 f7q0Var) {
        this.a = f7q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xdf) && u890.j(this.a, ((xdf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
