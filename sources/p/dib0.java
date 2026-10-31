package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dib0 {
    public final wsc0 a;

    public dib0(wsc0 wsc0Var) {
        this.a = wsc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dib0) && u890.j(this.a, ((dib0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
