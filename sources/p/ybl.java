package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ybl {
    public final fcl a;

    public ybl(fcl fclVar) {
        this.a = fclVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ybl) && this.a.equals(((ybl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
