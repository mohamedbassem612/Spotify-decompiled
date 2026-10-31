package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mvl implements cwl {
    public final wvp0 a;

    public mvl(wvp0 wvp0Var) {
        this.a = wvp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mvl) && this.a.equals(((mvl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
