package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tbd implements vbd {
    public final xbd a;

    public tbd(xbd xbdVar) {
        this.a = xbdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tbd) && this.a == ((tbd) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
