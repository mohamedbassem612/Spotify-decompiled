package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dyc0 implements gyc0 {
    public final wls0 a;

    public dyc0(wls0 wls0Var) {
        this.a = wls0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dyc0) && this.a == ((dyc0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
