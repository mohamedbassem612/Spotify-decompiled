package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m6u0 extends r2p1 {
    public final hux c;

    public m6u0(hux huxVar) {
        this.c = huxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m6u0) && this.c.equals(((m6u0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
