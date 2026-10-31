package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l2e1 extends l2p1 {
    public final String c;

    public l2e1(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2e1) && this.c.equals(((l2e1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
