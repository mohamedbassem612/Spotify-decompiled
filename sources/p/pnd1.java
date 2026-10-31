package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pnd1 extends czo1 {
    public final int c;

    public pnd1(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pnd1) && this.c == ((pnd1) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }
}
