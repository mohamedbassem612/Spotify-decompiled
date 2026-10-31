package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class y70 {
    public final wl71 a;

    public y70(wl71 wl71Var) {
        this.a = wl71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y70) && this.a.equals(((y70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
