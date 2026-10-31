package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yke extends bno1 {
    public final String c;

    public yke(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yke) && this.c.equals(((yke) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
