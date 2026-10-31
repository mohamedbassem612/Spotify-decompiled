package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eyc0 implements gyc0 {
    public final wls0 a;

    public eyc0(wls0 wls0Var) {
        this.a = wls0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eyc0) && this.a == ((eyc0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
