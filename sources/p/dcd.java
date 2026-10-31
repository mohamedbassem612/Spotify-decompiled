package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dcd implements jcd {
    public final xbd a;

    public dcd(xbd xbdVar) {
        this.a = xbdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dcd) && this.a == ((dcd) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
