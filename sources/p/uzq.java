package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uzq extends r2p1 {
    public final o3r c;

    public uzq(o3r o3rVar) {
        this.c = o3rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uzq) && this.c == ((uzq) obj).c;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
