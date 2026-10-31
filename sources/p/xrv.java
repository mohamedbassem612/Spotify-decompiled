package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xrv implements usv {
    public final f8e0 a;

    public xrv(f8e0 f8e0Var) {
        this.a = f8e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xrv) && this.a.equals(((xrv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
