package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iuw0 {
    public final kge a;

    public iuw0(kge kgeVar) {
        this.a = kgeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iuw0) && this.a == ((iuw0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
