package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hiu {
    public final piu a;
    public final z6n b;

    public hiu(piu piuVar, z6n z6nVar) {
        this.a = piuVar;
        this.b = z6nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hiu) {
            hiu hiuVar = (hiu) obj;
            if (this.a == hiuVar.a && this.b.equals(hiuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
