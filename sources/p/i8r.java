package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i8r extends d5p1 {
    public final String c;

    public i8r(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i8r) && this.c.equals(((i8r) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
