package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class abz {
    public final yaz a;

    public abz(yaz yazVar) {
        this.a = yazVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof abz) && this.a.equals(((abz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
