package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t5k0 {
    public final wsc0 a;

    public t5k0(wsc0 wsc0Var) {
        this.a = wsc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t5k0) && u890.j(this.a, ((t5k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
