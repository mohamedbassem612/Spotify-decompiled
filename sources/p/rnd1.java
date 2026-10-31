package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rnd1 extends czo1 {
    public final int c;

    public rnd1(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rnd1) && this.c == ((rnd1) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }
}
