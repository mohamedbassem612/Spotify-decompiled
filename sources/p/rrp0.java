package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rrp0 extends yap1 {
    public final hux c;

    public rrp0(hux huxVar) {
        this.c = huxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rrp0) && this.c.equals(((rrp0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
