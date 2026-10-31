package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zck implements ddk {
    public final xck a;

    public zck(xck xckVar) {
        this.a = xckVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zck) && this.a == ((zck) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
