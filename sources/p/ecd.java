package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ecd implements jcd {
    public final ybd a;

    public ecd(ybd ybdVar) {
        this.a = ybdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ecd) && this.a == ((ecd) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
