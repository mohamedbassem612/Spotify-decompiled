package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nlw0 {
    public final wl71 a;

    public nlw0(wl71 wl71Var) {
        this.a = wl71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nlw0) && this.a.equals(((nlw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
