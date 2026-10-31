package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ccd implements jcd {
    public final wbd a;

    public ccd(wbd wbdVar) {
        this.a = wbdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ccd) && this.a == ((ccd) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
