package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class snd1 extends czo1 {
    public final int c;

    public snd1(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof snd1) && this.c == ((snd1) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }
}
