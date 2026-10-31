package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aca {
    public final wls0 a;

    public aca(wls0 wls0Var) {
        this.a = wls0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aca) && this.a == ((aca) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
