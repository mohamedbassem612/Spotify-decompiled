package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eay implements gay {
    public final vnx a;

    public eay(vnx vnxVar) {
        this.a = vnxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eay) && this.a.equals(((eay) obj).a);
    }

    public final int hashCode() {
        return -71357769;
    }
}
