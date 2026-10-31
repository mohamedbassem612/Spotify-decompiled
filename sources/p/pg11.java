package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pg11 extends o2p1 {
    public final String c;

    public pg11(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pg11) && this.c.equals(((pg11) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
